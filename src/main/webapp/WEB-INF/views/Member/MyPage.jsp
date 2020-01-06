<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css"	rel="stylesheet">

<style>
#inner-navbar {
	background: yellow;
	width: 300px;
	height: 100%;
	margin: 10px;
	float: left;
	padding-top: 30px;
	font-size: 20px;
}

#inner-content {
	background: skyblue;
	width: 70%;
	height: 100%;
	margin: 10px;
	float: left;
}

#table-profile {
	width: 600px;
	background: white;
	margin: 100px auto;
}

table tr td {
	border-collapse: collapse;
}

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
				<table id="table-profile" border=1>
					<tr>
						<td colspan=3 style="overflow: hidden; background: lightgreen;">프로필
							<input type="button" value="수정" style="float: right;">
						</td>


					</tr>
					<tr>
						<td rowspan=5 width=150>
							<img src="http://placehold.it/200x250">
						</td>
						<td width=100>이름</td>
						<td width=250>${my.mname }</td>
					</tr>
					<tr>

						<td width=100>아이디</td>
						<td width=250>${my.mid }</td>
					</tr>
					<tr>

						<td width=100>현재 등급</td>
						<td width=250>
							<c:if test="${my.mstatus==1 }">일반</c:if>
							<c:if test="${my.mstatus==2 }">전문의</c:if>
							<c:if test="${my.mstatus==3 }">블랙리스트</c:if>
							<c:if test="${my.mstatus==4 }">탈퇴</c:if>
						</td>
					</tr>
					<tr>

						<td width=100>가입일</td>
						<td width=250></td>
					</tr>
					<tr>

						<td width=100>신고수</td>
						<td width=250></td>
					</tr>
					<tr>
						<td><input type="button" value="저장"> <input
							type="button" value="취소"></td>
						<td width=100></td>
						<td width=250></td>
					</tr>
				</table>
			</div>
		</div>
		<div id="footer"></div>
	</div>
</body>
</html>