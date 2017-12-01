package org.com5104.controllers;

import org.com5104.models.Login;
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
	
	@RequestMapping(value = "/login", method = RequestMethod.GET)
    public ModelAndView displayLogin() {
		return new ModelAndView("login", "loginForm", new Login());
    }
	@RequestMapping(value = "/process_login", method = RequestMethod.POST) 
	public String login(@ModelAttribute("login") @Validated Login login,
			BindingResult result, Model model,
			final RedirectAttributes redirectAttributes) { 
		
		if(login.getUserName().equalsIgnoreCase("clerk")) {
			System.out.println("***************Tansin*******************");
			return "clerk/clerk_home";
		} else if(login.getUserName().contains("@")) {
			System.out.println("**********************************");
			return "student/student_home";
		}
		else {
			System.out.println("************Tithy**********************" + login.getUserName());
			model.addAttribute("loginForm", login);
			return "login";
		}
		
	}
}
