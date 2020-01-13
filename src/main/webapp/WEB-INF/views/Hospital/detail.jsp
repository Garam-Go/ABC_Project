<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>병원 세부정보</title>
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>

<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">

<style>
#page{
	text-align: center;
}
table {
	margin:10px auto;
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
		<div id="login">
			<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
		</div>
		<div id="navbar">
			<jsp:include page="../Nav/navBar.jsp"></jsp:include>
		</div>
		<div id="content" style="overflow: hidden;">
			<div id="content-left" style="float: left; width: 680px; ">
				<input type="hidden" value="${vo.h_code}" id="h_code">


				<table border=1 width=530 style="margin-top:20px;">
					<tr>
						<td width=100>병원이름</td>
						<td id="h_name">${vo.h_name}</td>
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
				<div style="background: white; width: 600px; height: 50px; margin: 0px auto;margin-top:20px;">
					<select style="height: 50px;" id="grade">
						<option value="none" selected disabled hidden>평점 선택</option>
						<option value="5">★★★★★</option>
						<option value="4">★★★★☆</option>
						<option value="3">★★★☆☆</option>
						<option value="2">★★☆☆☆</option>
						<option value="1">★☆☆☆☆</option>
					</select> 
					<input type="text" size=55 style="height: 45px;" id="review"> 
					<input type="button" value="등록" style="height: 50px;" id="btnreview">
					
<!-- 				<div style="background: #E0F8E6; width: 600px; height: 50px; margin: 0px auto;margin-top:20px;"> -->
<!-- 					<input type="button" value="길찾기" style="margin-top: 12px;"> -->
<!-- 					<input type="button" value="네비게이션" style="margin-top: 12px;"> -->
<!-- 				</div> -->
			</div>
		
		</div>
			<!-- content  right 시작 -->
			<div id="content-right"	style="width: 120px; height: 500px; background: lightgray; float: right; margin-top:50px; margin-bottom:50px;" >
				<div style="margin-top:150px;">
					<input type="button" onClick="location.href='MessageHome'" value="메세지함" style="width:100px;height:75px;margin-left:2.5px;margin-bottom:100px;">
					<input type="button" value="질문게시판" style="width:100px;height:75px;margin-left:2.5px;">
				</div>
			</div>

		</div>
		<div id="footer"></div>
		
	</div>
	
</body>
	<script>
	var mid = "${mid}";
	
	//detail넘어오면 병원 저장하기
// 	$(document).ready(function(){
// 		//alert(mid);
// 		if(mid==null || mid==""){
// 			return;
// 		}else{
// 			var mhid = mid;
// 			var mhrecent = "${param.h_code}";
// 			$.ajax({
// 				type:"get",
// 				url:"mhinsert",
// 				data:{"mhid":mhid,"mhrecent":mhrecent},
// 				success:function(){
// 					//alert("save");
// 				}
// 			});
// 		}
// 	});

	
	/* 리뷰 목록 */
	$("#btnreview").on("click",function(){
		//alert("하하");
		var h_name=$("#h_name").html();
		var revcontent=$("#review").val();
		var h_hcode=$("#h_code").val();
		var revgrade=$("#grade").val();
		var mid = "${mid}";
		//alert(revgrade+h_name);
		//유효성체크
		if(revcontent==""){
			alert("내용을 입력하세요");
			revcontent.focus();
			return false;
		}
		if(revgrade==null){
			alert("평점을 선택하세요");
			return false;
		}
		$.ajax({
			type:"get",
			url:"Hos-reviewinsert",
			data:{"revcontent":revcontent,"revgrade":revgrade,"h_hcode":h_hcode,"hrevmyid":mid,"h_name":h_name},
			success:function(){
				//alert("성공");
 				$("#grade").prop("value","none");
				$("#review").val("");
			}
		});
	});
	
	</script>
</html>