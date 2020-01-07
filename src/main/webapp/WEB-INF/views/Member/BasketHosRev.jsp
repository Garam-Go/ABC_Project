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
	#table-hospital{
		width:600px;
		background:white;
		margin:100px auto;
		
	}
	table tr td{
		border-collapse: collapse;
	}
</style>
</head>
<body>
<div id="page">
	<div id="header">
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
			<table id="table-hospital" border=1>
				<tr>
					<td colspan=3 style="overflow:hidden; background:lightgreen;">내가 쓴 리뷰 목록
						<input type="button" value="수정" style="float:right;">
					</td>
				</tr>
				<tr>
					<td width=200>제목</td>
					<td width=300>병원</td>
					<td width=200>작성일</td>
				</tr>

			</table>
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
</html>