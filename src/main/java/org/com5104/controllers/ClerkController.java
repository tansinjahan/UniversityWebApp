package org.com5104.controllers;

import javax.servlet.http.HttpServletRequest;

import org.com5104.models.Course;
import org.com5104.models.Login;
import org.com5104.models.Student;
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
	
	@RequestMapping(value = "/create_course", method = { RequestMethod.GET, 
			RequestMethod.POST })
	public ModelAndView createCourse(@ModelAttribute("createCourseForm") @Validated Course course,
			BindingResult result, Model model,
			final RedirectAttributes redirectAttributes, HttpServletRequest request) {
		if(request.getMethod().contains("GET")) {
			return new ModelAndView("clerk/create_course", "createCourseForm", new Course());
		}else {
			 CourseTable.getInstance().add(course);
			 for (Course acourse : CourseTable.getInstance().getCourses()) {
				System.out.println("========================>>>" + acourse.getCode());
			 }
			 return new ModelAndView("clerk/clerk_home", "", null);
		}
	}

	
	@RequestMapping(value = "/create_student", method = { RequestMethod.GET, 
			RequestMethod.POST })
	public ModelAndView createStudent(@ModelAttribute("createStudentForm") @Validated Student student,
			BindingResult result, Model model,
			final RedirectAttributes redirectAttributes, HttpServletRequest request) {
		if(request.getMethod().contains("GET")) {
			System.out.println("******************************" );
			return new ModelAndView("clerk/create_student", "createStudentForm", new Student());
		}else {
			if(result.hasErrors()) {
				System.out.println("*************form error*****************" );
				return new ModelAndView("clerk/create_student", "createStudentForm", student);
			}else {
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
