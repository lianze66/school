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
	
		<jsp:include page="/sysUser/loadMenuData.do"></jsp:include>
		
		<main class="app-content">111</main>
	    
		<%@include file="/include/js.jsp"%>
		
	</body>
</html>