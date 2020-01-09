<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<link href="${pageContext.request.contextPath}/resources/test.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/mypageNavbar.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

<style>
#inner-navbar{
		background:yellow;
		width:250px;
		height:100%;
		margin: 10px;
		float:left;
		padding-top:30px;
		font-size:20px;
	}
	#inner-content{
		background:skyblue;
		width:67%;
		height:100%;
		margin: 10px;
		float:left;
	}
	#table-medicine{
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
			<table id="table-medicine" border=1></table>
			<script id="temp-medicine" type="text/x-handlebars-templete">
				<tr>
					<td colspan=2 style="overflow:hidden; background:lightgreen;">최근 검색한 약
						<input type="button" value="수정" style="float:right;">
					</td>
				</tr>
				<tr>
					<td width=200>약 코드</td>
					<td width=300>약 이름</td>
				</tr>
				{{#each med}}
					<tr>
						<td width=200>{{medcode}}</td>
						<td width=300>{{medname}}</td>
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
	getmlist();
	function getmlist(){
		var mmid = "${mid}";
		$.ajax({
			type:"get",
			url:"BasketMedSaveList",
			data:{"mmid":mmid},
			success:function(data){
				var temp=Handlebars.compile($("#temp-medicine").html());
				$("#table-medicine").html(temp(data));
			}
		});
	}
</script>
</html>