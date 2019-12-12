package k05engHistogram;

import java.util.Scanner;

public class EngHistogram {


	int ab[]= new int[26];						//알파벳 카운트할 배열
	char AB[]= new char[26];					//대문자 배열
	
	String readString()
	{
		StringBuffer sb= new StringBuffer();		//키 입력 받을 스트링버퍼
		Scanner sc= new Scanner(System.in);
		
		for(int i=0; i<ab.length; i++)
		{
			ab[i]=0;
			AB[i]=(char)('A'+i);
		}
		
		while(true)
		{
			System.out.println("문장을 입력해");
			String line= sc.nextLine();				//텍스트 한 라인을 읽어
			line=line.toLowerCase();
			
			if(line.equals(";"))			//;만 있는 라인일때
				break;						//입력종료	
			
			for(int i=0; i<line.length(); i++)		//문장 글자수만큼 반복
			{
				for(char j='a'; j<'a'+26; j++)		//알파벳 숫자만큼 반복하여 체크
				{
					
					if(j==line.charAt(i))
					{
						ab[(int)(j-'a')]+=1;
					}
				}
			}
			sb.append(line);				//읽은 라인 문자열을 스트링버퍼에 추가
		}
		
		return sb.toString();				//입력된 모든 스트링버퍼의 문자열을 스트링으로 리턴
	}
	
	void showHistogram()
	{
		for(int i=0; i<ab.length; i++)
		{
//			System.out.println((char)('a'+i)+": "+ab[i]);
			System.out.print((char)('a'+i)+": ");
			for(int j=0; j<ab[i]; j++)
			{
				System.out.print("=");
			}
			System.out.println();
		}
	}
	
	public static void main(String []args)
	{
		EngHistogram eh= new EngHistogram();
		String body= eh.readString();
		System.out.println(body);
		eh.showHistogram();
	}
}
