<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MedicineSearchResult</title>
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
			float:right;
			margin-top:100px;
			margin-left:40px;
			margin-right:50px;
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
		table{
			border-color:black;
			border-collapse:collapse;
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
			<!-- 테이블 목록 출력 -->
			<h3>테이블 목록</h3>
				<table id="boxlist" border=1 width=700></table>
				<script id="temp" type="text/x-handlebars-template">
				{{#each .}}
				<tr class="row" onClick="location.href='medicineDes?medcode={{medcode}}'">
					<td width=100 height=50>{{medcode}}</td>
					<td class="medname">{{medname}}</td>
					<td width=100>★100</td>
				</tr>	
				<tr>
					<td colspan=3 height=20>
					<div style="overflow:hidden;text-overflow:ellipsis;width:700px;">
						{{medcontent}}
					</div>
					</td>
				</tr>
				{{/each}}
				</script>
				<div id="pagination" style="background:black;width:705px;height:50px;"></div>
		</div>
			<div id="right">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
	</div>
</body>
<script>
var keyword=$("#keyword").val();
var page=1;

getmedicine();

$("#btnsearch").on("click", function(){
	is_end=false;
	page = 1;
	$("#boxlist").html("");
	keyword=$("#keyword").val();
	getmedicine();
});
/*테이블 목록 출력*/
function getmedicine(){
	$.ajax({
		type:"get",
		url:"medicine.json",
		data:{"keyword":keyword,"page":page},
		success:function(data){
			var temp=Handlebars.compile($("#temp").html());
			$("#boxlist").html(temp(data));
		}
	});
}
getme();
/*클로링 목록 출력*/
function getme(){
	$.ajax({
		type:"get",
		url:"../me.json",
		success:function(data){
			var temp=Handlebars.compile($("#ctemp").html());
			$("#boxclist").html(temp(data));
		}
	});
}

$("#pagination").on("click", "li a", function(event){
	event.preventDefault();
	page = $(this).attr("href");
	getmedicine();
});

$(".row").on("click", function(){
	
	var medcode=$(this).attr("medcode");
	var medname=$(this).attr("medname");
	$.ajax({
		type:"get",
		url:"insert",
		data:{"medcode":medcode,"medname":medname},
		success:function(){
			alert("저장되었습니다");
			getmedicine();
		}
	});
});
</script>
</html>