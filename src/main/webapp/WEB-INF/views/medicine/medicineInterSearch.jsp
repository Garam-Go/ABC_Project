<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>MedicineInterSearch</title>
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
			border:1px solid black;
			width:150px;
			height:170px;
			background:white;
			margin-left:15px;
			margin-right:35px;
			margin-top:300px;
			float:left;
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
			height:200px;
		}
		.center1-1{
			border:1px solid;
			width:400px;
			height:100px;
			margin-bottom:50px;
		}
		.center2{
		 	border:1px solid;
		 	width:400px;
		 	height:200px;
		}
		.center2-1{
			border:1px solid;
			width:400px;
			height:100px;
			margin-bottom:100px;
			
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
		
		<div id="search" style="margin-bottom:100px;">
			<button>三</button>
			<input type="text">
			<button id="sbutton">검색</button>
		</div>
		
		<div id="content">
			<div id="left">
				<div id="left1">
					관심 있는 약
				</div>
				<div id="left2">
					최근 검색한 약
				</div>
			</div>
			<div id="center">
				<div class="center1">
					<input type="text">
					<input type="text">
					<button>검색</button>
				</div>
				<div class="center1-1">
				</div>
				<div class="center2">
					<input type="text">
					<input type="text">
					<button>검색</button>
				</div>
				<div class="center2-1">
				</div>
			</div>
			<div id="right">
				<div class="right1"></div>
				<div class="right2"></div>
			</div>
		</div>
		
	</div>
</body>
</html>