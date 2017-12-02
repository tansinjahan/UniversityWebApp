package org.com5104.controllers;

import javax.servlet.http.HttpServletRequest;

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
public class LoginController {

	@RequestMapping(value = "/login", method = { RequestMethod.GET, 
			RequestMethod.POST })
	public ModelAndView displayLogin(@ModelAttribute("createCourseForm") @Validated Login login,
			BindingResult result, Model model,
			final RedirectAttributes redirectAttributes, HttpServletRequest request) {
		if(request.getMethod().contains("GET")) {
			return new ModelAndView("login", "loginForm", new Login());
		}else {
			if(login.getUserName().equalsIgnoreCase("clerk")) {
				System.out.println("***************Tansin*******************");
				return new ModelAndView("clerk/clerk_home", "", null);
			}else if(login.getUserName().contains("@")) {
				System.out.println("**********************************");
				return new ModelAndView("student/student_home", "", null);
			}else {
				System.out.println("************Tithy**********************" + login.getUserName());
				model.addAttribute("loginForm", login);
				return new ModelAndView("login", "", null);
			}
		}
	}
}
