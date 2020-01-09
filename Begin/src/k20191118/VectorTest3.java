package k20191118;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

public class VectorTest3 {

	public static void main(String[] args) {
		
		Vector<Student> v= new Vector<Student>();
		v.add(new Student(1,"ȫ�浿","1��"));
		v.add(new Student(2,"�Ӳ���","1��"));
		v.add(new Student(3,"���޼�","1��"));
		
//public Enumeration elements()
/*
Enumeration�̳� Iterator ����
	��ü���� ����ü�� �����ϰ� ���ִ� �������̽�
�̵� �������̽����� ������ ��ü���� �Ѽ�����
	�ϳ��� ó���� �� �ִ� �޼ҵ带 �����Ѵ�
	-	������ Ŀ���� �����Ͽ� Ŀ���� �̵��ϸ鼭 �����͸� �������°�

*/
		
		
//�ֱٿ��� iterator�� ���� ���ٰ�
		Enumeration<Student> en= v.elements();
		
		while(en.hasMoreElements())			// boolean hasMoreElements()
			//���Ŀ� ��ҵ��� �� �������־�? T/F
		{
			Student s= en.nextElement();	// E nextElements();	E�� generic�� Ÿ���� ����
				//������ Ŀ���� ��ĭ ������ �̵�
			System.out.println(s.getName()+", "+s.getCname());
		}
		
		
		//public Iterator<E> iterator()
		//iterator�� v�� ����� ��Ҹ� �Ѳ����� ������
		Iterator<Student> it= v.iterator();
		
		for(int i=0; i<v.size(); i++)
		{
			if(it.hasNext())
			{
				Student s= it.next();
				System.out.println(s.getName()+", "+s.getCname());
			}
		}
		//�����Դ�
		for(Iterator<Student> itr=v.iterator();it.hasNext();)
		{
			Student st= itr.next();
			System.out.println(st.getNo()+","+st.getName());
		}
		// �Ǵ�,
		//Iterator�� ������ ����Ǿ����Ƿ�
		for( ; it.hasNext(); )
		{
			Student st= it.next();
			System.out.println(st.getNo()+","+st.getName());
		}
		
		System.out.println("\n*********************\n");
		
		//void copyInto(Object[])
		//���Ϳ� ����� ��ü���� �迭�� �����Ѵ�	: ���Ϳ��� �迭�� �Űܿö�
		
		//v�� ����� ��ü�� Student[]�� �ű���
		Student std[]= new Student[3];			//Std[]= new Student[v.size()]
		
		v.copyInto(std);						//���Ϳ�Ҹ� �迭�� ����!
		
		for(Student s: std)
		{
			System.out.println(s.getName());
		}
		
		
	}
}
