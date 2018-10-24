package com.lanying.service;

import java.util.List;

import com.lanying.dto.SysRole;

public interface ISysRoleService {
	
	List<SysRole> queryListByLoginName(String loginName);
	
	List<String> getNamesByLoginName(String loginName);
	
}
