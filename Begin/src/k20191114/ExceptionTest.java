package k20191114;

//���ܸ� ����ó���ϴ� ��� try-catch
public class ExceptionTest {

	public static void main(String[] args) {
		String fruits[] = { "Lemon", "Orange", "Apple", "Mango" };

		try {
			for (int i = 0; i < 5; i++) {
				System.out.println(fruits[i]);
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("�迭�� �ε��������� �ʰ�");
		}
		System.out.println("##�ݵ�� ����Ǿ���ϴ� �ڵ�##");

	}
}
