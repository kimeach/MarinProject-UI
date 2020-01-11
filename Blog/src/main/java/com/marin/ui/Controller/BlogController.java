package com.marin.ui.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/blog")
public class BlogController {
	
	@GetMapping
	public ModelAndView getBlog() {
		return new ModelAndView("blog");
	}
}
