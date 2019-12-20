<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>병원 메인 페이지</title>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	
	<style>
		*{
			margin:0px;
			padding:0px;
		}
	</style>
</head>
<body>
	<div id="page" style="margin:0px auto;background:gray;width:800px;height:1200px;">
		<div style="text-align:center;margin-top:20px;">
			<input type="text" id="query" value="하이">
			<input type="button" value="검색" id="btnsearch">
		</div>
		
		<table border=1 width=500 style="text-align:center;margin:20px auto;" id="tbl">
				<tr>
					<td colspan="2" width=100>증상별</td>
				</tr>
				<tr>
				<td width=100>증상</td>
					<td width=400></td>
				</tr>
				<tr>
					<td width=100>종류</td>
					<td width=400></td>
				</tr>
				<tr>
					<td width=100>테마</td>
					<td width=400>
								<div id="divtheme" style="float:left;">
									<input type="button" value="응급실" class="theme">							
									<input type="button" value="대학병원" class="theme">
									<input type="button" value="보건소" class="theme">
									<input type="button" value="전문병원" class="theme">
								</div>
							<input type="button" value="▶">
					</td>
				</tr>
			</table>
		
	</div>
	
</body>
	<script>
		var query=$("#query").val();
		var theme=$(".theme").val();
		
		$("#divtheme").on("click",function(){
			var size = $("input[class='theme']").length;
	        for(i=0;i< size; i++){
	            //alert( i + $("input[name='inputName']").eq(i).attr("value") );
	            //네임에 값을 넣어줌
	            alert(theme)
	        }
		});
		    
		
		
		$("#btnsearch").on("click",function(){
			query=$("#query").val();
			alert(query);	
			location.href='search';
		});
	
		
		
			
		
	</script>
</html>