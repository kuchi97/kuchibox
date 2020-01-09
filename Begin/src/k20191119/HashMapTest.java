package k20191119;

import java.util.HashMap;
import java.util.Iterator;
import java.io.Console;

/*
HashMap
	- Hashtable과 동일한 기능, 메소드도 동일
	- 동기화 되어있지 않아, 웹에서 주로 사용됨 (ArrayList와 비슷)
	
*/

public class HashMapTest {

	HashMap<String, String> map= new HashMap();
	
	//회원가입처리를 하는 메소드
	public void join()
	{
		map.put("Hong", "123");
		map.put("Gil", "abc");
		map.put("Dong", "!@#");
		map.put("Admin", "tiger");
		System.out.println("회원가입완료!");
	}
	
	//로그인처리하는 메소드
	public void loginCheck()
	{
		//Console을 이용하여 입력받기
		Console con= System.console();		//도스에서 실행시켜야함
		System.out.println("input id: ");
		String userid= con.readLine();
		System.out.println("input pw: ");
		char[] pwd=con.readPassword();
			//char[] readPassword()
		//입력확인
		String pwdStr= new String(pwd,0,pwd.length);
		System.out.println(userid+" / "+pwdStr);
		
		//id pwd 입력후 해당 아이디가 map에 존재하는지 찾아서
		//없다면 "회원이 아닙니다"
		//id는 있으나 pwd가 다를경우 "비밀번호가 틀렸엉"
		//id, pwd가 모두 맞다면 "xxx님 환영합니다"
		//Admin이라면 "관리자 모드를 이용가능합니다"
		
		//boolean containsKey(Object key)		//HashMap안에 해당값이 포함되어있기만 하면
		//boolean containsValue(Object Value)	//true 반환
		String orgPwd= map.get(userid);
		if(map.containsKey(userid))
		{
			if(userid.contentEquals("Admin"))
			{
				if(orgPwd.contentEquals(pwdStr))
					System.out.println("관리자모드 이용가능");
				else
					System.out.println("어딜감히");
			}
			
			else if(orgPwd.contentEquals(pwdStr))
			{
				System.out.println(userid+"님 환영합니다");
			}
			else
				System.out.println("비번이 달라요");
		}
		else
			System.out.println("회원 아닌데?");
	}
	
	public static void main(String[] args) {
	
		HashMapTest hm= new HashMapTest();
		
		hm.join();
		
		hm.loginCheck();
	}
}
