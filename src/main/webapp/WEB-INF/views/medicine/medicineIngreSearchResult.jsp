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
			width:900px;
			height:1000px;
			margin:20px auto;
			background:white;
			text-align:center;
			box-shadow:1px 5px 5px gray;
		}
		#content{
			margin:0 auto;
			width:800px;
			height:600px;
			position:relative;
		}
		#left{
			width:150px;
			height:170px;
			background:white;
			margin-left:20px;
			margin-right:40px;
			margin-top:100px;
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
			border:1px solid black;
			width:400px;
			height:600px;
			background:white;
			margin:auto;
			float:left;
		}
		#right{
			width:160px;
			float:right;
			margin-top:30px;
		}
		.right1{
			border:1px solid black;
			width:150px;
			height:150px;
			background:white;
			margin-bottom:70px;
			
		}
		.right2{
			border:1px solid black;
			width:150px;
			height:150px;
			background:white;
		}
		#bottom{
			width:900px;
			height:120px;
			background:gold;
			margin-top:60px;
		}
		#top{
			background:gray;
			width:900px;
			height:150px;
			margin-bottom:50px;
		}
		.thumbnail{
			width:100px;
			float:left;
		}
		.mcontent{
			overflow: hidden;
		    text-overflow: ellipsis;
		    display: -webkit-box;
		    -webkit-line-clamp: 3; /* 라인수 */
		    -webkit-box-orient: vertical;
		    word-wrap:break-word; 
		    line-height: 1.2em;
		    height: 3.6em;
		    float:left;
		    background:gold;
		    font-size:15px;
		}
		.medname{
			overflow: hidden;
		    text-overflow: ellipsis;
		    line-height: 1.2em;
		    font-size:15px;
		}
		table{
			border-color:white;
			border-collapse:collapse;
		}
	</style>
</head>
<body>
	<div id="page">
		<div id="top" style="margin-top:50px;"></div>
		
		<div id="search" style="margin-bottom:50px;">
			<select id="searchType">
				<option value="name">이름</option>
				<option value="symptom">증상</option>
			</select>
			<input type="text" id="keyword">
			<input type="button" value="검색" id="btnsearch">
		</div>
		
		<div id="content">
			<div id="left">
				<div id="left1">
					<a href="">관심 있는 약</a>
				</div>
				<div id="left2">
					<a href="">최근 검색한 약</a>
				</div>			
			</div>
			<div id="center">
				<table id="boxlist" border=1 width=400></table>
				<script id="temp" type="text/x-handlebars-template">
				{{#each .}}
				<tr>
					<td></td>
					<td></td>
					<td></td>
					<td></td>
				</tr>
				{{/each}}
				</script>
				<div id="pagination"></div>
			</div>
			<div id="right">
				<div class="right1">
					<a href="">메시지</a>
				</div>
				<div class="right2">
					<a href="QestionHome">전문의에게 질문</a>
				</div>
			</div>
		</div>
		
		<div id="bottom"></div>
	</div>
</body>
</html>