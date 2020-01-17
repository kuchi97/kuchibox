<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<jsp:include page="/top.jsp"/>

<div class='row'>
	<div id='side' class= 'col-md-2 bg-info'>
		
		<div id='list' class='text-center'>
			<h3>리스트</h3>
			<ul>
				<li>목록1</li>
				<li>목록1</li>
				<li>목록1</li>
				<li>목록1</li>			
			</ul>
		</div>
	</div>
	<div id='main' class= 'col-md-10 bg-danger'>
		<div>
			<button type='button' onclick='openList()' class='btn btn-danger'>버튼</button>
			<button id='closeList' class='btn btn-primary'>버튼</button>
		</div>
		가나다마바사
	</div>
</div>

<script>
	function openList()
	{
		$("#side").removeClass("col-md-2");
		$("#main").addClass("col-md-12");
		$("#side").css("width","0px");
	}
	
	$("#closeList").click(function(){
		$("#side").addClass("col-md-2");
		$("#main").removeClass("col-md-12");
		$("#side").css("width","25%");
		$("#main").css("backgroundColor","gray");
	})
</script>

</body>
</html>