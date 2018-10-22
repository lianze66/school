<%@page contentType="text/html; charset=UTF-8"%>

<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
		
		<jsp:include page="../top.jsp"></jsp:include>
	
		<jsp:include page="../menu.jsp"></jsp:include>
		
		<main class="app-content">
			<div class="row">
				<div class="col-md-12">
					<div class="tile">
						<div class="tile-body">
							<table class="table table-hover table-bordered">
								<thead>
									<tr>
										<th>序号</th>
										<th>登录名称</th>
										<th>密码</th>
										<th>真实姓名</th>
									</tr>
								</thead>
								<tbody>
									<c:forEach items="${list}" var="sysUser" varStatus="i">
										<tr>
											<td>${(page-1)*pageSize + i.index+1}</td>
											<td>${sysUser.loginName}</td>
											<td>${sysUser.password}</td>
											<td>${sysUser.realName}</td>
										</tr>
									</c:forEach>
								</tbody>
							</table>
							<div>
								<ul class="pagination">
								    <li><a href="#">&laquo;</a></li>
								    <li><a href="#">1</a></li>
								    <li><a href="#">2</a></li>
								    <li><a href="#">3</a></li>
								    <li><a href="#">4</a></li>
								    <li><a href="#">5</a></li>
								    <li><a href="#">&raquo;</a></li>
								</ul>
							</div>
						</div>
					</div>
				</div>
			</div>

		</main>
	    
		<%@include file="/include/js.jsp"%>
		
	</body>
</html>