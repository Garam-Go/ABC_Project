<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
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
<link href="${pageContext.request.contextPath}/resources/Loginpage.css" rel="stylesheet">

<style>
#loginDiv{
	position: absolute;
	top: 50%;
	left: 50%;
	transform: translate(-50%,-50%);
	width:400px;
	height:600px;
	background:white;
	box-shadow : 1px 1px 10px gray;
}

</style>

</head>
<body>
	<div id="loginDiv">

	<form action="loginPost" method="post" name="fom">			
		<div class="login-box">
			<h1>로그인</h1>
			<div class="textbox">
				<i class="fa fa-user" aria-hidden="true"></i>
				<input type="text" id="input" name="mid" placeholder="아이디">
			</div>
			
			<div class="textbox">
				<i class="fa fa-lock" aria-hidden="true"></i>
				<input type="password"  id="input" name="mpassword" placeholder="비밀번호">
			</div>
			<div style="text-align:center">
			<input type="button" value="로그인" id="btnlogin" class="btn">
			<input type="button" onClick="location.href='signIn'" value="회원가입" class="btn">
			<input type="button" onClick="location.href='page'" value="취소" class="btn">
			</div>
			<!-- 네이버아이디로 로그인 버튼 노출 영역 -->
			<div id="naver_id_login" style="margin:0 auto;"></div>
		</div>
	</form>
	
	<!-- //네이버아이디로 로그인 버튼 노출 영역 -->
	<script type="text/javascript">
		var naver_id_login = new naver_id_login("rqO0TDIARI6udRXDMExh", "http://192.168.0.134:8088/abc/Member/naverlogin");
		var state = naver_id_login.getUniqState();
		naver_id_login.setButton("green", 3, 40);
		naver_id_login.setDomain("http://192.168.0.134:8088/abc/");
		naver_id_login.setState(state);
// 		naver_id_login.setPopup();
		naver_id_login.init_naver_id_login();
	</script>
	</div>
	
</body>
<script>
$("#btnlogin").on("click",function(){
	if($(fom.mid).val()==""){
		alert("아이디를 입력하세요");
	}else if($(fom.mpassword).val()==""){
		alert("비밀번호를 입력하세요");
		fom.mpassword.focus();
	}else{
		fom.submit();
	}
	
});

var error = "${param.error}";
//로그인 실패 alert창 띄우기
$(document).ready(function(){
	if(error != "" ){
		alert(error);
	}
});
</script>
</html>