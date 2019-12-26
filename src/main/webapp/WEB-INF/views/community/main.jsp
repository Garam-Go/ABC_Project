<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/main.css" rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<style>
	.health{
		width:280px;
		text-overflow: ellipsis;
		white-space: nowrap;
		overflow: hidden;
		text-align: left;
	}
	
	.active{color:black}
</style>
<title>커뮤니티 메인</title>
</head>
<body>
	<div id="page">
		<div id="navbar">
		
		</div>

		<div id="content" style="overflow:hidden;">
		
			<div style="width: 800px; background: #86E57F; overflow: hidden;">
				<!-- head -->
				<div style="width: 300px; height: 200px; float: left; margin-left: 50px;">
					<div style="text-align:right; padding-right:10px; font-size:20px;">
						<b><a href="comu_hlist" style="text-decoration:none">+</a></b>
					</div>
					<table id="tbl" border=1 width=300 style="border-collapse:collapse;"></table>
					<script id="temp" type="text/x-handlebars-template">
						{{#each .}}
							<tr>
								<td><div class=health>
									<a href="http://www.bosa.co.kr/{{link}}" style="text-decoration:none; color:black;">
										{{title}}
									</a>
								</div></td>
							</tr>
						{{/each}}
					</script>
				</div>
				
				<div style="width: 300px; height: 150px; float: right; margin-right: 50px;">
					<div style="text-align:right; font-size:20px;">
						<b>+</b>
					</div>
					
					<table border=1 style="border-collapse:collapse;">
						<c:forEach var="qvo" items="${qlist}" begin="0" end="4">

								<tr>
									<td>${qvo.qid}</td>
									<td><div class=health>${qvo.title}</div></td>
								</tr>

						</c:forEach>
					</table>
				</div>
			</div>
	
			<!-- mid -->
			<div id="content-left" style = "width:600px; float:left">
				<div style="margin-top: 50px;">
					<div style="overflow: hidden;">
						
							
							<span> 
								
								<form name=frm>
									<span style="float: left">
										<select name=searchType id=searchType>
												<option value="title">제목</option>
												<option value="content">내용</option>
												<option value="fname">작성자</option>
										</select>
									
										<input type="text" id=keyword size=10> 
										<input type="button" value="검색" id="btnsearch"> 
										<input type="hidden" id=page>
									</span>
								</form> 
								
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
									{{#each clist}}
										<tr class=tr>
											<td width=50>{{pid}}</td>
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
			
			<div id = "content-right" style="width: 180px; float: right; margin: 50px 10px 10px 0px; background:lightgray;">					
				<input type="button" value="메세지함" style="width:100px;height:75px; margin:10px;">
           		<input type="button" value="질문게시판" style="width:100px;height:75px;margin:10px;">
           		
			</div>
		</div>		<!-- content end -->

		<div id="footer">
		
		</div>
	</div>
	<script>
		var searchType = $("#searchType").val();
		var keyword = $("#keyword").val();
		var total=0;
		var page=1;
	
		getlist();
		gethealth();
		
		//건강정보
		function gethealth(){
			$.ajax({
				type:"get",
				url:"health.json",
				success:function(data){
					var temp=Handlebars.compile($("#temp").html());
			         $("#tbl").html(temp(data));
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
				keyword = $("#keyword").val();
				searchType = $("#searchType").val();
				page=1;
				getlist();
			}
		});
		
		//리스트
		function getlist() {
			$.ajax({
				type : "get",
				url : "clist.json",
				data:{"keyword":keyword,"page":page,"searchType":searchType},
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
		
		//페이지 이동
		$("#pagination").on("click","a", function(event){
			event.preventDefault();
			page = $(this).attr("href");
			getlist();
		})
	</script>
</body>
</html>