package com.lanying.dto;

import java.util.List;

public class SysModel {
	
	private Integer id;
	
	private String name;
	
	private Integer parentId;
	
	private String url;
	
	private String icon;
	
	private List<SysModel> childList;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getParentId() {
		return parentId;
	}

	public void setParentId(Integer parentId) {
		this.parentId = parentId;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getIcon() {
		return icon;
	}

	public void setIcon(String icon) {
		this.icon = icon;
	}

	public List<SysModel> getChildList() {
		return childList;
	}

	public void setChildList(List<SysModel> childList) {
		this.childList = childList;
	}
}
