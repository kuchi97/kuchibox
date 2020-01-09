package K20191101;

import javax.swing.JOptionPane;

public class MyTest3 {
	
	public static void main(String[] args)
	{
		//String class의 charAt() 메소드를 api에 찾아서 사용해봅시다
		
		String str= JOptionPane.showInputDialog("정수를 입력하세요");
		System.out.println(str);
		
//		입력한 모든 값을 반복문으로 돌려서 검사하여
//		숫자가 아닌 문자가 있으면 숫자여야합니다 출력
//		숫자가 맞으면 숫자입니다 출력
		
		for(int i=0; i<str.length(); i++)
		{
			char ch2= str.charAt(i);
			if(ch2>='0' && ch2<='9')
			{
				System.out.println(ch2+": 숫자입니다");
			}
			else
				System.out.println(ch2+": 숫자여야합니다");
		}

	}

}

