package k20191120;

/*
- HashSet�� ��ü�� �����ϱ� ���� ��ü�� hashCode()�� ȣ���Ͽ�
�ؽ��ڵ带 ��´�.

- �׸��� �̹� ����Ǿ��ִ� ��ü���� �ؽ��ڵ�� ���Ѵ�.
���� ������ �ؽ��ڵ尡 �ִٸ�, �ٽ� equals() �޼ҵ�� �ΰ�ü�� ���Ͽ�
true�� ������ ���ϰ�ü�� �Ǵ��ϰ� �ߺ������� �����ʴ´�.


 */

import java.util.HashSet;
import java.util.Iterator;

class Member			//domain ��ü: �����Ͱ��� �������ִ� ��ü: member�� ȸ���� ������ �������ִ� ��ü
{
	String name;
	int age;
	
	public Member(String name, int age)
	{
		this.name=name;
		this.age=age;
	}
	
	public void info()
	{
		System.out.println("Name: "+name);
		System.out.println("Age:  "+age);
	}
	
	@Override
	public int hashCode()
	{
		return this.name.hashCode()+age;
	}
	public boolean equals(Object obj)
	{
		if(obj instanceof Member)
		{
			Member user= (Member)obj;
			boolean b= (user.name.contentEquals(this.name) && user.age==this.age);
			return b;
		}
		else
		{
			return false;
		}
	}
	
}


public class HashSetTest2 {

	public static void main(String[] args) {
		
		//member��ü 3�� ����
		Member m1= new Member("��浿", 52);
		Member m2= new Member("�οø�", 32);
		Member m3= new Member("�����", 42);
		
		
		//hashset �����ؼ� member �����ϱ�
		HashSet<Member> hs= new HashSet<Member>();
		
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		Member m4= new Member("��浿", 52);
		hs.add(m4);
		
		System.out.println(m1.hashCode()+ " = " +m4.hashCode());
		
		System.out.println(hs.size()+"�� ��ϵ�");
						
		//�ݺ��� �̿��� ������� ���
		
		Iterator<Member> it= hs.iterator();
		
		for(; it.hasNext(); )
		{
			Member mem= it.next();
			mem.info();
			
		}
		
		System.out.println();
		
		// ��Ŀ���� �̹� ������������ while�� ��� �ȵ�
		while(it.hasNext())
		{
			Member mem=it.next();
			mem.info();
		}
		
		System.out.println();
		
		for(Member m:hs)
		{
			m.info();
		}
		
	}
}
