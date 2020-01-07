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
			<table id="table-hospital" width=600 border=1></table>
			<script id="temp-hospital" type="text/x-handlebars-templete">
				<tr>
					<td colspan=3 style="overflow:hidden; background:lightgreen;">병원저장페이지
						<input type="button" value="수정" style="float:right;">
					</td>
				</tr>
				<tr>
					<td width=200>이름</td>
					<td width=200>주소</td>
					<td width=200>전화</td>
				</tr>
				{{#each list}}
					<tr>
						<td width=200>{{mhid}}</td>
						<td width=200>{{mhrecent}}</td>
						<td width=200>{{h_phone}}</td>
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
gethlist();

function gethlist(){
	var mid = "${mid}";
	$.ajax({
		type:"get",
		url:"BasketHosSaveList",
		data:{"mid":mid},
		success:function(data){
			//alert(mid);
			var temp=Handlebars.compile($("#temp-hospital").html());
			$("#table-hospital").html(temp(data));
		}
	});
}
</script>
</html>