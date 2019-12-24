<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title>search </title>
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
				<div id="new">
			<!-- 검색 연습 시작-->	
			<input type="text" id="keyword">
			<input type="button" value="검색" id="btnsearch">
			<!-- 검색 연습 끝 -->
			<select style="margin:0px auto; height:50px;" id="hide-new">
				<option>1.인기 검색어 시작 </option>
				<option>10.인기 검색어 끝</option>
			</select>
		</div>
		<div style="text-align:center;width:600px;height:50px;margin-top:25px;margin-left:70px;height:50px;margin-bottom:25px;">
			<select style="height:50px;">
				<option>시/도 선택</option>
			</select>
			
			<select style="height:50px;">
				<option>시/군/구 선택</option>
			</select>
			
			<select style="height:50px;">
				<option>읍/면/동/로 선택</option>
			</select>
			
			<select style="height:50px;">
				<option>증상 (ex)</option>
				<option>종류 (ex)</option>
				<option>테마 (ex)</option>
			</select>

		<input type="button" value="검색">
		</div>
		
		<div style="background:#E0F8E6; width:280px;height:500px; margin-left:90px;float:left;">
			
		</div>
		<div style="width:210px; background:#E0F8E6;margin-left:400px;margin-bottom:50px;padding:15px;">
			<!-- <a href="detail">예치과</a>-->
			<!-- 크롤링 한 데이터 -->
			<!-- 
			<table border=1 width=180 id="tblc"></table>
			<script id="tempc" type="text/x-handlebars-template">
				{{#each .}}
				<tr>
					<td style="padding:5px;">
						<a href="#">{{title}}</a>
					</td>
					<td><button h_name="{{title}}">저장</button></td>
				{{/each}}
			</script>
			 -->
			 
			<!-- 크롤링 한 데이터를 테이블에 저장 -->
			<table border=1 width=180 id="tbl"></table>
			<script id="temp" type="text/x-handlebars-template">
				{{#each .}}
				<tr>
					<td style="padding:5px;"><a href="detail?h_code={{h_code}}">{{h_name}}</a></td>
					<td>{{h_code}}</td>
				</tr>
				{{/each}}
			</script>
			
			
		</div>
		</div><!--content-left 끝  -->		
			
		<div id="content-right" style="width:120px;height:1000px; background:lightgray;float:left;"><!-- content-right 시작 -->
			<jsp:include page="right.jsp"></jsp:include>
		</div>
		
		</div><!-- content 끝 -->

		<div id="footer"style="width:800px; height:100px;background:#666666;">
			<jsp:include page="bottom.jsp"></jsp:include>
		</div>
		<div>
			<a href="main">◀</a>
		</div>
</div>
	
		
		
		
		
		
		
		
		
	
	
</body>
	<script>
		var query="${param.query}";
		var theme="${param.theme}";
		//alert(query+"\n"+theme);
	
		var query2=$("#query2").val();
		
		var keyword=$("#keyword").val();
		
		getlist();
		
		 $("#btnsearch").on("click", function() {
		        keyword = $("#keyword").val();
		        getlist();
		 });
		
		function getlist(){
			//alert("gg");
			//keyword=$("#keyword").val();
			$.ajax({
				type:"get",
				url:"slist.json",
				data:{"keyword":keyword},
				success:function(data){
					//alert("tbl2");
					var temp=Handlebars.compile($("#temp").html());
					$("#tbl").html(temp(data));
				}
			});
		}
		
		$("#tblc").on("click","tr td button",function(){
			//alert("g");
			var h_code="1234567814";
			var h_name=$(this).attr("h_name");
			alert(h_code+"\n"+h_name);
			$.ajax({
				type:"get",
				url:"insert.json",
				data:{"h_code":h_code,"h_name":h_name},
				success:function(){
					alert("저장됨");	
				}
				
			});
		});
		$("#btnsearch").on("click",function(){
			query2=$("#query2").val();
			//alert(query2);
		});
		/*
	getMovie();
	function getMovie(){
		$.ajax({
			type:"get",
			url:"../daum.json",
			success:function(data){
				var temp=Handlebars.compile($("#temp").html());
				$("#tbl").html(temp(data));
			}
		});
	}
*/
getMovie();
function getMovie(){
	$.ajax({
		type:"get",
		url:"../daum5.json",
		success:function(data){
			var temp=Handlebars.compile($("#tempc").html());
			$("#tblc").html(temp(data));
		
		}
		});
	}
	
		    
		
		
	
	
		
		
			
		
	</script>
</html>