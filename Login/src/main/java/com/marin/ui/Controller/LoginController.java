package com.marin.ui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping
	public ModelAndView getLogin() {
		return new ModelAndView("LoginIndex");
	}
}
