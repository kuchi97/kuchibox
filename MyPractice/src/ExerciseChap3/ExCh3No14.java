package ExerciseChap3;

//과목이름을 입력받아 점수를 출력하는 프로그램 작성
//그만 을 입력받으면 종료시킨다

//*** String equals(String input)			//문자열을 비교하는 메소드 true/false반환

import java.util.Scanner;

public class ExCh3No14 {
	
	public static void main(String[] args)
	{
		//주어진 배열
		String course[]= {"Java", "C++", "HTML5", "컴퓨터구조", "안드로이드"};
		int score[]= {95, 88, 76, 62, 55};
		
		String stop="그만";
		
		while(true)
		{
			Scanner sc=new Scanner(System.in);
			System.out.print("입력하셈: ");
			String inputStr=sc.next();

			for(int i=0; i<course.length; i++)
			{
				if(course[i].equals(inputStr))
				{
					System.out.println(score[i]);
				}
				else
				{
					continue;
				}
			}
		
			if(inputStr.equals(stop))
			{
				System.out.println("program terminated");
				return;
			}
		}
		
	}
	

}
