<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<style>
#inner-navbar{
		background:yellow;
		width:200px;
		height:100%;
		margin: 10px;
		float:left;
		padding:30px;
		font-size:20px;
	}
	#inner-content{
		background:skyblue;
		width:70%;
		height:100%;
		margin: 10px;
		float:left;
	}
	#table-profile{
		width:600px;
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
			<jsp:include page="loginmenu.jsp"></jsp:include>
		</div>
	    <div id="navbar">
			<jsp:include page="../navBar.jsp"></jsp:include>
	    </div>
	</div>
	<div id="content">
		<div id="inner-navbar">
			<ul id="out-ul">
				<li>나의 보관함
					<ul id="in-ul">
						<li>병원</li>
						<li>약</li>
						<li>커뮤</li>
					</ul>
				</li>
			</ul>
			<ul id="out-ul">
				<li>메세지함
					<ul id="in-ul">
						<li>메세지 확인</li>
						<li>주소록</li>
						<li>휴지통</li>
					</ul>
				</li>
			</ul>
			<ul id="out-ul">
				<li>고객센터
					<ul id="in-ul">
						<li>QnA</li>
						<li>1:1 질문하기</li>
					</ul>
				</li>
			</ul>
		</div>
		<div id="inner-content">
			
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
</html>