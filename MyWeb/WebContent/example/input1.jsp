<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<style>
	th {
		background-color:#CCCCFF;
		padding:5px;
	}
	td {
		padding:5px;
	}
</style>

<jsp:include page="/top.jsp"/>

	<h1>주문 입력</h1>

	<form name='f' method='post' action='result1.jsp'>
	
		<table border=1 style='border-collapse:collapse;'>
			<tr>
				<th>Email</th>
				<td><input type='text' name='email'></td>
			</tr>
			<tr>
				<th>상품</th>
				<td>
					<input type='radio' name='products' value='product1'>상품1 (500원)<br>
					<input type='radio' name='products' value='product2'>상품2 (600원)<br>
					<input type='radio' name='products' value='product3'>상품3 (700원)<br>
				</td>
			</tr>
			<tr>
				<th>수량</th>
				<td><input type='text' name='ea'></td>			
			</tr>			
			<tr>
				<td colspan='2' align='center'>
					<button type='button' onclick='check()'>주문</button>
<!-- 					<button type='button' onclick='toBasket()'>장바구니</button> -->
				</td>			
			</tr>
			
		</table>
		
<!--		
		<p></p>
 		<h1>장바구니</h1>
		<table border=1 style='border-collapse:collapse;'>
			<tr>
				<th>상품명</th>
				<th>수량</th>
				<th>가격</th>
			</tr>
			<tr>
				<td></td>
				<td></td>
				<td></td>
			</tr>
				
		</table> -->
	</form>
	
<script>
	
	function check()
	{
		if(!isEmail(f.email))
		{
			alert("올바른 이메일 주소를 입력해주세요");
			f.email.select();
			return;
		}
		if(!isSelected(f.products))
		{
			alert("상품을 선택해주세요");
			return;
		}
		
		//isNaN(): 숫자가 아니면 true 반환
		if(!isEa(f.ea))
		{
			alert("정확한 수량을 입력해주세요");
			f.ea.select();
			return;
		}
		
		
		f.submit();
		
		
	}
	
	function isEmail(obj)
	{
		var val= obj.value;
		var pattern=/^[0-9a-zA-Z]{2,50}[@]{1}[a-z]+[.]{1}[a-z.]{1,10}$/;
		console.log(pattern.test(val));
		return pattern.test(val);
	}
	function isSelected(obj)
	{
		var val= obj.value;
		console.log("products: "+val);
		return val;
	}
	function isEa(obj)
	{
		var val= obj.value;
		var pattern= /^[0-9]+$/;
		console.log("EA: "+val);
		return pattern.test(val);
	}

</script>

<jsp:include page="/foot.jsp"/>