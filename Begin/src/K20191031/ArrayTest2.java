package K20191031;
import java.util.Date;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		//������ �迭 ����ϱ� (String, Date, Class........)
		
		String str[]= new String[3];
		str[0]= "Hello";
		str[1]= new String("Java");
		str[2]= "bYe";
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//date���� ������ �迭����� ũ��2
		//���迭�� date��ü ����
		//for �̿� ���
		
		
		Date darr[]= new Date[2];
		System.out.println(darr[0]);
		darr[0]= new Date();
		try{
			Thread.sleep(3000);
		}catch(Exception e) {
		}
		darr[1]= new Date();
		
		System.out.println(darr[0]);
		System.out.println(darr[1]);
		
		

	}
}