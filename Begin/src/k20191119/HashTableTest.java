package k20191119;

import java.util.Collection;
import java.util.Enumeration;
import java.util.Hashtable;

/*
Hashtable
	- Map �迭
	- key�� value�� �����Ͽ� �����Ѵ�
	- �����Ͱ� 75%���� �ڵ����� ���念���� Ȯ���Ѵ�
	- key���� �ߺ� �Ұ� (primary key�� ���)
	- ������ �������� �ʴ´�(ArrayList�� ����ϰ� Vector�� �ٸ���)
	- ������ ����: Object put(Object key, Object value)
	- ������ ������: Object get(Object key)

*/

public class HashTableTest {

	public static void main(String[] args) {
		
		//1.4���� (�󶼴¸��̾�)
		Hashtable ht= new Hashtable();
		ht.put("�ϳ�", new Integer(1));
		ht.put("��", 2);
		ht.put("����", "Red");
		ht.put("�Ķ�", java.awt.Color.blue);
		
		//�˻��� ������: key�� �˻��ϸ� value�� ���󳪿�
		Object val= ht.get("��");
		System.out.println(val);
		//String���� �޾ƺ���
		String val2= (String)ht.get("����");	//String ����ȯ �ʿ�
		System.out.println(val2.toUpperCase());
		
		//5.0���� generic ���
		Hashtable<String, Integer> ht2= new Hashtable();
			//generic�� key���� ������ value���� ������ �־��ش�
		ht2.put("����", 2000);
		ht2.put("����", 19);
		ht2.put("�뵷", 5000);
		
		Integer age= ht2.get("����");
		System.out.println("age: "+age);
		System.out.println("size: "+ht2.size());
		
		System.out.println("\n*********************\n");
		
		// Enumeration<K> keys()		: key���� Enumeration���·� ��ȯ
		// Enumeration<V> elements()	: value���� Enumeration���·� ��ȯ
		
		//ht2�� ����� Ű���� �Ѳ����� ���
		Enumeration<String> en= ht2.keys();
		
		for(; en.hasMoreElements(); )
		{
			String keyStr= en.nextElement();
			System.out.print("key: "+keyStr+", ");
			//key �����ϸ� value�� ���� �����س��� �ִ� get()
			Integer val3=ht2.get(keyStr);
			System.out.println(val3);
		}
		
		//Collection<V> values()	: value������ Collection ���·� ��ȯ
		Collection<Integer> col= ht2.values();
		for(Integer val4: col)
		{
			System.out.println(val4);
		}
		
		
	}
}
