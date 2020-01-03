<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<ul id="out-ul">
	<li id="out-li">나의 보관함
		<ul id="in-ul">
			<li id="in-hos"><a href="BasketHosMove">병원</a>
				<div id="in-hos-menu">
					<a href="BasketHosList">최근 본 병원</a><br>
					<a href="BasketHosRes">병원 예약 관리</a><br>
					<a href="BasketHosRev">리뷰관리</a>
				</div>
			</li>
			<li id="in-med"><a href="BasketMedMove">약</a>
				<div id="in-med-menu">
					<a href="BasketMedList">최근 검색한 약</a><br>
					<a href="BasketMedFav">내 관심 약</a><br>
					<a href="BasketComFav">약 댓글 관리</a>
				</div>
			</li>
			<li id="in-com"><a href="BasketComMove">커뮤</a>
				<div id="in-com-menu">
					<a href="BasketComFree">내가 쓴 글</a><br>
					<a href="BasketComQes">내가 쓴 질문</a><br>
					<a href="BasketRepList">내 댓글 관리</a>
				</div>
			</li>
		</ul>
	</li>
</ul>
<ul id="out-ul">
	<li id="out-li">메세지함
		<ul id="in-ul">
			<li><a href="MessageHome">메세지 확인</a></li>
			<li><a href="Message">메세지 보내기</a></li>
			<li><a href="'MessageBook?mbmyid='+${mid }">주소록</a></li>
			<li><a href="MessageDel">휴지통</a></li>
		</ul>
	</li>
</ul>
<ul id="out-ul">
	<li id="out-li">고객센터
		<ul id="in-ul">
			<li><a href="#">QnA</a></li>
			<li><a href="#">1:1 질문하기</a></li>
		</ul>
	</li>
</ul>