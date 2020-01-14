<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<ul>
	<li id="out-li">나의 보관함
		<ul id="in-ul">
			<li id="in-hos"><a href="" style="color:black;">병원</a>
				<div id="in-hos-menu">
					<a href="BasketHosList">최근 본 병원</a><br>
					<a href="BasketHosRes">병원 예약 관리</a><br>
					<a href="BasketHosRev">리뷰관리</a>
				</div>
			</li>
			<li id="in-med"><a href="" style="color:black;">약</a>
				<div id="in-med-menu">
					<a href="BasketMedList">최근 검색한 약</a><br>
					<a href="BasketMedFav">내 관심 약</a><br>
					<a href="BasketRepListM">약 댓글 관리</a>
				</div>
			</li>
			<li id="in-com"><a href="" style="color:black;">커뮤</a>
				<div id="in-com-menu">
					<a href="BasketComFree">내가 쓴 글</a><br>
					<a href="BasketComQes">내가 쓴 질문</a><br>
					<a href="BasketRepListC">내 댓글 관리</a>
				</div>
			</li>
		</ul>
	</li>
</ul>
<ul id="out-ul">
	<li id="out-li" >메세지함
		<ul id="in-ul">
			<li><a href="MessageHome" style="color:black;">메세지 확인</a></li>
			<li><a href="Message" style="color:black;">메세지 보내기</a></li>
			<li><a href="MessageBook?mbmyid=+${mid }" style="color:black;">주소록</a></li>
			<li><a href="MessageDel" style="color:black;">휴지통</a></li>
		</ul>
	</li>
</ul>
<ul id="out-ul">
	<li id="out-li">고객센터
		<ul id="in-ul">
			<li><a href="CSqna" style="color:black;">QnA</a></li>
			<li><a href="CSqes" style="color:black;">1:1 질문하기</a></li>
		</ul>
	</li>
</ul>