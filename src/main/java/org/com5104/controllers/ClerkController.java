package org.com5104.controllers;

import org.com5104.models.Course;
import org.com5104.models.Login;
import org.com5104.tables.CourseTable;
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
	
	@RequestMapping(value = "/create_course", method = RequestMethod.GET)
	public ModelAndView createCourse() {
		System.out.println("+++++++++++++++++++++++++++**********now it is being run in debugging mode***********");
		return new ModelAndView("clerk/create_course", "createCourseForm", new Course());
	}
	@RequestMapping(value = "/process_createCourse", method = RequestMethod.POST) 
	public String createCourse(@ModelAttribute("createCourseForm") @Validated Course course,
			BindingResult result, Model model,
			final RedirectAttributes redirectAttributes) { 
		 CourseTable.getInstance().add(course);
		 for (Course acourse : CourseTable.getInstance().getCourses()) {
			System.out.println("========================>>>" + acourse.getCode());
		}
		
		
		return "clerk/clerk_home";
		
	}

}
