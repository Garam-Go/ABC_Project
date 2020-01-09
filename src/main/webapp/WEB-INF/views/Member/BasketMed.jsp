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
	width: 250px;
	height: 100%;
	margin: 10px;
	float: left;
	padding-top: 30px;
	font-size: 20px;
}

#inner-content {
	background: skyblue;
	width: 67%;
	height: 100%;
	margin: 10px;
	float: left;
}

#inner-button{
    border:1px solid;
    width:80%;
    padding-left: 150px;
}

.my-button{
    width: 200px;
    height: 200px;
    border-radius: 100px;
    border: none;
    background-color: lightgreen;
    box-shadow: 1px 1px 5px gray;
    font-weight: bold;
    font-size: 20px;
    margin: 50px;
}

.my-button:hover{cursor:pointer;}
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
			<jsp:include page="../Nav/navBar.jsp"></jsp:include>
	    </div>
	</div>
	<div id="content">
		<div id="inner-navbar">
			<jsp:include page="MyNavList.jsp"></jsp:include>
		</div>
		<div id="inner-content">
			<div id="inner-button">
                <button class="my-button" onClick="location.href='BasketMedList'">최근 검색한 약</button>
                <button class="my-button" onClick="location.href='BasketMedFav'">관심있는 약</button>
                <button class="my-button" onClick="location.href='BasketRepList'">내가 쓴 댓글</button>
            </div>
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
</html>