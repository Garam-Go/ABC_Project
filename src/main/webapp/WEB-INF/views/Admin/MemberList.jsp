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
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<style>
#navbar h1{vertical-align: middle;}
#content{
	 width: 100%;
    height: 800px;
    padding: 10px; 
    overflow: hidden;
}
#inner-navbar{
	background:yellow;
	width:300px;
	height:100%;
	margin: 10px;
	float:left;
	padding-left:10px;
	padding-top:50px;
	font-size:17px;
}
#inner-content{
	background:skyblue;
	width:60%;
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
table{background:white; width:700px;}
</style>
</head>
<body>
<div id="page">

	<div id="login">
		<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
	</div>
    <div id="navbar">
		<jsp:include page="../Nav/navBar.jsp"></jsp:include>
    </div>
    <div id="content">
    	<div id="inner-navbar">
    		<ul id="out-ul">
				<li id="out-li">회원관리
					<ul id="in-ul">
						<li><a href="">회원목록 확인</a></li>
						<li><a href="">회원 등급전환</a></li>
						<li><a href="">신고된 회원 목록</a></li>
						<li><a href="">블랙리스트 목록</a></li>
						<li><a href="">탈퇴회원 관리</a></li>
					</ul>
				</li>
				<li id="out-li">고객센터
					<ul id="in-ul">
						<li><a href="">QnA관리</a></li>
						<li><a href="">1:1질문 & 답변</a></li>
						<li><a href="">신고된 글 확인</a></li>
					</ul>
				</li>
			</ul>
			</div>
    	<div id="inner-content">
    		<table id="tbl" width=800 border=1></table>
			<script id="temp" type="text/x-handlebars-templete">
				<tr>
					<td>
						<input type="checkbox">
					</td>
					<td>아이디</td>
					<td>이름</td>
					<td>가입일자</td>
					<td>회원등급</td>
					<td>메세지</td>
				</tr>
				{{#each .}}
					<tr>
						<td>
							<input type="checkbox">
						</td>
						<td>아이디</td>
						<td>이름</td>
						<td>가입일자</td>
						<td>회원등급</td>
						<td>메세지</td>
					</tr>				
				{{/each}}
			</script>
    	</div>
    </div>
    <div id="footer">
    </div>
</div>
</body>
<script>

</script>
</html>