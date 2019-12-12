package exchap4no8;

public class Phone {
	
	String name;
	String tel;
	
	public Phone()
	{
		this("이름없음","N/A");
	}
	public Phone(String name, String tel)
	{
		this.name=name;
		this.tel=tel;
	}
	
	public void showInfo()
	{
		System.out.println("=== 인물정보 ===");
		System.out.println("이름: "+name);
		System.out.println("번호: "+tel);
		System.out.println();
	}

}
