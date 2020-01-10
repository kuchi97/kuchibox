<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ page import="user.model.*" %>

<jsp:useBean id="dao" class="user.model.UserDAO" scope="session"/>
	<%-- UserDAO dao= new UserDAO(); --%>
	
<jsp:useBean id="user" class="user.model.UserVO" scope="page"/>
	<%-- UserVO user= new UserVO(); 와 같은 말임 --%>
	
<jsp:setProperty property="*" name="user"/>
	<%-- user.setUserid(request.getParameter("userid")); 와 동일함 --%>


<%-- setProperty 액선을 편하게 이용하려면 html의 input name과 bean(VO객체)의
	property(멤버변수)명을 일치시켜야 함
		만약 일치시키지 못했다면 setProperty 액션의 param="" 이라는 옵션으로 
		input name을 특정해주어야 한다
		
- java Bean의 scope
	1. page
		: 페이지마다 객체를 생성함	>> VO는 page scope를 줌
	2. request
		: forward 이동시 같은request 공유 >> 공유하는 페이지에 하나의 객체를 생성함
	3. session
		: 세션에 하나의 객체를 생성함	>> DAO는 session scope를 줌
	4. application
		: 서버가 startup하고 shutdown할 때까지 하나의 객체를 생성함
			>> 커넥션 풀의 경우 application scope를 줌

--%>

<%
/* model1 방식
	- 한 페이지를 두개로 처리하여
	- 하나는 디자인적인 페이지 (signup.jsp)
		다른 하나는 로직처리 페이지(signupEnd.jsp)
		로 구성한다 
*/

//1. post 방식에서 한글처리
	//EncodingFilter로 처리할예정
//2. 사용자가 입력한 값 받기
//useBean 액션을 이용해서 받을것임
	String userid=user.getUserid();
	String name=user.getName();
	String pwd=user.getPwd();


//3. 유효성 체크
	if(name.trim().isEmpty() || name==null)
	{
%>
		<script>
			alert("이름을 똑.바.로. 기재해라 인간");
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
	//bean으로 생성함

//5. UserDAO 생성해서 insertUser() 호출하기
	//UserDAO dao= new UserDAO();		bean으로 생성함
	
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