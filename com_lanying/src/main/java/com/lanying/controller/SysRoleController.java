package com.lanying.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("sysRole")
public class SysRoleController {
	
	@RequestMapping("list.do")
	public ModelAndView list() {
		ModelAndView mav = new ModelAndView("/main/system/sysRole.jsp");
		return mav;
	}
}
