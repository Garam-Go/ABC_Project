<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>-------DMain-----</title>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<link href="${pageContext.request.contextPath}/resources/main (2).css"
	rel="stylesheet">
  <!-- 합쳐지고 최소화된 최신 CSS -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap.min.css">

<!-- 부가적인 테마 -->
<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/css/bootstrap-theme.min.css">

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.2/js/bootstrap.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<style>
/* 네비바 css 시작 */

#darken-background {
	position: absolute;
	top: 0px;
	left: 0px;
	right: 0px;
	height: 100%;
	width: 100%;
	background: rgba(0, 0, 0, 0.5);
	z-index: 1000;
	overflow-y: scroll;
	display: none;
}

#lightbox {
	width: 700px;
	margin: 20px auto;
	padding: 15px;
	border: 1px solid #333333;
	border-radius: 5px;
	background: white;
	box-shadow: 0px 5px 5px rgba(34, 25, 25, 0.4);
	text-align: center;
}

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
	margin:20px;
	width: 120px;
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

</style>
</head>
<body>
	<div id="page">
	<!-- 기본 네비 메뉴 시작-->

	<!-- 기본 네비 메뉴 끝-->
	
	
	<!-- 누르면 나오는 버튼 만들기 시작-->
<nav class="navbar navbar-expand-sm bg-warning navbar-dark">
	<ul class="navbar-nav">
		
	</ul>
<p>
  <button class="btn btn-light" type="button" style="margin-top:10px;"  data-toggle="collapse" data-target="#multiCollapseExample2" aria-expanded="false" aria-controls="multiCollapseExample2">내 약국 찾기</button>
  <button class="btn btn-light" type="button" style="margin-top:10px;"  data-toggle="collapse" data-target="#multiCollapseExample2" aria-expanded="false" aria-controls="multiCollapseExample2">내 커뮤니티 보기</button>
  <button class="btn btn-light" type="button" style="margin-top:10px;" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false" aria-controls="multiCollapseExample1 multiCollapseExample2">내 병원  찾기</button>
</p>



<div class="row">
  <div class="col">
    <div class="collapse multi-collapse" id="multiCollapseExample1">
      <div class="card card-body" id="card">
        	<input type="button" class="btn btn-info" value="이비인후과" style="margin-bottom:5px;" >
        	<input type="button" class="btn btn-info" value="소아"  style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="피부과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="외과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="정형외과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="안과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="치과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="한의원" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="산부인과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="비뇨기과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="성형외과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="신경과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="신경외과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="정신과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="마취통증과" style="margin-bottom:5px;">
      </div>
    </div>
     </div>
  <div class="col">
    <div class="collapse multi-collapse" id="multiCollapseExample2">
      <div class="card card-body" style="margin-top:10px;">
		 
      </div>
    </div>
  </div>
  </div>
 
<!-- row 끝 -->
</nav>


	<!-- 누르면 나오는 버튼 만들기 끝 -->
		
		<div id="navbar"></div>
		
		
		
		
		<div id="content" style="overflow: hidden;">
			<!-- content 시작 -->

			<div id="content-left" style="float: left; width: 680px;overflow:hidden;">
				<!-- content  left 시작 -->
				<div>
					<input type="text" id="query" value="소아"> 
					<input type="button" value="검색" id="btnsearch">
				<!-- 라이트박스 -->
				</div>

				<div id="darken-background">

					<div id="lightbox">
						<table id="tblh" width="500" border=0 style="border: 1px solid gray;"></table>
						<script id="temph" type="text/x-handlebars-template">
							{{#each .}}
								<tr onClick="location.href='Hos-ddetail?h_code={{h_code}}'">
									<td>{{h_name}}</td>
								</tr>
							{{/each}}
							</script>

						<button id="btnClose" class="btnClose">닫기</button>

					</div>

				</div>
				<script>
					$("#btnsearch").on("click", function() {
						$("#darken-background").show();
						//alert(query);
						getlist();
							
					});
					
				

					$("#query").on("keyup", function(key) {
						if (key.keyCode == 13) {
							$("#darken-background").show();
							query = $("#query").val();
							getlist();

						}
					});
					

					$("#btnClose").on("click", function() {
						$("#darken-background").hide();
					});

					getlist();
					var query = $("#query").val();
					function getlist() {
						query = $("#query").val();
						//alert(query);
						$.ajax({
							type : "get",
							url : "Hos-slist.json",
							data : {
								"keyword" : query
							},
							success : function(data) {
								//alert("하하");
								var temp = Handlebars
										.compile($("#temph").html());
								$("#tblh").html(temp(data));
								//alert(data.length);
						
								
								
							}
						});
					}
				</script>







				
				<!-- 메뉴 테이블 -->
				<div style="float:left;overflow:hidden;">
				
				</div>
			</div>
			<!-- content  left 끝 -->
			<div id="content-right">
				<!-- content  right 시작 -->
				
			</div>
			<!-- content right 끝 -->


		</div>
		<!-- content 끝 -->

	
		<div id="footer">
			<!-- footer 시작 -->

		</div>
		<!-- footer 끝 -->

	</div>

</body>
<script>
	var theme = "";
	$("#theme").on("click", "input:button", function() {
		var themes = $(this).val();
		location.href = "Hos-search?themes=" + themes;
	});
	
	$("#card").on("click", "input:button", function() {
		var card = $(this).val();
		location.href = "Hos-dsearchhtml?card=" + card;
	});
	
	/* 기본 네비바 js 시작*/

/* 기본 네비바 js 시작*/
</script>
</html>