<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>어드민 메인페이지</title>
<!--     합쳐지고 최소화된 최신 CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!--     부가적인 테마 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!--     합쳐지고 최소화된 최신 자바스크립트 -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>

	<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
	<style>
	#navbar h1{vertical-align: middle;}
	#content{
		 width: 100%;
	    height: 800px;
	    padding: 15px; 
	    overflow: hidden;
	}
	#inner-navbar{
		background:yellow;
		width:300px;
		height:100%;
		margin: 10px;
		float:left;
		padding:30px;
		font-size:20px;
	}
	#inner-content{
		background:skyblue;
		width:1000px;
		height:100%;
		margin: 10px;
		float:left;
	}
	#inner-member{
		border:1px solid;
		padding:10px;
		text-align:center;
		background:white;
		margin-bottom:10px;
	}
	</style>
</head>
<body>
<div id="page">

	<div id="login">
		<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
	</div>
    <div id="navbar">
		<h1>어드민 메인페이지</h1>
    </div>
    <div id="content">
    	<div id="inner-navbar">
    		<div id="inner-member">회원관리</div>
    		<ul>
    			<li>회원리스트</li>
    			<li>회원등급전환</li>
    			<li>신고된회원목록</li>
    			<li>블랙리스트 회원목록</li>
    			<li>탈퇴회원관리</li>
    		</ul>
    	</div>
    	<div id="inner-content">
    	
    	</div>
    </div>
    <div id="footer">
    </div>
</div>
</body>
<script>

</script>
</html>