package k20191104;

public class MyDate {
	
	static int year;			//class var.
	int month, date;		//instance var.
	
	//static initializer
	//���κ��� ���� �����
	static
	{
		year= 2019;
		System.out.println("static block");
	}
	
	//constructor
	public MyDate()				//�����ڸ��� Ŭ������� ���ƾ�
	{
		System.out.println("constructor");
		month= 11;
		date= 4;
	}
	
	public static void main(String[] args)
	{
		System.out.println("main();");
		
		//MyDate �޸𸮿� �ö�
		MyDate md= new MyDate();
		
		System.out.println(MyDate.year);
		System.out.println(md.month);		//md�� �ʱ�ȭ�ؼ� md�� �̿��� ����
		System.out.println(md.date);
		
		//md2= md ����
		MyDate md2= new MyDate();
		md2.month= 12;
		md2.date= 22;
		
	}

}
