<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en">

<head>

  <meta charset="utf-8">
  <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
  <meta name="description" content="">
  <meta name="author" content="">

  <title>약 세부검색</title>

  <!-- Bootstrap core CSS -->
  <link href="resources/template/med-list/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Custom styles for this template -->
  <link href="resources/template/med-list/css/blog-home.css" rel="stylesheet">
	<script src="https://cdnjs.cloudflare.com/ajax/libs/handlebars.js/3.0.1/handlebars.js"></script>
		<script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
<style>
.det:hover{
	cursor: pointer;
	background:lightgreen;
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


  <!-- Page Content -->
  <div class="container">

    <div class="row">

      <!-- Blog Entries Column -->
      <div class="col-md-8">

        <h1 class="my-4">약 리스트
          <small>검색결과</small>
        </h1>
        <!-- Blog Post -->

           <table id="boxlist" border=1 width=580></table>
			<script id="temp-med" type="text/x-handlebars-template">
				{{#each list}}
				<tr class="det" medcode="{{medcode}}" onClick="location.href='bmed_des?medcode={{medcode}}'">
					<td width=100 height=50>{{medcode}}</td>
					<td class="medname">{{medname}}</td>
					<td width=100>★100</td>
				</tr>	
				<tr class="med-detail">
					<td colspan=3 height=20>
					<div style="overflow:hidden;text-overflow:ellipsis;width:580px;">
						{{medcontent}}...
					</div>
					</td>
				</tr>
				{{/each}}
				</script>
     
   

        <!-- Pagination -->
        <ul class="pagination justify-content-center mb-4">
            <button class="btn btn-secondary" type="button" id="more">More</button>
        </ul>

      </div>

      <!-- Sidebar Widgets Column -->
      <div class="col-md-4">

        <!-- Search Widget -->
        <div class="card my-4">
          <h5 class="card-header">검색</h5>
          <div class="card-body">
            <div class="input-group">
              <input type="text" class="form-control" placeholder="Search for..." id="keyword" value='<c:out value="${param.key==''?'':param.keyword}"></c:out>'>
              <span class="input-group-btn">
                <button class="btn btn-secondary" type="button" id="btnsearch">검색</button>
              </span>
            </div>
          </div>
        </div>

        <!-- Categories Widget -->
        <div class="card my-4">
          <h5 class="card-header">메세지함</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
              	<a href="MessageHome">메세지함</a>
              </div>
              <div class="col-lg-6">
             
              </div>
            </div>
          </div>
        </div>

	<div class="card my-4">
          <h5 class="card-header">질문게시판</h5>
          <div class="card-body">
            <div class="row">
              <div class="col-lg-6">
              	<a href="comu_qlist">질문게시판</a>
              </div>
              <div class="col-lg-6">
             
              </div>
            </div>
          </div>
        </div>
        <!-- Side Widget -->
     

      </div>

    </div>
    <!-- /.row -->

  </div>
  <!-- /.container -->

  <!-- Footer -->
  <footer class="py-5 bg-dark">
    <div class="container">
      <p class="m-0 text-center text-white">Copyright &copy; ABC Project 2020</p>
    </div>
    <!-- /.container -->
  </footer>

  <!-- Bootstrap core JavaScript -->
  <script src="resources/template/med-list/vendor/jquery/jquery.min.js"></script>
  <script src="resources/template/med-list/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>

</body>
<script>
var keyword=$("#keyword").val();
var page = 1; //결과 페이지 번호
var size = 3; //한 페이지에 보여질 문서의 개수
var is_end ;

$(document).ready(function(){
	keyword = "${param.keyword}";
	if(keyword !=''){
		page = 1;
		$("#boxlist").html("");
		keyword=$("#keyword").val();
		getmedicine();
	}
});

//약 상세페이지
$("#boxlist").on("click","tr",function(){
	var mmid = "${mid}";
	var mmrecent = parseInt($(this).attr("medcode"));
	$.ajax({
		type:"get",
		url:"mminsert",
		data:{"mmid":mmid,"mmrecent":mmrecent},
		success:function(){
			//alert("save");
			location.href="bmed_des?medcode="+mmrecent;
		}
	});
})


//더보기버튼 누르기
$("#more").on("click",function(){
	page = page+3;
	size = size +3;
	getmedicine();
});
getmedicine();
var keyword=$("#keyword").val();

//검색
$("#btnsearch").on("click",function(){
	page = 1;
	$("#boxlist").html("");
	keyword=$("#keyword").val();
	getmedicine();	
});
/*테이블 목록 출력*/
function getmedicine(){
	$.ajax({
		type:"get",
		url:"medicine.json",
		data:{"keyword":keyword,"page":page,"perPageNum":size},
		success:function(data){
			//alert(keyword);
			var temp=Handlebars.compile($("#temp-med").html());
			$("#boxlist").append(temp(data));
		}
	});
}
getme();
/*클로링 목록 출력*/
function getme(){
	$.ajax({
		type:"get",
		url:"../me.json",
		success:function(data){
			var temp=Handlebars.compile($("#ctemp").html());
			$("#boxclist").append(temp(data));
		}
	});
}
//페이징
$("#pagination").on("click", "li a", function(event){
	event.preventDefault();
	page = $(this).attr("href");
	getmedicine();
});

</script>
</html>
