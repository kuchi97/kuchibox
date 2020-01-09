package k20191105;

public class Student {
	
	private String name;
	private String cName;
	private int no;
	
	public void setName(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setCname(String className)
	{
		this.cName= className;
	}
	public String getCname()
	{
		return cName;
	}
	
	public void setNo(int no)
	{
		this.no= no;
	}
	public int getNo()
	{
		return no;
	}
	
	public void showInfo()
	{
		System.out.println("name: "+name);
		System.out.println("class: "+cName);
		System.out.println("number: "+no);
	}

}
