<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html lang="en-US">
  <head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>알보칠프로젝트</title>
    <meta name="description" content="This is a basic starter template for MMPilot which includes Bootstrap Framework."/>
    <link href="https://fonts.googleapis.com/css?family=Oxygen:300,400,600,700" rel="stylesheet">
    <link href="resources/template/main/styles/main.css" rel="stylesheet">
    <script src="http://code.jquery.com/jquery-3.1.1.min.js"></script>
    
  </head>
  <body id="top">
    <header class="tf-header">
      <nav class="navbar py-5 navbar-dark">
        <div class="container">
          <a class="navbar-brand" href="#"><img src="resources/template/main/images/logo1.png" style="width:100px;"/></a>
          <div id="navbar">
            <ul class="nav pull-right">
              <li class="nav-item">
              	<a class="nav-link" href="#">
              		<jsp:include page="Member/loginmenu.jsp"></jsp:include>		
              	</a>
              </li>
            </ul>
            <div id="nav-wrap" style="overflow:hidden; display: block;"></div>
          </div>
        </div>
      </nav>
      <div class="container">
        <div class="row">
          <div class="col-md-7 col-sm-12">
            <h2>abc <br> project
          </div>
        </div>
        <div class="row">
          <div class="col-md-7 col-sm-12">
            <p class="mt-4">...</p>
            <p class="mt-5"><strong class="text-uppercase">병원 검색</strong></p>
          </div>
        </div>
        <div class="row no-gutters">
          <div class="col-md-4 col-sm-12 tf-hh-col">
            <input class="mt-1 form-control" type="email" placeholder="검색어를 입력하세요" id="query">
          </div>
          <div class="col-md-3 col-sm-12"><a class="tf-header-heading-btn a btn btn-primary btn-block mt-1" href="#" id="mainSearch">검색</a></div>
        </div>
      </div>
    </header>
    <div class="page-content">
      <div>
<div class="tf-work-section">
  <div class="container" id="work">
    <h2 class="h3">menu</h2>
  </div>
  <div class="container">
    <div class="row">
      <div class="col-md-4 col-sm-12 pt-2">
        <div class="card">
            <figure class="snip1432">
              <img class="img-fluid card-img-top" src="resources/template/main/images/hos.jpg" alt="hospital" />
              <figcaption>
                <div>
                	<h3></h3>
                	<h3>병원검색</h3>
                </div>
              </figcaption>
              <a href="Hos-bmain"></a>
            </figure>
        </div>
      </div>
      <div class="col-md-4 col-sm-12 pt-2">
        <div class="card">
          <figure class="snip1432">
            <img class="img-fluid card-img-top" src="resources/template/main/images/med.jpg" alt="medicine" />
            <figcaption>
              <div>
                <h3></h3>
                <h3>약 검색</h3><!-- 약 검색 -->
              </div>
            </figcaption>
            <a href="bmed_list"></a>
          </figure>
        </div>
      </div>
      <div class="col-md-4 col-sm-12 pt-2">
        <div class="card">
          <figure class="snip1432">
            <img class="img-fluid card-img-top" src="resources/template/main/images/4-start-simple.jpg" alt="community" />
            <figcaption>
              <div>
                <h3></h3>
                <h3>커뮤니티</h3><!-- 커뮤니티 -->
              </div>
            </figcaption>
            <a href="comu_clist"></a>
          </figure>
        </div>
      </div>
    </div>
  </div>
</div>
<div class="tf-quotes-section">
  <div class="carousel slide mt-5" id="tf-carousel" data-ride="carousel">
    <ol class="carousel-indicators">
      <li class="active" data-target="#tf-carousel" data-slide-to="0"></li>
      <li data-target="#tf-carousel" data-slide-to="1"></li>
      <li data-target="#tf-carousel" data-slide-to="2"></li>
    </ol>
    <div class="carousel-inner">
      <div class="carousel-item active" style="background-image: url('resources/template/main/images/5-start-simple-slider.jpg');">
        <div class="carousel-caption">
          <p class="slider-text-1"><br>Final project</p>
          <p class="slider-text-2">알보칠(알고 보고 치료하자)</p>
        </div>
      </div>
      <div class="carousel-item" style="background-image: url('resources/template/main/images/6-start-simple-slider.jpg');">
        <div class="carousel-caption">
          <p class="slider-text-1"><br>팀장</p>
          <p class="slider-text-2">노건</p>
        </div>
      </div>
      <div class="carousel-item" style="background-image: url('resources/template/main/images/7-start-simple-slider.jpg');">
        <div class="carousel-caption">
          <p class="slider-text-1"><br>팀원</p>
          <p class="slider-text-2">김경민<br>강교은<br>남건우</p>
        </div>
      </div>
    </div><a class="carousel-control-prev" href="#tf-carousel" role="button" data-slide="prev"><span class="carousel-control-prev-icon" aria-hidden="true"></span><span class="sr-only">Previous</span></a><a class="carousel-control-next" href="#tf-carousel" role="button" data-slide="next"><span class="carousel-control-next-icon" aria-hidden="true"></span><span class="sr-only">Next</span></a>
  </div>
</div>
<div class="tf-contact-section">
  <div class="container" id="contact">
    <h2 class="h4"></h2>
  </div>
  <div class="container">
    <div class="row">
      <div class="col-md-4 col-sm-12">
      </div>
      <div class="col-md-8 col-sm-12 float-right text-right">
        <h3 class="h5">Address</h3><span>ICIA교육원<br/>인천 미추홀구 매소홀로488번길 6-32 태승빌딩 5층</span>
        <p></p>
        <h3 class="h5">Phone</h3>
        <p>010-2706-1558</p>
        <h3 class="h5">Email</h3>
        <p>shrjs1@naver.com</p>
      </div>
    </div>
  </div>
</div></div>
    </div>
    <footer class="bg-dark py-4 mt-5 tf-footer">
      <div class="container text-light">
        <div class="row">
          <div class="col-md-6 col-sm-12">&copy;ABCProject. All rights reserved.</div>
          <div class="col-md-6 col-sm-12 text-right tf-design">Design - <a href="https://templateflip.com" target="_blank">Templateflip</a></div>
        </div>
      </div>
    </footer>
    <script src="https://code.jquery.com/jquery-3.2.1.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
    <script src="resources/template/main/scripts/main.js"></script>
  </body>
<script>
$("#mainSearch").on("click",function(e){
	e.preventDefault();
	query = $("#query").val();
	location.href="Hos-bmain?query="+query;
});
</script>
</html>