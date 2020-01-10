<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style>
	#myModal {
		color:navy;
	}
</style>

<%-- 저장된 쿠키 꺼내와서 사용자 아이디를 login form의 userid value값으로 주기 --%>
<%

	Cookie[] userCookies= request.getCookies();
	String cval="";	
	boolean ckflag=false;
	
	if(userCookies!=null)
	{	
		for(Cookie c:userCookies)
		{
			if(c.getName().equals("cookieid"))
			{
				cval=c.getValue();		//저장된 사용자아이디값
				ckflag=true;
				break;
			}
		}
	}

%>

<div class='row'>

	<div id='myModal' class='modal fade' role='dialog'>
        <!-- 아이디 지정 필수.  .modal fade -->

        <div class='modal-dialog'>
            <div class='modal-content'>

                <form name='loginF' action='loginEnd.jsp' method='post'>
                    <div class="modal-header">
                        <!-- 헤더 영역 -->
                        <h4 class='text-center' style='font-weight:bold;'>LOGIN</h4>
                        <button data-dismiss='modal' class='close'>&times;</button>

                    </div>

                    <div class="modal-body">
                        <!-- 바디 영역 -->
                        <div class='row m-2' style='margin-bottom:10px;'>
                            <label for='userid' class='col-md-3'>아이디</label>
                            <div class='col-md-9'>
                                <input type='text' name='userid' id='userid' value='<%=cval %>' placeholder='ID' class='form-control' required>
                            </div>
                        </div>
                        <div class='row m-2'>
                            <label for='pwd' class='col-md-3'>비밀번호</label>
                            <div class='col-md-9'>
                                <input type='password' name='pwd' id='pwd' placeholder='password' class='form-control' required>
                            </div>
                        </div>

                    </div>

                    <div class="modal-footer">
                        <!-- 푸터 영역 -->
                        <input type='checkbox' name='saveid' id='saveid' <%= (ckflag)?"checked":"" %> class='form-check-input'>
						<label>아이디 저장하기</label>
                        <button type='button' id='loginBtn' onclick='loginCheck()' class='btn btn-primary'>LOGIN</button>
                        <button data-dismiss='modal' class='btn btn-danger'>Close</button>

                    </div>
                </form>

            </div>
        </div>

    </div>
</div>
    
<script>
	
	loginF.loginBtn.focus();
	
	function loginCheck()
	{
		if(!loginF.userid.value)
		{
			alert("아이디를 입력하세요");
			loginF.userid.focus();
			return;
		}
		if(!loginF.pwd.value)
		{
			alert("비밀번호를 입력하세요");
			loginF.pwd.focus();
			return;
		}
		loginF.action="<%=request.getContextPath()%>/login/loginEnd.jsp";
		loginF.submit();
	}

</script>
	
    