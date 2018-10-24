<%@page contentType="text/html; charset=UTF-8"%>

<%@ taglib prefix="shiro" uri="http://shiro.apache.org/tags"%>
<shiro:hasRole name="admin"></shiro:hasRole>

<!DOCTYPE html>
<html lang="en">
	<head>
		<!-- Open Graph Meta-->
		<title>蓝英教育后台管理系统</title>
		<meta charset="utf-8" />
		<meta http-equiv="X-UA-Compatible" content="IE=edge" />
		<meta name="viewport" content="width=device-width, initial-scale=1" />
		
		<%@include file="/include/css.jsp"%>
	</head>
	<body class="app sidebar-mini rtl">
		
		<jsp:include page="top.jsp"></jsp:include>
	
		<jsp:include page="/sysUser/loadMenuData.do"></jsp:include>
	
		<main class="app-content" style="margin-top: 20px;">
			<div class="row user col-md-12">
				<div class="tab-content">
					<div class="tab-pane active" id="user-timeline">
						<div class="timeline-post">
							<div class="post-media">
								<a href="#"><img
									src="https://s3.amazonaws.com/uifaces/faces/twitter/jsa/48.jpg"></a>
								<div class="content">
									<h5><a href="#"><shiro:principal /></a></h5>
									<p class="text-muted"><small>2 January at 9:30</small></p>
								</div>
							</div>
							<div class="post-content">
								<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
									sed do eiusmod tempor incididunt ut labore et dolore magna
									aliqua. Ut enim ad minim veniam, quis tion ullamco laboris nisi
									ut aliquip ex ea commodo consequat. Duis aute irure dolor in
									reprehenderit in voluptate velit esse cillum dolore eu fugiat
									nulla pariatur. Excepteur sint occaecat cupidatat non proident,
									sunt in culpa qui officia deserunt mollit anim id est laborum.</p>
							</div>
							<ul class="post-utility">
								<li class="likes">
									<a href="#"><i class="fa fa-fw fa-lg fa-thumbs-o-up"></i>Like</a></li>
								<li class="shares">
									<a href="#"><i class="fa fa-fw fa-lg fa-share"></i>Share</a></li>
								<li class="comments"><i class="fa fa-fw fa-lg fa-comment-o"></i>
									5 Comments</li>
							</ul>
						</div>
					</div>
				</div>
			</div>
		</main>
		
		<%@include file="/include/js.jsp"%>
		
	</body>
</html>