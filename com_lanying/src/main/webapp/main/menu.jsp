<%@page contentType="text/html; charset=UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<script src="<%=request.getContextPath()%>/main/js/jquery-3.2.1.min.js"></script>

<script type="text/javascript">
	$().ready(function(){
		$("a").map(function(){
			if(window.location.pathname == $(this).attr("href")) {
				$(this).parent().parent().parent().addClass("is-expanded");
				$(this).addClass("active");
			};
		});
	});
</script>

<div class="app-sidebar__overlay" data-toggle="sidebar"></div>
<aside class="app-sidebar">
	<ul class="app-menu">
		<c:forEach items="${menuList}" var="sysModel">
		    <li class="treeview">
		    	<a class="app-menu__item" href="#" data-toggle="treeview">
		    		<i class="app-menu__icon fa ${sysModel.icon}"></i>
		    		<span class="app-menu__label">${sysModel.name}</span>
		    		<i class="treeview-indicator fa fa-angle-right"></i>
		    	</a>
		    	<ul class="treeview-menu">
		    		<c:forEach items="${sysModel.childList}" var="childSysModel">
		    			<li><a class="treeview-item" href="<%=request.getContextPath()%>${childSysModel.url}"><i class="icon fa fa-circle-o"></i> ${childSysModel.name}</a></li>
		    		</c:forEach>
		    	</ul>
		    </li>
		</c:forEach>
	</ul>
</aside>