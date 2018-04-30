<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/dir.css">

</head>
<body>
	<!--标题-->
	<form action="writer" method="post">
	<label>选择标签：</label>
	<select name="type">
		<option value="Java">Java</option>
		<option value="Oracle">Oracle</option>
		<option value="JavaScript">JavaScript</option>
		<option value="Ajax">Ajax</option>
		<option value="jQuery">jQuery</option>
		<option value="Spring">Spring</option>
		<option value="Mybatis">Mybatis</option>
	</select>
	<div>
	    <div id="header">
	        <input type="text" placeholder="请输入标题" class="headerText" name="title">
	    </div>
	</div>
	<!--日记内容-->
	<div id="content">
	    <div id="diary">
	        <textarea name="page" id="" cols="30" rows="10" placeholder="请在输入内容" class="textarea"></textarea>
	    </div>
	</div>
	
	<div id="btn">
	    <input type="submit" value="提交" class="sub">
	    <input type="button" value="返回" class="back" onclick="window.location.href='${pageContext.request.contextPath}/index'">
	</div>
	</form>
</body>
</html>