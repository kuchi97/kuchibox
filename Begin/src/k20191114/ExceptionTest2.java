package k20191114;

public class ExceptionTest2 {

	public static void main(String[] args) {
		
		try {
			for(int i=0;i<=5; i++)
			{
				int a=50/(i-3);
				System.out.println("a: "+a);
			}
		} catch(ArithmeticException e) {
			System.out.println("나도 순정이있다 0으로 계속 나누면 그때부터 나는..");
		}
		System.out.println("End~~");

	}

}
