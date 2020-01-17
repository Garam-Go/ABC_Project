<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
	
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>병원검색</title>

  <!-- Bootstrap core CSS -->
  <link href="resources/template/hos/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="resources/template/hos/css/blog-post.css" rel="stylesheet">
  
  	<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>


</head>
<style>
	.hos-click:hover{
		cursor: pointer;
	}
</style>
<body>

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
  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <!-- Post Content Column -->
      <div class="col-lg-8">
		
        <!-- Title -->
        <h1 class="mt-4">병원 검색</h1>
        

        <!-- Author -->
        <p class="lead">
          <a href="#"></a>
        </p>
      
 

        <!-- select box로 검색 가능 -->
        
		<div>
			
						<!-- 카테고리 별 검색 -->
						<select  class="form-control" id="searchType" style="overflow:hidden;">
							<option value="이비인후과" <c:out value="${param.btn=='이비인후과'?'selected':''}"/> >이비인후과</option>
							<option value="소아" <c:out value="${param.btn=='소아'?'selected':''}"/>>소아과</option>
							<option value="피부과" <c:out value="${param.btn=='피부과'?'selected':''}"/>>피부과</option>
							<option value="정형외과" <c:out value="${param.btn=='정형외과'?'selected':''}"/>>정형외과</option>
							<option value="안과" <c:out value="${param.btn=='안과'?'selected':''}"/>>안과</option>
							<option value="치과" <c:out value="${param.btn=='치과'?'selected':''}"/>>치과</option>
							<option value="한의원" <c:out value="${param.btn=='한의원'?'selected':''}"/>>한의원</option>
							<option value="산부인과" <c:out value="${param.btn=='산부인과'?'selected':''}"/>>산부인과</option>
							<option value="비뇨기과" <c:out value="${param.btn=='비뇨기과'?'selected':''}"/>>비뇨기과</option>
							<option value="성형외과" <c:out value="${param.btn=='성형외과'?'selected':''}"/>>성형외과</option>
							<option value="가정의학과" <c:out value="${param.btn=='가정의학과'?'selected':''}"/>>가정의학과</option>
							<option value="외과" <c:out value="${param.btn=='외과'?'selected':''}"/>>외과</option>
							<option value="신경외과" <c:out value="${param.btn=='신경외과'?'selected':''}"/>>신경외과</option>
							<option value="신경과" <c:out value="${param.btn=='신경과'?'selected':''}"/>>신경과</option>
							<option value="정신" <c:out value="${param.btn=='정신'?'selected':''}"/>>정신과</option>
							<option value="마취통증" <c:out value="${param.btn=='마취통증'?'selected':''}"/>>마취통증과</option>
						</select>
						<input type="hidden" id="keyword" size=30 style="height:35px">
						<input type="hidden" value="검색" id="selsearch" class="selsearch"> 
						
		</div>
		
		<!-- select box로 검색 가능 -->
		<hr>
        <!-- Date/Time -->

		<!-- 병원 목록 중 하나 선택하면 detail로 이동 -->
		<div id="tblr"></div>
		<table border=1 width=600 id="tblr"></table>
		<script id="tempr" type="text/x-handlebars-template">
			{{#each .}}
				<tr  h_code="{{h_code}}" class="hos-click" onClick="location.href='Hos-detail?h_code={{h_code}}'">
					<td style="padding:5px;">{{h_name}}</td>
				</tr>
			{{/each}}
			</script>
			
        <!-- Preview Image -->


        <!-- Post Content -->

      </div>

      <!-- Sidebar Widgets Column -->
            <!-- Sidebar Widgets Column -->
      <div class="col-md-4">



        <!-- Categories Widget -->
        <div class="card my-4">
          <h5 class="card-header">메세지함</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
              		<a href="MessageHome">메세지 확인하기</a>
              </div>
            </div>
          </div>
        </div>

        <!-- Side Widget -->
         <div class="card my-4">
          <h5 class="card-header">질문게시판</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
              		<a href="comu_qlist">질문게시판</a>
              </div>
            </div>
          </div>
        </div>

      </div>

        <input type="hidden" value="${param.btn}" id="btn">

      </div>

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; ABCProject 2020</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="resources/template/hos/vendor/jquery/jquery.min.js"></script>
  <script src="resources/template/hos/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>

<script>
//검색버튼
	var query = "${param.query}";
	//var theme="${param.theme}";
	//alert(query+"\n"+theme);
	var query2 = $("#query2").val();
	var keyword = $("#keyword").val();
	gettlist();
	var themes = "${param.themes}";

	var searchType = $("#searchType option:selected").val();

	//셀렉트 박스로 검색
	$("#selsearch").trigger("click");
	$(document).ready(function() {
		//페이지가 로딩하자마자 selsearch 버튼을 누르겠음
		$("#selsearch").trigger("click");
	});

	$("#selsearch").on("click", function() {
		//alert("gg");
		searchType = $("#searchType option:selected").val();
		//alert(searchType);
		gettlist();

	});
	//검색버튼
	$("#btnsearch").on("click", function() {
		keyword = $("#keyword").val();
		//alert(keyword);
		gettlist();
	});
	
	//엔터눌러서 검색
	$("#keyword").keydown(function(key) {
		if (key.keyCode == 13) {
			keyword = $("#keyword").val();
			gettlist();
		}
	});


	gettlist();

	function gettlist() {
		//alert("gg");
		keyword = $("#keyword").val();
		//alert(keyword);

		$.ajax({
			type : "get",
			url : "Hos-slist.json",
			data : {
				"keyword" : searchType,
			},
			success : function(data) {
				//alert(keyword);
				var temp = Handlebars.compile($("#tempr").html());
				$("#tblr").html(temp(data));
			}
		});
	}


	/*검색 리드한 테이블을 검색 목록에 저장하기*/
	$("#tblc").on("click", "tr td button", function() {
		//alert("g");
		var h_code = $("#tbl tr td button").attr("h_code");
		var h_name = $(this).attr("h_name");
		var h_time = $(this).attr("h_time");
		//alert(h_code + "\n" + h_name + "\n" + h_time);
		$.ajax({
			type : "get",
			url : "rinsert.json",
			data : {
				"h_code" : h_code,
				"h_name" : h_name,
				"h_time" : h_time
			},
			success : function() {
				//alert("저장됨");	
			}
		});
	});

	$("#btnsearch").on("click", function() {
		query2 = $("#query2").val();
		//alert(query2);
	});
	
	//병원 누르면 저장하기
	$("#tblr").on("click","tr",function(){
		var mid = "${mid}";
		//alert(mid);
		if(mid==null || mid==""){
			return;
		}else{
			var mhid = mid;
			var mhrecent = $(this).attr("h_code");
			//alert(mhrecent);
			$.ajax({
				type:"get",
				url:"mhinsert",
				data:{"mhid":mhid,"mhrecent":mhrecent},
				success:function(){
					//alert("save");
					location.href="Hos-detail?h_code="+mhrecent;
				}
			});
		}
		
	});
 //select box 로 검색하기
$("#searchType").on("change",function(){
	var card=$(this).val();
	$("#selsearch").trigger("click");	
});

</script>

</html>
