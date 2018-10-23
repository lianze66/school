package com.lanying.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.lanying.dto.SysUser;

public interface ISysUserDAO {
	
	List<SysUser> queryList();
	
	List<SysUser> queryListByPage(@Param("pageIndex")Integer pageIndex, @Param("pageSize")Integer pageSize);
	
	String getPasswordByLoginName(String loginName);
	
}
