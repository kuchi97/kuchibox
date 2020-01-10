<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.model.*" %>

<%
/* model1 방식
	- 한 페이지를 두개로 처리하여
	- 하나는 디자인적인 페이지 (signup.jsp)
		다른 하나는 로직처리 페이지(signupEnd.jsp)
		로 구성한다 
*/

//1. post 방식에서 한글처리
	//request.setCharacterEncoding("UTF-8");		//EncodingFilter로 처리할예정
//2. 사용자가 입력한 값 받기
	String name= request.getParameter("name");
	String userid= request.getParameter("userid");
	String email= request.getParameter("email");
	String pwd= request.getParameter("pwd");
	String hp1= request.getParameter("hp1");
	String hp2= request.getParameter("hp2");
	String hp3= request.getParameter("hp3");
	String post= request.getParameter("post");
	String addr1= request.getParameter("addr1");
	String addr2= request.getParameter("addr2");

//3. 유효성 체크
	if(name.trim().isEmpty() || name==null)
	{
		%>
		<script>
		alert("이름을 똑.바.로. 기재해라 인간")
		</script>
		<%
		response.sendRedirect("signup.jsp");
		return;
	}
	if(userid.trim().isEmpty() || userid==null)
	{
		out.println("아이디를 기재해라 인간");
		
		out.println("history.back()");
		return;
	}
	if(pwd.trim().isEmpty() || pwd==null)
	{
		%>
		<script>
			alert("비.밀.번.호.는 잊은거냐 인간");
			history.back();
		</script>
		<%
		return;
	}

//4. UserVO에 담기
	UserVO user= new UserVO();
	
	user.setName(name);
	user.setUserid(userid);
	user.setEmail(email);
	user.setPwd(pwd);
	user.setHp1(hp1);
	user.setHp2(hp2);
	user.setHp3(hp3);
	user.setPost(post);
	user.setAddr1(addr1);
	user.setAddr2(addr2);

//5. UserDAO 생성해서 insertUser() 호출하기
	UserDAO dao= new UserDAO();
//6. 처리결과 메시지 보여주고 이동경로로 이동
	int n=dao.insertUser(user);
	String msg=(n>0)? "등록 성공":"등록 실패";
	String loc=(n>0)? "memberAll.jsp":"javascript:history.back()";
//href에 자바스크립트 함수를 적용하려면
//앞에 javascript: 를 붙여준다 (psuedo protocol)

%>

<script>

	alert("<%=msg%>");
	location.href="<%=loc%>";
	


</script>