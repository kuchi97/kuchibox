package K20191101;

import javax.swing.JOptionPane;

public class MyTest2 {
	
	public static void main(String[] args)
	{
		//String class의 charAt() 메소드를 api에 찾아서 사용해봅시다
		
		String str= JOptionPane.showInputDialog("알파벳, 숫자, 그 외 기타문자 입력");
		System.out.println(str);
		
		//1. 사용자가 입력한 값의 첫글자만 추출해서 출력하세요
		//ABCDEFG ==> A, 안녕하세요 ==> 안
		
		char ch1= str.charAt(0);
		System.out.println("1st of str: "+ch1);
		
		//2. 추출한 첫글자가 알파벳이면 -알파벳입니다
		//	숫자면 숫자입니다
		//	기타입니다				출력
		
		for(int i=0; i<str.length(); i++)
		{
			char ch2= str.charAt(i);
			if(ch2>='0' && ch2<='9')
			{
				System.out.println("숫자입니다");
			}
			else if((ch2>='a'&&ch2<='z') || (ch2>='A'&&ch2<='Z'))
			{
				System.out.println("알파벳입니다");
			}
			else
				System.out.println("기타문자입니다");
		}
		
	}

}
