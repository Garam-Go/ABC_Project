<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>홈페이지</title>
    
    <!-- 합쳐지고 최소화된 최신 CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
    <!-- 부가적인 테마 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
    <!-- 합쳐지고 최소화된 최신 자바스크립트 -->
    
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
	<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
	<script type="text/javascript"	src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js"	charset="utf-8"></script>
	<script type="text/javascript"	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
</head>
<body>
<div id="page">
	<div id="header">
	<div id="login">
		<jsp:include page="menu.jsp"></jsp:include>
<!-- 		<div id="darken"> -->
<!-- 			<div id="lightbox"> -->
<%-- 				<jsp:include page="login.jsp"></jsp:include> --%>
<!-- 				<button id="lightboxClose">close</button> -->
<!-- 			</div> -->
<!-- 		</div> -->
	</div>
    <div id="navbar">
        <a href="#">
            <img src="http://placehold.it/120x120" id="iconimg"> 
        </a>
        <button class="oribtn">병원검색</button>
        <button class="oribtn">약검색</button>
        <button class="oribtn">커뮤니티</button>
        <button class="oribtn">고객센터</button>
    </div>
    </div> <!--     header -->
    <div id="content">
        <div id="content-left">
            <img src="http://placehold.it/300x300">
        </div>
        <div id="content-right">
            <h1>알보칠 검색 서비스</h1>
            <input type="text" size="50">
        </div>
    </div><!-- content -->
    <div id="footer">
        <button class="cirbtn">병원검색</button>
        <button class="cirbtn">약검색</button>
        <button class="cirbtn">메세지함</button>
        <button class="cirbtn">전문의 질문 게시판</button>
    </div><!-- footer -->
</div><!-- page -->
</body>
<script>

//lightbox열기
$("#login").on("click", function() {
	$("#darken").show();
});

//lightbox닫기
$("#lightboxClose").on("click", function() {
	$("#darken").hide();
});
</script>
</html>