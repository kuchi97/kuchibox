package ExerciseChap3;
//Scanner를 이용하여 소문자 알파벳을 하나 입력받고
//a부터 입력받은값까지 역피라미드형태로 출력
import java.util.Scanner;

public class ExCh3No4 {

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("input alphabet: ");
		String str= sc.next();		//문자열읽음 (띄어쓰기x)
		char ch=str.charAt(0);		//문자열의 첫번째 문자를 읽어옴
				
		for(int i=0; i<ch-'a'+1; i++)		//ch로 받은 문자에 a만큼을 빼면 ch의 알파벳 순서가 나온다
		{
			for(char j='a'; ((int)(ch-j)+1)>i; j++)	//마찬가지
			{
				System.out.print(j);
			}
			System.out.println();
		}
		
	}
}
