<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
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
#table-message{
	width:800px;
	border:1px solid;
	
}
#message-content{
	margin-top: 30px;
	margin-left: 50px;
	background: white;
	padding:20px;
	width: 900px;
}
</style>
</head>
<body>
<div id="page">
	<div id="header">
		<h1>마이페이지</h1>
		<div id="login">
			<jsp:include page="../loginmenu.jsp"></jsp:include>
		</div>
	    <div id="navbar">
			<jsp:include page="../../navBar.jsp"></jsp:include>
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
					<input type="text" value="${mid }" name="mssender">
					<table id="table-message" border=1>
						<tr>
							<td width=100>제목</td>
							<td width=700>
								<input type="text" size=100 name="mstitle">
							</td>
						</tr>
						<tr>
							<td width=100>받는사람</td>
							<td width=700 style="overflow:hidden;">
								<input type="text" name="msreceiver">
								<input type="button" value="주소록" id="bookbutton" style="float:right;">
							</td>
						</tr>
						<tr>
							<td width=100>내용</td>
							<td width=700>
								<textarea cols=100 rows=10 name="mscontent"></textarea>
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
	
	alert(mstitle+mscontent+mssender+msreceiver);
	
	$.ajax({
		type:"post",
		url:"message",
		data:{"mstitle":mstitle,"mscontent":mscontent,"mssender":mssender,"msreceiver":msreceiver},
		success:function(){
			alert("메세지 전송 성공!");
		}
	});
	
});

</script>
</html>