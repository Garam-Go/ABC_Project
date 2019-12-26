<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MedicineDes</title>
	<style>
		body {
			margin:0px;
			padding:0px;
			background:darkgray;
		}
		#page {
			width:900px;
			height:1200px;
			margin:20px auto;
			background:white;
			text-align:center;
			box-shadow:1px 5px 5px gray;
		}
		#content{
			margin:0 auto;
			width:800px;
			height:500px;
			position:relative;
		}
		#left{
			width:150px;
			height:170px;
			background:white;
			margin-left:15px;
			margin-right:35px;
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
			width:400px;
			height:500px;
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
		#top{
			background:gray;
			width:900px;
			height:150px;
			margin-bottom:50px;
		}
		.center1{
			border:1px solid;
			width:400px;
			height:250px;
			margin-bottom:20px;
		}
		.center2{
		 	border:1px solid;
		 	width:400px;
		 	height:250px;
		 	margin-bottom:30px;
		}
		.center3{
		 	width:400px;
		 	height:25px;
		 	margin-bottom:30px;
		}
		.center4{
		 	border:1px solid;
		 	width:400px;
		 	height:200px;
		}
		.des{
			width:400px;
			height:62.5px;
			background:none;
			border:none;
		}
		#sbutton{
			border:none;
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
			<input type="text" id="keyword" value="타이레놀">
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
				<div class="center1">
					<img src="http://placehold.it/180x200" style="float:left;margin:15px;">
				</div>
				<div class="center2">
					<button class="des">성분 ▼</button><br>
					<button class="des">효능효과 ▼</button><br>
					<button class="des">용법용량 ▼</button><br>
					<button class="des">주의사항 ▼</button>
				</div>
				<div class="center3">
					이 글을 추천합니다 <a href="">☆</a>
				</div>
				<div class="center4">
					<input type="text" size=25>
					<button id="btncomment">등록</button>
				</div>
			</div>
			<div id="right">
				<div class="right1">
					<a href="">메시지</a>
				</div>
				<div class="right2">
					<a href="">전문의에게 질문</a>
				</div>
			</div>
		</div>
		
	</div>
</body>
</html>