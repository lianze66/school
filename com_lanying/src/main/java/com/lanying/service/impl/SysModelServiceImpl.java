package com.lanying.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lanying.dao.ISysModelDAO;
import com.lanying.dto.SysModel;
import com.lanying.service.ISysModelService;

@Service
public class SysModelServiceImpl implements ISysModelService {
	
	@Autowired
	private ISysModelDAO sysModelDAO;
	
	@Override
	public List<SysModel> getTreeList() {
		List<SysModel> parentList = sysModelDAO.getListByParentId(0); // 0代表的是根节点。
		for (SysModel sysModel : parentList) {
			List<SysModel> childList = sysModelDAO.getListByParentId(sysModel.getId());
			sysModel.setChildList(childList);
		}
		return parentList;
	}

	@Override
	public List<String> getNamesByLoginName(String loginName) {
		return sysModelDAO.getNamesByLoginName(loginName);
	}
}
