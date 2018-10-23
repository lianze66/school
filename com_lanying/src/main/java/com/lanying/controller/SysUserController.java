package com.lanying.controller;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
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
	
	@RequestMapping(value="login.do")
	public ModelAndView login(String loginName, String password) {
		ModelAndView mav = new ModelAndView();
		mav.addObject("loginName", loginName);
		mav.addObject("password", password);
		
		Subject subject = SecurityUtils.getSubject();
		UsernamePasswordToken token = new UsernamePasswordToken(loginName, password);
		
        try {
        	subject.login(token);//执行认证提交
        	mav.setViewName("/main/index.jsp");
        } catch (UnknownAccountException e) {
            mav.addObject("loginNameError", "(用户名不存在！)");
            mav.setViewName("/main/login.jsp");
        } catch (IncorrectCredentialsException e) {
            mav.addObject("passwordError", "(密码错误！)");
            mav.setViewName("/main/login.jsp");
        }
		
		return mav;
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