<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-theme.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/css/blog.css">
<script
	src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script
	src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
<title>${title }</title>
<script type="text/javascript">
	function changeClass(obj) {
		var li = obj.parentNode; //获取父节点
		li.className = "active";
	}
</script>
<style type="text/css">
body {
		background-color:transparent;
}
</style>
</head>

<body>
	<div class="container">

		<div class="row">
			<div class="col-md-4">
				<div class="blog">
					<a href="${pageContext.request.contextPath}/index.html"
						style="text-decoration:none">
						<h1>
							<strong>${blogger.nickname}的网站 </strong>
						</h1> </a>
				</div>
			</div>

		</div>

		<div class="row" style="padding-top: 20px">
			<script type="text/javascript">
				function checkData() {

					var q = document.getElementById("q").value.trim();
					if (q == null || q == "") {
						alert("请输入您要查询的关键字！");
						return false;
					} else {
						return true;
					}
				}
			</script>

			<div class="col-md-12">
				<nav class="navbar navbar-default">
				<div class="container-fluid">
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav">
							<li><a class="navbar-brand"
								href="${pageContext.request.contextPath}/index.html"
								onclick="changeClass(this)">首页</a>
							</li>
							<li><a class="navbar-brand"
								href="${pageContext.request.contextPath}/blogger/aboutme.html"
								onclick="changeClass(this)">关于站长</a>
							</li>
						</ul>
						<form action="${pageContext.request.contextPath}/blog/search.html"
							class="navbar-form navbar-right" role="search" method="post"
							onsubmit="return checkData()">
							<div class="form-group">
								<input type="text" id="q" name="q" value="${q }"
									class="form-control" placeholder="请输入要查询的关键字">
							</div>
							<button type="submit" class="btn btn-default">搜索</button>
						</form>
					</div>
					<!-- /.navbar-collapse -->
				</div>
				<!-- /.container-fluid --> </nav>
			</div>
		</div>

		<div class="row">
			<div class="col-md-9">
				<jsp:include page="${commonPage }" />
			</div>
			<div class="col-md-3">
				<jsp:include page="/foreground/blog/rightList.jsp" />
			</div>
		</div>

		<div class="row">

			<div class="col-md-12">
				<div class="footer" align="center" style="padding-top: 120px">
					<font>BLOGWEB</font>

				</div>
			</div>
		</div>

	</div>

</body>
</html>
