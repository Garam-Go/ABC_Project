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

  <title>병원 세부정보</title>

  <!-- Bootstrap core CSS -->
  <link href="resources/template/hos/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="resources/template/hos/css/blog-post.css" rel="stylesheet">

</head>

<body>

 
<!-- Navigation -->
  <nav class="navbar navbar-expand-lg navbar-dark bg-dark fixed-top">
    <div class="container">
      <a class="navbar-brand" href="homepage">
      	<img src="resources/logo.png" id="iconimg" width=60 >
      </a>
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
        <h1 class="mt-4">약 세부검색</h1>

        <hr>

        <!-- Date/Time -->
        <p>Posted on January 1, 2019 at 12:00 PM</p>

        <hr>
		<input type="hidden" value="${vo.h_code}" id="h_code">		
        <!-- Preview Image -->
        
		<input type="hidden" value="${vo.h_code}" id="h_code">
        <hr>
<!-- 병원 read -->
        <!-- Post Content -->
        <p class="lead">${vo.h_name}</p>
        <hr>
		<p>${vo.h_address}</p>

		<hr>
          <p class="mb-0">${vo.h_time}</p>
          <hr>
          <p>${vo.h_phone}</p>
		<hr>
		
        <p>${vo.h_machine}</p>
        
        <hr>
<!-- 병원 read -->
<!-- 병원 review -->
        <!-- Comments Form -->
        <div class="card my-4">
          <h5 class="card-header">리뷰작성</h5>
          <div class="card-body">
            <form>
            <select class="form-control" id="grade">
            	<option value="" selected disabled hidden>평점 선택</option>
            	<option value="5">★★★★★</option>
            	<option value="4">☆★★★★</option>
            	<option value="3">☆☆★★★</option>
            	<option value="2">☆☆☆★★</option>
            	<option value="1">☆☆☆☆★</option>
            </select>
              <div class="form-group">
                <textarea class="form-control" rows="3" id="review"></textarea>
              </div>
              <button type="button" class="btn btn-primary" id="btnreview">Submit</button>
            </form>
          </div>
          

        </div>
<!-- 병원 review -->

       

       

      </div>

            <!-- Sidebar Widgets Column -->
      <div class="col-md-4">


		<!-- 마이페이지로 이동 -->
        <!-- Categories Widget -->
        <div class="card my-4">
          <h5 class="card-header">메세지함</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
              		<a href="mypage-mypage">메세지함</a>
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
              		<a href="#">질문게시판</a>
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
      <p class="m-0 text-center text-white">Copyright &copy; Your Website 2019</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="resources/template/hos/vendor/jquery/jquery.min.js"></script>
  <script src="resources/template/hos/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
	<script>
	var mid = "${mid}";
	
	
	/* 리뷰삽입 */
	$("#btnreview").on("click",function(){
		//alert("하하");
		var h_name=$("#h_name").html();
		var revcontent=$("#review").val();
		var h_hcode=$("#h_code").val();
		var revgrade=$("#grade").val();
		var mid = "${mid}";
		//alert(revgrade+h_name);
		//유효성체크
		if(mid==""){
			alert("로그인 후 이용해주세요.");
			location.href="login";
			return false;
		}
		if(revcontent==""){
			alert("내용을 입력하세요");
			revcontent.focus();
			return false;
		}
		if(revgrade==null){
			alert("평점을 선택하세요");
			return false;
		}
		$.ajax({
			type:"get",
			url:"Hos-reviewinsert",
			data:{"revcontent":revcontent,"revgrade":revgrade,"h_hcode":h_hcode,"hrevmyid":mid,"h_name":h_name},
			success:function(){
				//alert("성공");
 				$("#grade").prop("value","none");
				$("#review").val("");
				revlist();
			}
		});
	});
	</script>
</html>
