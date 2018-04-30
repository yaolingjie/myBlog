<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
</head>
<body>
	<form action="changePassword" method="post">
		<table>
			<tr>
				<td>用户名</td>
				<td><input type="text" name="userName" id="userName" readonly="readonly" value="${userName}"/></td>
			</tr>
			<tr>
				<td>请输入密码:</td>
				<td><input type="password" id="password" name="password"/></td>
			</tr>
			<tr>
				<td>请再次输入密码:</td>
				<td><input type="password" id="againPassword" name="againPassword"/></td>
			</tr>
		</table>
		<div id="message"></div>
		<input type="submit" value="确认" id="button"/>
	</form>
	<script type="text/javascript">
		$("#button").click(function(){
			$("#message").html();
			var userName = $("#userName").val();
			var password = $("#password").val();
			var againPassword = $("#againPassword").val();
			if(password != againPassword){
				$("#message").html("<font color='red'>两次输入密码不一样</font>");
				
				return false;
			}
		})
		
	</script>	
</body>
</html>