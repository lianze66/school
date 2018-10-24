package com.lanying.service;

import java.util.List;

import com.lanying.dto.SysModel;

public interface ISysModelService {
	
	List<SysModel> getTreeList();
	
	List<String> getNamesByLoginName(String loginName);
	
}
