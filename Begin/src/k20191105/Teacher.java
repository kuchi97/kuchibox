package k20191105;
//교번 이름 과목
public class Teacher {
	
	private String name;
	private String subject;
	private int no;
	
	public void setName(String name)
	{
		this.name= name;
	}
	public String getName()
	{
		return name;
	}
	
	public void setSubject(String subject)
	{
		this.subject= subject;
	}
	public String getSubject()
	{
		return subject;
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
		System.out.println("subject: "+subject);
		System.out.println("number: "+no);
	}

}
