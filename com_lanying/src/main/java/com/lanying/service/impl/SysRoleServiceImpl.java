package com.lanying.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanying.dao.ISysRoleDAO;
import com.lanying.dao.ISysUserDAO;
import com.lanying.dto.SysRole;
import com.lanying.service.ISysRoleService;

@Service
public class SysRoleServiceImpl implements ISysRoleService {
	
	@Autowired
	private ISysUserDAO sysUserDAO;
	
	@Autowired
	private ISysRoleDAO sysRoleDAO;
	
	@Override
	public List<SysRole> queryListByLoginName(String loginName) {
		Integer userId = sysUserDAO.getIdByLoginName(loginName);
		return sysRoleDAO.queryListByUserId(userId);
	}

	@Override
	public List<String> getNamesByLoginName(String loginName) {
		Integer userId = sysUserDAO.getIdByLoginName(loginName);
		return sysRoleDAO.getNameListByUserId(userId);
	}
}
