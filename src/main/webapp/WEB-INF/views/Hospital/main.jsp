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
				<div id="theme">
					<input type="button" value="이비인후과" class="theme">
					<input type="button" value="소아과" class="theme">
					<input type="button" value="피부과" class="theme">
					<input type="button" value="외과" class="theme">
					<input type="button" value="정형외과" class="theme">
					<input type="button" value="안과" class="theme">
					<input type="button" value="치과" class="theme">
					<input type="button" value="한의원" class="theme">
					<input type="button" value="산부인과" class="theme">
					<input type="button" value="비뇨기과" class="theme">
					<input type="button" value="성형외과" class="theme">
					<input type="button" value="신경과" class="theme">
				</div>
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
		var btnin="${param.theme}";
		//alert(btnin);
		var query=$("#query").val();
		
		var theme="";
		$("#theme").on("click","input:button",function(){
			var themes=$(this).val();
			//alert(themes);
			location.href="search?themes=" +themes;
			
		});
		$("#btnnext").on("click",function(){
			
		});

		$("#btnin").on("click",function(){
			var theme=$(this).val();
			location.href="search?theme=" +theme;
		});
		
		$("#btnout").on("click",function(){
			var theme=$(this).val();
			location.href="search?theme=" +theme;
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