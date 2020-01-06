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
				<input type="hidden" value="${vo.h_code}" id="h_code">


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
				<input type="button" value="예약" onClick="location.href='Hos-reservation?h_code=${vo.h_code}'">			
				<div
					style="background: white; width: 600px; height: 50px; margin: 0px auto;margin-top:20px;">
					<select style="height: 50px;" id="grade">
						<option  value="" selected disabled hidden>평점 선택</option>
						<option value="5">★★★★★</option>
						<option value="4">★★★★☆</option>
						<option value="3">★★★☆☆</option>
						<option value="2">★★☆☆☆</option>
						<option value="1">★☆☆☆☆</option>
					</select> 
					<input type="text" size=55 style="height: 50px;" id="review"> 
					<input type="button" value="등록" style="height: 50px;" id="btnreview">
					
				<div
					style="background: #E0F8E6; width: 600px; height: 50px; margin: 0px auto;margin-top:20px;">
					<input type="button" value="길찾기" style="margin-top: 12px;">
					<input type="button" value="네비게이션" style="margin-top: 12px;">
				</div>
			</div>
		
		</div>
			<div id="content-right" style="width: 120px; height: 1000px; background: lightgray; float: left;">
				<div style="margin-top:150px;">
					<input type="button" value="메세지함" style="width:100px;height:75px;margin-left:2.5px;margin-bottom:150px;">
					<input type="button" value="질문게시판" style="width:100px;height:75px;margin-left:2.5px;">
				</div>
			</div>
		</div>
		<div id="footer"></div>
		<div>
			<a href="search">◀</a> <a href="reservation">▶</a>
		</div>
				
	</div>
	
</body>
	<script>
	/* 리뷰 목록 */
	$("#btnreview").on("click",function(){
		//alert("하하");
	var revcontent=$("#review").val();
	var h_hcode=$("#h_code").val();
	var revgrade=$("#grade option:selected").val();
	//alert(grade);
	
	//유효성체크
	if(revcontent==""){
		alert("내용을 입력하세요");
		revcontent.focus();
		return false;
	}
	
	if(grade==""){
		alert("평점을 선택하세요");
		return false;
	}
	
	$.ajax({
		type:"get",
		url:"../Hos-reviewinsert",
		data:{"revcontent":revcontent,"revgrade":revgrade,"h_hcode":h_hcode,"hrevmyid":"user00"},
		success:function(){
			alert("성공");
		}
	});
	
	});
	
	
	</script>
</html>