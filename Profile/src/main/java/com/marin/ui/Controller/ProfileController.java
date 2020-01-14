package com.marin.ui.Controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/profile")
public class ProfileController {
	
	@GetMapping
	public ModelAndView getCalendar(HttpServletRequest request) {
		ModelAndView mav = new ModelAndView("Profile");
		mav.addObject("count", request.getParameter("count"));
		return new ModelAndView("Profile");
		
	}
}
