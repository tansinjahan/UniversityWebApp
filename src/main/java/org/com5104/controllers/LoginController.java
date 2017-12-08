package org.com5104.controllers;

import javax.servlet.http.HttpServletRequest;

import org.com5104.models.Course;
import org.com5104.models.Login;
import org.com5104.models.Student;
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
public class LoginController {

	@RequestMapping(value = "/login", method = { RequestMethod.GET, 
			RequestMethod.POST })
	public ModelAndView displayLogin(@ModelAttribute("loginForm") @Validated Login login,
			BindingResult result, Model model,
			final RedirectAttributes redirectAttributes, HttpServletRequest request) {
		if(request.getMethod().contains("GET")) {
			return new ModelAndView("login", "loginForm", login);
		}else {
			if(login.getUserName().equalsIgnoreCase("clerk") && login.getPassWord().equalsIgnoreCase("admin")) {
				System.out.println("***************Tansin*******************");
				request.setAttribute("message", "Successfully logged in!!");
				return new ModelAndView("clerk/clerk_home", "", null);
			}else if(login.getUserName().contains("@")) {
				Student currentStudent =StudentTable.getInstance().findByEmailPassword(login.getUserName(), login.getPassWord());
				if(currentStudent!=null){
					request.getSession().setAttribute("currentStudent", currentStudent);
					System.out.println("**********************************");
					request.setAttribute("message", "Successfully logged in!!");
					return new ModelAndView("student/student_home", "", null);
				}else {
					redirectAttributes.addFlashAttribute("message", "Your username should be your email");
					return new ModelAndView( "redirect:/login");
				}	
			}else {
				System.out.println("************Tithy**********************" + login.getUserName());
				model.addAttribute("loginForm", login);
				redirectAttributes.addFlashAttribute("message", "Invalid username or password");
				return new ModelAndView("redirect:/login");
			}
		}
	}
}
