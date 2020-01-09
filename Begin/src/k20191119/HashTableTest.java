package k20191119;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

/*
Hashtable
	- Map 계열
	- key와 value를 매핑하여 저장한다
	- 데이터가 75%차면 자동으로 저장영역을 확대한다
	- key값은 중복 불가 (primary key와 비슷)
	- 순서를 보장하지 않는다(ArrayList와 비슷하고 Vector와 다르다)
	- 데이터 저장: Object put(Object key, Object value)
	- 데이터 꺼내가: Object get(Object key)

*/

public class HashTableTest {

	public static void main(String[] args) {
		
		//1.4버전 (라떼는말이야)
		Hashtable ht= new Hashtable();
		ht.put("하나", new Integer(1));
		ht.put("둘", 2);
		ht.put("빨강", "Red");
		ht.put("파랑", java.awt.Color.blue);
		
		//검색이 용이함: key로 검색하면 value가 따라나옴
		Object val= ht.get("둘");
		System.out.println(val);
		//String으로 받아볼까
		String val2= (String)ht.get("빨강");	//String 형변환 필요
		System.out.println(val2.toUpperCase());
		
		//5.0이후 generic 사용
		Hashtable<String, Integer> ht2= new Hashtable();
			//generic에 key값의 유형과 value값의 유형을 넣어준다
		ht2.put("생년", 2000);
		ht2.put("나이", 19);
		ht2.put("용돈", 5000);
		
		Integer age= ht2.get("나이");
		System.out.println("age: "+age);
		System.out.println("size: "+ht2.size());
		
		System.out.println("\n*********************\n");
		
		// Enumeration<K> keys()		: key값을 Enumeration형태로 반환
		// Enumeration<V> elements()	: value값을 Enumeration형태로 반환
		
		//ht2에 저장된 키값을 한꺼번에 출력
		Enumeration<String> en= ht2.keys();
		
		for(; en.hasMoreElements(); )
		{
			String keyStr= en.nextElement();
			System.out.print("key: "+keyStr+", ");
			//key 추출하면 value도 같이 추출해낼수 있다 get()
			Integer val3=ht2.get(keyStr);
			System.out.println(val3);
		}
		
		//Collection<V> values()	: value값들을 Collection 형태로 반환
		Collection<Integer> col= ht2.values();
		for(Integer val4: col)
		{
			System.out.println(val4);
		}
		
		
	}
}
