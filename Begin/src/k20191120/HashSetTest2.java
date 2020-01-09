package k20191120;

/*
- HashSet은 객체를 저장하기 전에 객체의 hashCode()를 호출하여
해시코드를 얻는다.

- 그리고 이미 저장되어있는 객체들의 해시코드와 비교한다.
만약 동일한 해시코드가 있다면, 다시 equals() 메소드로 두객체를 비교하여
true가 나오면 동일객체로 판단하고 중복저장을 하지않는다.


 */

import java.util.HashSet;
import java.util.Iterator;

class Member			//domain 객체: 데이터값을 가지고있는 객체: member는 회원의 정보를 가지고있는 객체
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
		
		//member객체 3개 생성
		Member m1= new Member("김길동", 52);
		Member m2= new Member("두올리", 32);
		Member m3= new Member("도운어", 42);
		
		
		//hashset 생성해서 member 저장하기
		HashSet<Member> hs= new HashSet<Member>();
		
		hs.add(m1);
		hs.add(m2);
		hs.add(m3);
		Member m4= new Member("김길동", 52);
		hs.add(m4);
		
		System.out.println(m1.hashCode()+ " = " +m4.hashCode());
		
		System.out.println(hs.size()+"명 등록됨");
						
		//반복문 이용해 멤버정보 출력
		
		Iterator<Member> it= hs.iterator();
		
		for(; it.hasNext(); )
		{
			Member mem= it.next();
			mem.info();
			
		}
		
		System.out.println();
		
		// 논리커서가 이미 지나가버려서 while문 출력 안됨
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
