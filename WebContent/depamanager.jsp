<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
  <head>
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta name="description" content="">
    <meta name="author" content="Dashboard">
    <meta name="keyword" content="Dashboard, Bootstrap, Admin, Template, Theme, Responsive, Fluid, Retina">

    <title>DASHGUM - Bootstrap Admin Template</title>

    <!-- Bootstrap core CSS -->
    <link href="assets/css/bootstrap.css" rel="stylesheet">
    <!--external css-->
    <link href="assets/font-awesome/css/font-awesome.css" rel="stylesheet" />
        
    <!-- Custom styles for this template -->
    <link href="assets/css/style.css" rel="stylesheet">
    <link href="assets/css/style-responsive.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/libs/html5shiv/3.7.0/html5shiv.js"></script>
      <script src="https://oss.maxcdn.com/libs/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>

  <body>

  <section id="container" >
      <!-- **********************************************************************************************************************************************************
      TOP BAR CONTENT & NOTIFICATIONS
      *********************************************************************************************************************************************************** -->
      <!--header start-->
      <nav class="navbar navbar-default navbar-inverse navbar-fixed-top " role="navigation">
          <div class="container">
              <div class="row">
                  <!-- Brand and toggle get grouped for better mobile display -->
                  <div class="navbar-header">
                      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
                          <span class="sr-only">Toggle navigation</span>
                          <span class="icon-bar"></span>
                          <span class="icon-bar"></span>
                          <span class="icon-bar"></span>
                      </button>
                      <a class="navbar-brand" href="#">Boot3Admin</a>
                  </div>
                  <!-- Collect the nav links, forms, and other content for toggling -->
                  <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                      <ul class="nav navbar-nav">
                          <li class="active"><a href="#">首页</a></li>
                          <li ><a href="#">关于我们</a></li>
                          <li class="dropdown">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">下拉菜单<b class="caret"></b></a>
                              <ul class="dropdown-menu">
                                  <li><a href="#">Action</a></li>
                                  <li><a href="#">Another action</a></li>
                                  <li><a href="#">Something else here</a></li>
                                  <li class="divider"></li>
                                  <li><a href="#">Separated link</a></li>
                                  <li class="divider"></li>
                                  <li><a href="#">One more separated link</a></li>
                              </ul>
                          </li>
                      </ul>
                      <form class="navbar-form navbar-left" method="POST"  action="${pageContext.request.contextPath}/depaManage?method=Search">
                          <div class="form-group">
                              <input type="text" class="form-control" id="search" name="search" placeholder="请输入内容">
                          </div>
                          <button type="submit" class="btn btn-default">搜索</button>
                      </form>
                      <ul class="nav navbar-nav navbar-right">
                          <li><a href="#">链接</a></li>
                          <li class="dropdown">
                          
                         <c:if test="${!empty user }">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown" style="color:red">欢迎你，${user.name}<b class="caret"></b></a>
						</c:if>
						<c:if test="${empty user }">
                              <a href="#" class="dropdown-toggle" data-toggle="dropdown">管理员<b class="caret"></b></a>
						</c:if>
						
						<ul class="dropdown-menu">
                                  <li><a href="#">设置</a></li>
                                  <li><a href="#">个人资料</a></li>
                                  <li><a href="#">账户中心</a></li>
                                  <li class="divider"></li>
                                  <li><a href="#">退出登录</a></li>
                              </ul>
                          </li>
                      </ul>
                  </div><!-- /.navbar-collapse -->
              </div>
          </div>
      </nav>
      <!--header end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN SIDEBAR MENU
      *********************************************************************************************************************************************************** -->
