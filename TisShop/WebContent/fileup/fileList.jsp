<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.io.*, java.util.*, java.text.*" %>

<jsp:include page="/top.jsp"/>

<div class='col-md-8 col-md-offset-2'>
	<h1>::upload file list</h1>

<%
	String upDir="C:/Myjava/upload";			//업로드할 디렉토리
	File dir= new File(upDir);

	SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
	
%>
	<table class='table table-bordered table-hover'>
		<tr class='primary text-center'>
			<th>FILE/DIR</th>
			<th>파일명</th>
			<th>파일크기</th>
			<th>마지막수정일</th>
			<th>다운로드</th>
		</tr>	
		<!-- 반복문이 돌아간다 뿜뿜 -->
<%
		//1. 업로드 디렉토리에 있는 파일목록 얻어오기
		File[] files= dir.listFiles();

		String filename;
		//2. 반복문 돌면서 파일명, 파일크기, 마지막수정일 얻어오기
		if(files!=null)
		{
			for(int i=0; i<files.length;i++)
			{
				filename=files[i].getName();
%>
			<tr class='danger text-center'>
				<td>
<%
					//다음엔 삼항연산자로 해보셈
 					if(files[i].isFile())
						out.println("<img src='../images/new.PNG'>");
					else
						out.println("<img src='../images/jokericon.png'>");
%>
				</td>
				<td><%=filename %></td>
				<td class='text-right'><%=files[i].length() %> bytes</td>
				<td><%=sdf.format(files[i].lastModified()) %></td>
				<td>
					<button onclick='fileDown("<%=filename%>")'class='btn btn-info'>다운로드허쉴?</button>
				</td>
			</tr>
<%
				
			}
		}
%>
		<!-- ----------------------- -->
	</table>
	
	
</div>

<script>
	fileDown=function(filename)
	{
		location.href='../FileDown?filename='+encodeURIComponent(filename);
		//servlet으로 다운로드하는 앱을 작성한다
		//@Webservlet("/FileDown")
		
	}

</script>


<jsp:include page="/foot.jsp"/>
