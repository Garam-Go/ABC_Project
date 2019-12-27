<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

<title>건강정보기사</title>
<link href="resources/main.css" rel="stylesheet">
</head>
<body>
<div id="page">
	<div id="navber">
		
	</div>
	
	<div id="content" style="overflow:hidden">
	
		<div style="width: 800px; background: #86E57F; overflow: hidden;">
				<!-- head -->
				<div style="width: 300px; height: 200px; float: left; margin-left: 50px;">
					<div style="text-align:right; padding-right:10px; font-size:20px;">
						<b><a href="comu_clist" style="text-decoration:none">+</a></b>
					</div>
					<div>
						<table border=1 width=280 style="border-collapse:collapse;">
							<c:forEach var="vo" items="${clist}">
								<tr>
									<td>${vo.title}</td>
								</tr>
							</c:forEach>
						</table>
					</div>
				</div>
				
				<div style="width: 300px; height: 150px; float: right; margin-right: 50px;">
					<div style="text-align:right; font-size:20px;">
						<b>+</b>
					</div>
				</div>
			</div>
		
		<div id="content-left" style="float:left; margin:50px 10px; overflow:hidden; width:580px;" >
			<span style="float:right">
				<input type="text" id=keyword size=10> 
				<input type="button" value="검색" id="btnsearch"> 
			</span>
			<span id="total" style="float:left">
				
			</span>
			
			<table id="tbl" border=1 width=580 ></table>
			<script id="temp" type="text/x-handlebars-template">
				{{#each hlist}}
					<tr>
						<td class=title>
							<div class=health>
								<a href="http://www.bosa.co.kr/news/{{link}}" style="text-decoration:none; color:black;">
									{{title}}
								</a>
							</div>
							<div class=wdate>
								{{wdate}}
							</div>
						</td>
					</tr>
				{{/each}}
			</script>
			
			
			<div style="overflow:hidden">
				<span>
					<button id="prev" style="float:left">◀</button>
				</span>
				<span>
					<button id="next" style="float:right">▶</button>
				</span>
			</div>
		</div>
		
		<div id = "content-right" style="width: 180px; float: right; margin:50px 10px; background:lightgray;">					
				<input type="button" value="메세지함" style="width:100px;height:75px; margin:10px;">
           		<input type="button" value="질문게시판" style="width:100px;height:75px;margin:10px;">
           		
		</div>
		
		
	</div>
	
	<div id="footer">
	
	</div>
</div>
</body>
<script>

var page=1;
var keyword= $("#keyword").val();


$("#prev").on("click",function(){
	if(page > 1){
		page= page-1;
		getlist();
	}else{
		alert("뒤로 갈 수 없습니다.")
	}
});

$("#next").on("click",function(){
	page = page+1;
	getlist();
});


//검색
$("#btnsearch").on("click",function(){
	keyword = $("#keyword").val();
	page=1;
	getlist();
});

//키 검색
$("#keyword").keyup(function(key) {
	if (key.keyCode == 13) {
		keyword = $("#keyword").val();
		page=1;
		getlist();
	}
});

getlist();

//리스트
function getlist() {
	$.ajax({
		type : "get",
		url : "healthlist.json",
		data:{"page":page,"keyword":keyword},
		success : function(data) {
			var temp = Handlebars.compile($("#temp").html());
			$("#tbl").html(temp(data));
			$("#total").html(data.total);
		}
	});	
}
</script>
</html>