package K20191031;
import java.util.Date;

public class ArrayTest22 {

	public static void main(String[] args) {
		
		//������ �迭 ����ϱ� (String, Date, Class........)
		
		String str[]= new String[3];
		str[0]= "Hello";
		str[1]= new String("Java");
		str[2]= "bYe";
		
		for (int i = 0; i < str.length; i++) {
			System.out.println();
		}
		
		//date���� ������ �迭����� ũ��2
		//���迭�� date��ü ����
		//for �̿� ���
		
		
		Date dte= new Date();
		dte.toString();
		

	}
}