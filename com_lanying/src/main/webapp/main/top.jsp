<%@page contentType="text/html; charset=UTF-8"%>

<header class="app-header">
	<a class="app-header__logo" href="<%=request.getContextPath()%>/main/index.jsp">蓝英教育</a>
	<a class="app-sidebar__toggle" href="#" data-toggle="sidebar" aria-label="Hide Sidebar"></a>
	
	<ul class="app-nav">
		<li class="app-search"><input class="app-search__input" type="search" placeholder="Search">
			<button class="app-search__button">
				<i class="fa fa-search"></i>
			</button>
		</li>
		
		<!-- User Menu-->
		<li class="dropdown">
			<a class="app-nav__item" href="#" data-toggle="dropdown" aria-label="Open Profile Menu">
				<i class="fa fa-user fa-lg"></i>
			</a>
			<ul class="dropdown-menu settings-menu dropdown-menu-right">
				<li><a class="dropdown-item" href="page-user.html"><i class="fa fa-cog fa-lg"></i> Settings</a></li>
				<li><a class="dropdown-item" href="page-user.html"><i class="fa fa-user fa-lg"></i> Profile</a></li>
				<li><a class="dropdown-item" href="page-login.html"><i class="fa fa-sign-out fa-lg"></i> Logout</a></li>
			</ul>
		</li>
	</ul>
</header>