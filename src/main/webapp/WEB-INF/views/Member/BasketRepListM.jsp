<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">

</head>
<body>
	<table id="table-hospital" border=1>
		<tr>
			<td colspan=4 style="overflow:hidden; background:lightgreen;">내가 쓴 댓글
			</td>
		</tr>
		<tr>
			<td width=50>번호</td>
			<td width=250>댓글내용</td>
			<td width=150>약이름</td>
			<td width=150>작성일</td>
		</tr>
	</table>
</body>
</html>