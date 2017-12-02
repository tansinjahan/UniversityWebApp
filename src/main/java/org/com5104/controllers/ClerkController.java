package org.com5104.controllers;

import javax.servlet.http.HttpServletRequest;

import org.com5104.models.Course;
import org.com5104.models.CourseWebModel;
import org.com5104.models.Login;
import org.com5104.models.Student;
import org.com5104.models.TestTermSimulator;
import org.com5104.models.University;
import org.com5104.tables.CourseTable;
import org.com5104.tables.StudentTable;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
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
			CourseWebModel dcourse=new CourseWebModel();
			dcourse.setTitle("data");
			dcourse.setCode(112345);
			dcourse.setCapacity(34);
			dcourse.setAssignment(2);
			dcourse.setMidterm(1);
			dcourse.setPrerequisite(true);
			dcourse.setFinalExam(true);
			dcourse.setProject(false);
			return new ModelAndView("clerk/create_course", "createCourseForm", dcourse);
		} else {
			try {
				TestTermSimulator test = new TestTermSimulator(University.getInstance());
				test.termCreated();
				Course acourse = University.getInstance().createCourse("clerk", course.getTitle(), course.getCode(),
						course.getCapacity(), course.getFinalExam(), course.getAssignment(), course.getMidterm(),
						course.getPrerequisite(), course.getProject());
				System.out.printf("Course is created with %s and %d", acourse.getTitle(), acourse.getCode());
				return new ModelAndView("clerk/clerk_home", "", null);

			} catch (Exception e) {
				System.out.println("Course can not be created" +e.getMessage());
				return new ModelAndView("clerk/clerk_home", "", null);
			}
		}
	}

	@RequestMapping(value = "/create_student", method = { RequestMethod.GET, RequestMethod.POST })
	public ModelAndView createStudent(@ModelAttribute("createStudentForm") @Validated Student student,
			BindingResult result, Model model, final RedirectAttributes redirectAttributes,
			HttpServletRequest request) {
		if (request.getMethod().contains("GET")) {
			System.out.println("******************************");
			return new ModelAndView("clerk/create_student", "createStudentForm", new Student());
		} else {
			if (result.hasErrors()) {
				System.out.println("*************form error*****************");
				return new ModelAndView("clerk/create_student", "createStudentForm", student);
			} else {
				System.out.println("**************************" + student.getEmail());
				StudentTable.getInstance().add(student);
				for (Student aStudent : StudentTable.getInstance().getStudents()) {
					System.out.println("===========KKKKK=============>>>" + aStudent.getEmail());
				}
				return new ModelAndView("clerk/clerk_home", "", null);
			}
		}

	}

}
