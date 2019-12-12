package ExerciseChap3;

//정수값으로 돈을 입력받아
//입력한 액수가 현금으로 얼마나 출력되는지 알려주는 프로그램
//반드시 배열과 반복문으로 작성할것
//
//금액을 입력하시오>>65123
//50000원짜리: 1개
//10000원짜리: 1개
//1000원짜리 : 5개
//100원짜리 : 1개
//10원짜리: 2개
//1원짜리: 3
import java.util.Scanner;

public class ExCh3No6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int unit[]= {50000,10000,5000,1000,500,100,50,10,1};
		
		System.out.print("input gold: ");
		int input= sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			
			System.out.println(unit[i]+"원 짜리: "+input/unit[i]);
			input%=unit[i];
		}
	}
}
