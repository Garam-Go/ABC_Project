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
		background:white;
		margin:100px auto;
		
	}
	
	#table-read {
	width: 800px;
	border: 1px solid;
}
	table tr td{
		border-collapse: collapse;
		padding:5px;
	}
	
	.msg-detail:hover{
		cursor: pointer;
		background:lightgreen;
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
			<input type="hidden" value="${mid }" id="mid">
			<table id="table-message" border=1></table>
			<script id="temp" type="text/x-handlebars-templete">
				<tr style= "background:lightgreen;">
					<td width=30>
						<input type="checkbox" id="chk-all">
					</td>
					<td width=300>제목</td>
					<td width=100>보낸사람</td>
					<td width=200>보낸날짜</td>
					<td width=50>답장</td>
				</tr>
				{{#each list}}
					<tr>
						<td width=30>
							<input type="checkbox" id="chk-in">
						</td>
						<td width=300 class="msg-detail" msid="{{msid}}">{{mstitle}}</td>
						<td width=100 class="mssender">{{mssender}}</td>
						<td width=200>{{msdate}}</td>
						<td width=50>
							<button class="message-reply">답장</button>
						</td>
					</tr>
				{{/each}}
			</script>
<!-- 	lightbox -->
		<div id="darken">
			<div id="lightbox">
				<jsp:include page="MessageRead.jsp"></jsp:include>
			</div>
		</div>
		</div>
	</div>
	<div id="footer">
	
	</div>
</div>
</body>
<script>
getList();

function getList(){
	var mid = $("#mid").val();
	$.ajax({
		type:"get",
		url:"messagelist",
		data:{"mid":mid},
		success:function(data){
			var temp=Handlebars.compile($("#temp").html());
			$("#table-message").html(temp(data));

		}
	});
}

var msid = "";

//메세지 읽기
$("#table-message").on("click",".msg-detail",function(){
	msid = $(this).attr("msid");
	alert(msid);
	
	$("#darken").show();
	
	getRead();
});

//메세지 읽기 ajax
function getRead(){
	$.ajax({
		type:"get",
		url:"msgread",
		data:{"msid":msid},
		success:function(data){
// 			alert("yee");
			var temp=Handlebars.compile($("#temp-read").html());
			$("#table-read").html(temp(data));

		}
	});
}

//lightbox 닫기
$("#btn-close").on("click",function(){
	$("#darken").hide();
});

//답장하기
$("#table-message").on("click",".message-reply",function(){
	var row = $(this).parent().parent();
	var mstitle = "re: "+row.find(".msg-detail").html();
	var msreceiver = row.find(".mssender").html();
	location.href = "Message?msreceiver="+msreceiver+"&mstitle="+mstitle;
});
</script>
</html>