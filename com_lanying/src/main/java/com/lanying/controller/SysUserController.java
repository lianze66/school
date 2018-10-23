package com.lanying.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lanying.service.ISysUserService;

@Controller
@RequestMapping("sysUser")
public class SysUserController {
	
	@Autowired
	private ISysUserService sysUserService;
	
	@RequestMapping("login.do")
	public void login(String loginName, String password) {
		
	}
	
	@RequestMapping("list")
	public ModelAndView list(Integer page) {
		page = page==null?1:page;
		int pageSize = 10;
		
		ModelAndView mav = new ModelAndView();
		
		mav.addObject("list", sysUserService.queryListByPage(page, pageSize));
		mav.addObject("page", page);
		mav.addObject("pageSize", pageSize);
		
		mav.setViewName("/main/system/sysUser.jsp");
		
		return mav;
	}
}