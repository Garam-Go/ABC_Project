<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">

<style>
#inner-navbar {
	background: yellow;
	width: 250px;
	height: 100%;
	margin: 10px;
	float: left;
	padding-top: 30px;
	font-size: 20px;
}

#inner-content {
	background: skyblue;
	width: 67%;
	height: 100%;
	margin: 10px;
	float: left;
}
	#table-hospital{
		width:500px;
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
			<jsp:include page="../loginmenu.jsp"></jsp:include>
		</div>
	    <div id="navbar">
			<jsp:include page="../../Nav/navBar.jsp"></jsp:include>
	    </div>
	</div>
	<div id="content">
		<div id="inner-navbar">
			<jsp:include page="../MyNavList.jsp"></jsp:include>
		</div>
		<div id="inner-content">
			<h3>주소록</h3>
			<table id="tbl-book" width=700 border=1>
				<tr style= "background:lightgreen;">
					<td width=200>이름</td>
					<td width=250>이메일</td>
					<td>메일쓰기<td>
					<td>삭제</td>
				</tr>
				<c:forEach items="${book}" var="v">
					<tr>
						<td width=200>${v.mbname }</td>
						<td width=250>${v.mbid}</td>
						<td>
							<button>메일쓰기</button>
						<td>
						<td>
							<button>삭제</button>
						</td>
					</tr>
				</c:forEach>
			</table>	
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
<script>
	function getBook(){
		var mid  = "${mid};"
		$.ajax({})
	}
</script>
</html>