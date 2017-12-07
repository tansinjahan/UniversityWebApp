package org.com5104.controllers;

import javax.servlet.http.HttpServletRequest;

import org.com5104.models.Course;
import org.com5104.models.CourseWebModel;
import org.com5104.models.Login;
import org.com5104.models.Student;
import org.com5104.models.StudentWebModel;
import org.com5104.models.TestTermSimulator;
import org.com5104.models.University;
import org.com5104.tables.CourseTable;
import org.com5104.tables.StudentTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class ClerkController {

	@RequestMapping(value = "/clerk_home", method = RequestMethod.GET)
	public String clerkHome() {
		return "clerk/clerk_home";
	}

	@RequestMapping(value = "/create_course", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView createCourse(@ModelAttribute("createCourseForm") @Validated CourseWebModel course,
			BindingResult result, Model model, final RedirectAttributes redirectAttributes,
			HttpServletRequest request) {
		if (request.getMethod().contains("GET")) {
			return new ModelAndView("clerk/create_course", "createCourseForm", course);
		} else {
			if(result.hasErrors()) {
				String message = "";
				System.out.println("Course can not be created");
				for (ObjectError error : result.getAllErrors()) {
					message = message + error.getDefaultMessage() + System.lineSeparator();
				}
				request.setAttribute("message", message);
				return new ModelAndView("clerk/clerk_home", "", null);
			} else {
				try {
					TestTermSimulator test = new TestTermSimulator(University.getInstance());
					test.termCreated();
					Course acourse = University.getInstance().createCourse("clerk", course.getTitle(), course.getCode(),
							course.getCapacity(), course.getFinalExam(), course.getAssignment(), course.getMidterm(),
							course.getPrerequisite(), course.getProject());
					System.out.printf("Course is created with %s and %d", acourse.getTitle(), acourse.getCode());
					request.setAttribute("message", "Course was successfully created!!!");
					return new ModelAndView("clerk/clerk_home", "", acourse);
				} catch (Exception e) {
					System.out.println("Course can not be created" + e.getMessage());
					request.setAttribute("message", "Course was not created: " + e.getMessage());
					return new ModelAndView("clerk/clerk_home", "", null);
				}
			}
		}
	}

	@RequestMapping(value = "/create_student", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView createStudent(@ModelAttribute("createStudentForm") @Validated StudentWebModel student,
			BindingResult result, Model model, final RedirectAttributes redirectAttributes,
			HttpServletRequest request) {
		if (request.getMethod().contains("GET")) {
			return new ModelAndView("clerk/create_student", "createStudentForm", student);
		} else {
			if (result.hasErrors()) {
				String message = "";
				System.out.println("*************form error*****************");
				System.out.println("Student can not be created");
				for (ObjectError error : result.getAllErrors()) {
					message = message + error.getDefaultMessage() + System.lineSeparator();
				}
				request.setAttribute("message", message);
				return new ModelAndView("clerk/create_student");
			} else {
				try {
				TestTermSimulator test = new TestTermSimulator(University.getInstance());
				test.termCreated();
				Student newStudent = University.getInstance().createStudent(student.getStudentName(),
						student.getStudentNumber(), student.getEmail(), student.getPassword(), student.getstudentStatus());
				System.out.printf("Student is created with %s and %s", newStudent.getStudentName(),
						newStudent.getStudentNumber());
				request.setAttribute("message", "Student successfully created!!!");
				return new ModelAndView("clerk/clerk_home");
				}catch(Exception e) {
					request.setAttribute("message", "Student was not created: " + e.getMessage());
					return new ModelAndView("clerk/clerk_home");
				}
			}

		}
	}

	@RequestMapping(value = "/delete_student", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView deleteStudent(final RedirectAttributes redirectAttributes,
			HttpServletRequest request) {
		if (request.getMethod().contains("GET")) {
			return new ModelAndView("clerk/delete_student");
		} else {
			if (request.getParameter("studentNumber").isEmpty()) {
				System.out.println("*************form error*****************");
				System.out.println("Student can not be deleted");
				request.setAttribute("message", "Please enter student number");
				return new ModelAndView("clerk/clerk_home");
			} else {
				TestTermSimulator test = new TestTermSimulator(University.getInstance());
				test.termCreated();
				Student dStudent = StudentTable.getInstance().findByStudentNumber(Integer.parseInt(request.getParameter("studentNumber"))); 
				University.getInstance().deleteStudent(dStudent);
				System.out.printf("Student is deleted successfully");
				request.setAttribute("message", "Student is deleted successfully!!!");
				return new ModelAndView("clerk/clerk_home");
			}

		}
	}

	@RequestMapping(value = "/delete_course", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView deleteCourse(final RedirectAttributes redirectAttributes,
			HttpServletRequest request) {
		if (request.getMethod().contains("GET")) {
			return new ModelAndView("clerk/delete_course");
		} else {
			if (request.getParameter("code").isEmpty()) {
				System.out.println("*************form error*****************");
				System.out.println("Course can not be deleted");
				request.setAttribute("message", "Please enter course code");
				return new ModelAndView("clerk/clerk_home");
			} else {
				TestTermSimulator test = new TestTermSimulator(University.getInstance());
				test.termCreated();
				Course dCourse = CourseTable.getInstance().findCourseByCode(Integer.parseInt(request.getParameter("code"))); 
				System.out.printf("course code", dCourse.getCode());
				University.getInstance().cancelCourse(dCourse);
				System.out.printf("Course is deleted successfully");
				request.setAttribute("message", "Course is deleted successfully");
				return new ModelAndView("clerk/clerk_home");
			}

		}
	}

}
