
/*
= 정규식 메타문자 (/여기에 문자 입력/)
    ^ : 시작
    $ : 끝
    a-z: 알파벳 소문자 범위
    A-Z: 알파벳 대문자 범위
    0-9: 숫자들
    + : 패턴이 한번이상 반복된다는 의미
    [a-zA-z]{1} : 알파벳이 앞에 최소 한글자는 나와야한다
    [a-zA-Z0-9가-힣]{4,12}: []안의 문자를 4~12자리까지만 사용가능
*/

function isUserid(obj)
{
    var val= obj.value;
    //var pattern= new RegExp(/^[a-zA-Z0-9가-힣]+$/);
    var pattern= new RegExp(/^[a-zA-z]{1}[a-zA-Z0-9]{3,11}$/)

    //test(): 패턴에 해당하는 문자열이라면 true 반환
    var b=pattern.test(val);
    console.log(b);


    return b;
}//--isUserId()

//[A-Za-z]{1}: 최소 한글자는 알파벳 대소문자로 시작해야함
//  \w: 알파벳 대소문자와 숫자를 의미
//  !: 느낌표 통과
//  \.: 마침표 통과
//  _: 언더바 통과

function isPasswd(obj)
{
    var val= obj.value;
    var pattern=  new RegExp(/^([A-Za-z]{1}[\w!_\.]{4,9})$/);
    var b= pattern.test(val);
    console.log("pwd b: "+b);
    return b;
}

function isName(obj)
{
    var val= obj.value;
    var pattern= /^[가-힣 ]+$/;          //이렇게 써도 됨

    console.log("username test: "+pattern.test(val));
    return pattern.test(val);
}

function isDate(obj)
{
    var val= obj.value;
    var pattern= /\b[\d]{4}[-\/]{1}\d{1,2}[-\/]{1}\d{1,2}\b/;
    //\b: 단어 사이의 경계에 매치되어 정확한 패턴이 일치해야한다
    //\d{1,2}:      \d: 0~9숫자
    //           {1,2}: 2자리까지 올수 있다
    //[-\/]: - 이거나 /        >>\/로 안해도 /만 해도 되던데..

    return pattern.test(val);
}

function isPhone(obj1, obj2, obj3)
{
    var val= obj1.value + "-" + obj2.value + "-" + obj3.value;
    console.log(val);
    var pattern= /\b(010|011|016|019)[-]\d{3,4}[-]\d{4}\b/;
    var b=pattern.test(val);
    console.log("phone b: "+b);
    return b;
}

function isEmail(obj)
{
    var val= obj.value;
    var pattern= /^(\w|\W)+[@][a-zA-Z]+[.][a-z.]+$/;
    //선생님풀이 var pattern=/^[\w-_]+(\.[\w]+_*@([a-zA-Z]+\.)+[a-z]{2,3}$/

    //* : 올수도 있고 안올수도 있다
    //      cf> + : 하나이상 온다
    console.log("email: "+pattern.test(val));
    return pattern.test(val);
}