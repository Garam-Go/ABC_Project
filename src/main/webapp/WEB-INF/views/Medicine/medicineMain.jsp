<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<title>MedicineMain</title>
<style>
	#left{
		width:150px;
		height:410px;
		background:white;
		margin-top:100px;
		margin-left:20px;
		margin-right:20px;
		float:left;
	}
	#left1{
		border:1px solid black;
		width:150px;
		height:170px;
		background:white;
		margin-bottom:70px;
	}
	#center{
		width:600px;
		background:white;
		margin:10px auto;
		float:left;
	}
	#right{
		width:120px;
		height:170px;
		float:right;
		margin-top:100px;
		margin-left:10px;
		margin-right:10px;
	}
	.right1{
		border:1px solid black;
		width:120px;
		height:50px;
		background:white;
		margin-bottom:70px;
		
	}
	.right2{
		border:1px solid black;
		width:120px;
		height:50px;
		background:white;
	}
		
	.right1:hover, .right2:hover{
		cursor: pointer;
	}
</style>
</head>
<body>
	<div id="page">
		<div id="login">
			<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
		</div>
		<div id="navbar">
			<jsp:include page="../Nav/navBar.jsp"></jsp:include>
		</div>
		<div id="content">
			<div id="left">
				<jsp:include page="left.jsp"></jsp:include>		
			</div>
			<div id="center">
				<div id="search" style="margin-bottom:20px;">
					<input type="text" id="keyword">
					<input type="button" id="btnsearch" value="검색">
				</div>
				<div id="searchbox">
					<jsp:include page="medicineSearchResult.jsp"></jsp:include>
				</div>
			</div>
			<div id="right">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
		
		<div id="footer"></div>
	</div>
</body>
<script>

</script>
</html>