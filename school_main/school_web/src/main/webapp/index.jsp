<%@page contentType="text/html; charset=UTF-8"%>

<!DOCTYPE HTML>
<html>
	<head>
		<title>首页</title>
		<script type="text/javascript">
			function sendMessage() {
				var url = "ws://127.0.0.1:8080/school_web/websocket/sendMessage";
				var ws;
				if("WebSocket" in window) {
					ws = new WebSocket(url);
				} else if("MozWebSocket" in window) {
					ws = new MozWebSocket(url);
				} else {
					alert("您的浏览器版本过低，不支持websocket。");
					return;
				}
				
				alert(ws.OPEN);
				
				ws.onopen = function() {
					ws.send("Hello world");
				};
				
				ws.onmessage = function(e) {
					document.getElementById("showInfo").innerHTML=e.data;
				};
			}
		</script>
	</head>
	
	<body>
		<input type="button" value="测试websocket" onclick="sendMessage();" />
		<div id="showInfo"></div>
	</body>
</html>