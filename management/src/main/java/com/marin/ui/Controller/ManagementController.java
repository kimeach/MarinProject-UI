package com.marin.ui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/management")
public class ManagementController {

	@GetMapping
	public ModelAndView getManagement() {
		return new ModelAndView("ManagementTest");
	}
}
