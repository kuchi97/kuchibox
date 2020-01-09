package k20191115;

import java.util.Scanner;

/*
= 사용자정의 예외만들기
	1. Exception을 상속받는다
	2. 생성자를 구성하고 그 안에서
		super("메시지")를 호출한다

*/

class NotSupportedNameException extends Exception
{
	public NotSupportedNameException()
	{
		super("지원되지 않는 이름입니다");
	}
	public NotSupportedNameException(String msg)
	{
		super(msg);
	}
	
	@Override
	public String toString()
	{
		return "NotSupportedNameException";
	}
}

public class PongApp {
	
	public static void login(String name) throws NotSupportedNameException
	{
		//이름이 퐁 >> 환영합니다 ㅁㅁㅁ님
		//이름이 콩 >> 꺼져
		if(name.charAt(0)=='퐁')
		{
			System.out.println("환영합니다 "+name+"님 ^^");
		}
		else if(name.startsWith("콩"))
		//boolean startsWith(String str)
		{
			throw new NotSupportedNameException("콩까지마 넌 못지나간다");
		}
			
		
	}

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("이름을 입력하세오: ");
		String name= sc.next();
		
		try {
			PongApp.login(name);
			System.out.println("써어비스 이용 중");
		} 
		catch (NotSupportedNameException e){
			//exception변수 e호출하면 만들어둔 예외메소드 출력
			System.out.println(e);
			
			//등록된 예외메시지를 반환
			String msg=e.getMessage();
			System.out.println(msg);
		}
		
		sc.close();
	}

}
