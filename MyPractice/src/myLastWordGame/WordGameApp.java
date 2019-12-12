package myLastWordGame;

import java.util.Scanner;
public class WordGameApp {
	Scanner sc= new Scanner(System.in);
	
	public void runGame()
	{
		Player p= new Player();						//player()객체소환
		
		System.out.print("how many?: ");
		int numberOfPlayer= sc.nextInt();
		
		String pl[]= new String[numberOfPlayer];	//플레이어저장
		
		//참가자 저장
		for(int i=0; i<pl.length; i++)
		{
			pl[i]= p.player();
		}
		
		//참가자 출력
		for(int i=0; i<pl.length; i++)
		{
			System.out.println("참가자"+(i+1)+": "+pl[i]);
		}
		
		System.out.println("시작단어는 '아버지' 입니다");
		
		//게임시작
		int count=0;

		String input= "아버지";
		while(true)
		{
			
			
			//전단어 마지막글자와 후단어 첫글자 비교하기
			int lastIndex= input.length()-1;		//전단어 마지막글자인덱스
			char lastChar= input.charAt(lastIndex);	//전단어 마지막글자
			
			System.out.print(pl[count]+">> ");
			input= sc.next();						//새단어 입력
			
			char firstChar= input.charAt(0);		//새단어 첫글자
			
			
			if(lastChar == firstChar)
			{
				count++;
				if(count == (numberOfPlayer))
					count=0;
				continue;
			}
			else
				break;

		}//while
		System.out.println(pl[count]+"가 패배하였습니다");
		
	
	}//runGame method
	
	public static void main(String[] args)
	{
		WordGameApp rg= new WordGameApp();
		rg.runGame();
	}

}
