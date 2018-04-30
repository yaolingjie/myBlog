<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<link rel="stylesheet" href="css/back.css">
</head>
<body>
<div id="back_btn">
    <a href="${pageContext.servletContext.contextPath}/index"><img src="images/back.jpg" alt="返回按钮" class="back_img"></a>
</div>
<div class="back_text">
	<p>${blog.blogTittle}</p>
    <div id="book_top">${blog.blogBody}</div>
    <div id="book_down"> 	
    	<label>评论区：</label><br>
    	<ul style="list-style: none">
			<c:forEach items="${commentList}" var="list" varStatus="status">
				<li>第${status.index + 1}楼</li>
				<li>用户：${list.userName}</li>
				<li style="border-bottom: 1px solid #ccc;padding: 5px 0 5px 0">评论：${list.comment}</li>
			</c:forEach>
    	</ul>
    </div>
    <form action="${pageContext.servletContext.contextPath}/comment" method="post">
		<div>
    	<input type="hidden" value="${blog.version}" name="version">
		    <textarea rows="10" cols="135" name="comment"></textarea>
		</div>
		<div id="foot_btn">
		    <button type="submit">提交</button>
		    <button type="reset">清空</button>
		</div>
    </form>

</div>

</body>
</html>