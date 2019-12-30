<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>

<jsp:include page="/top.jsp"/>

<form name="info" id="info" method="POST" action="ex08_result.jsp">
    <table border="1" cellspacing="0" cellpadding="0" width="80%" height="750%" 
    	style='margin:auto; border-collapse:collapse; color:black; font-family:Helvetica;'>
        <tr>
            <td colspan="2" bgcolor="#A9E2F3" >☞아이디(ID) 정보</td>
        </tr>
        <tr>
            <td align="right" bgcolor="#F5F6CE">*아이디</td>
            <td>
                <input type="text" name="userId" id='userId'style="width:25%">
                <input type="submit" value="중복검사"><br>
                (4~12자 영자/숫자 가능, 한글, 특수문자 ID는 사용할 수 없습니다.)
            </td>
        </tr>
        <tr>
            <td align="right" bgcolor="#F5F6CE">*비밀번호</td>
            <td>
                <input type="password" name="userpwd" style="width:25%">
                (5~10자 이내의 영어/숫자 특수기호(!, _)만 가능합니다)
            </td>
        </tr>
        <tr>
            <td align="right" bgcolor="#F5F6CE">*비밀번호 확인</td>
            <td>
                <input type="password" name="userpwd_check" style="width:25%">
                (위 번호와 같이 입력해주세요)
            </td>
        </tr>
        <tr>
            <td colspan="2" bgcolor="#A9E2F3">☞개인정보</td>
        </tr>
        <tr>
            <td align="right" bgcolor="#F5F6CE">*이름(한글)</td>
            <td>
                <input type="text" name="username">
                (예:박정현)
            </td>
        </tr>
        <tr>
            <td align="right" bgcolor="#F5F6CE">생년월일</td>
            <td>
                <input type="text" name="birth">
                ([yyyy-mm-dd] 또는 [yyyy/mm/dd] 의 형식으로 입력)
            </td>
        </tr>
        <tr>
            <td align="right" bgcolor="#F5F6CE">*전화번호</td>
            <td>
                핸드폰<select name="phone1">
                    <option value="010">010</option>
                    <option value="011">011</option>
                    <option value="016">016</option>
                    <option value="019">019</option>
                    </select>
                    -<input type="text" name="phone2" style="width:50px">
                    -<input type="text" name="phone3" style="width:50px">
                    <input type="radio" name="phone_com" value="skt" checked>SKT
                    <input type="radio" name="phone_com" value="ktf">KTF
                    <input type="radio" name="phone_com" value="lgt">LGT
                <br>
                집/회사<input type="text" name="phone_ect1" style="width:50px">
                -<input type="text" name="phone_ect1" style="width:50px">
                -<input type="text" name="phone_ect1" style="width:50px">
                최소 한개는 입력하세요
            </td>
        </tr>
        <tr>

            <td align="right" bgcolor="#F5F6CE">이메일</td>
            <td>
                <input type="text" name="email" style="width:300px"> 
            </td>
        </tr>
        <tr>

            <td align="right" bgcolor="#F5F6CE" multiple>사용 언어</td>
            <td>
                <input type="checkbox" name="lang" value="Java">Java 
                <input type="checkbox" name="lang" value="C"> C  
                <input type="checkbox" name="lang" value="JavaScript">JavaScript 
                <input type="checkbox" name="lang" value="Spring">Spring
            </td>
        </tr>
        <tr>

            <td align="right" bgcolor="#F5F6CE">사용 DBMS</td>
            <td>
            	<select name='dbms' multiple>
            		<option value='Oracle'>Oracle</option>
            		<option value='SQL Server'>SQL Server</option>
            		<option value='MYSQL'>MYSQL</option>
            		<option value='none'>none</option>
            	</select>
            </td>
        </tr>
        <tr>
            <td colspan='2' style='text-align:center;'>
                <button type='submit'>회원가입</button>
                <button type='reset'>다시쓰기</button>
            </td>
        </tr>
    </table>
</form>

<jsp:include page="/foot.jsp"/>