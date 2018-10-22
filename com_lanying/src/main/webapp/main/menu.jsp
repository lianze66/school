<%@page contentType="text/html; charset=UTF-8"%>

<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
<aside class="app-sidebar">
	<ul class="app-menu">
	    <li>
	    	<a class="app-menu__item active" href="<%=request.getContextPath()%>/main/sysUser.jsp">
	    		<i class="app-menu__icon fa fa-user"></i>
	    		<span class="app-menu__label">个人信息</span>
	    	</a>
	    </li>
	    <li class="treeview">
	    	<a class="app-menu__item" href="#" data-toggle="treeview">
	    		<i class="app-menu__icon fa fa-laptop"></i>
	    		<span class="app-menu__label">系统设置</span>
	    		<i class="treeview-indicator fa fa-angle-right"></i>
	    	</a>
	    	<ul class="treeview-menu">
	    		<li><a class="treeview-item" href="<%=request.getContextPath()%>/sysUser/list"><i class="icon fa fa-circle-o"></i> 人员管理</a></li>
	    		<li><a class="treeview-item" href="<%=request.getContextPath()%>/sysUser/list"><i class="icon fa fa-circle-o"></i> 角色管理</a></li>
	    		<li><a class="treeview-item" href="<%=request.getContextPath()%>/sysUser/list"><i class="icon fa fa-circle-o"></i> 模块管理</a></li>
	    		<li><a class="treeview-item" href="<%=request.getContextPath()%>/sysUser/list"><i class="icon fa fa-circle-o"></i> 权限管理</a></li>
	    	</ul>
	    </li>
	</ul>
</aside>