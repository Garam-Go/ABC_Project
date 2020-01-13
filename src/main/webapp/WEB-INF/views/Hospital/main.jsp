<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>main</title>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/main (2).css"	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">

<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<style>
table {
	border: 1px solid #444444;
	border-collapse: collapse;
}

td {
	border: 1px solid #444444;
}

.theme {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 5px;
	width: 120px;
}

.theme:hover{
	cursor:pointer;
}
.btnClose {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	padding: 15px 32px;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 5px;
	width: 120px;
}
#tbl tr:hover{
	cursor:pointer;
	background : #9CC89D;
}
</style>
</head>
<body>
	<div id="page">
		<div id="login">
			<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
		</div>
		<div id="navbar">
			<jsp:include page="../Nav/navBar.jsp"></jsp:include>
		</div>
		<div id="content" style="overflow: hidden;">
			<!-- content 시작 -->

			<div id="content-left" style="float: left; width: 680px;">
				<!-- content  left 시작 -->
				
				<!-- 라이트박스 -->
				<div id="darken">

					<div id="lightbox">
						<table id="tbl" width="500" border=0 style="border: 1px solid gray;"></table>
						<script id="temp" type="text/x-handlebars-template">
							{{#each .}}
								<tr onClick="location.href='Hos-detail?h_code={{h_code}}'" h_code="{{h_code}}">
									<td>{{h_name}}</td>
								</tr>
							{{/each}}
							</script>

						<button id="btnClose" class="btnClose">닫기</button>

					</div>

				</div>
				

				<!-- 메뉴 테이블 -->
				<table width=700 border=0 style="margin-top: 20px; margin-right: 20px;">
					<tr>
						<td height=100>병원 검색</td>
						<td>
							<input type="text" id="query" placeholder="검색어 입력"> 
							<input type="button" value="검색" id="btnsearch">		
						</td>
					</tr>
					<tr>
						<td width=100>병원이름으로 검색</td>
						<td>
							<div id="theme">
								<input type="button" value="이비인후과" class="theme"> 
								<input type="button" value="소아" class="theme"> 
								<input type="button" value="피부과" class="theme"> 
								<input type="button" value="외과" class="theme">
								<input type="button" value="정형외과" class="theme"> 
								<input type="button" value="안과" class="theme"> 
								<input type="button" value="치과" class="theme"> 
								<input type="button" value="한의원" class="theme"> 
								<input type="button" value="산부인과" class="theme"> 
								<input type="button" value="비뇨기과" class="theme"> 
								<input type="button" value="성형외과" class="theme">
								<input type="button" value="신경과" class="theme"> 
								<input type="button" value="신경외과" class="theme"> 
								<input type="button" value="정신" class="theme"> 
								<input type="button" value="마취통증" class="theme">
							</div>
						</td>
					</tr>
				</table>
			</div>
			<!-- content  left 끝 -->
			<div id="content-right"	style="width: 120px; height: 500px; background: lightgray; float: left; margin-top:50px; margin-bottom:50px;" >
				<!-- content  right 시작 -->
				<div style="margin-top:150px;">
					<input type="button" onClick="location.href='MessageHome'" value="메세지함" style="width:100px;height:75px;margin-left:2.5px;margin-bottom:100px;">
					<input type="button" value="질문게시판" style="width:100px;height:75px;margin-left:2.5px;">
				</div>
			</div>
			<!-- content right 끝 -->
	<script>
	//병원검색
		$("#btnsearch").on("click", function() {
			$("#darken").show();
			//alert(query);
			getlist();
		});
		
	
	//엔터 눌러서 병원검색
		$("#query").on("keyup", function(key) {
			if (key.keyCode == 13) {
				$("#darken").show();
				query = $("#query").val();
				getlist();

			}
		});
		
	//검색 결과 닫기
		$("#btnClose").on("click", function() {
			$("#darken").hide();
		});

		getlist();
		var query = $("#query").val();
		function getlist() {
			query = $("#query").val();
			//alert(query);
			$.ajax({
				type : "get",
				url : "Hos-slist.json",
				data : {"keyword" : query},
				success : function(data) {
					var temp = Handlebars.compile($("#temp").html());
					$("#tbl").html(temp(data));		
				}
			});
		}
	</script>

		</div>
		<!-- content 끝 -->




		<div id="footer">
			<!-- footer 시작 -->

		</div>
		<!-- footer 끝 -->

	</div>
	<!-- page 끝 -->

</body>
<script>
	var theme = "";
	$("#theme").on("click", "input:button", function() {
		var themes = $(this).val();
		//alert(themes);
		location.href = "Hos-search?themes=" + themes;
	});
</script>
</html>