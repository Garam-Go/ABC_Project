<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>search</title>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<link href="${pageContext.request.contextPath}/resources/main (2).css"	rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=6baa3500ff42695b48d705aa87132cb3"></script>
<script type="text/javascript"
	src="//dapi.kakao.com/v2/maps/sdk.js?appkey=APIKEY&libraries=LIBRARY"></script>
<style>
.selsearch {
	background-color: #4CAF50; /* Green */
	border: none;
	color: white;
	text-align: center;
	text-decoration: none;
	display: inline-block;
	font-size: 16px;
	margin: 5px;
	width: 100px;
	padding: 10px;
}
.hos-click:hover{
	cursor: pointer;
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
		<div id="content-left" style="float: left; width: 750px; overflow: hidden;">
				<div style="border: 5px solid #E0F8E6; width: 450px; margin-bottom: 30px; padding: 5px; float:left;">
						<!-- 카테고리 별 검색 -->
						<select style="height: 35px;" id="searchType">
							<option value="이비인후과"
								<c:out value="${param.themes=='이비인후과'?'selected':''}"/>>이비인후과</option>
							<option value="내과"
								<c:out value="${param.themes=='내과'?'selected':''}"/>>내과</option>
							<option value="소아"
								<c:out value="${param.themes=='소아'?'selected':''}"/>>소아과</option>
							<option value="피부과"
								<c:out value="${param.themes=='피부과'?'selected':''}"/>>피부과</option>
							<option value="정형외과"
								<c:out value="${param.themes=='정형외과'?'selected':''}"/>>정형외과</option>
							<option value="안과"
								<c:out value="${param.themes=='안과'?'selected':''}"/>>안과</option>
							<option value="치과"
								<c:out value="${param.themes=='치과'?'selected':''}"/>>치과</option>
							<option value="한의원"
								<c:out value="${param.themes=='한의원'?'selected':''}"/>>한의원</option>
							<option value="산부인과"
								<c:out value="${param.themes=='산부인과'?'selected':''}"/>>산부인과</option>
							<option value="비뇨기과"
								<c:out value="${param.themes=='비뇨기과'?'selected':''}"/>>비뇨기과</option>
							<option value="성형외과"
								<c:out value="${param.themes=='성형외과'?'selected':''}"/>>성형외과</option>
							<option value="가정의학과"
								<c:out value="${param.themes=='가정의학과'?'selected':''}"/>>가정의학과</option>
							<option value="외과"
								<c:out value="${param.themes=='외과'?'selected':''}"/>>외과</option>
							<option value="신경외과"
								<c:out value="${param.themes=='신경외과'?'selected':''}"/>>신경외과</option>
							<option value="신경과"
								<c:out value="${param.themes=='신경과'?'selected':''}"/>>신경과</option>
							<option value="정신"
								<c:out value="${param.themes=='정신'?'selected':''}"/>>정신과</option>
							<option value="마취통증"
								<c:out value="${param.themes=='마취통증'?'selected':''}"/>>마취통증과</option>
						</select> 
						<input type="text" id="keyword" size=30 style="height:35px">
						<input type="button" value="검색" id="selsearch" class="selsearch">
						<!-- 직접 검색 -->
					</div>
				
		<div style="width: 700px; background: #E0F8E6; margin-bottom: 50px; padding: 15px; clear:both;">		
			<h2>검색된 병원 목록</h2>
			<table border=1 width=600 id="tblr"></table>
			<script id="tempr" type="text/x-handlebars-template">
				{{#each .}}
				<tr  h_code="{{h_code}}" class="hos-click">
					<td style="padding:5px;">{{h_name}}</td>
				</tr>
				{{/each}}
			</script>
			</div>
		</div>
		
		<!--content-left 끝  -->
		
		<!-- content  right 시작 -->
		<div id="content-right"	style="width: 120px; height: 500px; background: lightgray; float: right; margin-top:50px; margin-bottom:50px;" >
			<div style="margin-top:150px;">
				<input type="button" onClick="location.href='MessageHome'" value="메세지함" style="width:100px;height:75px;margin-left:2.5px;margin-bottom:100px;">
				<input type="button" value="질문게시판" style="width:100px;height:75px;margin-left:2.5px;">
			</div>
		</div>
	</div>
		<!-- content 끝 -->

		<div id="footer"></div>

		<div>
			<a href="main">홈으로</a>
		</div>
		<input type="hidden" value="${param.themes}" id="themes">
	</div>
</body>
<script>
	var query = "${param.query}";
	//var theme="${param.theme}";
	//alert(query+"\n"+theme);
	var query2 = $("#query2").val();
	var keyword = $("#keyword").val();
	gettlist();
	var themes = "${param.themes}";

	var searchType = $("#searchType option:selected").val();

	//셀렉트 박스로 검색
	$("#selsearch").trigger("click");
	$(document).ready(function() {
		//페이지가 로딩하자마자 selsearch 버튼을 누르겠음
		$("#selsearch").trigger("click");
	});

	$("#selsearch").on("click", function() {
		//alert("gg");
		searchType = $("#searchType option:selected").val();
		//alert(searchType);
		gettlist();

	});
	//검색버튼
	$("#btnsearch").on("click", function() {
		keyword = $("#keyword").val();
		//alert(keyword);
		gettlist();
	});
	
	//엔터눌러서 검색
	$("#keyword").keydown(function(key) {
		if (key.keyCode == 13) {
			keyword = $("#keyword").val();
			gettlist();
		}
	});


	gettlist();

	function gettlist() {
		//alert("gg");
		keyword = $("#keyword").val();
		//alert(keyword);

		$.ajax({
			type : "get",
			url : "Hos-slist.json",
			data : {
				"keyword" : searchType,
			},
			success : function(data) {
				//alert(keyword);
				var temp = Handlebars.compile($("#tempr").html());
				$("#tblr").html(temp(data));
			}
		});
	}


	/*검색 리드한 테이블을 검색 목록에 저장하기*/
	$("#tblc").on("click", "tr td button", function() {
		//alert("g");
		var h_code = $("#tbl tr td button").attr("h_code");
		var h_name = $(this).attr("h_name");
		var h_time = $(this).attr("h_time");
		//alert(h_code + "\n" + h_name + "\n" + h_time);
		$.ajax({
			type : "get",
			url : "rinsert.json",
			data : {
				"h_code" : h_code,
				"h_name" : h_name,
				"h_time" : h_time
			},
			success : function() {
				//alert("저장됨");	
			}
		});
	});

	$("#btnsearch").on("click", function() {
		query2 = $("#query2").val();
		//alert(query2);
	});
	
	//병원 누르면 저장하기
	$("#tblr").on("click","tr",function(){
		var mid = "${mid}";
		//alert(mid);
		if(mid==null || mid==""){
			return;
		}else{
			var mhid = mid;
			var mhrecent = $(this).attr("h_code");
			//alert(mhrecent);
			$.ajax({
				type:"get",
				url:"mhinsert",
				data:{"mhid":mhid,"mhrecent":mhrecent},
				success:function(){
					//alert("save");
					location.href="Hos-detail?h_code="+mhrecent;
				}
			});
		}
	});
</script>
</html>