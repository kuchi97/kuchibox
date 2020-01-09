package k20191118;

import java.util.Enumeration;
import java.util.Vector;
import java.util.Iterator;

public class VectorTest3 {

	public static void main(String[] args) {
		
		Vector<Student> v= new Vector<Student>();
		v.add(new Student(1,"홍길동","1반"));
		v.add(new Student(2,"임꺽정","1반"));
		v.add(new Student(3,"오달수","1반"));
		
//public Enumeration elements()
/*
Enumeration이나 Iterator 들은
	객체들을 집합체로 관리하게 해주는 인터페이스
이들 인터페이스에는 각각의 객체들을 한순간에
	하나씩 처리할 수 있는 메소드를 제공한다
	-	논리적인 커서가 존재하여 커서를 이동하면서 데이터를 꺼내오는것

*/
		
		
//최근에는 iterator를 자주 쓴다고
		Enumeration<Student> en= v.elements();
		
		while(en.hasMoreElements())			// boolean hasMoreElements()
			//이후에 요소들을 더 가지고있어? T/F
		{
			Student s= en.nextElement();	// E nextElements();	E는 generic의 타입을 말함
				//벡터의 커서를 한칸 옆으로 이동
			System.out.println(s.getName()+", "+s.getCname());
		}
		
		
		//public Iterator<E> iterator()
		//iterator로 v에 저장된 요소를 한꺼번에 꺼내기
		Iterator<Student> it= v.iterator();
		
		for(int i=0; i<v.size(); i++)
		{
			if(it.hasNext())
			{
				Student s= it.next();
				System.out.println(s.getName()+", "+s.getCname());
			}
		}
		//선생님답
		for(Iterator<Student> itr=v.iterator();it.hasNext();)
		{
			Student st= itr.next();
			System.out.println(st.getNo()+","+st.getName());
		}
		// 또는,
		//Iterator가 위에서 선언되었으므로
		for( ; it.hasNext(); )
		{
			Student st= it.next();
			System.out.println(st.getNo()+","+st.getName());
		}
		
		System.out.println("\n*********************\n");
		
		//void copyInto(Object[])
		//벡터에 저장된 객체들을 배열로 복사한다	: 벡터에서 배열로 옮겨올때
		
		//v에 저장된 객체를 Student[]로 옮기자
		Student std[]= new Student[3];			//Std[]= new Student[v.size()]
		
		v.copyInto(std);						//벡터요소를 배열에 복사!
		
		for(Student s: std)
		{
			System.out.println(s.getName());
		}
		
		
	}
}
