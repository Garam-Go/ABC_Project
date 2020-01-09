<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

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
	height:100%;
	margin: 10px;
	float: left;
}
#table-message{
	width:500px;
	border:1px solid;
	margin: 10px auto;
	text-align:left;
}
#message-content{
	margin:30px auto;
	background: white;
	padding:10px;
	width: 500px;
	text-align:center;
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
			<h1>메세지 보내기</h1>
			<div id="message-content">
				<form name="fom" action="message" method="post">
					<input type="hidden" value="${mid }" name="mssender">
					<table id="table-message" border=1>
						<tr>
							<td width=100>제목</td>
							<td width=400>
								<input type="text" size=50 name="mstitle" value="${param.mstitle }">
							</td>
						</tr>
						<tr>
							<td width=100>받는이</td>
							<td width=400 style="overflow:hidden;">
								<input type="text" name="msreceiver" value="${param.msreceiver }">
								<input type="button" value="주소록" id="bookbutton" style="float:right;">
							</td>
						</tr>
						<tr>
							<td width=100>내용</td>
							<td width=400>
								<textarea cols=50 rows=10 name="mscontent"></textarea>
							</td>
						</tr>
					</table>
					<input type="button" value="보내기" id="message-send">
					<input type="reset" value="초기화">
					
				</form>
			</div>
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
<script>
$("#message-send").on("click",function(){
	var mstitle = fom.mstitle.value;
	var mscontent = fom.mscontent.value;
	var mssender = fom.mssender.value;
	var msreceiver = fom.msreceiver.value;
	
	//alert(mstitle+mscontent+mssender+msreceiver);
	
	$.ajax({
		type:"post",
		url:"message",
		data:{"mstitle":mstitle,"mscontent":mscontent,"mssender":mssender,"msreceiver":msreceiver},
		success:function(){
			alert("메세지 전송 성공!");
			location.href="MessageHome";
		}
	});
	
});

</script>
</html>