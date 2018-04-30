<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>  
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>我的博客园</title>
<link rel="stylesheet" href="css/Blogger.css">
    <script src="js/jquery-3.3.1.js"></script>
</head>
<body>
<body>
<div id="header">
    <div class="head">
        <div class="row">
            <div class="heade">
                    <div class="head_left">敲出人生巅峰</div>
                    <div class="head_right">
                        
                        <%
                        	String userName = (String)session.getAttribute("userName");
                        	String userPassword = (String)session.getAttribute("userPassword");
                        	String blogName = (String)session.getAttribute("blogName");
                        	boolean b = userName == null || userPassword == null ? true : false;
               				if(b == true){
                        %>
                        		<span class="login_dl">登录</span>
                        	<span class="head_span_h"></span>
                        	<span class="login_zc">注册</span>
                        <% }else{
                 		%>
                 			<span >欢迎： <%=blogName %></span>
                 			<span class="head_span_h"></span>
                 			<span id="myArticle">我的文章</span>
                 			<span class="head_span_h"></span>
                        	<span><a href="closeUserName">注销</a></span>
                        <%} %>
                        	
                    </div>
            </div>
            <div class="split_line">
                    <div class="split_line_up"></div>
                    <div class="split_line_down"></div>
            </div>

            <div class="head_search">

                    <div class="head_search_ss">
                        <span class="Blogger_Logo">Blogger</span>
                        <span class="head_search_ssText">搜索：</span>
                        <input type="text" class="head_search_ssInput" placeholder="请输入博客文章标题或博客名" id="search">
                    </div>
                    <div class="head_search_btn">
                    <input type="submit" class="head_search_btnSub" id="searchSubmit">
                    <button class="head_search_btnBtn" onclick = "javascript:window.location.href='${pageContext.request.contextPath}/diary.jsp'">写文章</button>
                </div>
            </div>
            <div class="head_oul_all">
                <div class="head_oul">
                    <ul id="oul">
                        <li>java</li>
                        <li>Oracle</li>
                        <li>JavaScript</li>
                        <li>Ajax</li>
                        <li>jQuery</li>
                        <li>Spring</li>
                        <li>Mybatis</li>
                    </ul>
                </div>
                <div class="article">
					<%@include file="/article.jsp"%>
                </div>
                <div class="yanzhen" style="display: none">
					<%@include file="/findPassword.jsp"%>
                </div>
                <div class="searchTitle" style="display: none">
               	 	<%@include file="/searchTitle.jsp"%>
                </div>
                <div class="myArticle" style="display: none">
                	<%@include file="/myArticles.jsp"%>
                </div>
            </div>
        </div>
    </div>
</div>
<c:if test="${!empty blogTitle}">
<script>
	$(".article").css("display","none");
	$(".yanzhen").fadeOut();
	$(".searchTitle").fadeIn(1);
</script>
</c:if>


<div id="content">

</div>

<!--登录蒙版-->
<div id="mask_login">
    <div class="mask_login">
        <div class="login">
            <div class="login_top">
                <div>登录</div>
            </div>
            <div class="login_cont">
                <form action="">
                    <div class="login_acc">
                    <div id="message"></div>
                        <label>账号：</label>
                        <input type="text" placeholder="请输入账号" class="login_acc_text" id="userName">
                        <span style="color: red;cursor:pointer" id="lostPassword">忘记密码？</span>
                    </div>
                    <div class="login_pass">
                        <label>密码：</label>
                        <input type="password" placeholder="请输入密码" class="login_pass_text" id="userPassword">
                    </div>
                    <div>
                        <input type="submit" value="登录" class="login_btu_come" id="login">
                        <input type="reset" value="清空" class="login_btu_out">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>
<!--注册蒙版-->
<div id="mask_reg">
    <div class="mask_reg">
        <div class="reg">
            <div class="reg_top">
                <div>注册</div>
            </div>
            <div class="reg_cont">
                <form action="">
                    <div class="reg_acc">
                        <label>账号：</label>
                        <input type="text" placeholder="请输入账号" class="reg_acc_text" id="registerUserName">
                        <div id="registerMessage"></div>
                    </div>

                    <div class="reg_pass">
                        <label>密码：</label>
                        <input type="password" placeholder="请输入密码" class="reg_pass_text" id="registerUserPassword">
                    </div>

                    <div class="reg_phone">
                        <label class="reg_phone_num">手机号：</label>
                        <input type="text" placeholder="请输入手机号" class="reg_phone_text" id="registerPhone">
                    </div>

                    <div class="reg_Blogger">
                        <label class="reg_Blogger_num">博客名：</label>
                        <input type="text" placeholder="请输入博客名" class="reg_Blogger_text" id="registerBlogName">
                    </div>
					<div class="reg_address">
                        <label class="reg_address_num">地址：</label>
                        <input type="text" placeholder="请输入地址" class="reg_address_text" id="registerAddress">
                    </div>
                    <div class="reg_sex">
                        <label class="reg_sex_num">性别：</label>
                        <input type="radio" value="男" name="sex" class="reg_sex_man">男
                        <input type="radio" value="女" name="sex" class="reg_sex_woman">女
                    </div>
                    <div>
                        <input type="submit" value="注册" class="reg_btu_come" id="register">
                        <input type="button" value="去登录" class="reg_btu_out login_dl" id="reg_btu_out">
                    </div>
                </form>
            </div>
        </div>
    </div>
</div>

