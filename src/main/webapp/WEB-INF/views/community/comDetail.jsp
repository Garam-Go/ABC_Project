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
<title>상세 정보 페이지</title>

<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="resources/template/main/scripts/main.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen:300,400,600,700" rel="stylesheet">
<link href="resources/template/main/styles/main.css" rel="stylesheet">

</head>
<body>
<div id=page>

	
	<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="homepage">
      	<img src="resources/logo.png" id="iconimg" width=60 >
      </a>
     <div id="login">
		<jsp:include page="../Member/loginmenu.jsp"></jsp:include>
	</div>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="homepage">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="Hos-bmain">병원검색</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="bmed_list">약검색</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="comu_clist">커뮤니티</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="MyPage?mid=${mid}">마이페이지</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
	
	<div id="content" style="overflow:hidden">
		<div id="content-left" style = "width:600px; float:left;">
			<table width=600 border=1 style="border-collapse:collapse;margin-left:120px;margin-top:20px;">
				<tr>
					<td>${vo.fname}</td>
					<td>${vo.title}</td>
					<td><f:formatDate value="${vo.wdate}" pattern="yyyy-MM-dd / kk-mm-ss"/></td>
				</tr>
				<tr>
					<td colspan="3" style="text-align:left; height:100px;">
						<div style="text-align:center">
							${vo.content}
						</div>
						<br>
						
						<div style="text-align:center">
							<img src="display?fileName=${vo.image}" width=400>
						</div>
					</td>
				</tr>
			</table>
			<br>
			<div style="margin-left:120px;">
				<input type="text" id="reply" style="line-height:40px;" size=75>
				<input type="button" id="btnreply" value="입력" style="height:40px;">
			</div>
			<table id="box" border=1 width=525 style="margin-left:160px;float:left; margin-top:10px;"></table>
			<script id="temp" type="text/x-handlebars-template">
			{{#each .}}
				<tr>
					<td>
						<div style="width:500px; overflow:hidden">
							<div style="float:left">
								{{mid}}({{wdate}})
							</div>
							<br>

							<div>
								{{content}}
							</div>
						</div>
					</td>
				</tr>
			{{/each}}
			</script>
		</div>
		
		<div id = "content-right" style="width: 180px; float: right; margin: 50px 10px 10px 0px; background:lightgray;">					
				<input type="button" value="메세지함" onClick="location.href='MessageHome'" style="width:100px;height:75px; margin:10px;">
           		<input type="button" value="질문게시판" style="width:100px;height:75px;margin:10px;" onClick="location.href='comu_qlist'">     
           		
           		<input type="text" id="query" style="width:160px;margin:10px;">

           		<table id="boxh" border=1 width=180 style="; border-collapse:collapse; overflow:hidden;"></table>
				<script id="temph" type="text/x-handlebars-template">	
				{{#each hlist}}
					<tr>
						<td>
							<div class=hos>
								<a href="comu_community?h_code={{h_code}}&h_name={{h_name}}" style="text-decoration:none; color:black;">
									{{h_name}}
								</a>
							</div>
						</td>
					</tr>	
				{{/each}}
				</script>
				
				<!-- 병원목록 페이지 버튼 -->
				<div>		
					<span>
						<button id="btnprev">◀</button>
					</span>
					
					<span>
						<button id="btnnext">▶</button>
					</span>
				</div>     		
		</div>
	</div>
	

</div>	
<footer class="py-5 bg-dark">
	    <div class="container">
	      <p class="m-0 text-center text-white">Copyright &copy; ABCProject 2020</p>
	    </div>
	    <!-- /.container -->
	  </footer>
</body>
<script>
var page1=1;
var query = $("#query").val();
var htotal = 1;
var pid="${param.id}"

gethlist();
getrlist();

// 병원 목록 이전 다음
$("#btnprev").on("click", function(){
	if(page1 > 1){
		page1 = page1 - 1;
		gethlist();
	}
});

$("#btnnext").on("click", function(){
	if((page1*10) < htotal){
		page1 = page1 + 1;
		gethlist();
	}
});

//키 검색
$("#query").keyup(function(key) {
	if (key.keyCode == 13) {
		query = $("#query").val();
		page1=1;
		gethlist();
	}
});

//병원리스트
function gethlist() {
	$.ajax({
		type : "get",
		url : "community.json",
		data:{"page":page1, "keyword":query},
		success : function(data) {
			var temp = Handlebars.compile($("#temph").html());
			$("#boxh").html(temp(data));
			
			htotal = data.pm.totalCount;
		}
	});	
}

//댓글리스트
function getrlist() {
	$.ajax({
		type : "get",
		url : "replyList.json",
		data:{"pid":pid},
		success : function(data) {
			var temp = Handlebars.compile($("#temp").html());
			$("#box").html(temp(data));
		}
	});	
}

//키 검색
$("#reply").keyup(function(key) {
	if (key.keyCode == 13) {
		$("#btnreply").click();
	}
});

//댓글입력
$("#btnreply").on("click",function(){
	var content=$("#reply").val();
	var mid = "${mid}";
	$.ajax({
		type : "get",
		url : "freereplyinsert.json",
		data:{"pid":pid, "content":content,"mid":mid},
		success : function(data) {
			var temp = Handlebars.compile($("#temp").html());
			$("#box").html(temp(data));
			
			$("#reply").val("");
			gethlist();
			getrlist();
		}
	});

});
</script>
</html>