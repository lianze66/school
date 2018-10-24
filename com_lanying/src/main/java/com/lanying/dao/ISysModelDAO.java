package com.lanying.dao;

import java.util.List;

import com.lanying.dto.SysModel;

public interface ISysModelDAO {
	
	List<SysModel> getListByParentId(Integer parentId);
	
	List<SysModel> getListByLoginName(String loginName);
	
	List<String> getNamesByLoginName(String loginName);
}
