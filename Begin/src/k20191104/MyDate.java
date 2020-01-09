package k20191104;

public class MyDate {
	
	static int year;			//class var.
	int month, date;		//instance var.
	
	//static initializer
	//메인보다 먼저 수행됨
	static
	{
		year= 2019;
		System.out.println("static block");
	}
	
	//constructor
	public MyDate()				//생성자명은 클래스명과 같아야
	{
		System.out.println("constructor");
		month= 11;
		date= 4;
	}
	
	public static void main(String[] args)
	{
		System.out.println("main();");
		
		//MyDate 메모리에 올라감
		MyDate md= new MyDate();
		
		System.out.println(MyDate.year);
		System.out.println(md.month);		//md로 초기화해서 md를 이용해 접근
		System.out.println(md.date);
		
		//md2= md 복사
		MyDate md2= new MyDate();
		md2.month= 12;
		md2.date= 22;
		
	}

}
