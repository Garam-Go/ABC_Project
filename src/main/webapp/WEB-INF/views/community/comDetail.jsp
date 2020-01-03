<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/main.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<title>상세 정보 페이지</title>
</head>
<body>
<div id=page>

	<h1>[상세정보 페이지]</h1>
	
	<div id="navbar">
	
	</div>
	
	<div id="content" style="overflow:hidden">
		<div id="content-left" style = "width:600px; float:left;">
			<table width=600 border=1 style="border-collapse:collapse;">
				<tr>
					<td>${vo.fname}</td>
					<td>${vo.title}</td>
					<td><f:formatDate value="${vo.wdate}" pattern="yyyy-MM-dd / kk-mm-ss"/></td>
					<td>${vo.num}</td>
				</tr>
				<tr>
					<td colspan="4" style="text-align:left; height:100px;">
						${vo.content}
					</td>
				</tr>
			</table>
			<br>
			<input type="text" id="reply" style="line-height:40px; float:left" size=75>
			<input type="button" id="btnreply" value="입력" style="height:40px;">
			
			<table id="box" border=1 width=525 style="float:left; margin-top:10px;"></table>
			<script id="temp" type="text/x-handlebars-template">
			{{#each .}}
				<tr>
					<td>
						<div style="width:500px;">
							<div>
								{{mid}}({{wdate}})
							</div>
							<div>
								{{content}}
							</div>
						</div>
					</td>
				</tr>
			{{/each}}
			</script>
		</div>
		
		<div id = "content-right" style="width: 180px; float: right; margin: 50px 10px 10px 0px; background:lightgray;">					
				<input type="button" value="메세지함" style="width:100px;height:75px; margin:10px;">
           		<input type="button" value="질문게시판" style="width:100px;height:75px;margin:10px;" onClick="location.href='comu_qlist'">     
           		
           		<input type="text" id="query" style="width:160px;margin:10px;">

           		<table id="boxh" border=1 width=180 style="; border-collapse:collapse; overflow:hidden;"></table>
				<script id="temph" type="text/x-handlebars-template">	
				{{#each hlist}}
					<tr>
						<td>
							<div class=hos>
								<a href="comu_community?h_code={{h_code}}&h_name={{h_name}}" style="text-decoration:none; color:black;">
									{{h_name}}
								</a>
							</div>
						</td>
					</tr>	
				{{/each}}
				</script>
				
				<!-- 병원목록 페이지 버튼 -->
				<div>		
					<span>
						<button id="btnprev">◀</button>
					</span>
					
					<span>
						<button id="btnnext">▶</button>
					</span>
				</div>     		
		</div>
	</div>
	
	<div id="footer">
	
	</div>
</div>	
</body>
<script>
var page1=1;
var query = $("#query").val();
var htotal = 1;
var pid="${param.id}"

gethlist();
getrlist();

// 병원 목록 이전 다음
$("#btnprev").on("click", function(){
	if(page1 > 1){
		page1 = page1 - 1;
		gethlist();
	}
});

$("#btnnext").on("click", function(){
	if((page1*10) < htotal){
		page1 = page1 + 1;
		gethlist();
	}
});

//키 검색
$("#query").keyup(function(key) {
	if (key.keyCode == 13) {
		query = $("#query").val();
		page1=1;
		gethlist();
	}
});

//병원리스트
function gethlist() {
	$.ajax({
		type : "get",
		url : "community.json",
		data:{"page":page1, "keyword":query},
		success : function(data) {
			var temp = Handlebars.compile($("#temph").html());
			$("#boxh").html(temp(data));
			
			htotal = data.pm.totalCount;
		}
	});	
}

//댓글리스트
function getrlist() {
	$.ajax({
		type : "get",
		url : "replyList.json",
		data:{"pid":pid},
		success : function(data) {
			var temp = Handlebars.compile($("#temp").html());
			$("#box").html(temp(data));
		}
	});	
}
</script>
</html>