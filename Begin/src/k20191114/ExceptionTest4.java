package k20191114;

/*
try {} 하나에 catch{} 여러개가 올수있다
	단, 이때에는 catch 순서에 주의
	- 부모와 자식의 상속관계가 있는 예외일 경우
	- 자식 예외를 먼저 catch 하고 부모예외를 나중에 catch 해야한다

try~finally {} : 반드시 한번은 수행하는 블럭
	return이 있어도 반드시 수행하고 제어권을 넘긴다
*/
	

import javax.swing.*;

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		String str;
		int num, a;
		try {
			str = JOptionPane.showInputDialog("정수입력");
			String b= str.substring(0,1);	//523 => 5
			System.out.println("b: "+b);
			num = Integer.parseInt(b);
//			사용자가 무엇을 입력하느냐에 따라 NumberFormatException이나
//			ArithMeticException이 나타날수있음
			a= 50/num;
			System.out.println("a: "+a);
			
		} catch (NumberFormatException e) {
			System.out.println("숫자를 입력해");
		} catch (ArithmeticException e) {
			System.out.println("0으로 나누지마");
			//return;
			System.exit(-1);
			//시스템종료 코드가 오면 바로 종료됨
				//finally는 수행하지 않음
		} catch (Exception e) {
			System.out.println("그냥에러");
		} finally {
			System.out.println("반드시수행되어야하는코드");
		}
		System.out.println("E N D ~ ~");

	}

}
