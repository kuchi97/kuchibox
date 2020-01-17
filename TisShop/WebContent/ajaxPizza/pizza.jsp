<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    

<!DOCTYPE html>
<jsp:include page="/top.jsp" />

<style type="text/css">
	/* body,h2{
		font-family:돋움,돋움체,verdana;
		color:navy;
	} */
</style>

<script type="text/javascript">

	var req= false;
	var init= function()
	{
		try {
			req=new XMLHttpRequest();
			//Ajax 첫번째단계는 XMLHttpRequset() 객체를 생성하는것부터 시작한다
			//alert(req);
		} catch (e) {
			
			//IE 6 이하일때
			try {
				req= new ActiveXObject("Msxm12.XMLHTTP");
				
			} catch (e2) {
				req=false;
			}
		}
		if(!req) alert("req객체 생성실패");
	}

	var getUserInfo= function()
	{
		var phone= $("#phone").val();
		
		// 1.서버에 요청보내기, 이때 고객연락처를 파라미터로 넘김
		var url="result.jsp?phone="+phone;
		
		//요청보낼 준비
		req.open("GET", url, true);
	/*	open ("method", url, [async])
				전송방식, 보내는곳, 비동기방식여부
				true면 비동기방식 default
				false면 동기방식 */

		// 2. 콜백함수 지정(필수)
		req.onreadystatechange= updatePage;
	
		// 3. 요청전송: send()
		req.send(null);
		
	}//--getUserInfo()
	
	var updatePage= function()
	{
		//alert(req.readyState+"/"+req.status);
		if(req.readyState==4 && req.status==200)
		{
			//성공적인 응답이 왔다면
			var res= req.responseText;		//responseText: 응답유형이 text일때
											//responseXML: 응답유형이 xml일때
			//result.jsp에서 구분자를 # 으로 줌 >> #을 기준으로 쪼개서 배열로 만든다
			var token=res.split("#");
			var midx=token[0];
			var mname=token[1];
			var maddr=token[2];
			
			//비회원일경우	
			if(parseInt(midx)==0)
			{
				$("#userInfo").html("");
				$("#userInfo").hide();
				$("#nonUser").show(200);
				$("#addr").focus();
			}
			//회원일경우
			else
			{
				//alert("응답 옴: "+res);
				$("#userInfo").html("");
				$("#userInfo").append("<h3> 회원명: "+mname+"</h3>")
							.append("<h3> 주소: "+maddr+"</h3>");
				$("#userInfo").show(200);
				$("#nonUser").hide(200);
			}
			
		}
	}
	
	window.onload=init;
</script>


<div class="container">
<div class="col-md-10 col-md-offset-1">
	<h1>Pizza Order Page</h1>
	<form role="form" class="form-horizontal" 
	name="orderF" id="orderF"
	 action="order.jsp" method="POST">
		<div class="form-group">
			<p class="text-info">
				<b>귀하의 전화번호를 입력하세요:</b>
				<input type="text" size="20" name="phone" id="phone" onchange="getUserInfo()" class="form-control"/>
			</p>
			<p class="text-danger">
				<b>귀하가 주문하신 피자는 아래 주소로 배달됩니다.</b>	
			</p>
			<div id="userInfo"></div>
			<div id="address"></div>
			<!-- 비회원 입력 폼 : 비회원일 경우 주소입력 폼을 보여주자.-->
			<div id="nonUser" style="display:none;">
				주소: <input type="text" name="addr" id="addr"
						size="60" style="border:2px solid maroon;" class="form-control"/>
			</div>
			<!-- ------------------------------------------- -->
			<p class="text-info">
			<b>주문 내역을 아래에 기입하세요</b></p>
			<p>
				<textarea name="orderList"
				 id="orderList" rows="6" cols="50" class="form-control"></textarea>
			</p>
			<p>
				<input type="submit" value="Order Pizza" class="btn btn-primary"/>
			</p>
		</div>
	</form>
</div>
</div>

<jsp:include page="/foot.jsp" />