<!--sidebar start-->
      <aside>
          <div id="sidebar"  class="nav-collapse ">
              <!-- sidebar menu start-->
              <ul class="sidebar-menu" id="nav-accordion">
              
              	  <p class="centered"><a href="profile.html"><img src="assets/img/ui-sam.jpg" class="img-circle" width="60"></a></p>
              	  <h5 class="centered">寸金人力资源管理系统</h5>
              	  	
                  <li class="mt">
                      <a class="active" href="index.jsp">
                          <i class="fa fa-dashboard"></i>
                          <span>系统初始化</span>
                      </a>
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-desktop"></i>
                          <span>系统管理</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="${pageContext.request.contextPath}/userManage?method=UserManage">用户管理</a></li>
                          <li><a  href="modifypwd.jsp">口令设置</a></li>
                          <!--<li><a  href="panels.html">Panels</a></li>-->
                      </ul>
                  </li>

                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-cogs"></i>
                          <span>基本信息管理</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="depamanager.jsp">部门管理</a></li>
                          <li><a  href="empmanager.jsp">员工信息</a></li>
                          <!--<li><a  href="todo_list.html">Todo List</a></li>-->
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-book"></i>
                          <span>人事管理</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="blank.html">人事信息管理</a></li>
                          <li><a  href="login.html">新员工登记</a></li>
                          <li><a  href="lock_screen.html">员工调动管理</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-tasks"></i>
                          <span>工资管理</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="form_component.html">工资信息管理</a></li>
						  <li><a  href="#">员工奖罚管理</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class="fa fa-th"></i>
                          <span>工具</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="basic_table.html">计算器</a></li>
                          <li><a  href="responsive_table.html">记事本</a></li>
						   <li><a  href="#">快捷方式</a></li>
                      </ul>
                  </li>
                  <li class="sub-menu">
                      <a href="javascript:;" >
                          <i class=" fa fa-bar-chart-o"></i>
                          <span>Charts</span>
                      </a>
                      <ul class="sub">
                          <li><a  href="morris.html">Morris</a></li>
                          <li><a  href="chartjs.html">Chartjs</a></li>
                      </ul>
                  </li>

              </ul>
              <!-- sidebar menu end-->
          </div>
      </aside>
      <!--sidebar end-->
      
      <!-- **********************************************************************************************************************************************************
      MAIN CONTENT
      *********************************************************************************************************************************************************** -->
      <!--main content start-->
      <section id="main-content">
          <section class="wrapper">
          	<h3><i class="fa fa-angle-right"></i>部门管理</h3>
			

              <div class="row mt">
                  <div class="col-md-12">
                      <div class="content-panel">
                      
                      <a href="${pageContext.request.contextPath}/depaManage?method=depaManager" style="font-size:20px">&nbsp;&nbsp;刷新</a>
                          
                          <table class="table table-striped table-advance table-hover">
	                  	  	  <h4><i class="fa fa-angle-right"></i> 部门管理</h4>
	                  	  	  <hr>
                              <thead>
                              <tr>
                                  <th><i class="fa fa-bullhorn"></i> 部门编号</th>
                                  <th class="hidden-phone"><i class="fa fa-question-circle"></i> 部门名称</th>
                                  <th><i class="fa fa-bookmark"></i> 部门电话</th>
                                  <th><i class=" fa fa-edit"></i> 部门负责人</th>
                                  <th></th>
                              </tr>
                              </thead>
                              <tbody>
                              
                             <c:forEach items="${pageBean.list}" var="depa" varStatus="i">
                              <tr>
                                  <td><a href="basic_table.html#">${depa.depa_id}</a></td>
                                  <td class="hidden-phone">${depa.depa_name}</td>
                                  <td>${depa.depa_phone}</td>
                                  <td>${depa.minister} </td> 
                                  <td>
                                     <button class="btn btn-success btn-xs" onclick="javascript:window.location.href='adddepafrom.jsp'">
                                      <i class="fa glyphicon glyphicon-plus"></i></button> 
                                      <button class="btn btn-primary btn-xs" onclick="javascript:window.location.href='${pageContext.request.contextPath}/depaManage?method=alterDepa&depaid=${depa.depa_id}'">
                                      <i class="fa fa-pencil"></i></button>
                                      <button  class="btn btn-danger btn-xs" onclick="del(this, '${i.index + 1}', ${depa.depa_id});">
                                      <input type="hidden" value="${depa.depa_id}">
                                      <i class="fa fa-trash-o "></i>
                                      </button>
                                  </td>
                              </tr>
                              </c:forEach>
                              
                              </tbody>
                          </table>
                      </div><!-- /content-panel -->
                  </div><!-- /col-md-12 -->
              </div><!-- /row -->



	 <div class="pagination-container" style="margin-left: 500px;margin-top: 100px;">
                 <ul class="pagination">
                 <c:if test="${pageBean.currentPage==1}">
                     <li><a href="javascript:void(0);">&laquo;</a></li>
              	 </c:if>
                 <c:if test="${pageBean.currentPage!=1}">
                     <li><a href="${pageContext.request.contextPath}/depaManage?method=depaManager&currentPage=${pageBean.currentPage-1}">&laquo;</a></li>
              	 </c:if>
              	 
              	 
	 		<!-- 显示每一页 -->
			<c:forEach begin="1" end="${pageBean.totalPage}" var="page">
			<c:forEach begin="1" end="5"></c:forEach>
			<!-- 判断是否当前页 -->
			<c:if test="${page==pageBean.currentPage}">
			<!-- 	href=”javascript:void(0);”这个的含义是，让超链接去执行一个js函数，而不是去跳转到一个地址，
   			而void(0)表示一个空的方法，也就是不执行js函数。 -->
				<li class="active"><a href="javascript:void(0);">${page}</a></li>
			</c:if>
			<c:if test="${page!=pageBean.currentPage}">
				<li><a href="${pageContext.request.contextPath}/depaManage?method=depaManager&currentPage=${page}">${page}</a></li>
			</c:if>
			</c:forEach>
			
			
            <!--下一页  -->
			<c:if test="${pageBean.currentPage==pageBean.totalPage}">
				<li class="disable">
					<a href="javascript:void(0);"> &raquo;</a>
				</li>
			</c:if>
			<c:if test="${pageBean.currentPage!=pageBean.totalPage}">
				<li>
					<a href="${pageContext.request.contextPath}/depaManage?method=depaManager&currentPage=${pageBean.currentPage+1}"> 
						&raquo;
					</a>
				</li>
			</c:if>
                 </ul>
                 <div >
                 <label>&nbsp;&nbsp;&nbsp;&nbsp;转到第</label>
	                 <input  type="text" id="test" name="test" style="width:40px;hight:30px">
	                 <label>页</label>
	                 <input type="button" value="跳转" id="jumpBtn" onclick=""> 
	                 </div>
             </div>

				
		</section><! --/wrapper -->
      </section><!-- /MAIN CONTENT -->
      
     
      <!--main content end-->
      <!--footer start-->
      <footer class="site-footer" style="margin-top: 200px;">
          <div class="text-center" ">
            <p><small>&copy; All Rights Reserved @ <a href="#" target="_blank" >寸金人力资源管理系统</a> </small></p> <a href="basic_table.html#" class="go-top">
                  <i class="fa fa-angle-up"></i>
              </a>
          </div>
      </footer>
      <!--footer end-->
  </section>

    <!-- js placed at the end of the document so the pages load faster -->
    <script src="assets/js/jquery.js"></script>
    <script src="assets/js/bootstrap.min.js"></script>
    <script class="include" type="text/javascript" src="assets/js/jquery.dcjqaccordion.2.7.js"></script>
    <script src="assets/js/jquery.scrollTo.min.js"></script>
    <script src="assets/js/jquery.nicescroll.js" type="text/javascript"></script>


    <!--common script for all pages-->
    <script src="assets/js/common-scripts.js"></script>

   
    
   <script type="text/javascript">
    $("#test").change(function(){
		    var test = $("#test").val();
    		$("#jumpBtn").attr("onclick", "javascrtpt:window.location.href="+ "'${pageContext.request.contextPath}/depaManage?method=depaManager&currentPage=" + test + "'");
    });
   </script>
   <script type="text/javascript">
   function del(input, index, depaId){
		 if(confirm("是要否删除？")){
			 window.location.href="${pageContext.request.contextPath}/depaManage?method=deleteDepa&did=" + depaId;
		 }
	}
   </script>
  </body>
</html>