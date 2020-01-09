package k20191114;

//예외를 직접처리하는 방법 try-catch
public class ExceptionTest {

	public static void main(String[] args) {
		String fruits[] = { "Lemon", "Orange", "Apple", "Mango" };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(fruits[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스범위를 초과");
		}
		System.out.println("##반드시 실행되어야하는 코드##");

	}
}
