<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>        
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>detail</title>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
	<link href="${pageContext.request.contextPath}/resources/main (2).css" rel="stylesheet">
</head>
<body>
	
<div id="page">
		<div id="navbar">
		
		</div>
		<div id="content" style="overflow:hidden;">
			<div id="content-left" style="float:left;width:680px;">
				<div id="new" style="background:white;width:100px; heigth:50px; margin-left:500px;margin-top:20px;">
			<select style="margin:0px auto;height:50px;" id="hide-new">
				<option>1.인기 검색어 시작 </option>
				<option>10.인기 검색어 끝</option>
			</select>
		</div>
		<div style="background:#E0F8E6;width:600px; height:200px;margin:0px auto;margin-top:20px;">
			지도 출력
		</div>
		<input type="hidden" value="${vo.h_code}">
		
		<form>
			<table border=1 width=530>
				<tr>
					<td>병원코드</td>
					<td>${vo.h_code}</td>
				</tr>
				<tr>
					<td>병원이름</td>
					<td>${vo.h_name}</td>
				</tr>
				<tr>
					<td>진료시간</td>
					<td>${vo.h_time}</td>
				</tr>
				
			</table>
		</form>
		
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
		<div style="background:white; width:600px; height:50px; margin:0px auto;margin-bottom:20px;">
			<select style="height:50px;">
				<option>평점 선택</option>
			</select>
			<input type="text" size=55 style="height:50px;">
			<input type="button"value="등록" style="height:50px;">
		</div>
		
		<div style="background:#E0F8E6; width:600px; height:50px; margin:0px auto;margin-bottom:20px;">
			<input type="button" value="길찾기" style="margin-top:12px;">
			<input type="button" value="네비게이션" style="margin-top:12px;">
		</div>
			</div>
		<div id="content-right"	style="width:120px;height:1000px; background:lightgray;float:left;">
			<jsp:include page="right.jsp"></jsp:include>
		</div>
		</div>
		<div id="footer">
		
		</div>
		<div>
			<a href="search">◀</a>
			<a href="reservation">▶</a>
		</div>
</div>	
</body>
	<script>
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