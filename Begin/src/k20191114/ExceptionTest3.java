package k20191114;

public class ExceptionTest3 {

	public static void main(String[] args) {

		for (int i = 0; i <= 5; i++) {
			try {
				int a = 50 / (i - 3);
				System.out.println("a: " + a);
			} catch (ArithmeticException e) {
				System.out.println("0���γ������������̾�");
			}
		}

		System.out.println("End~~");

	}

}
