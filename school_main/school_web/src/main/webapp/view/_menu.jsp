<%@page contentType="text/html; charset=UTF-8"%>

<script type="text/javascript" src="<%=request.getContextPath()%>/view/js/jquery-1.9.0.js"></script>

<script type="text/javascript">
	$(function() {
		var url = window.location.href;
		if(url.indexOf("course.jsp") != -1) {
			$("#menu_2").addClass("m-active");
		} else if(url.indexOf("video.jsp") != -1) {
			$("#menu_3").addClass("m-active");
		} else if(url.indexOf("audition.jsp") != -1) {
			$("#menu_4").addClass("m-active");
		} else if(url.indexOf("message.jsp") != -1) {
			$("#menu_5").addClass("m-active");
		}		
	});
</script>

<div class="nav-sub m-box">
	<div class="m-box-col">
		<a href="<%=request.getContextPath()%>/view/index.jsp">首页</a>
	</div>
	<div class="m-box-col">
		<a id="menu_2" href="<%=request.getContextPath()%>/view/course.jsp">课程</a>
	</div>
	<div class="m-box-col">
		<a id="menu_3" href="<%=request.getContextPath()%>/view/video.jsp">视频</a>
	</div>
	<div class="m-box-col">
		<a id="menu_4" href="<%=request.getContextPath()%>/view/audition.jsp">听听</a>
	</div>
	<div class="m-box-col">
		<a id="menu_5" href="<%=request.getContextPath()%>/view/message.jsp">留言</a>
	</div>
</div>