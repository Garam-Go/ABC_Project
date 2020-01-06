<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MedicineDes</title>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
	<style>
		body {
			margin:0px;
			padding:0px;
			background:darkgray;
		}
		#page {
			width:1200px;
			height:1800px;
			margin:20px auto;
			background:white;
			text-align:center;
			box-shadow:1px 5px 5px gray;
		}
		#top{
			background:gray;
			width:1200px;
			height:150px;
			margin-bottom:50px;
		}
		#content{
			margin:0 auto;
			width:1200px;
			height:700px;
			position:relative;
		}
		#left{
			width:150px;
			height:410px;
			background:white;
			margin-top:100px;
			margin-left:50px;
			margin-right:45px;
			float:left;
		}
		#left1{
			border:1px solid black;
			width:150px;
			height:170px;
			background:white;
			margin-bottom:70px;
		}
		#left2{
			border:1px solid black;
			width:150px;
			height:170px;
			background:white;
		}
		#center{
			width:700px;
			height:600px;
			background:white;
			margin:20px auto;
			float:left;
		}
		#right{
			width:150px;
			height:170px;
			margin-top:100px;
			margin-left:40px;
			margin-right:50px;
			float:right;
		}
		.right1{
			border:1px solid black;
			width:150px;
			height:50px;
			background:white;
			margin-bottom:70px;
			
		}
		.right2{
			border:1px solid black;
			width:150px;
			height:50px;
			background:white;
		}
		.center1{
			border:1px solid;
			width:700px;
			height:270px;
			margin-bottom:20px;
		}
		.center2{
		 	border:1px solid;
		 	width:700px;
		 	height:250px;
		 	margin-bottom:30px;
		}
		.center3{
		 	width:700px;
		 	height:25px;
		 	margin-bottom:30px;
		}
		.center4{
		 	border:1px solid;
		 	width:600px;
		 	height:250px;
		 	margin:0 auto;
		}
		table{
			border-color:black;
			border-collapse:collapse;
		}
		#replytbl{
			border-color:white;
		}
	</style>
</head>
<body>
	<div id="page">
		<div id="top" style="margin-top:50px;"></div>
		
		<div id="search" style="margin-bottom:50px;">
			<input type="text" id="keyword">
			<input type="button" id="btnsearch" value="검색">
		</div>
		
		<div id="content">
			<div id="left">
				<jsp:include page="left.jsp"></jsp:include>
			</div>
			<div id="center">
				<div class="center1">
				<table border=1 width=700>
						<tr>
							<td>${vo.medcode}</td>
							<td>${vo.medname}</td>
							<td>추천수★</td>
						</tr>
					</table>
					<table width=195 style="margin:15px auto;">
						<tr><td>식약처 분류</td></tr>
						<tr><td style="font-size:12px;">신경계감각기관용 의약품 > 중추신경계용약 > 해열, 진통, 소염제</td></tr>
						<tr><td>구분</td><tr>
						<tr><td style="font-size:12px;">일반 의약품</td><tr>
						<tr><td>제조(수입)업체명</td><tr>
						<tr><td style="font-size:12px;">한국인센</td><tr>
						<tr><td>제조·수입 구분</td><tr>
						<tr><td style="font-size:12px;">제조</td><tr>
					</table>
					
				</div>
				<div class="center2">
							<div style="font-size:12px;">${vo.medcontent}</div>
				</div>
				<div class="center3">
					이 글을 추천합니다 <a href="#">☆</a>
				</div>
				<div class="center4">
					<input type="text" size=70 id="replytext">
					<input type="button" value="등록" id="btninsert">

					<table id="replytbl" border=1 width=600></table>
					<script id="temp" type="text/x-handlebars-template">
					{{#each list}}
					<tr class="row" replyid="{{replyid}}">
						<input type="hidden" id="medcode" value={{medcode}}>
						<td width=40 id="replyid" style="font-size:12px;">{{replyid}}</td>
						<td style="text-align:left;">{{replyname}}</td>
						<td style="text-align:right;">{{replydate}}</td>
						<td width=30><button  replyid="{{replyid}}" medcode="{{medcode}}">X</button></td>
					</tr>
					<tr>
						<td colspan=4 height=25>{{replycontent}}</td>
					</tr>
					{{/each}}
					</script>
					<div id="pagination"></div>
				</div>
			</div>
			<div id="right">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
		
	</div>
</body>
<script>
var keyword=$("#keyword").val();

//alert(medcode);

getmedicine();
var page=1;

function getmedicine(){
	var medcode="${vo.medcode}";
	//alert(medcode);
	$.ajax({
		type:"get",
		url:"list",
		data:{"medcode":medcode},
		success:function(data){
			var temp=Handlebars.compile($("#temp").html());
			$("#replytbl").html(temp(data));
			
			var str="";
			if(data.pm.prev){
				str += "<a href='" + (data.pm.startPage-1) + "'>◀</a>";
			}
			for(var i=data.pm.startPage; i<=data.pm.endPage;i++){
				if(data.pm.cri.page==i){
					str += "[<a href='" + i + "' class='active'>" + i + "</a>]"	
				}else{
					str += "[<a href='" + i + "'>" + i + "</a>]"
				}
			}
			if(data.pm.next){
				str += "<a href='" + (data.pm.endPage+1) + "'>▶</a>";
			}
			$("#pagination").html(str);
		}
		
	});
}
$("#pagination").on("click",function(e){
	e.preventDefault();
	page=$(this).attr("href");
	getmedicine();
});

$("#btnsearch").on("click", function(){
	is_end=false;
	page = 1;
	$("#boxlist").html("");
	keyword=$("#keyword").val();
	getmedicine();
	
});
$("#btninsert").on("click", function(){
	var medcode=$("#medcode").val();
	var replyid=$("#replytbl tr").attr("replyid");
	//alert(row);	
	var replytext=$("#replytext").val();
	//alert(replyid);
	if(replytext==""){
		alert("댓글 내용을 입력하세요");
		$("#replytext").focus();
	}else{
		$.ajax({
			type:"post",
			url:"insert",
			data:{"medcode":medcode, "replyid":replyid, "replycontent":replytext},
			success:function(){
				alert("성공");
				getmedicine();
			}
		});
	}
});
$("#replytbl").on("click", ".row button", function(){
	var medcode=$(this).attr("medcode");
	var replyid=$(this).attr("replyid");
	alert(medcode + replyid);
	$.ajax({
		type:"post",
		url:"delete",
		data:{"medcode":medcode,"replyid":replyid},
		success:function(){
			getmedicine();
		}
	});
});
</script>
</html>