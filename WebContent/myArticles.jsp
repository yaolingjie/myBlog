<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<script src="js/jquery-3.3.1.js"></script>
</head>
<body>
	<div class="headBigdiv" >
         <div class="head_bigdiv">
	          <ul style="list-style: none;">
	           <c:forEach items="${myArticles}" var="list" >
					<li>
						<a href="show?version=${list.version}">${list.blogTittle}</a>
						<br>
						<a href="deleteMyArticle?version=${list.version}" class="deleteMyArticle">删除</a>
					</li>
					
	           </c:forEach>
	          </ul>
         </div>
     </div>
     <script>
	     $(function(){
	     	$(".deleteMyArticle").click(function(){
	     		if(confirm("确认要删除？")){
		     		var url = $(this).attr("href");
		     		$.get(url, function(data){
		     			alert(data);
		     			window.location.reload();
		     		});
						     			
	     		}
	     		return false;
	     	})    	 
	     })
     </script>
</body>
</html>