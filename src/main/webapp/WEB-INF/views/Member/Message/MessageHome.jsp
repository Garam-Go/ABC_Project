<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
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
	#table-hospital{
		width:800px;
		background:white;
		margin:100px auto;
		
	}
	table tr td{
		border-collapse: collapse;
	}
</style>
</head>
<body>
<div id="page">
	<div id="header">
		<h1>마이페이지</h1>
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
			<table id="table-hospital" border=1></table>
			<script id="temp" type="text/x-handlebars-templete">
				<tr style= "background:lightgreen;">
					<td width=50>
						<input type="checkbox" id="chk-all">
					</td>
					<td width=300>제목</td>
					<td width=100>보낸사람</td>
					<td width=150>보낸날짜</td>
					<td width=100>답장</td>
				</tr>
				{{#each list}}
					<tr>
						<td width=50>
							<input type="checkbox" id="chk-in">
						</td>
						<td width=300>{{mstitle}}</td>
						<td width=100>2</td>
						<td width=150>3</td>
						<td width=100>
							<button>답장</button>
						</td>
					</tr>
				{{/each}}
			</script>

		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
</html>