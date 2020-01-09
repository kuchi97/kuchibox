package k20191119;

import java.util.ArrayList;
import java.util.Iterator;

/*
ArrayList
	- java.util.List�迭
	- Vector�� ����� ����
	- ��, Vector�� ����ȭ(synchronized)�� ������ �ݸ�,
		ArrayList�� ����ȭ�Ǿ����� ����, ������ ���� ����Ѵ�
	- �Է¼����� ����ϰ�,
	- ������ �ߺ��� ����Ѵ�

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
		
		//Iterator �̿��Ͽ� �ѹ��� ����ϱ�
		Iterator<String> it= arrList.iterator();
		
		while(it.hasNext())
		{
			String arrStr=it.next();
			System.out.println(arrStr);
		}
		System.out.println(arrList.size()+"�� �����");
		
		//toArray(T[] a) �̿��ؼ� �迭�� �����ϱ�
		String strArr[]= new String[arrList.size()];
		
		arrList.toArray(strArr);
			//public<t> T[] toArray(T[] a)	: �Ű����� �迭Ÿ�� a, ��ȯ �迭
		System.out.println(strArr[1]);
		
		for(String s: strArr)
		{
			System.out.println(s.toLowerCase());
		}
		
		
	}
}
