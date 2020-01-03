<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%
	//set encoding post
	request.setCharacterEncoding("UTF-8");

	//var.
	String email= request.getParameter("email");
	String products= request.getParameter("products");
	int price=0;
	String item="";
	String ea= request.getParameter("ea");
	
	switch(products)
	{
		case "product1":
			price=500;
			item="축구공";
			break;
		
		case "product2":
			price=600;
			item="농구공";
			break;
		
		case "product3":
			price=700;
			item="배구공";
			break;
	}
	
	int sum= price*(Integer.parseInt(ea));
	

%>

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

<h1>주문 결과</h1>

<form name='f' method='post' action='input1.jsp'>

	<table border=1 style='border-collapse:collapse;'>
		<tr>
			<th>주문자 Email</th>
			<td><input type='text' name='email' value='<%=email%>' readonly></td>
		</tr>
		<tr>
			<th>상품</th>
			<td><%=item %></td>
		</tr>
		<tr>
			<th>수량</th>
			<td><%=ea %></td>			
		</tr>			
		<tr>
			<th>결제금액</th>
			<td><%=sum %> 원</td>			
		</tr>	
		<tr>
			<td colspan='2' align='center'>
				<button type='button' onclick='goMain()'>주문화면</button>
			</td>			
		</tr>
		
	</table>


</form>


<script>
	function goMain()
	{
		window.location.assign("input1.jsp");
	}
</script>

<jsp:include page="/foot.jsp"/>