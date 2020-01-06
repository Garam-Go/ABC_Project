<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>reservation</title>
	<link href="${pageContext.request.contextPath}/resources/main (2).css" rel="stylesheet">
</head>
<body>



<div id="page">
		<div id="navbar">
		
		</div>
		<div id="content" style="overflow:hidden;">
			<div id="content-left" style="float:left;width:680px;">
				<div id="new" style="background:white;width:100px;height:50px;margin-left:500px;margin-top:20px;">
			<select  style="margin:0px auto;height:50px;" id="hide-new">
				<option>1.인기 검색어 시작 </option>
				<option>10.인기 검색어 끝</option>
			</select>
		</div>
		
		
		<table border=1 width=530 style="margin:0px auto;margin-top:20px;margin-bottom:20px;">
		<tr>
			<td width="100" height=50>병원 이름:</td>
			<td width="430">${vo.h_name}</td>
		</tr>
		<tr>
			<td rowspan="2" width=200 height=150>위치:</td>
			<td width=200 height=100>
				예약 날짜 선택:
				<div>
					<input type="date" value="xxx" min="yyy" max="zzz" style="margin-top:5px;margin-bottom:5px;">
				</div>	
			</td>
		</tr>
		<tr>
			<td>
				예약 시간 선택:
				<div>
					<input type="time" value="xxx" min="yyy" max="zzz" style="margin-top:5px;margin-bottom:5px;">
				</div>	
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<div style="margin-left:150px;"> 
					<input type="button" value="메인" onClick="location.href='./Hos-main'" style="margin-top:7px;margin-bottom:7px;height:35px;">
					<input type="reset" value="취소"style="margin-top:7px;margin-bottom:7px;height:35px;">
					<input type="button" value="예약" style="margin-top:7px;margin-bottom:7px;height:35px;">
				</div>
			</td>
		</tr>
		</table>
			</div>
			<div id="content-right" style="width:120px;height:1000px; background:lightgray;float:left;">
				<div style="margin-top:150px;">
					<input type="button" value="메세지함" style="width:100px;height:75px;margin-left:2.5px;margin-bottom:150px;">
					<input type="button" value="질문게시판" style="width:100px;height:75px;margin-left:2.5px;">
				</div>
			</div>
		</div>
		<div id="footer">
		
		</div>
		<div>
			<a href="detail">◀</a>
		</div>
</div>
</body>
</html>