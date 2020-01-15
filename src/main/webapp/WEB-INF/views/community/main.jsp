<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="f" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link href="resources/main.css" rel="stylesheet">
<link href="${pageContext.request.contextPath}/resources/test.css"	rel="stylesheet">
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script	src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>


<script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="resources/template/main/scripts/main.js"></script>
<link href="https://fonts.googleapis.com/css?family=Oxygen:300,400,600,700" rel="stylesheet">
<link href="resources/template/main/styles/main.css" rel="stylesheet">




<style>
	.health{
		width:280px;
		text-overflow: ellipsis;
		white-space: nowrap;
		overflow: hidden;
		text-align: left;
	}
	
	.hos{
		width:160px;
		text-overflow: ellipsis;
		white-space: nowrap;
		overflow: hidden;
		text-align: left;
	}
	
	.active{color:black}
</style>
<title>커뮤니티 메인(자유게시판)</title>
</head>
<body>
	<div id="page">
	
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

		<div id="content" style="overflow:hidden;">
		
			<div style="width: 800px; overflow: hidden; margin:20px auto;">
				<!-- head -->
				<div style="width: 300px; height: 200px; float: left; margin-left: 50px;">
					<div style="text-align:right; padding-right:10px; font-size:20px;">
						<b><a href="comu_hlist" style="text-decoration:none; color:black;"">+</a></b>
					</div>
					<table id="tbl" border=1 width=300 style="border-collapse:collapse; background:white; box-shadow:3px 3px 3px darkgray;"></table>
					<script id="temp" type="text/x-handlebars-template">
						{{#each .}}
							<tr>
								<td><div class=health>
									<a href="http://www.bosa.co.kr/{{link}}" style="text-decoration:none; color:black;">
										{{title}}
									</a>
								</div></td>
							</tr>
						{{/each}}
					</script>
				</div>
				
				<div style="width: 300px; height: 150px; float: right; margin-right: 50px;">
					<div style="text-align:right; padding-right:10px; font-size:20px;">
						<b><a href="comu_qlist" style="text-decoration:none;color:black;">+</a></b>
					</div>
					<div style="text-align:center;">
						<table border=1 style="border-collapse:collapse;  background:white; box-shadow:3px 3px 3px darkgray;">
							<c:forEach var="qvo" items="${qlist}" begin="0" end="4">
									<tr>
										<td><div class=health>${qvo.title}</div></td>
									</tr>
	
							</c:forEach>
						</table>
					</div>
				</div>
			</div>
	
			<!-- mid -->
			<div id="content-left" style = "width:700px; float:left;margin-left:100px;margin-bottom:20px;"><!-- 테이블 짤리면 여기 바꾸면됨 -->
				<div style="margin-top: 50px;">
				
				<div style="overflow:hidden; margin-bottom:10px;">
					<span style="float:right">
						<input type="button" value="글쓰기" onClick="location.href='comu_insert?name=free'">
					</span>
				</div>
				
					<div style="overflow: hidden;">
							<span> 
								<form name=frm>
									<span style="float: left">
										<select name=searchType id=searchType>
												<option value="title">제목</option>
												<option value="content">내용</option>
												<option value="fname">작성자</option>
										</select>
										<input type="text" id=keyword size=10> 
										<input type="button" value="검색" id="btnsearch"> 
									</span>
								</form>								
								<span id=total style="float:right;"></span>
							</span>
							
						<div>
							<div>
								<table id="tbl1" border=1 width=700 style="text-align: center;"></table>
								<script id="temp1" type="text/x-handlebars-template">
									<tr style="background:#9ccfde">
										<td width=50>번호</td>
										<td width=100>작성일</td>
										<td width=275>제목</td>
										<td width=75>작성자</td>
										<td width=50>추천</td>
									</tr>
									{{#each clist}}
										<tr class=tr>
											<td width=50>{{pid}}</td>
											<td width=100>{{wdate}}</td>
											<td width=275><a href="comu_detailListFree?id={{pid}}" style="color:black;">{{title}}</a></td>
											<td width=75>{{fname}}</td>
											<td width=50>{{num}}</td>
										</tr>
									{{/each}}
								</script>
							</div>
						</div>
					</div>
		
					<!-- bottom -->
					<div id=pagination class="pagination" style="width: 285px; text-align:center;margin:0px auto; margin-top: 20px; padding: 10px;"></div>
				
				</div>
			</div>
			
			<div id = "content-right" style="width: 180px; float: right; margin: 100px 50px 0px 20px; background:lightgray;">					
				<input type="button" value="메세지함"  onClick="location.href='MessageHome'"style="width:100px;height:75px; margin:10px;">
           		<input type="button" value="질문게시판" style="width:100px;height:75px;margin:10px;" onClick="location.href='comu_qlist'">   
           		<input type="text" id="query" style="width:160px;margin:10px;">

           		<table id="boxh" border=1 width=180 style="border-collapse:collapse; overflow:hidden;"></table>
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
		</div>		<!-- content end -->
<!-- 
		<div id="footer">
			<div class="a c"  onClick="funab()">b</div>
			<div class=a onClick="funac()">c</div>
			<div class="a c">d</div>
			<div class=a>e</div>
			<div class="a c">f</div>
			<div class=a onClick="funag()">g</div>
		</div>
-->
		<footer class="py-5 bg-dark">
	    <div class="container">
	      <p class="m-0 text-center text-white">Copyright &copy; ABCProject 2020</p>
	    </div>
	    <div class="a c"  onClick="funab()">b</div>
			<div class=a onClick="funac()">c</div>
			<div class="a c">d</div>
			<div class=a>e</div>
			<div class="a c">f</div>
			<div class=a onClick="funag()">g</div>
	    <!-- /.container -->
	  </footer>
	</div>
	<script>
		var searchType = $("#searchType").val();
		var keyword = $("#keyword").val();
		var total=0;
		var page=1;
		var page1=1;
		var query = $("#query").val();
	
		getlist();
		gethealth();
		gethlist();
		
		function funab(){
			alert($(".a").length)
			return $(".a").length;
		}
		
		function funac(){
			alert($(".c").length)
			return $(".c").length;
		}
		
		
		//건강정보
		function gethealth(){
			$.ajax({
				type:"get",
				url:"health.json",
				success:function(data){
					var temp=Handlebars.compile($("#temp").html());
			         $("#tbl").html(temp(data));
				}
			});
		}
		
		//검색
		$("#btnsearch").on("click",function(){
			keyword = $("#keyword").val();
			searchType = $("#searchType").val();
			page=1;
			getlist();
		});
		
		//키 검색
		$("#keyword").keyup(function(key) {
			if (key.keyCode == 13) {
				keyword = $("#keyword").val();
				searchType = $("#searchType").val();
				page=1;
				getlist();
			}
		});
		
		//리스트
		function getlist() {
			$.ajax({
				type : "get",
				url : "clist.json",
				data:{"keyword":keyword,"page":page,"searchType":searchType},
				success : function(data) {
					var temp = Handlebars.compile($("#temp1").html());
					$("#tbl1").html(temp(data));

					total = data.pm.totalCount;
					
					$("#total").html("총 검색 수 : " + total + " 건");
					
					var str="";
					if(data.pm.prev){
						str += "<a href='" + (data.pm.startPage - 1) + "'style='color:black'>◀</a>";
					}
					for(var i=data.pm.startPage; i<=data.pm.endPage; i++){
						if(i==page){
							str += "[<a href='"+ i + "'class=active>" + i + "</a>] ";
						}else{
							str += "[<a href='"+ i + "'style='color:black'>" + i + "</a>] ";
						}
					}
					if(data.pm.next){
						str += "<a href='" + (data.pm.endPage + 1) + "'style='color:black'>▶</a>";
					}
					$("#pagination").html(str);
				}
			});	
		}
		
		//페이지 이동
		$("#pagination").on("click","a", function(event){
			event.preventDefault();
			page = $(this).attr("href");
			getlist();
		});
		
		
		
		var htotal = 1;
		
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
		
	</script>
</body>
</html>