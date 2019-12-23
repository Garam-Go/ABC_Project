<%@ page language="java" contentType="text/html; charset=EUC-KR"    pageEncoding="EUC-KR"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>커뮤니티 메인</title>
</head>
<body>
	<h1>[커뮤니티 메인]</h1>
	
	<div style="width:960px; background:#86E57F;">
		<!-- head -->
		<div style="width:400px; height:200px; background:gray; float:left; margin-left:50px;"></div>
		<div style="width:400px; height:200px; background:black; float:right; margin-right:50px;"></div>
	</div>
	<!-- mid -->
	
	<div>
		<h1>clist</h1>
		<table border=1 width=700>
			<c:forEach items="${clist}" var="vo">
				<tr>
					<td>${vo.pid}</td>
					<td>
						<f:formatDate value="${vo.wdate}" pattern="yyyy-MM-dd kk-mm-ss"/> 	
					</td>
					<td>${vo.title}</td>
					<td>${vo.fname}</td>
					<td>${vo.num}</td>
				</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>