<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
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
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">]
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
	font-size:20px;
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
<title>회원가입</title>
</head>
<body>
<div>

<div id="page">
	
	<div id="loginDiv">
	<h1>회원가입</h1>
	<form name="fom">
		<table class="loginTable">
				<tr>
					<td>아이디</td>
					<td><input type="text" name="mid" <c:if test="${param.mid != null}">value="${param.mid }"</c:if>></td>
				</tr>
				<tr>
					<td>비밀번호</td>
					<td><input type="password" name="mpassword"></td>
				</tr>
				<tr>
					<td>이름</td>
					<td><input type="text" name="mname"></td>
				</tr>
				<tr>
					<td>성별</td>
					<td>
						<input type="radio" value="male" name="mgender">남자 
						<input type="radio" value="female" name="mgender">여자
					</td>
				</tr>
				<tr>
					<td colspan=2>
						<input type="button" value="회원가입" id="btnSignIn">
						<input type="button" onClick="location.href='login'" value="취소">
					</td>
				</tr>
			</table>
	</form>
	</div>
	</div>
</div>
</body>
<script>
$("#btnSignIn").on("click",function(){
	if($(fom.mid).val()==""){
		alert("아이디를 입력하세요")
	}else if($(fom.mpassword).val()==""){
		alert("비밀번호를 입력하세요")
	}else if($(fom.mname).val()==""){
		alert("이름을 입력하시오")
	}else if($(fom.mgender).val()==""){
		alert("성별을 선택하세요")
	}else{
		
		var mid = $(fom.mid).val();
		var mpassword = $(fom.mpassword).val();
		var mname = $(fom.mname).val();
		var mgender = fom.mgender.value;
		
	 	alert(mid + mpassword + mname + mgender);
	 	
		$.ajax({
			type:"post",
			url:"signIn",
			data:{"mid":mid,"mpassword":mpassword,"mname":mname,"mgender":mgender},
			success:function(){
			}
		});
		alert("회원가입 완료!");
		location.href="login";	
	}
	
});
</script>
</html>