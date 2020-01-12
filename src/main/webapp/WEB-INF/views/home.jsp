<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="ko">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>홈페이지</title>
   
<%-- <link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet"> --%>
<link href="${pageContext.request.contextPath}/resources/template/main/styles/main.css" rel="stylesheet">
<script type="text/javascript" src="https://static.nid.naver.com/js/naveridlogin_js_sdk_2.0.0.js" charset="utf-8"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js" integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n" crossorigin="anonymous"></script>
<script src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js" integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo" crossorigin="anonymous"></script>
<script src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js" integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6" crossorigin="anonymous"></script>
<style>
#footer{
    width:100%;
    background-color: #9CC89D;
    height: 100px;
    line-height: 150px;
    padding: 15px 50px 15px 50px; 
}
	</style>
</head>
<body>
<div id="page">
	<div id="header">
	<div id="login">
		<jsp:include page="Member/loginmenu.jsp"></jsp:include>
	</div>
    <div id="navbar">
		<jsp:include page="Nav/navBar.jsp"></jsp:include>
    </div>
    </div> <!--     header -->
    <div id="content">
        <div id="content-left">
            <img src="resources/abc.png" width=500 style="vertical-align: middle;">
        </div>
        <div id="content-right">
            <h1>알보칠 검색 서비스</h1>
            <input type="text" size="50">
        </div>
    </div><!-- content -->
    <div id="footer">
        <h1>여기에는 뭘 넣어야 할까</h1>
    </div><!-- footer -->
</div><!-- page -->
</body>
<script>
$(document).ready(function(){
	
});
// //lightbox열기
// $("#login").on("click", function() {
// 	$("#darken").show();
// });

// //lightbox닫기
// function funClose(){
// 	$("#darken").hide();
// }

// $("#lightboxClose").on("click", function() {
// 	$("#darken").hide();
// });
</script>
</html>