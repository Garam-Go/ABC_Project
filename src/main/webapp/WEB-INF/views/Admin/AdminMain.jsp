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
</head>
<body>
<div id="page">
	<h1>어드민 메인페이지</h1>
	<a href="#" id="login">로그인</a>
	<div id="darken">
			<div id="lightbox">
				<button onClick="funClose()" id="lightboxClose">close</button>
			</div>
		</div>
</div>
</body>
<script>
//lightbox열기
$("#login").on("click", function() {
	$("#darken").show();
});

//lightbox닫기
function funClose(){
	$("#darken").hide();
}

$("#lightboxClose").on("click", function() {
	$("#darken").hide();
});
</script>
</html>