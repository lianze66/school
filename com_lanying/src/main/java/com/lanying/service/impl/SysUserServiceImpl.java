package com.lanying.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanying.dao.ISysUserDAO;
import com.lanying.dto.SysUser;
import com.lanying.service.ISysUserService;

@Service
public class SysUserServiceImpl implements ISysUserService {
	
	@Autowired
	private ISysUserDAO sysUserDAO;
	
	@Override
	public List<SysUser> queryList() {
		return sysUserDAO.queryList();
	}

	@Override
	public List<SysUser> queryListByPage(Integer page, Integer pageSize) {
		return sysUserDAO.queryListByPage((page-1)*pageSize, pageSize);
	}

	@Override
	public String getPasswordByLoginName(String loginName) {
		return sysUserDAO.getPasswordByLoginName(loginName);
	}
	
	@Override
	public List<String> querySysRoleListByLoginName(String loginName) {
		// TODO Auto-generated method stub
		return null;
	}
}
