package K20191101;

//feat. MyDemo(), YourDemo(), OurDemo();

public class Test {

	public static void main(String[] args) {
		//MyDemo의 객체를 생성하기
		//같은 패키지에 있으면 쓸수있어
		
		/* class유형의 변수 생성
			= (class var.name= new 생성자이름();)
		*/
		
		MyDemo md;						//md라는 객체를 생성, md는 stack에 저장
		md= new MyDemo();				//new 하면 MyDemo생성자가 heap에 저장되고
		MyDemo md2= new MyDemo();		//md는 MyDemo의 주소를 가리킴
		MyDemo md3= new MyDemo();
		MyDemo md4= md;
		
		System.out.println(md);			//같은 MyDemo를 생성했지만
		System.out.println(md2);		//각자 가리키는 주소값이 다 다름
		System.out.println(md3);		//새로 생성된거임 ㅇㅇ
		System.out.println(md4);
		
		System.out.println("==================\n");
				
		YourDemo yd= new YourDemo();	//YourDemo 객체 생성
		System.out.println(yd);
		
		YourDemo yd2= new YourDemo();
		
		yd2.str="같이왔어요";
		
		System.out.println("yd.str: "+yd.str);
		System.out.println("yd2.str: "+yd2.str);
		
		OurDemo od= new OurDemo();		//생성자 안만든 객체도 호출가능?
		System.out.println(od.z);
		System.out.println(od.bool);
		System.out.println(od.str);
		
	}

}