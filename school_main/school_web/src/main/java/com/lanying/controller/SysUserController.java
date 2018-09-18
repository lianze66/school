package com.lanying.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lanying.dto.SysUser;
import com.lanying.service.ISysUserService;

@Controller
@RequestMapping("sysUser")
public class SysUserController {
	
	@Autowired
	private ISysUserService sysUserService;
	
	@Autowired
	private RedisTemplate redisTemplate;
	
	@ResponseBody
	@RequestMapping("queryList.do")
	public List<SysUser> queryList() {
		return sysUserService.queryList();
	}
	
	@ResponseBody
	@RequestMapping("querySchoolName.do")
	public String querySchoolName() {
		ValueOperations opsForValue = redisTemplate.opsForValue();
		opsForValue.set("bbb", "222");
		String name = opsForValue.get("school_name").toString();
		return name;
	}
}
