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

  <title>----------dmainhtml--------------------</title>
  <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
  <script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
  <!-- Bootstrap core CSS -->
  <link href="../resources/ddetail/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="../resources/ddetail/css/blog-post.css" rel="stylesheet">
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
	margin-top:120px;
}

#lightbox {
	width: 100%;
	margin: 0px auto;
	padding: 15px;
	border: 1px solid #333333;
	border-radius: 5px;
	background: white;
	box-shadow: 0px 5px 5px rgba(34, 25, 25, 0.4);
	text-align: center;
}

  	
  </style>
</head>

<body>

  <!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="#">Start Bootstrap</a>
      <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarResponsive" aria-controls="navbarResponsive" aria-expanded="false" aria-label="Toggle navigation">
        <span class="navbar-toggler-icon"></span>
      </button>
      <div class="collapse navbar-collapse" id="navbarResponsive">
        <ul class="navbar-nav ml-auto">
          <li class="nav-item active">
            <a class="nav-link" href="#">Home
              <span class="sr-only">(current)</span>
            </a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">About</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Services</a>
          </li>
          <li class="nav-item">
            <a class="nav-link" href="#">Contact</a>
          </li>
        </ul>
      </div>
    </div>
  </nav>
  <div id="darken-background">

					<div id="lightbox">
						<table id="tblh" class="table" border=0 style="border: 1px solid gray;"></table>
						<script id="temph" type="text/x-handlebars-template">
							{{#each .}}
								<tr onClick="location.href='Hos-ddetail?h_code={{h_code}}'" class="hover">
									<td>{{h_name}}</td>
								</tr>
							{{/each}}
							</script>

						<button id="btnClose" class="btnClose">닫기</button>

					</div>

				</div>
  

  <!-- 병원 네비 끝 -->

  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <!-- Post Content Column -->
      <div class="col-lg-8">

        <!-- Title -->
        <h1 class="mt-4">Post Title</h1>

        <!-- Author -->
        <p class="lead">
          by
          <a href="#">Start Bootstrap</a>
        </p>

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
 
<!-- row 끝 -->
            </div>
          </div>
        </div>

        <hr>
		
		
		
		<p>검색바</p>	
		
		        <!-- Search Widget -->
        <div class="card my-4">
          <h5 class="card-header">Search</h5>
          <div class="card-body">
            <div class="input-group">
              <input type="text" class="form-control" id="query"  placeholder="Search for...">
              <span class="input-group-btn">
                <button class="btn btn-secondary" type="button" id="btnsearch">Go!</button>
              </span>
            </div>
          </div>
        </div>
        <!-- Preview Image -->
        <img class="img-fluid rounded" src="http://placehold.it/900x300" alt="">

        <hr>

        <!-- Post Content -->
        <p class="lead">${vo.h_name}</p>
		<p>${vo.h_address}</p>


          <p class="mb-0">${vo.h_time}</p>
          <p>${vo.h_phone}</p>

		
        <p>${vo.h_machine}</p>
        
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
                <ul class="list-unstyled mb-0">
                  <li>
                    <a href="#">Web Design</a>
                  </li>
                  <li>
                    <a href="#">HTML</a>
                  </li>
                  <li>
                    <a href="#">Freebies</a>
                  </li>
                </ul>
              </div>
              <div class="col-lg-6">
                <ul class="list-unstyled mb-0">
                  <li>
                    <a href="#">JavaScript</a>
                  </li>
                  <li>
                    <a href="#">CSS</a>
                  </li>
                  <li>
                    <a href="#">Tutorials</a>
                  </li>
                </ul>
              </div>
            </div>
          </div>
        </div>

        <!-- Side Widget -->
        <div class="card my-4">
          <h5 class="card-header">질문게시판</h5>
          <div class="card-body">
            You can put anything you want inside of these side widgets. They are easy to use, and feature the new Bootstrap 4 card containers!
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
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="../resources/ddetail/vendor/jquery/jquery.min.js"></script>
  <script src="../resources/ddetail/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
	<script>
	$("#card").on("click", "input:button", function() {
		//alert("ㅎ하");
		var card = $(this).val();
		//alert(card);
		location.href = "Hos-dsearchhtml?card=" + card;
	});
	var query=$("#query").val();
	$("#btnsearch").on("click",function(){
		$("#darken-background").show();
		query=$("#query").val();
		getlist();
		//alert(query);
	});
	
	$("#btnClose").on("click", function() {
		$("#darken-background").hide();
	});
	$("#query").on("keyup",function(key){
		if(key.keyCode==13){
			//alert("하하");
			$("#darken-background").show();
			query=$("#query").val();
			//alert(query);
			getlist();
		}
	});
	getlist();
	function getlist() {
		query = $("#query").val();
		//alert(query);
		$.ajax({
			type : "get",
			url : "Hos-slist.json",
			data : {
				"keyword" : query
			},
			success : function(data) {
				//alert("하하");
				var temp = Handlebars
						.compile($("#temph").html());
				$("#tblh").html(temp(data));
				//alert(data.length);
		
				
				
			}
		});
	}
	
	</script>

</html>
