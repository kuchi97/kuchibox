package ExerciseChap3;
//정수를 몇개저장할지 키보드로 입력받아 (100미만) 정수배열 생성
//1~100까지 랜덤하게 삽입
//배열에는 같은수가 없도록하고 출력할것

import java.util.Scanner;
public class ExCh3No8 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("input int 1~99: ");
		int input= sc.nextInt();
		
		if(input<1||input>=100)
		{
			System.out.println("error");
			return;
		}
		
		int randArr[];
		randArr= new int[input];
		
		for(int i=0; i<input; i++)			//i는 input만큼 증가시켜 input만큼 출력시킬거
		{
			for(int j=0; j<=i; j++)			//j는 i의 횟수만큼 다시 돌거
			{
				randArr[i]= (int)(Math.random()*100+1);		//따라서 i번의 배열에 값이 들어감
				if(randArr[i]==(int)(Math.random()+100+1))	//만약 같은값이 나오면
				{
					randArr[i]=(int)(Math.random()*100+1);	//i번째 배열요소를 다시 넣어줌
				}
			}
		}
		
		
		
		
		for(int i=0; i<input; i++)
		{
			System.out.print(randArr[i]+" ");
			if((i+1)%5 == 0)
			{
				System.out.println();
			}
		}
		
	}

}
