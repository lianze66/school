package com.lanying.dao;

import java.util.List;

import com.lanying.dto.SysRole;

public interface ISysRoleDAO {
	
	List<SysRole> queryListByUserId(Integer userId);
	
	List<String> getNameListByUserId(Integer userId);
	
}
