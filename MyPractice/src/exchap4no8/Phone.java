package exchap4no8;

public class Phone {
	
	String name;
	String tel;
	
	public Phone()
	{
		this("�̸�����","N/A");
	}
	public Phone(String name, String tel)
	{
		this.name=name;
		this.tel=tel;
	}
	
	public void showInfo()
	{
		System.out.println("=== �ι����� ===");
		System.out.println("�̸�: "+name);
		System.out.println("��ȣ: "+tel);
		System.out.println();
	}

}
