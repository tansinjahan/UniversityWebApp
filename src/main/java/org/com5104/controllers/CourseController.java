package org.com5104.controllers;

import java.util.Map;

import org.com5104.models.Course;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class CourseController {
	// inject via application.properties
		@Value("${welcome.message:test}")
		private String message = "Hello Tansin";

		@RequestMapping(value = "/course", method = RequestMethod.GET) 
		public String displayLogin(Model model) { 
		    model.addAttribute("course", new Course()); 
		    return "course"; 
		}
}
