package k20191119;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList
	- java.util.List계열
	- Vector와 기능이 동일
	- 단, Vector는 동기화(synchronized)가 구현된 반면,
		ArrayList는 동기화되어있지 않음, 웹에서 많이 사용한다
	- 입력순서를 기억하고,
	- 데이터 중복을 허용한다

*/
public class ArrayListTest {

	public static void main(String[] args) {
		
		ArrayList<String> arrList= new ArrayList<String>();
		arrList.add("java");
		arrList.add("HTML");
		arrList.add("SQL");
		
		String str= arrList.get(0);
		System.out.println(str);
		System.out.println(arrList);
		
		//Iterator 이용하여 한번에 출력하기
		Iterator<String> it= arrList.iterator();
		
		while(it.hasNext())
		{
			String arrStr=it.next();
			System.out.println(arrStr);
		}
		System.out.println(arrList.size()+"개 저장됨");
		
		//toArray(T[] a) 이용해서 배열로 복사하기
		String strArr[]= new String[arrList.size()];
		
		arrList.toArray(strArr);
			//public<t> T[] toArray(T[] a)	: 매개변수 배열타입 a, 반환 배열
		System.out.println(strArr[1]);
		
		for(String s: strArr)
		{
			System.out.println(s.toLowerCase());
		}
		
		
	}
}
