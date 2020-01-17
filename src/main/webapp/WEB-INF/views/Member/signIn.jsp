<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<!--     합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">
<!--     부가적인 테마 -->
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">
<!--     합쳐지고 최소화된 최신 자바스크립트 -->
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script type="text/javascript"
	src="https://static.nid.naver.com/js/naverLogin_implicit-1.0.3.js"
	charset="utf-8"></script>
<script type="text/javascript"
	src="http://code.jquery.com/jquery-1.11.3.min.js"></script>
</head>
<link href="${pageContext.request.contextPath}/resources/Loginpage.css"
	rel="stylesheet">
]
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
</style>
<title>회원가입</title>
</head>
<body>

		<div id="loginDiv">
			<form name="fom">
				<div class="login-box">
					<h1>회원가입</h1>
					<div class="textbox">
						<i class="fa fa-user" aria-hidden="true"></i> 
						<input type="text"	id="input" name="mid" placeholder="아이디" value='<c:out value="${param.mid != '' ? param.mid : '' }"></c:out>'>
					</div>

					<div class="textbox">
						<i class="fa fa-lock" aria-hidden="true"></i> 
						<input type="password" id="input" name="mpassword" placeholder="비밀번호">
					</div>

					<div class="textbox">
						<i class="fa fa-user" aria-hidden="true"></i> 
						<input type="text"	id="input" name="mname" placeholder="이름">
					</div>

					<div class="textbox">
						<i class="fa fa-user" aria-hidden="true"></i> 
						성별 : 
						<select	name="mgender">
							<option value="male">남자</option>
							<option value="female">여자</option>
						</select>
					</div>

					<input class="btn" type="button" value="회원가입" id="btnSignIn">
					<input class="btn" type="button" onClick="location.href='login'"
						value="취소">
				</div>
			</form>
		</div>
</body>
<script>
	$("#btnSignIn").on("click", function() {
		if ($(fom.mid).val() == "") {
			alert("아이디를 입력하세요")
		} else if ($(fom.mpassword).val() == "") {
			alert("비밀번호를 입력하세요")
		} else if ($(fom.mname).val() == "") {
			alert("이름을 입력하시오")
		} else if ($(fom.mgender).val() == "") {
			alert("성별을 선택하세요")
		} else {

			var mid = $(fom.mid).val();
			var mpassword = $(fom.mpassword).val();
			var mname = $(fom.mname).val();
			var mgender = fom.mgender.value;

			//alert(mid + mpassword + mname + mgender);

			$.ajax({
				type : "post",
				url : "signIn",
				data : {
					"mid" : mid,
					"mpassword" : mpassword,
					"mname" : mname,
					"mgender" : mgender
				},
				success : function() {
				}
			});
			alert("회원가입 완료!");
			location.href = "login";
		}

	});
</script>
</html>