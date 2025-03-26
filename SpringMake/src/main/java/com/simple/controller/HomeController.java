package com.simple.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("example/aaa")
	public ModelAndView home() {
		ModelAndView mv = new ModelAndView();
		mv.addObject("data", "hello world123");
		mv.setViewName("aaa");
		return mv;
	}
}