<script>
//添加li的事件-->
$(function () {
    //给所有的li添加移入事件
    $(".begin1").eq(0).css({
        display:"inline-block"
    })
    $("#oul li").mouseover(function () {
		$(".article").fadeIn(1);
		$(".myArticle").fadeOut(1);
		$(".yanzhen").css({
			display:"none"
		})
		$(".searchTitle").fadeOut(1);
        $(".begin1").css({
            display:"none"
        })
        //获取当前的li的索引

        var index = $(this).index();
        //获取全部的begin1
        var begin = $(".begin1");
        console.log(begin[index]);
        $(begin[index]).css({
            display:"inline-block"
        })

        $(this).addClass("cur_Blo_bgc").siblings("li").removeClass("cur_Blo_bgc");

    })
})

    //点击登录蒙版事件
    $(".login_dl").click(function () {
        $("#mask_login").fadeIn(1);
        $(".mask_login").fadeIn(1);
        $("#mask_reg").fadeOut(1);
        $(".mask_reg").fadeOut(1);
        

        //补上消失的滚动条宽度
        $("#header").css({
            "marginRight":"17px"
        });
        $(".mask_login").css({
            "marginRight":"17px"
        });
        document.body.style.overflow = 'hidden';
        // $(document).scroll(function () {
        //     $(document).scrollTop(0);
        // })
    });
    //点击忘记密码事件
    $("#lostPassword").click(function(){
    	$(".article").css("display","none");
		$(".yanzhen").fadeIn(1);
		$(".searchTitle").fadeOut();
    	$("#mask_login").fadeOut();
    });
    
    //点击注册蒙版事件
    $(".login_zc").click(function () {
        // alert(1222);mask_reg
        $("#mask_reg").fadeIn(1);
        $(".mask_reg").fadeIn(1);
        $("#header").css({
            "marginRight":"17px"
        });
        $(".mask_reg").css({
            "marginRight":"17px"
        });
        document.body.style.overflow = 'hidden';
    })
    
    //去登录按钮事件

//    监听鼠标点击事件
    $("#mask_login").click(function () {
        $("#mask_login").fadeOut();
        // $(document).unbind("scroll");
        $("#header").css({
            "marginRight":0
        })
        $(".mask_login").css({
            "marginRight":"0px"
        })

        document.body.style.overflow = 'scroll';
    });
    //阻止事件冒泡
    $(".mask_login").click(function (e) {
        e.stopPropagation();
    })
    //    监听鼠标点击事件
    $("#mask_reg").click(function () {
        $("#mask_reg").fadeOut();
        //补上的宽度重新设置为0
        $("#header").css({
            "marginRight":0
        })
        $(".mask_reg").css({
            "marginRight":"0px"
        })
        document.body.style.overflow = 'scroll';
    });
    //阻止事件冒泡
    $(".mask_reg").click(function (e) {
        e.stopPropagation();
    });
    
	$("#login").click(function(){
		var userName = $("#userName").val();
		var userPassword = $("#userPassword").val();
		var url="${pageContext.request.contextPath}/loginServlet";
		var args= {"userName":userName, "userPassword":userPassword, "time":new Date()};
		$.post(url, args, function(data){
			alert(data);
			var flag = data == "用户名密码正确" ? true : false;
			if(flag){
				window.location.href="http://localhost:8080/blog/index";				
			}
		});
		return false;
	});
	$("#registerUserName").blur(function(){
		var registerUserName = $("#registerUserName").val();
		var url = "${pageContext.request.contextPath}/registerUserNameCheck";
		var args = {"registerUserName" : registerUserName, "time" : new Date()};
		$.post(url, args, function(data){
			$("#registerMessage").html(data);			
		});
	});
	
	
	$("#register").click(function(){
		var registerUserName = $("#registerUserName").val();
		var registerUserPassword = $("#registerUserPassword").val();
		var registerPhone = $("#registerPhone").val();
		var registerBlogName = $("#registerBlogName").val();
		var registerMessage = $("#registerMessage").text();
		var registerSex = $("input[name='sex']:checked").val();
		var registerAddress = $("#registerAddress").val();
		var url = "${pageContext.request.contextPath}/insertServlet";
		var args = {"registerAddress" : registerAddress, "registerSex" : registerSex, "registerMessage" : registerMessage, "registerUserName" : registerUserName, "registerUserPassword" : registerUserPassword, "registerPhone" : registerPhone, "registerBlogName" : registerBlogName, "time" : new Date()};
		if(registerUserName != "" && registerUserPassword != "" && registerPhone != "" && registerBlogName != "" && registerSex != "" && registerAddress != ""){			
			$.post(url, args, function(data){
				 if(confirm(data)){
					 $.post("${pageContext.request.contextPath}/loginServlet",{"userName" : registerUserName, "userPassword" : registerUserPassword}, function(data){
						 window.location.href="${pageContext.request.contextPath}/index";	
					 });					 
				 }
				 window.location.reload();					 
			});
		} else{
			alert("注册失败。");
		}
		return false;
	});
	//点击查询按钮事件
	$("#searchSubmit").click(function(){
		$(".article").css("display","none");
		$(".yanzhen").fadeOut();
		$(".searchTitle").fadeIn(1);
		var search = $("#search").val();
		var url = "${pageContext.request.contextPath}/searchServlet";
		var args = {"search" : search, "time" : new Date()};
		$.post(url, args, function(data){
			if(data == false){
				location.reload();				
			}
		});
		
	});
	//我的文章的点击事件
	$("#myArticle").click(function(){
		$(".article").css("display","none");
		$(".yanzhen").fadeOut();
		$(".searchTitle").fadeOut();
		$(".myArticle").fadeIn(1);
	});
</script>
</body>
</html>