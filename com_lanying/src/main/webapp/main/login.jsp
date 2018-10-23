<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		
		<%@include file="/include/css.jsp"%>
		
		<title>蓝英教育后台登录</title>
	</head>
	<body>
		<section class="material-half-bg">
			<div class="cover"></div>
		</section>
		<section class="login-content">
			<div class="logo">
				<h1>蓝英教育</h1>
			</div>
			<div class="login-box">
				<form class="login-form" action="<%=request.getContextPath()%>/sysUser/login.do" method="post">
					<h3 class="login-head">
						<i class="fa fa-lg fa-fw fa-user"></i>后台登录
					</h3>
					<div class="form-group">
						<label class="control-label">名称</label>
						<font color="red">${loginNameError}</font>
						<input class="form-control" type="text" name="loginName" placeholder="用户名称" value="${loginName}" autofocus>
					</div>
					<div class="form-group">
						<label class="control-label">密码</label>
						<font color="red">${passwordError}</font>
						<input class="form-control" type="password" name="password" value="${password}" placeholder="用户密码">
					</div>
					<div class="form-group">
						<div class="utility">
							<div class="animated-checkbox">
								<label> <input type="checkbox"><span class="label-text">记住用户名</span></label>
							</div>
						</div>
					</div>
					<div class="form-group btn-container">
						<button class="btn btn-primary btn-block"><i class="fa fa-sign-in fa-lg fa-fw"></i>登录</button>
					</div>
				</form>
			</div>
		</section>
	
		<%@include file="/include/js.jsp"%>
	</body>
</html>