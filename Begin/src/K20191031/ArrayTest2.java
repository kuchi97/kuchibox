package K20191031;
import java.util.Date;

public class ArrayTest2 {

	public static void main(String[] args) {
		
		//참조형 배열 사용하기 (String, Date, Class........)
		
		String str[]= new String[3];
		str[0]= "Hello";
		str[1]= new String("Java");
		str[2]= "bYe";
		
		for (int i = 0; i < str.length; i++) {
			System.out.println(str[i]);
		}
		
		//date유형 저장할 배열만들기 크기2
		//각배열에 date객체 저장
		//for 이용 출력
		
		
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