package com.marin.ui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/notice")
public class NoticeController {
	
	@GetMapping
	public ModelAndView getCalendar() {
		return new ModelAndView("Notice");
	}
}
