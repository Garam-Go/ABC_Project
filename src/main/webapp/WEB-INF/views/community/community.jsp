<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>병원 별 커뮤니티 게시판</title>
<link href="resources/main.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
</head>
<body>
<div id=page>
	
	
	<div id=navbar>
	
	</div>
	<h1 id="name"></h1>
	
	<div id=content style="overflow:hidden;">
		
		
		<div id="content-left" style = "width:600px; float:left;">
			<div style="margin-top: 50px;">
				<div style="overflow:hidden; margin-bottom:10px;">
					<span id="btnType" style="float:left">
						<input type="button" value="전체보기" id="all">
						<input type="button" value="밥친구"  id="rise">
						<input type="button" value="커피친구"  id="coffee">
						<input type="button" value="영화친구"  id="movie">
						<input type="button" value="음식나눔"  id="food">
					</span>
					<span style="float:right">
						<input type="button" value="글쓰기" onClick="location.href='comu_insert'">
					</span>
				</div>
				
					<div style="overflow: hidden;">
							<span> 
									<span style="float: left">
										<select name=searchtype id=searchType>
												<option value="title">제목</option>
												<option value="content">내용</option>
												<option value="fname">작성자</option>
										</select>
										<input type="hidden" id=hname>
										<input type="hidden" id=hcode>
										<input type="text" name=keyword id=keyword size=10> 
										<input type="button"value="검색" id="btnsearch"> 
									</span>
								<span id=total style="float:right;"></span>
							</span>
							
						<div>
							<div>
								<table id="tbl1" border=1 width=600 style="text-align: center;"></table>
								<script id="temp1" type="text/x-handlebars-template">
									<tr>
										<td width=50>번호</td>
										<td width=100>작성일</td>
										<td width=275>제목</td>
										<td width=75>작성자</td>
										<td width=50>추천</td>
									</tr>
									{{#each hoslist}}
										<tr class=tr>
											<td width=50>{{hid}}</td>
											<td width=100>{{wdate}}</td>
											<td width=275>{{title}}</td>
											<td width=75>{{fname}}</td>
											<td width=50>{{num}}</td>
										</tr>
									{{/each}}
								</script>
							</div>
						</div>
					</div>
		
					<!-- bottom -->
				<div id=pagination style="width: 580px; background: #FFA7A7; margin-top: 20px; padding: 10px;"></div>
			</div>
		</div>
		
		<div id = "content-right" style="width: 180px; float: right; margin: 50px 0px 10px 20px; background:lightgray;">					
			<input type="button" value="메세지함" style="width:100px;height:75px; margin:10px;">
           	<input type="button" value="질문게시판" style="width:100px;height:75px;margin:10px;">   
		</div>
	</div>
	
	<div id=footer>
	
	</div>
</div>
</body>
<script>
var searchType = $("#searchType").val();
var keyword = $("#keyword").val();
var total=0;
var page=1;
var type="all";
var hcode="${param.h_code}";
var hname="${param.h_name}";
$("#hcode").val(hcode);
$("#hname").val(hname);
$("#name").html(hname+" 커뮤니티");




$("#rise").on("click",function(){
	type="rise";
	page=1;
	keyword = $("#keyword").val();
	getlist();
});

$("#coffee").on("click",function(){
	type="coffee";
	page=1;
	getlist();
});

$("#movie").on("click",function(){
	type="movie";
	page=1;
	getlist();
});

$("#food").on("click",function(){
	type="food";
	page=1;
	getlist();
});

$("#all").on("click",function(){
	type="all";
	page=1;
	getlist();
});

getlist();
	//리스트
	function getlist() {
		$.ajax({
			type : "get",
			url : "comu_community.json",
			data:{"keyword":keyword,"page":page,"searchType":searchType,"hcode":hcode,"type":type},
			success : function(data) {
				var temp = Handlebars.compile($("#temp1").html());
				$("#tbl1").html(temp(data));
				
				total = data.pm.totalCount;
				
				$("#total").html("총 검색 수 : " + total + " 건");
				
				var str="";
				if(data.pm.prev){
					str += "<a href='" + (data.pm.startPage - 1) + "'>◀</a>";
				}
				for(var i=data.pm.startPage; i<=data.pm.endPage; i++){
					if(i==page){
						str += "[<a href='"+ i + "' class=active>" + i + "</a>] ";
					}else{
						str += "[<a href='"+ i + "' style='color:white'>" + i + "</a>] ";
					}
				}
				if(data.pm.next){
					str += "<a href='" + (data.pm.endPage + 1) + "'>▶</a>";
				}
				$("#pagination").html(str);
				
			}
		});	
	}

//검색
$("#btnsearch").on("click",function(){
	keyword = $("#keyword").val();
	searchType = $("#searchType").val();
	page=1;
	getlist();
});

//키 검색
$("#keyword").keyup(function(key) {
	if (key.keyCode == 13) {
		$("#btnsearch").click();
	}
});



//페이지 이동
$("#pagination").on("click","a", function(event){
	event.preventDefault();
	page = $(this).attr("href");
	getlist();
});
</script>
</html>