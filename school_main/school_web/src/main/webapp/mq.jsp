<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE HTML>
<html>
	<head>
		<title>消息队列</title>
	</head>
	
	<body>
		<form action="<%=request.getContextPath()%>/mq/reciveMessage" method="post">
			消息：
			<input type="text" name="message" />
			<input type="submit" value="发送到MQ" />
		</form>
	</body>
</html>