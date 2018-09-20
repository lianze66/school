package com.lanying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class FreemarkerController {
	
	@ResponseBody
	@RequestMapping("showFreemarker")
	public ModelAndView showFreemarker() {
		ModelAndView mav = new ModelAndView("may");
		
		mav.addObject("userName", "ะกร๗");
		
		return mav;
	}
}
