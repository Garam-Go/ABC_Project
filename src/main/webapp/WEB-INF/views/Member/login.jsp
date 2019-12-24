<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>LOGIN</title>
<!--     합쳐지고 최소화된 최신 CSS -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!--     부가적인 테마 -->
    <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!--     합쳐지고 최소화된 최신 자바스크립트 -->
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<style>
#page{
	background: skyblue;
}
tr td{
	padding: 30px;
	background:skyblue;
	border-collapse: collapse; 
	border: 3px solid white;
}
.loginTable{
	background:white;
	width:500px;
	margin: 30px auto;
	padding: 30px;
	border: 1px solid black;
}
#loginDiv{
	background:white;
	width:960px;
	height:700px;
	border:1px solid;
	text-align:center;
	margin:0 auto;
}
</style>

</head>
<body>
<div id="page">
	
	<div id="loginDiv">
	<h1>로그인</h1>
	<form action="loginPost" method="post">
		<table class="loginTable">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="uid"></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="upw"></td>
				</tr>
				<tr>
					<td colspan=2>
						<input type="submit" value="로그인" id="btnlogin">
						<input type="button" id="signUp" value="회원가입">
						<input type="button" id="loginCancel" value="취소">
					</td>
				</tr>
			</table>
	</form>
	<!-- 네이버아이디로 로그인 버튼 노출 영역 -->
	<div id="naver_id_login"></div>
	<!-- //네이버아이디로 로그인 버튼 노출 영역 -->
	<script type="text/javascript">
		var naver_id_login = new naver_id_login("rqO0TDIARI6udRXDMExh", "http://localhost:8088/example/naverlogin");
		var state = naver_id_login.getUniqState();
		naver_id_login.setButton("green", 3, 40);
		naver_id_login.setDomain("http://localhost:8088");
		naver_id_login.setState(state);
// 		naver_id_login.setPopup();
		naver_id_login.init_naver_id_login();
	</script>
	</div>
	</div>
</body>
<script>
$("#loginCancel").on("click",function(){
	location.href="home";
});

</script>
</html>