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

  <title>알보칠 프로젝트</title>
  <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
  <!-- Bootstrap core CSS -->
  <link href="resources/template/hos/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="resources/template/hos/css/blog-post.css" rel="stylesheet">
  <!-- 합쳐지고 최소화된 최신 CSS -->

<!-- 부가적인 테마 -->

<!-- 합쳐지고 최소화된 최신 자바스크립트 -->
  <style>
  	#darken-background {
	position: absolute;
	top: 0px;
	left: 0px;
	right: 0px;
	height: 100%;
	width: 100%;
	background: rgba(0, 0, 0, 0.5);
	z-index: 1000;
	overflow-y: scroll;
	display: none;
	margin-top:55px;
}

#lightbox {
	width: 60%;
	margin: 0px auto;
	padding: 15px;
	border: 1px solid #333333;
	border-radius: 5px;
	background: white;
	box-shadow: 0px 5px 5px rgba(34, 25, 25, 0.4);
	text-align: center;
}

  	#tbl{
  		margin:20px auto;
  		border:1px solid gray;
  	}
  	#tbl tr:hover{
  		cursor: pointer;
  		background: lightgreen;
  	}
  </style>
</head>

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

  
    


<!-- 라이트 박스 -->
  <div id="darken-background">

					<div id="lightbox">
						<table id="tbl" width="500" ></table>
						<script id="temp" type="text/x-handlebars-template">
							{{#each .}}
								<tr h_code="{{h_code}}">
									<td>{{h_name}}</td>
								</tr>
							{{/each}}
						</script>
						<button id="btnClose" class="btn btn-info">닫기</button>

					</div>

				</div>
<!-- 라이트 박스 -->

  

  <!-- 병원 네비 끝 -->

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <!-- Post Content Column -->
      <div class="col-lg-8">

        <!-- Title -->
        <h1 class="mt-4">병원검색</h1>

     

        <hr>


        <!-- Date/Time -->
        <p>병원 카테고리</p>
	 <div class="card my-4">
          <h5 class="card-header">
          		<button class="btn btn-light" type="button" style="margin-top:10px;" data-toggle="collapse" data-target=".multi-collapse" aria-expanded="false" aria-controls="multiCollapseExample1 multiCollapseExample2">내 병원  찾기</button>
          </h5>
          <div class="card-body">
            <div class="input-group">
                <!-- 병원 네비 시작 -->
	<ul class="navbar-nav">
		
	</ul>
<p>
  
</p>

<!-- 병원 버튼을 클릭하면 'search'로 value값을 가지고 이동합니다. -->

<div class="row">
  <div class="col">
    <div class="collapse multi-collapse" id="multiCollapseExample1" style="position:relative;float:none;">
      <div class="card card-body" id="card" style="display:block;position:relative;">
        	<input type="button" class="btn btn-info" value="이비인후과" style="margin-bottom:5px;" >
        	<input type="button" class="btn btn-info" value="소아"  style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="피부과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="외과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="정형외과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="안과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="치과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="한의원" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="산부인과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="비뇨기과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="성형외과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="신경과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="신경외과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="정신과" style="margin-bottom:5px;">
        	<input type="button" class="btn btn-info" value="마취통증과" style="margin-bottom:5px;">
      </div>
    </div>
     </div>
  </div>
<!-- 버튼을 클릭하면 'search'로 value값을 가지고 이동합니다. --> 
<!-- row 끝 -->

            </div>
          </div>
        </div>

        <hr>
		
		
<!-- 검색 버튼을 누르면 라이트박스 출력! 검색 결과가 나옴 -->
		<p>검색바</p>	
		
		        <!-- Search Widget -->
        <div class="card my-4">
          <h5 class="card-header">Search</h5>
          <div class="card-body">
            <div class="input-group">
              <input type="text" class="form-control" id="query"  placeholder="Search for..." value='<c:out value="${param.query!=''?param.query:'' }"></c:out>'>
                            <span class="input-group-btn">
                <button class="btn btn-secondary" type="button" id="btnsearch">검색</button>
              </span>
            </div>
          </div>
        </div>
<!-- 버튼을 누르면 라이트박스 출력! 검색 결과가 나옴 -->        


        
        <hr>

        <!-- Comments Form -->
        

        <!-- Single Comment -->
        

        <!-- Comment with nested comments -->


      </div>

      <!-- Sidebar Widgets Column -->
      <div class="col-md-4">



        <!-- Categories Widget -->
        <div class="card my-4">
          <h5 class="card-header">메세지함</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
              		<a href="MessageHome">메세지함</a>
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
              		<!-- onClick="location.href='comu_qlist'" -->
              </div>
            </div>
          </div>
        </div>

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
	<!-- 라이트 박스 출력문 -->
	<script>
	getlist();
	//병원 누르면 저장하기
	$("#tbl").on("click","tr",function(){
		var mid = "${mid}";
		var mhrecent = $(this).attr("h_code");
		//alert(mid);
		if(mid==null || mid==""){
			mhrecent = $(this).attr("h_code");
			location.href="Hos-detail?h_code="+mhrecent;
		}else{
			var mhid = mid;
			mhrecent = $(this).attr("h_code");
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
	
	$("#btnsearch").on("click",function(){
		$("#darken-background").show();
		getlist();
	});
	$("#btnClose").on("click",function(){
		$("#darken-background").hide();
	});
	var theme = "";
	$("#card").on("click", "input:button", function() {
		var btn = $(this).val();
		//alert(themes);
		location.href = "Hos-bsearch?btn=" + btn;
	});
	//병원검색

	

//엔터 눌러서 병원검색
	$("#query").on("keyup", function(key) {
		if (key.keyCode == 13) {
			$("#darken-background").show();
			query = $("#query").val();
			getlist();

		}
	});
	


	var query = $("#query").val();
	function getlist() {
		query = $("#query").val();
		//alert(query);
		$.ajax({
			type : "get",
			url : "Hos-slist.json",
			data : {"keyword" : query},
			success : function(data) {
				var temp = Handlebars.compile($("#temp").html());
				$("#tbl").html(temp(data));		
			}
		});
	}
	
	$("#mainSearch").on("click",function(e){
		e.preventDefault();
		query = $("#query").val();
		location.href="Hos-bmain?query="+query;
	});
	</script>
</html>
