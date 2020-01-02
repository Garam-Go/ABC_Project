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
<link href="${pageContext.request.contextPath}/resources/main (2).css"
	rel="stylesheet">
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
</style>
</head>
<body>
	<div id="page">
		<div id="navbar"></div>
		<div id="content" style="overflow: hidden;">
			<div id="content-left" style="float: left; width: 680px;">
				<div id="new">




					<!-- 검색 연습 끝 -->
					<select style="margin: 0px auto; height: 50px;" id="hide-new">
						<option>1.인기 검색어 시작</option>
						<option>10.인기 검색어 끝</option>
					</select>
				</div>

				<div
					style="text-align: center; width: 600px; height: 50px; margin-top: 25px; margin-left: 70px; height: 50px; margin-bottom: 25px;">
					<div
						style="border: 5px solid #E0F8E6; width: 500px; margin: 0px auto; padding: 5px;">
						<!-- 나중에 -->
						<!--		
			<select style="height:50px;">
				<option>시/도 선택</option>
			</select>
			
			<select style="height:50px;">
				<option>시/군/구 선택</option>
			</select>
			
			<select style="height:50px;">
				<option>읍/면/동/로 선택</option>
			</select>
			-->
						<!-- 검색  -->
						

						<!-- 카테고리 별 검색 -->
						<select style="height: 25px;" id="searchType">
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
						
						<input type="button" value="검색" id="selsearch" class="selsearch">
						<!-- 직접 검색 -->
					</div>
				</div>

				<div
					style="background: #E0F8E6; width: 280px; height: 500px; margin-left: 90px; float: left;">
				

				</div>


				<div
					style="width: 210px; background: #E0F8E6; margin-left: 400px; margin-bottom: 50px; padding: 15px;">
					<!-- <a href="detail">예치과</a>-->
					<!-- 
			<h2>검색 목록을 크롤링 한 데이터 </h2>
			
			<table border=1 width=210 id="tbl"></table>
			<script id="temp" type="text/x-handlebars-template">
				{{#each .}}
				<tr class="row">
					<td width=30>
						<button h_code="{{id}}" h_name="{{title}}" h_time="{{time}}" h_phone="{{phone}}" 
							h_address="{{addressA}}" h_phone="{{phone}}" h_machine="{{desc}}">저장하기</button>
					</td>
					<td width=30>{{id}}</td>
					<td width=30>{{title}}</td>
					<td width=30>{{time}}</td>
					<td width=30>{{addressA}}</td>
					<td width=30>{{phone}}</td>
					<td width=30>{{desc}}</td>
				</tr>
				{{/each}}
			</script>
			<script>
			
				$("#tbl").on("click","tr td button",function(){
					//alert("Gg");
					var h_code=$(this).attr("h_code");
					var h_name=$(this).attr("h_name");
					var h_time=$(this).attr("h_time");
					var h_phone=$(this).attr("h_phone");
					var h_address=$(this).attr("h_address");
					var h_machine=$(this).attr("h_machine");
					//alert("h_code="+h_code+"\n"+"h_name="+h_name+"\n"+"h_time="+h_time+"\n"+"h_phone="+h_phone+"\n"+"h_address="+h_address+"\n"+"h_machine="+h_machine);
					
					$.ajax({
						type:"get",
						url:"tinsert.json",
						data:{
							"h_code":h_code,"h_name":h_name,
							"h_time":h_time,
							"h_phone":h_phone,
							"h_address":h_address,
							"h_machine":h_machine
							},
						success:function(){
							alert(저장);
						}
					});
				});
				
				getMovie2();
				function getMovie2(){
					$.ajax({
						type:"get",
						url:"../r1.json",
						success:function(data){
							//alert(data[0]["id"]);
							var temp=Handlebars.compile($("#temp").html());
							$("#tbl").html(temp(data));

						}
						});
					}
			</script>
			 -->
					<!-- 
			 	<h3>h_machine 값 안 넣은 애들 수정</h3>
			  	<table border=1 width=210 id="tblz"></table>
			<script id="tempz" type="text/x-handlebars-template">
				{{#each .}}
				<tr class="row">
					<td width=30>
						<button h_code="{{id}}" h_name="{{title}}" h_time="{{time}}" h_phone="{{phone}}" 
							h_address="{{addressA}}" h_phone="{{phone}}" h_machine="{{desc}}">저장하기</button>
					</td>
					<td width=30>{{id}}</td>
					<td width=30>{{title}}</td>
					<td width=30>{{time}}</td>
					<td width=30>{{addressA}}</td>
					<td width=30>{{phone}}</td>
					<td width=30>{{desc}}</td>
				</tr>
				{{/each}}
			</script>
			<script>
			$("#tblz").on("click","tr td button",function(){
				//alert("Gg");
				var h_code=$(this).attr("h_code");
				var h_name=$(this).attr("h_name");
				var h_time=$(this).attr("h_time");
				var h_phone=$(this).attr("h_phone");
				var h_address=$(this).attr("h_address");
				var h_machine=$(this).attr("h_machine");
				alert("h_code="+h_code+"\n"+"h_name="+h_name+"\n"+"h_time="+h_time+"\n"+"h_phone="+h_phone+"\n"+"h_address="+h_address+"\n"+"h_machine="+h_machine);
			
				$.ajax({
					type:"get",
					url:"update.json",
					data:{
						"h_code":h_code,"h_name":h_name,
						"h_time":h_time,
						"h_phone":h_phone,
						"h_address":h_address,
						"h_machine":h_machine
						},
					success:function(){
						alert(수정);
					}
				});
			
			});
				
				getMovie2();
				function getMovie2(){
					$.ajax({
						type:"get",
						url:"../x6.json",
						success:function(data){
							//alert(data[0]["id"]);
							//$("#h_code").html(data.id);
							var temp=Handlebars.compile($("#tempz").html());
							$("#tblz").html(temp(data));
							

						}
						});
					}
			</script>
			  -->
					<!--  -->
					<!-- 
			 <h2>검색 리드를 크롤링한 데이터</h2>
			 <table border=1 width=180 id="tblc"></table>
			<script id="tempc" type="text/x-handlebars-template">
				<tr>
					<td>전화번호</td>
					<td>도로명주소</td>
					<td>지번주소</td>
					<td>의료장비</td>
					<td>저장</td>
					
				</tr>
				{{#each .}}
				<tr>
					<td width=100 style="padding:5px;">{{phone}}</td>
					<td width=100 style="padding:5px;">{{addressA}}</td>
					<td width=100 style="padding:5px;">{{addressB}}</td>
					<td>{{desc}}</td>
					<td><button>저장</button></td>
				</tr>
				{{/each}}
			</script>
			 -->
					<h2>내 테이블에 저장된 데이터 목록</h2>
					<table border=1 width=180 id="tblr"></table>
					<script id="tempr" type="text/x-handlebars-template">
				{{#each .}}
				<tr>
					<td style="padding:5px;"><a href="detail?h_code={{h_code}}">{{h_name}}</a></td>
				</tr>
				{{/each}}
			</script>

					<!-- 
			 <form>
			 <table border=1 width=180>
			 <c:forEach items="${list}" var="vo">
			 
				 <tr onClick="location.href='detail?h_code=${vo.h_code}'">
				 	<td>${vo.h_code}</td>
				 	<td>${vo.h_name}</td>
				 </tr>
				 </c:forEach>
			 </table>
			 </form>
			 -->
				</div>
			<!-- 	
				<input type="text" id="queryapi" value="해리포터">
				<input type="button" value="검색"id="api">
			 -->				
				<!-- 카카오 api 카테고리로 병원 검색 -->
				<!-- 
				<table border=1 width=700 id="tblapi"></table>
				<script id="tempapi" type="text/x-handlebars-template">
				{{#each documents}}
				<tr class="row">
					<td><input type="checkbox"></td>
					<td>{{place_name}}</td>
					<td>{{address_name}}</td>
					<td>{{phone}}</td>
					<td><button class="mapView" x="{{x}}" y="{{y}}" place="{{place_name}}" tel="{{phone}}">지도보기</button></td>
				</tr>
				{{/each}}
				</script>
		 		-->

			</div>
			<!--content-left 끝  -->

			<div id="content-right"
				style="width: 120px; height: 1000px; background: lightgray; float: left;">
				<!-- content-right 시작 -->
				<jsp:include page="right.jsp"></jsp:include>
			</div>

		</div>
		<!-- content 끝 -->

		<div id="footer"></div>

		<div>
			<a href="main">◀</a>
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
	//alert(themes);

	var searchType = $("#searchType option:selected").val();

	//alert(searchType);

	//그냥지도출력
	/*
	var queryapi=$("#queryapi").val();
				$("#api").on("click",function(){
					queryapi=$("#queryapi").val();
					//alert(queryapi);
					getapi();
				});
				*/
	/*
getapi();
	//카테코리 검색 api
	function getapi() {
		$.ajax({
			type : "get",
			url : "https://dapi.kakao.com/v2/local/search/keyword.json?",
			headers : {
				"Authorization" : "KakaoAK 6baa3500ff42695b48d705aa87132cb3"
			},
			dataType : "json",
			data : {
				"query":"인천 속편한내과의원",
				"page" : "1",
				"size" : "10"
			},
			success : function(data) {
				var temp = Handlebars.compile($("#tempapi").html());
				$("#tblapi").html(temp(data));
				//$("#container").html(temp(data));내용이 refresh
				//$("#container").appned(temp(data));내용이 추가
				//is_end=data.meta.is_end;
			}
		});
	}

	*/
	
	//////////////////////////////////////////////////////////////////////
	//테이블에 저장된 지도 출력
	
	
	/*
	
	$("#divmap").show();
		var lat = $("#tblr tr .row").attr("y");
		//위도
		var ing = $("#tblr tr .row").attr("x");
		//경도
		alert(lat +"-"+ lng);

		var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
		var options = { //지도를 생성할 때 필요한 기본 옵션
			center : new kakao.maps.LatLng(lat, lng), //지도의 중심좌표.
			level : 3
		//지도의 레벨(확대, 축소 정도)
		};
		var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴	
		var marker = new kakao.maps.Marker({
			position : new kakao.maps.LatLng(lat, lng)
		});
		marker.setMap(map);

		var str = "<div>" + place + "</div>";
		str += "<div>" + tel + "</div>";
		//출력할 impormation 생성
		var info = new kakao.maps.InfoWindow({
			content : str
		})
		kakao.maps.event.addListener(marker, "mouseover", function() {
			info.open(map, marker);
		});
		kakao.maps.event.addListener(marker, "mouseout", function() {
			info.close(map, marker);
		});
	
	
	
	
	
	
		*/
	
	//api 지도 출력 
	/* 
	
	$("#tblapi").on("click","tr td button",function(){
		$("#divmap").show();
		var lat = $(this).attr("y");
		//위도
		var lng = $(this).attr("x");
		//경도
		alert(lat +"-"+ lng);
		var place = $(this).attr("place");
		var tel = $(this).attr("tel");

		var container = document.getElementById('map'); //지도를 담을 영역의 DOM 레퍼런스
		var options = { //지도를 생성할 때 필요한 기본 옵션
			center : new kakao.maps.LatLng(lat, lng), //지도의 중심좌표.
			level : 3
		//지도의 레벨(확대, 축소 정도)
		};
		var map = new kakao.maps.Map(container, options); //지도 생성 및 객체 리턴	
		var marker = new kakao.maps.Marker({
			position : new kakao.maps.LatLng(lat, lng)
		});
		marker.setMap(map);

		var str = "<div>" + place + "</div>";
		str += "<div>" + tel + "</div>";
		//출력할 impormation 생성
		var info = new kakao.maps.InfoWindow({
			content : str
		})
		kakao.maps.event.addListener(marker, "mouseover", function() {
			info.open(map, marker);
		});
		kakao.maps.event.addListener(marker, "mouseout", function() {
			info.close(map, marker);
		});

	});
		*/
		
	//////////////////////////////////////////////////////////////////
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

	$("#btnsearch").on("click", function() {
		keyword = $("#keyword").val();
		//alert(keyword);
		gettlist();
	});
	$("#keyword").keydown(function(key) {
		if (key.keyCode == 13) {
			keyword = $("#keyword").val();
			gettlist();
		}
	});

	/*
	function getlist() {
		//alert("gg");
		//keyword=$("#keyword").val();
		//alert(keyword);
		$.ajax({
			type : "get",
			url : "slist.json",
			data : {
				"keyword" : keyword
			},
			success : function(data) {
				//alert("tbl2");
				var temp = Handlebars.compile($("#tempr").html());
				$("#tblr").html(temp(data));
			}
		});
	}
*/
	gettlist();

	function gettlist() {
		//alert("gg");
		keyword = $("#keyword").val();
		//alert(keyword);

		$.ajax({
			type : "get",
			url : "slist.json",
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

	/*크롤링한 데이터 hsearch에 저장*/
	/*
	$("#tbl").on("click","tr td button",function(){
		//alert("g");
		var h_code=$(this).attr("h_code");
		var h_name=$(this).attr("h_name");
		var h_time=$(this).attr("h_time");
		//alert(h_code+"\n"+h_name+"\n" +h_time);
		
		$.ajax({
			type:"get",
			url:"rinsert.json",
			data:{"h_code":h_code,"h_name":h_name,"h_time":h_time},
			success:function(){
				//alert("저장됨");	
			
			}
			
		});
		
	});
	 */
	/*검색 리드한 테이블을 검색 목록에 저장하기*/
	$("#tblc").on("click", "tr td button", function() {
		//alert("g");
		var h_code = $("#tbl tr td button").attr("h_code");
		var h_name = $(this).attr("h_name");
		var h_time = $(this).attr("h_time");
		alert(h_code + "\n" + h_name + "\n" + h_time);

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

	/*리드한 크롤링한 데이터 출력*/
	/*
	/*
	getMovie();
	function getMovie(){
	$.ajax({
		type:"get",
		url:"../r1.json",
		success:function(data){
			//alert(data[0]["id"]);
			var temp=Handlebars.compile($("#tempc").html());
			$("#tblc").html(temp(data));

		}
		});
	}	

	 */
	/*hsearch에 id가 무엇인 것에 전화번호,도로명 주소,의료장비 넣기!*/

	/**/
</script>
</html>