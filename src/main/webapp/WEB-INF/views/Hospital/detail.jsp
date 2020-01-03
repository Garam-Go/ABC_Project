<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>detail</title>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<link href="${pageContext.request.contextPath}/resources/main (2).css"
	rel="stylesheet">
<style>
table {
	margin-top:10px;
	margin-bottom:10px;
	border: 1px solid #444444;
	border-collapse: collapse;
}

td {
	border: 1px solid #444444;
}

</style>
</head>
<body>
	<h3>로그인</h3>
	
	<div id="top"><!-- 메뉴  -->
		<jsp:include page="menu.jsp"></jsp:include>
	</div>
	<div>
		<form action="loginPost" method="post">
		<table border=1 width=300>
			<tr>
				<td>아이디:<input type="text" name="mid"></td>
				<td rowspan="2"><input type="submit" value="로그인"></td>
			</tr>
			<tr>
				<td>비밀번호:<input type="password" name="mpassword"></td>
			</tr>
		</table>
		</form>
	</div>
	<div id="page">
		<div id="navbar"></div>
		<div id="content" style="overflow: hidden;">
			<div id="content-left" style="float: left; width: 680px; ">
				<div id="new"
					style="background: white; width: 100px; heigth: 50px; margin-left: 500px; margin-top: 20px;">
					<select style="margin: 0px auto; height: 50px;" id="hide-new">
						<option>1.인기 검색어 시작</option>
						<option>10.인기 검색어 끝</option>
					</select>
				</div>
				<div
					style="background: #E0F8E6; width: 600px; height: 200px; margin: 0px auto; margin-top: 20px;">
					지도 출력</div>
				<input type="text" value="${vo.h_code}" id="h_code">


				<table border=1 width=530 style="margin-top:20px;">
					<tr>
						<td width=100>병원이름</td>
						<td>${vo.h_name}</td>
					</tr>
					<tr>
						<td width=100>진료시간</td>
						<td>${vo.h_time}</td>
					</tr>
					<tr>
						<td width=100>전화번호</td>
						<td>${vo.h_phone}</td>
					</tr>
					<tr>
						<td width=100>주소</td>
						<td>${vo.h_address}</td>
					</tr>
					<tr>
						<td width=100>진료과목</td>
						<td>${vo.h_machine}</td>

					</tr>
				</table>



				<!-- ajax 으로 read 를 하렸는되 안됨-->
				<!-- 
		<table border=1 width=530 id="tbl"></table>
		<script id="temp" type="text/x-handlebars-template">
		<tr>
			<td>병원 코드</td>
			<td>병원 이름</td>
		</tr>
		{{#each .}}
			<tr>
				<td>{{h_code}}</td>
				<td>{{h_name}}</td>
			</tr>
		{{/each}}
		<tr>
			<td colspan="2"><button onClick="location.href='reservation'">예약</button></td>
		</tr>
		

		</script>
		 -->

				<!-- 
		<table border=1 width=530 style="margin:0px auto;margin-top:20px;margin-bottom:20px;">
			<tr>
				<td width=100>병원 이름</td>
				<td width=350></td>
			</tr>
			<tr>
				<td width=100>병원 주소</td>
				<td width=350></td>
			</tr>
			<tr>
				<td width=100>진료 시간</td>
				<td width=350></td>
			</tr>
			<tr>
				<td width=100>의료장비</td>
				<td width=350></td>
			</tr>
			<tr>
				<td width=100>연락처</td>
				<td width=350></td>
			</tr>
			<tr>
				<td>예약하기</td>
				<td>
					<div>
						<input type="button" onClick="location.href='reservation'" value="예약" >
					</div>	
				</td>
			</tr>
		</table>
		-->
				<div
					style="background: white; width: 600px; height: 50px; margin: 0px auto;margin-top:20px;">
					<select style="height: 50px;" id="grade">
						<option  value="" selected disabled hidden>평점 선택</option>
						<option value="5">★★★★★</option>
						<option value="4">★★★★☆</option>
						<option value="3">★★★☆☆</option>
						<option value="2">★★☆☆☆</option>
						<option value="1">★☆☆☆☆</option>
					</select> <input type="text" size=55 style="height: 50px;" id="review"> <input
						type="button" value="등록" style="height: 50px;" id="btnreview">
				
				<!-- mbhrev 목록 출력 -->
				
				<table border=1 width=500 id="rev"></table>
				<script id="temp" type="text/x-handlebars-template">
				{{#each}}
				<tr>
					<td>{{mhid}}</td>
					<td>{{mhrecent}}</td>
					<td>{{mhres}}</td>	
					<td>{{mhreview}}</td>
				</tr>
				{{/each}}		
				</script>
				
				<!-- mbasketH 리뷰번호 insert한 목록 출력 -->		
						

			
				
				<div
					style="background: #E0F8E6; width: 600px; height: 50px; margin: 0px auto;margin-top:20px;">
					<input type="button" value="길찾기" style="margin-top: 12px;">
					<input type="button" value="네비게이션" style="margin-top: 12px;">
				</div>
			</div>
		
		</div>
			<div id="content-right" style="width: 120px; height: 1000px; background: lightgray; float: left;">
				<jsp:include page="right.jsp"></jsp:include>
			</div>
		</div>
		<div id="footer"></div>
		<div>
			<a href="search">◀</a> <a href="reservation">▶</a>
		</div>
				
	</div>
	
</body>
<script>
	/* mhhrev에 리뷰를 등록할때 mbasketH에도 저장할거임(병원코드와 리뷰번호를) */
	
	
	/*
	$("#btnreview").on("click",function(){
		//alert("gg");
		
		var revcontent=$("#review").val();
		//alert(review);
		var revgrade=$("#grade option:selected").val();
		
		alert("revcontent:" +revcontent +"revgrade:" +revgrade);
	
		var mhid=$("#mhrecent").
		$.ajax({
			type:"get",
			url:"reviewinsert",
			data:{"revcontent":revcontent,"revgrade":revgrade,"hrevmyid":"shrjs1@naver.com","mhid":"shrjs1@naver.com",},
			success:function(data){
				//alert("성공하고싶음제발");
				$("#review").val("");
				$("#regrade").val("");
			}
		});
	
	});
	*/
	/*
		var h_code=$("#h_code").val();
		//alert(h_code);
		//alert(h_code);
		getlist();
		function getlist(){
			h_code=$("#h_code").val();
			//alert(h_code);
			$.ajax({
				type:"get",
				url:"read.json",
				data:{"h_code":h_code},
				success:function(data){
					//alert("하하");
					var temp=Handlebars.compile($("#temp").html());
					$("#tbl").html(temp(data));
				}
			});
		}
	 */
</script>
</html>