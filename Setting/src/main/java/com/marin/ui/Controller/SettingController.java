package com.marin.ui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/setting")
public class SettingController {
	
	@GetMapping
	public ModelAndView getCalendar() {
		return new ModelAndView("Setting");
	}
}
