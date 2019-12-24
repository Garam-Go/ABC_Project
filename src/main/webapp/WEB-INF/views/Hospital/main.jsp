<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>main</title>
	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
	<link href="${pageContext.request.contextPath}/resources/main (2).css" rel="stylesheet">
</head>
<body>
<div id="page">
	<div id="navbar">
		
	</div>
	<div id="content" style="overflow:hidden;"><!-- content 시작 -->
			
		<div id="content-left" style="float:left;width:680px;"><!-- content  left 시작 -->
		<div style="text-align:center;margin-top:20px;">
			<input type="text" id="query" value="하이">
			<input type="button" value="검색" id="btnsearch">
		</div>	
		<div id="new">
			<select style="margin:0px auto;margin-top:25px;height:50px;" id="hide-new">
				<option>1.인기 검색어 시작 </option>
				<option>10.인기 검색어 끝</option>
			</select>
		</div>
		
		<table border=1 width=530 style="margin-top:100px;">
			<tr>
				<td colspan="2" height=100>병원 검색</td>
			</tr>		
			<tr>
				<td rowspan="2" height=500>
					<a href="search">외과</a>
				</td>
				<td rowspan="2" height=500>
					<a href="search">내과</a>
				</td>
			</tr>
		</table>
	</div><!-- content  left 끝 -->
		<div id="content-right" style="width:120px;height:1000px; background:lightgray;float:left;"><!-- content  right 시작 -->
			<jsp:include page="right.jsp"></jsp:include>
		</div><!-- content right 끝 -->
	</div><!-- content 끝 -->
	
	<div id="footer" style="width:800px; height:100px;background:#666666;"><!-- footer 시작 -->
		<jsp:include page="bottom.jsp"></jsp:include>
	</div>	<!-- footer 끝 -->

</div><!-- page 끝 -->
	
</body>
	<script>
		var query=$("#query").val();
		
		var theme="";
		
		$("#btnnext").on("click",function(){
			
		});

		
		   $("#divtheme").on("click","input:button",function(){
			   theme=$(this).val();
			   query=$("#query").val();
			   //$(this).text(theme);
			   //alert(theme+"/"+query);
			   location.href="search?query="+query+"&theme="+theme;
		   });
		
		    
		
		
	
	
		
		
			
		
	</script>
</html>