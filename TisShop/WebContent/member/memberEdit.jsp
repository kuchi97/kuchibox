<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!-- 관리자 확인모듈 include -->
<%@ include file="../login/adminCheckModule.jsp" %>
<!-- -------------------------- -->

<jsp:include page="/top.jsp"/>

<script>

	var win=null;
	var flag=false;
	//id 중복체크를 위해 팝업창을 띄운다
	function idCheck()
	{
		var url="idCheck.jsp";
		
		win= window.open(url,"idCheck","width=500, height=400, left=100, top=100");
		flag= true;			//아이디 중복체크버튼 누르면 true;
	}
	var check= function()
	{
		if(!flag)
		{
			alert("아이디 중복체크가 필요합니다");
			return false;
		}
		if(!forms[0].userid.value)
		{
			alert("아이디 중복체크가 필요합니다");
			return false;
		}
		
		//그 외의 유효성체크 >> 정규식 이용
		
		return true;
	}

</script>

<%
	//수정할 회원 번호받기
	String idxStr=request.getParameter("idx");

	//유효성
	if(idxStr==null || idxStr.trim().isEmpty())
	{
		response.sendRedirect("memberAll.jsp");
		return;
	}
%>
	<%-- DAO useBean 생성 --%>
	<jsp:useBean id="dao" class="user.model.UserDAO" scope="session"/>
	<jsp:useBean id="user" class="user.model.UserVO" scope="session"/>
<%
	user= dao.selectUser(Integer.parseInt(idxStr.trim()));	
	
	if(user==null)
	{
%>
		<script>
			alert("존재하지 않는 회원입니다");
			history.back();
		
		</script>
<%
		return;
	}

%>

<div>
	<h1 class='text-center'>회원정보수정</h1>
	
	<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-8 col-md-offset-2">
            <form action='memberEditEnd.jsp' method='post' onsubmit="return check()" class="form-horizontal" 
            role="form" >
              <h4 class="display-1" style="text-align:right;">* 은 필수 입력 항목입니다</h4>
              <br>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="idx" class="control-label">회원번호 *
                    <br>
                  </label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="idx" name='idx' value='<%=user.getIdx() %>' placeholder="회원번호" readonly>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="name" class="control-label">이름 *
                    <br>
                  </label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="name" name='name' value='<%=user.getName() %>' placeholder="이름">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="userid" class="control-label">아이디 *
                    <br>
                  </label>
                </div>
                <div class="col-xs-8">
                  <input type="text" class="form-control" id="userid" name='userid' value='<%=user.getUserid() %>' placeholder="ID" required readonly>
                </div>
                <!-- 중복체크버튼 -->
                <div class="col-xs-2">
                  <button type='button' onclick='idCheck()' class="btn btn-danger">중복확인</button>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="email" class="control-label">Email *</label>
                </div>
                <div class="col-sm-10">
                  <input type="email" class="form-control" id="email" name='email' value='<%=user.getEmail() %>' placeholder="Email">
                </div>
              </div>
              <!-- <div class="form-group">
                <div class="col-sm-2">
                  <label for="pwd" class="control-label">비밀번호 *</label>
                </div>
                <div class="col-sm-10">
                  <input type="password" class="form-control" id="pwd" name='pwd' placeholder="비밀번호">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="confirmPwd" class="control-label">비밀번호확인*</label>
                </div>
                <div class="col-sm-10">
                  <input type="password" class="form-control" id="confirmPwd" name='confirmPwd' placeholder="비밀번호 확인">
                </div>
              </div> -->
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="phone" class="control-label">연락처 *
                    <br>
                  </label>
                </div>
                <div class="col-xs-2">
                  <input type="text" class="form-control" id="hp1" name='hp1' value='<%=user.getHp1() %>' maxlength='3' placeholder="010">
                </div>
                <div class="col-xs-1 text-center">
                  <label class="control-label">-</label>
                </div>
                <div class="col-xs-3">
                  <input type="text" class="form-control" id="hp2" name='hp2' value='<%=user.getHp2() %>' maxlength='4' placeholder="앞자리">
                </div>
                <div class="col-xs-1 text-center">
                  <label class="control-label">-</label>
                </div>
                <div class="col-xs-3">
                  <input type="text" class="form-control" id="hp3" name='hp3' value='<%=user.getHp3() %>' maxlength='4' placeholder="뒷자리">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="post" class="control-label">우편번호 *
                    <br>
                  </label>
                </div>
                <div class="col-xs-8">
                  <input type="text" class="form-control" id="post" name='post' value='<%=user.getPost() %>' maxlength='5' placeholder="우편번호">
                </div>
                <div class="col-xs-2">
                  <button type='button' class="btn btn-info">찾기</button>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="addr1" class="control-label">주소 1 *
                    <br>
                  </label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="addr1" name='addr1' value='<%=user.getAddr1() %>' placeholder="주소1">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="addr2" class="control-label">주소 2
                    <br>
                  </label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="addr2" name='addr2' value='<%=user.getAddr2() %>' placeholder="주소2">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-10">
	                <div class="col-sm-2">
	                  <label for="addr2" class="control-label">회원 상태
	                    <br>
	                  </label>
	                </div>
                  <div class="radio">
                    <label>
                      <input type="radio" name='m_state' value='0' 
                      <%=(user.getM_state()==0)?"checked":"" %>>일반회원
   					</label>
                    <label>
                      <input type="radio" name='m_state' value='-1' 
                      <%=(user.getM_state()==-1)?"checked":"" %>>정지회원
   					</label>
                    <label>
                      <input type="radio" name='m_state' value='-2' 
                      <%=(user.getM_state()==-2)?"checked":"" %>>탈퇴회원
   					</label>
                  </div>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="mileage" class="control-label">마일리지
                    <br>
                  </label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="mileage" name='mileage' value='<%=user.getMileage() %>' placeholder="마일리지">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10 text-center">
                  <button type="submit" class="btn btn-success">Confirm</button>
                  <a href='memberAll.jsp' class='btn btn-danger'>To List</a>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
	
</div>
<jsp:include page="/foot.jsp"/>