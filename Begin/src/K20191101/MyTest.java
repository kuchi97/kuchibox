package K20191101;

public class MyTest {

	public static void main(String[] args) {
		// Integer class �� class var.
		/*
			1.
			static int MAX_VALUE
			static int MIN_VALUE
			
				�������� ����ϼ���
			
			2. method
			static String toBinaryString(int i)		10to2
			static String toHexString(int i)		10to16
			static String toOctalString(int i)		10to8
			
				ȣ���ؼ� �������ƺ�����
		*/
		System.out.println("1.---------------");
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		
		System.out.println("\n2.---------------");
		
		int i=283;
		System.out.println("toBiStr: "+Integer.toBinaryString(i));
		System.out.println("toHxStr: "+Integer.toHexString(i));
		System.out.println("toOcStr: "+Integer.toOctalString(i));

	}

}
