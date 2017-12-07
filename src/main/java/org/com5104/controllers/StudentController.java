package org.com5104.controllers;

import javax.servlet.http.HttpServletRequest;

import org.com5104.models.Course;
import org.com5104.models.CourseWebModel;
import org.com5104.models.Student;
import org.com5104.models.TestTermSimulator;
import org.com5104.models.University;
import org.com5104.tables.CourseTable;
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

	public class StudentController {
		@RequestMapping(value = "/student_home", method = RequestMethod.GET)
		public String studentHome() {
			return "student/student_home";
			// return new ModelAndView("clerk_home", "loginForm", new Login());
		}
		
		@RequestMapping(value = "/register_course", method = { RequestMethod.GET, RequestMethod.POST })
		public ModelAndView registerCourse(@ModelAttribute("registerForm") @Validated CourseWebModel course,
				BindingResult result, Model model, final RedirectAttributes redirectAttributes,
				HttpServletRequest request) {
			if (request.getMethod().contains("GET")) {
				return new ModelAndView("student/register_course");
				
			}
			else {
				if(result.hasErrors()) {
					System.out.println("*************form error*****************");
					System.out.println("Course registration has not been successful");
					String message = "";
	  				for (ObjectError error : result.getAllErrors()) {
	  					message = message + error.getDefaultMessage() + System.lineSeparator();
	 				}
	 				request.setAttribute("message", message);
					return new ModelAndView("student/student_home");
				}
				else {
					try {
				System.out.println("I am inside register course");
					TestTermSimulator test = new TestTermSimulator(University.getInstance());
					test.termAllowCourseRegistration();
					Course acourse = CourseTable.getInstance().findCourseByCode(course.getCode());
					Student currentStudent = (Student)request.getSession().getAttribute("currentStudent");
					System.out.println("======================================" + currentStudent);
					University.getInstance().registerStudentForCourse(currentStudent, acourse);
					System.out.println("Course registration has been successful");
					request.setAttribute("message", "Course registration has been successful");
					return new ModelAndView("student/student_home");
					}catch(Exception e) {
						request.setAttribute("message", "Course registration has not been successful:" + e.getMessage());
						return new ModelAndView("student/register_course");
					}
				}
				
			}
			
		}
		
		@RequestMapping(value = "/select_course", method = { RequestMethod.GET, RequestMethod.POST })
		public ModelAndView selectCourse(@ModelAttribute("selectCourseForm") @Validated CourseWebModel course,
				BindingResult result, Model model, final RedirectAttributes redirectAttributes,
				HttpServletRequest request) {
			if (request.getMethod().contains("GET")) {
				return new ModelAndView("student/select_course");
				
			}
			else {
				if(result.hasErrors()) {
					System.out.println("*************form error*****************");
					System.out.println("Course selection has not been successful");
					String message = "";
	  				for (ObjectError error : result.getAllErrors()) {
	  					message = message + error.getDefaultMessage() + System.lineSeparator();
	 				}
	 				request.setAttribute("message", message);
					return new ModelAndView("student/select_course");
				}
				else {
					try {
				System.out.println("I am inside selected course");
					TestTermSimulator test = new TestTermSimulator(University.getInstance());
					test.termAllowCourseRegistration();
					Course acourse = CourseTable.getInstance().findCourseByCode(course.getCode());
					Student currentStudent = (Student)request.getSession().getAttribute("currentStudent");
					System.out.println("======================================" + currentStudent);
					University.getInstance().selectCourseForStudent(currentStudent, acourse);
					System.out.println("Course selection has been successful");
					request.setAttribute("message", "Course selection has been successful");
					return new ModelAndView("student/student_home");
					}catch(Exception e) {
						request.setAttribute("message", "Course selection has not been successful : " + e.getMessage());
						return new ModelAndView("student/select_course");
					}
				}
				
			}
			
		}
		
		@RequestMapping(value = "/deregister_course", method = { RequestMethod.GET, RequestMethod.POST })
		public ModelAndView deregisterCourse(@ModelAttribute("deregisterForm") @Validated CourseWebModel course,
				BindingResult result, Model model, final RedirectAttributes redirectAttributes,
				HttpServletRequest request) {
			if (request.getMethod().contains("GET")) {
				return new ModelAndView("student/deregister_course");
				
			}
			else {
				if(result.hasErrors()) {
					System.out.println("*************form error*****************");
					System.out.println("Course can not be deregister");
					String message = "";
	  				for (ObjectError error : result.getAllErrors()) {
	  					message = message + error.getDefaultMessage() + System.lineSeparator();
	 				}
	 				request.setAttribute("message", message);
					return new ModelAndView("student/deregister_course");
				}
				else {
				System.out.println("I am inside deregistered course");
					TestTermSimulator test = new TestTermSimulator(University.getInstance());
					test.startTerm();
					Course acourse = CourseTable.getInstance().findCourseByCode(course.getCode());
					Student currentStudent = (Student)request.getSession().getAttribute("currentStudent");
					System.out.println("======================================" + currentStudent);
					Boolean success = University.getInstance().deregisterCourse(acourse, currentStudent);
					if(success) {
						System.out.println("Course deregistration has been successful");
						request.setAttribute("message", "Course deregistration has been successful");
						return new ModelAndView("student/student_home");
					}
					else {
						System.out.println("Course can not be deregister");
						request.setAttribute("message", "Course can not be deregister");
						return new ModelAndView("student/deregister_course");
					}
					
				}
				
			}
			
		}
		
		@RequestMapping(value = "/drop_course", method = { RequestMethod.GET, RequestMethod.POST })
		public ModelAndView dropCourse(@ModelAttribute("dropCourseForm") @Validated CourseWebModel course,
				BindingResult result, Model model, final RedirectAttributes redirectAttributes,
				HttpServletRequest request) {
			if (request.getMethod().contains("GET")) {
				return new ModelAndView("student/drop_course");
				
			}
			else {
				if(result.hasErrors()) {
					System.out.println("*************form error*****************");
					System.out.println("Course can not be dropped");
					String message = "";
	  				for (ObjectError error : result.getAllErrors()) {
	  					message = message + error.getDefaultMessage() + System.lineSeparator();
	 				}
	 				request.setAttribute("message", message);
					return new ModelAndView("student/drop_course");
				}
				else {
					TestTermSimulator test = new TestTermSimulator(University.getInstance());
					test.twoWeeksPassesTillTermStarted();
					Course acourse = CourseTable.getInstance().findCourseByCode(course.getCode());
					Student currentStudent = (Student)request.getSession().getAttribute("currentStudent");
					System.out.println("======================================" + currentStudent);
					Boolean success = University.getInstance().dropCourse(currentStudent, acourse);
					if(success)
					{
						System.out.println("Course drop has been successful");
						request.setAttribute("message", "Course drop has been successful");
						return new ModelAndView("student/student_home");
					}
					else
					{
						System.out.println("Course can not be dropped");
						request.setAttribute("message", "Course can not be dropped");
						return new ModelAndView("student/drop_course");	
					}
					
				}
				
			}
			
		}

}
