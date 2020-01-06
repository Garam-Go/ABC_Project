<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>고객센터</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

<style>
#inner-navbar {
	background: yellow;
	width: 300px;
	height: 100%;
	margin: 10px;
	float: left;
	padding-top: 30px;
	font-size: 20px;
}

#inner-content {
	background: skyblue;
	width: 70%;
	height: 100%;
	margin: 10px;
	float: left;
}

	#table-qna {
	background:white;
	width: 800px;
	border: 1px solid;
	margin:100px auto;
}
	table tr td{
		border-collapse: collapse;
		padding:5px;
	}
	
	.msg-detail:hover{
		cursor: pointer;
		background:lightgreen;
	}
</style>
</head>
<body>
<div id="page">
	<div id="header">
		<h1>고객센터</h1>
		<div id="login">
			<jsp:include page="../loginmenu.jsp"></jsp:include>
		</div>
	    <div id="navbar">
			<jsp:include page="../../navBar.jsp"></jsp:include>
	    </div>
	</div>
	<div id="content">
		<div id="inner-navbar">
			<jsp:include page="../MyNavList.jsp"></jsp:include>
		</div>
		<div id="inner-content">
			<input type="hidden" value="${mid }" id="mid">
			<table id="table-qna">
				<tr style="background:lightgreen;">
					<td>번호</td>
					<td>QnA제목</td>
				</tr>
				<tr>
					<td>1</td>
					<td>메세지가 보내지지 않을경우</td>
				</tr>
			</table>		
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
<script>

</script>
</html>