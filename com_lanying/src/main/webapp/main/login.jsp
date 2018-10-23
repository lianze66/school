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
						<label class="control-label">名称</label> <input class="form-control" type="text" name="loginName" placeholder="用户名称" autofocus>
					</div>
					<div class="form-group">
						<label class="control-label">密码</label> <input class="form-control" type="password" name="password" placeholder="用户密码">
					</div>
					<div class="form-group">
						<div class="utility">
							<div class="animated-checkbox">
								<label> <input type="checkbox"><span class="label-text">记住用户名</span></label>
							</div>
							<p class="semibold-text mb-2">
								<a href="#" data-toggle="flip">忘记密码?</a>
							</p>
						</div>
					</div>
					<div class="form-group btn-container">
						<button class="btn btn-primary btn-block"><i class="fa fa-sign-in fa-lg fa-fw"></i>登录</button>
					</div>
				</form>
	
				<form class="forget-form" action="index.html">
					<h3 class="login-head">
						<i class="fa fa-lg fa-fw fa-lock"></i>Forgot Password ?
					</h3>
					<div class="form-group">
						<label class="control-label">EMAIL</label> <input
							class="form-control" type="text" placeholder="Email">
					</div>
					<div class="form-group btn-container">
						<button class="btn btn-primary btn-block">
							<i class="fa fa-unlock fa-lg fa-fw"></i>RESET
						</button>
					</div>
					<div class="form-group mt-3">
						<p class="semibold-text mb-0">
							<a href="#" data-toggle="flip"><i
								class="fa fa-angle-left fa-fw"></i> Back to Login</a>
						</p>
					</div>
				</form>
			</div>
		</section>
	
		<%@include file="/include/js.jsp"%>
	
		<script type="text/javascript">
			$('.login-content [data-toggle="flip"]').click(function() {
				$('.login-box').toggleClass('flipped');
				return false;
			});
		</script>
	</body>
</html>