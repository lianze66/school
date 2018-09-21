<html>
	<head>
		<title>Freemarker练习</title>
	</head>
	<body>
		用户名称:${userName}
		<br />
		学生名称：${student.name}  学生性别：${student.sex}
		<br />
		<#list stuList as stu>
			学生名称：${stu.name}  学生性别：${stu.sex}<br />
		</#list>
		<br />
		<#assign x>
			<#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as n> ${n}</#list>
       </#assign>
       ${x}
       <br />
       
       
       <#list ["星期一", "星期二", "星期三", "星期四", "星期五", "星期六", "星期天"] as n>
       		<#if n_index == 1 || (n_index == 3)>
       			<font color='red'>${n}</font>
       		 <#else>
       		 	<font color='blue'>${n}</font>
       		</#if>
       	</#list>
       	<br />
       	
       	${cur_time?time}
       	
	</body>
</html>
