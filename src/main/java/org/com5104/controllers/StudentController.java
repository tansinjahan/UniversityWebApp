package org.com5104.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
@Controller
public class StudentController {
	@RequestMapping(value = "/student_home", method = RequestMethod.GET)
    public String studentHome() {
		return "student/student_home";
		//return new ModelAndView("clerk_home", "loginForm", new Login());
    }

}
