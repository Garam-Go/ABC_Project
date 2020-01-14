<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>마이페이지</title>
<style>
#table-read {
	width: 800px;
	border: 1px solid;
	text-align:justify;
}

#message-content {
	margin-top: 30px;
	margin-left: 50px;
	background: white;
	padding: 20px;
	width: 900px;
}
</style>
</head>
<body>

	<h1 style="padding-top:50px;">메세지 확인</h1>

	<input type="text" value="${mid }" name="mssender">
		<table id="table-read" border=1></table>
				<script id="temp-read" type="text/x-handlebars-templete">
					<tr>
							<td width=100>제목</td>
							<td width=700 class="mstitle">{{mstitle}}</td>
						</tr>
						<tr>
							<td width=100>보낸사람</td>
							<td width=700 class="mssender">{{mssender}}</td>
						</tr>
						<tr>
							<td width=100>보낸날짜</td>
							<td width=700>{{msdate}}</td>
						</tr>
						<tr>
							<td width=100>내용</td>
							<td width=700 >
								{{mscontent}}
							</td>
						</tr>

			</script>
			<button id="btn-close">확인</button>
			<button id="btn-reply">답장하기</button>
</body>
<script>
$("#btn-close").on("click",function(){
	$("#darken").hide();
});
	
//답장하기
$("#btn-reply").on("click",function(){
	var row = $("#table-read");
	var mstitle = "re: "+row.find(".mstitle").html();
	var msreceiver = row.find(".mssender").html();
	location.href = "Message?msreceiver="+msreceiver+"&mstitle="+mstitle;
});
</script>
</html>