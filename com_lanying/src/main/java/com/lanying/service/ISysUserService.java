package com.lanying.service;

import java.util.List;

import com.lanying.dto.SysUser;

public interface ISysUserService {
	
	List<SysUser> queryList();
	
	List<SysUser> queryListByPage(Integer page, Integer pageSize);
	
}
