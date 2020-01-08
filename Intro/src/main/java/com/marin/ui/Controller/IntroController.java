package com.marin.ui.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.marin.ui.Repository.MarinTemplate;

@Controller
@RequestMapping("/intro")
public class IntroController {

	
	@GetMapping
	public ModelAndView getIntro() {
		return new ModelAndView("MainIntro");
	}
	
	@GetMapping("/base")
	public ModelAndView getIntro2() {
		return new ModelAndView("baseTemplate");
	}
}
