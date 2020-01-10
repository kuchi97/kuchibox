<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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

//우편번호 api
    // 우편번호 찾기 화면을 넣을 element
    var element_layer = document.getElementById('layer');

    function closeDaumPostcode() {
        // iframe을 넣은 element를 안보이게 한다.
        element_layer.style.display = 'none';
    }

    function findPost() {
        new daum.Postcode({
            oncomplete: function(data) {
                // 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

                // 각 주소의 노출 규칙에 따라 주소를 조합한다.
                // 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
                var addr = ''; // 주소 변수
                var extraAddr = ''; // 참고항목 변수

                //사용자가 선택한 주소 타입에 따라 해당 주소 값을 가져온다.
                if (data.userSelectedType === 'R') { // 사용자가 도로명 주소를 선택했을 경우
                    addr = data.roadAddress;
                } else { // 사용자가 지번 주소를 선택했을 경우(J)
                    addr = data.jibunAddress;
                }

                // 사용자가 선택한 주소가 도로명 타입일때 참고항목을 조합한다.
                if(data.userSelectedType === 'R'){
                    // 법정동명이 있을 경우 추가한다. (법정리는 제외)
                    // 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
                    if(data.bname !== '' && /[동|로|가]$/g.test(data.bname)){
                        extraAddr += data.bname;
                    }
                    // 건물명이 있고, 공동주택일 경우 추가한다.
                    if(data.buildingName !== '' && data.apartment === 'Y'){
                        extraAddr += (extraAddr !== '' ? ', ' + data.buildingName : data.buildingName);
                    }
                    // 표시할 참고항목이 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
                    if(extraAddr !== ''){
                        extraAddr = ' (' + extraAddr + ')';
                    }
                    // 조합된 참고항목을 해당 필드에 넣는다.
                    document.getElementById("sample2_extraAddress").value = extraAddr;
                
                } else {
                    document.getElementById("sample2_extraAddress").value = '';
                }

                // 우편번호와 주소 정보를 해당 필드에 넣는다.
                document.getElementById('sample2_postcode').value = data.zonecode;
                document.getElementById("sample2_address").value = addr;
                // 커서를 상세주소 필드로 이동한다.
                document.getElementById("sample2_detailAddress").focus();

                // iframe을 넣은 element를 안보이게 한다.
                // (autoClose:false 기능을 이용한다면, 아래 코드를 제거해야 화면에서 사라지지 않는다.)
                element_layer.style.display = 'none';
            },
            width : '100%',
            height : '100%',
            maxSuggestItems : 5
        }).embed(element_layer);

        // iframe을 넣은 element를 보이게 한다.
        element_layer.style.display = 'block';

        // iframe을 넣은 element의 위치를 화면의 가운데로 이동시킨다.
        initLayerPosition();
    }

    // 브라우저의 크기 변경에 따라 레이어를 가운데로 이동시키고자 하실때에는
    // resize이벤트나, orientationchange이벤트를 이용하여 값이 변경될때마다 아래 함수를 실행 시켜 주시거나,
    // 직접 element_layer의 top,left값을 수정해 주시면 됩니다.
    function initLayerPosition(){
        var width = 300; //우편번호서비스가 들어갈 element의 width
        var height = 400; //우편번호서비스가 들어갈 element의 height
        var borderWidth = 5; //샘플에서 사용하는 border의 두께

        // 위에서 선언한 값들을 실제 element에 넣는다.
        element_layer.style.width = width + 'px';
        element_layer.style.height = height + 'px';
        element_layer.style.border = borderWidth + 'px solid';
        // 실행되는 순간의 화면 너비와 높이 값을 가져와서 중앙에 뜰 수 있도록 위치를 계산한다.
        element_layer.style.left = (((window.innerWidth || document.documentElement.clientWidth) - width)/2 - borderWidth) + 'px';
        element_layer.style.top = (((window.innerHeight || document.documentElement.clientHeight) - height)/2 - borderWidth) + 'px';
    }
//---- 우편번호 api


</script>

<div>
	<h1 class='text-center'>SIGN UP</h1>
	
	<div class="section">
      <div class="container">
        <div class="row">
          <div class="col-md-8 col-md-offset-2">
            <form action='signupEnd.jsp' method='post' onsubmit="return check()" class="form-horizontal" 
            role="form" >
              <h4 class="display-1" style="text-align:right;">* 은 필수 입력 항목입니다</h4>
              <br>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="name" class="control-label">이름 *
                    <br>
                  </label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="name" name='name' placeholder="이름">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="userid" class="control-label">아이디 *
                    <br>
                  </label>
                </div>
                <div class="col-xs-8">
                  <input type="text" class="form-control" id="userid" name='userid' placeholder="ID" required readonly>
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
                  <input type="email" class="form-control" id="email" name='email' placeholder="Email">
                </div>
              </div>
              <div class="form-group">
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
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="phone" class="control-label">연락처 *
                    <br>
                  </label>
                </div>
                <div class="col-xs-2">
                  <input type="text" class="form-control" id="hp1" name='hp1' maxlength='3' placeholder="010">
                </div>
                <div class="col-xs-1 text-center">
                  <label class="control-label">-</label>
                </div>
                <div class="col-xs-3">
                  <input type="text" class="form-control" id="hp2" name='hp2' maxlength='4' placeholder="앞자리">
                </div>
                <div class="col-xs-1 text-center">
                  <label class="control-label">-</label>
                </div>
                <div class="col-xs-3">
                  <input type="text" class="form-control" id="hp3" name='hp3' maxlength='4' placeholder="뒷자리">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="post" class="control-label">우편번호 *
                    <br>
                  </label>
                </div>
                <div class="col-xs-8">
                  <input type="text" class="form-control" id="post" name='post' maxlength='5' placeholder="우편번호">
                </div>
                <div class="col-xs-2">
                  <button type='button' onclick='findPost()' class="btn btn-info">찾기</button>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="addr1" class="control-label">주소 1 *
                    <br>
                  </label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="addr1" name='addr1' placeholder="주소1">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-2">
                  <label for="addr2" class="control-label">주소 2
                    <br>
                  </label>
                </div>
                <div class="col-sm-10">
                  <input type="text" class="form-control" id="addr2" name='addr2' placeholder="주소2">
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10">
                  <div class="checkbox">
                    <label>
                      <input type="checkbox" name='agree'>본사의 약관에 동의합니다</label>
                  </div>
                </div>
              </div>
              <div class="form-group">
                <div class="col-sm-offset-2 col-sm-10 text-center">
                  <button type="submit" class="btn btn-success">Sign in</button>
                  <button type="button" class="btn btn-danger">Cancel</button>
                </div>
              </div>
            </form>
          </div>
        </div>
      </div>
    </div>
	
</div>
<jsp:include page="/foot.jsp"/>