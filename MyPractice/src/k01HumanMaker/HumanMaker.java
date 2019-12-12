package k01HumanMaker;
//사람 신상이 출력되는 메소드
//배열에 있는 값을 랜덤하게 출력
//객체 만들때마다 이름이나 나이가 달라지도록

import java.util.Scanner;


public class HumanMaker {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		Human hm= new Human();
		
		int input;
		
		System.out.println("******** HUMAN MAKER *******");
		System.out.println("*==== 인간을 창조하여 =====*");
		System.out.println("*== 신세계의 신이 되어라 ==*");
		System.out.println("****************************");
		while(true)
		{
			System.out.print("1.만들기 2.종료: ");
			input= sc.nextInt();
			if(input==1)
			{
				hm.makeHuman();
				System.out.println("\n===== 생성 완료!! =====\n");
			}
			else if(input==2)
				return;
			else
				continue;
		}
		
	}

}
