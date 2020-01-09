package k20191120;

import java.util.HashSet;
import java.util.Iterator;


/*
Set �迭
	- ������� x
	- ���̳��ߺ� ��� x
	- HashSet ��..
*/
	
	
public class HashSetTest {

	public static void main(String[] args) {

		HashSet<String> set= new HashSet<>();
		
		set.add("Apple");
		set.add("Mango");
		set.add("Orange");
		
		System.out.println(set.size());
		
		set.add("Apple");
		set.add("Banana");
		System.out.println(">>"+set.size());
		
		for(String str:set)
		{
			System.out.println(str);
		}
		
		Iterator<String> it= set.iterator();
		
		while(it.hasNext())
		{
			String str= it.next();
			System.out.println(str);
		}
		
		
		
		
	}
}
