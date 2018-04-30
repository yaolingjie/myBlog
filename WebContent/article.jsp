<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<div class="first_show begin1">
                    <div class="headBigdiv" >
                        <div class="head_bigdiv">
                        <ul style="list-style: none;">
	                        <c:forEach items="${listJava}" var="list" >
								<li><a href="show?version=${list.version}">${list.blogTittle}</a></li>
	                        </c:forEach>
                        </ul>
                        </div>
                    </div>
                </div>
                <div class="begin1">
                    <div class="headBigdiv" >
                        <div class="head_bigdiv">
                        	<ul style="list-style: none;">
		                        <c:forEach items="${listOracle}" var="list" >
									<li><a href="show?version=${list.version}">${list.blogTittle}</a></li>
		                        </c:forEach>
                        	</ul>
                        </div>
                    </div>
                </div>
                <div class="begin1">
                    <div class="headBigdiv" >
                        <div class="head_bigdiv">
                        	<ul style="list-style: none;">
		                        <c:forEach items="${listJS}" var="list" >
									<li><a href="show?version=${list.version}">${list.blogTittle}</a></li>
		                        </c:forEach>
                        	</ul>
                        </div>
                    </div>
                </div>
                <div class="begin1">
                    <div class="headBigdiv" >
                        <div class="head_bigdiv">
                        	<ul style="list-style: none;">
		                        <c:forEach items="${listAjax}" var="list" >
									<li><a href="show?version=${list.version}">${list.blogTittle}</a></li>
		                        </c:forEach>
                        	</ul>
                        </div>
                    </div>
                </div>
                <div class="begin1">
                    <div class="headBigdiv" >
                        <div class="head_bigdiv">
                        	<ul style="list-style: none;">
		                        <c:forEach items="${listjQuery}" var="list" >
									<li><a href="show?version=${list.version}">${list.blogTittle}</a></li>
		                        </c:forEach>
                        	</ul>
                        </div>
                    </div>
                </div>
                <div class="begin1">
                    <div class="headBigdiv" >
                        <div class="head_bigdiv">
                        	<ul style="list-style: none;">
		                        <c:forEach items="${listSpring}" var="list" >
									<li><a href="show?version=${list.version}">${list.blogTittle}</a></li>
		                        </c:forEach>
                        	</ul>
                        </div>
                    </div>
                </div>
                <div class="begin1">
                    <div class="headBigdiv" >
                        <div class="head_bigdiv">
                        	<ul style="list-style: none;">
		                        <c:forEach items="${listMybatis}" var="list" >
									<li><a href="show?version=${list.version}">${list.blogTittle}</a></li>
		                        </c:forEach>
                        	</ul>
                        </div>
                    </div>
                </div>
</body>
</html>