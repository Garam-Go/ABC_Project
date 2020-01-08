<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">

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

#table-hospital{
	width:600px;
	background:white;
	margin:100px auto;
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
                <button class="my-button" onClick="location.href='BasketHosList'">최근 본 병원</button>
                <button class="my-button" onClick="location.href='BasketHosRes'">병원 예약 현황</button>
                <button class="my-button" onClick="location.href='BasketHosRev'">내가 쓴 리뷰</button>
            </div>
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
</html>