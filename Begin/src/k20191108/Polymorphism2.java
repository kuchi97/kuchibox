package k20191108;

//�θ�Ŭ����= super class, base class
class Super
{
	int a=10;
	int b=20;
	
	void func()
	{
		System.out.println("***********");
		
		
	}
}//--EO.Super

//�ڽ�Ŭ����= sub class, derived class
class Sub extends Super
{
	int b=30;
	int c=40;
	
	@Override
	void func()
	{
		System.out.println("EEEEEEEEEE");
	}
}//EO.Sub


public class Polymorphism2 {

	public static void main(String[] args) {
		
		System.out.println(("1----------------"));
		Super sp= new Super();
		System.out.println("sp.a: "+sp.a);	//10
		System.out.println("sp.b: "+sp.b);	//20
		sp.func();							//*****
		
		System.out.println("\n=============\n");
		
		System.out.println(("2----------------"));
		Sub sb= new Sub();
		System.out.println("sb.a: "+sb.a);	//10
		System.out.println("sb.b: "+sb.b);	//30
		System.out.println("sb.c: "+sb.c);	//40
		sb.func();							//EEEEE
		
		System.out.println("\n=============\n");

		System.out.println(("3----------------"));
		Super ss= new Sub();
		System.out.println("ss.a: "+ss.a);	//10
		System.out.println("ss.b: "+ss.b);	//20
		//System.out.println("ss.c: "+ss.c);
		ss.func();							//EEEEE
		
		System.out.println("\n=============\n");
		
		System.out.println(("4----------------"));
		//��. sp sb ss�� ������ �迭�� �����ϰ� �� ��ü�� ����
		//�ݺ��� ���鼭 funcȣ��
		
		Super family[]= new Super[3];
		family[0]= sp;
		family[1]= sb;
		family[2]= ss;
		
		for(Super s:family)
		{
			s.func();
		}

	}

}//
