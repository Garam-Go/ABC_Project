<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">

<style>
#inner-navbar{
		background:yellow;
		width:200px;
		height:100%;
		margin: 10px;
		float:left;
		padding:30px;
		font-size:20px;
	}
	#inner-content{
		background:skyblue;
		width:67%;     
		height:100%;
		margin: 10px;
		float:left;
	}
	#table-medrep{
		width:600px;
		background:white;
		margin:100px auto;
		
	}
	table, tr, td{
		border-collapse: collapse;
	}
	#basm{
		display:none;
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
			<table id="table-medrep" width=700 border=1></table>
				<script id="temp-medrep" type="text/x-handlebars-templete">
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
					{{#each list}}			
						<tr>
							<td width=50>{{replyid}}</td>
							<td width=250>{{replycontent}}</td>
							<td width=150>{{medcode}}</td>
							<td width=150>작성일</td>
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
	getmrep();
	function getmrep(){
		var mid = "${mid}";
		$.ajax({
			type:"get",
			url:"mmlist",
			data:{"replyname":mid},
			success:function(data){
				var temp=Handlebars.compile($("#temp-medrep").html());
				$("#table-medrep").html(temp(data));

			}
		});
	}
</script>
</html>