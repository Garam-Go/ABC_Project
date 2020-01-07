<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">
	<title>MedicineMain</title>
	<style>
/* 		body { */
/* 			margin:0px; */
/* 			padding:0px; */
/* 			background:darkgray; */
/* 		} */
/* 		#page { */
/* 			width:1200px; */
/* 			height:1800px; */
/* 			margin:20px auto; */
/* 			background:white; */
/* 			text-align:center; */
/* 			box-shadow:1px 5px 5px gray; */
/* 		} */
/* 		#top{ */
/* 			background:gray; */
/* 			width:1200px; */
/* 			height:150px; */
/* 			margin-bottom:50px; */
/* 		} */
/* 		#content{ */
/* 			margin:0 auto; */
/* 			width:1200px; */
/* 			height:700px; */
/* 			position:relative; */
/* 		} */
		#left{
			width:150px;
			height:410px;
			background:white;
			margin-top:100px;
			margin-left:50px;
			margin-right:45px;
			float:left;
		}
		#left1{
			border:1px solid black;
			width:150px;
			height:170px;
			background:white;
			margin-bottom:70px;
		}
		#left2{
			border:1px solid black;
			width:150px;
			height:170px;
			background:white;
		}
		#center{
			width:700px;
			height:600px;
			background:white;
			margin:20px auto;
			float:left;
		}
		#right{
			width:150px;
			height:170px;
			float:right;
			margin-top:100px;
			margin-left:40px;
			margin-right:50px;
		}
		.right1{
			border:1px solid black;
			width:150px;
			height:50px;
			background:white;
			margin-bottom:70px;
			
		}
		.right2{
			border:1px solid black;
			width:150px;
			height:50px;
			background:white;
		}
		table{
			border-color:black;
			border-collapse:collapse;
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
			<div id="search" style="margin-bottom:50px;">
				<input type="text">
				<button onClick="location.href='medicineSearchResult'">검색</button>
			</div>
			<div id="left">
				<jsp:include page="left.jsp"></jsp:include>		
			</div>
			<div id="center">
				<div class="center1">
					
				</div>
			</div>
			<div id="right">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
		
		<div id="bottom"></div>
	</div>
</body>
</html>