<%@ page language="java" contentType="text/html; charset=UTF-8"    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link href="resources/main.css" rel="stylesheet">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
<title>커뮤니티 글쓰기</title>
</head>
<body>
<div id=page>

	<h1>커뮤니티 글쓰기</h1>
	
	<div id="navbar">
	
	</div>
	
	<div id="content" style="overflow:hidden;">
		<div id="content-left" style = "width:600px; float:left;">
			<form name=frm method="post" enctype="multipart/form-data">
				<div style="overflow:hidden">
					<span id="select" style="float:left">
						<select name=type>
							<option value="all">전체</option>
							<option value="1">밥친구</option>
							<option value="2">커피친구</option>
							<option value="3">영화친구</option>
							<option value="4">음식나눔</option>
						</select>
					</span>
					<span style="float:right">
						제목 : <input type=text name=title>
					</span>
				</div>
				
				<input type=hidden value="${param.hcode}" name=hcode>
				<input type=hidden value="${param.hname}" name=hname>
				
				<div style="float:right">로그인한 아이디</div>
				
				<textarea cols=85 rows=20 name=content></textarea>
				
				<div>
					<input id=file type="file" name="file1" style="visibility: hidden" accept="image/*">
				</div>
				
				<div>
					<img id="img" src="http://placehold.it/150x200" width=150 height=200>
				</div>
				<br>
				<input type="button" value="저장" onClick="funsave()">
				<input type="reset" value="취소">
				<input type="button" value="목록" onClick="location.href='list'">
				
			</form>
		</div>
		
		<div id = "content-right" style="width: 180px; float: right; margin: 50px 10px 10px 0px; background:lightgray;">					
			<input type="button" value="메세지함" style="width:100px;height:75px; margin:10px;">
      		<input type="button" value="질문게시판" style="width:100px;height:75px;margin:10px;" onClick="location.href='comu_qlist'">        		
		</div>
	</div>
	
	<div id="footer">
	
	</div>
</div>		
</body>
<script>
	var name="${param.name}"
	
	if(name == "com"){
		$("#select").show();
	}else{
		$("#select").hide();
	}
	
	//클릭시 이미지 변경
	$("#img").on("click",function(){
		$("#file").click();
	})
	
	//이미지 미리보기
   $("#file").on("change", function(e){
      var reader = new FileReader();
      reader.onload=function(e){
         $("#img").attr("src", e.target.result);
      }
      reader.readAsDataURL(this.files[0]);
   });
	
	function funsave(){
		if(name=="com"){
			frm.action="insertComu";
			frm.method="post";
			frm.submit();
		}
		
		else if(name=="free"){
			frm.action="insertfree";
			frm.method="post";
			frm.submit();
		}
		
		else if(name=="query"){
			frm.action="insertquery";
			frm.method="post";
			frm.submit();
		}
	}

</script>
</html>