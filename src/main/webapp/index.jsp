<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap.min.css">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/static/bootstrap3/css/bootstrap-theme.min.css">
<link rel="stylesheet" href="${pageContext.request.contextPath}/static/css/blog.css">
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/jquery-1.11.2.min.js"></script>
<script src="${pageContext.request.contextPath}/static/bootstrap3/js/bootstrap.min.js"></script>
<title>BlogWeb</title>
<style type="text/css">
body {
	background:
		url("${pageContext.request.contextPath}/background/back.jpg");
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	font-family: microsoft yahei;
}
</style>
</head>
<body>
	<div class="container">
		<div class="row">
			<div class="col-md-9"></div>
			<div class="col-md-3">
				<iframe frameborder="no" border="0" marginwidth="0" marginheight="0" width=330 height=110
					src="//music.163.com/outchain/player?type=0&id=649332310&auto=1&height=90"></iframe>
			</div>
		</div>
	</div>
	<iframe src="index.html" frameborder="0" width="100%"
		onload="javascript:this.height=this.contentWindow.document.body.scrollHeight+30;"></iframe>
</body>
</html>