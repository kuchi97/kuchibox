package my.job;

//±¸Á÷ÀÚ Å¬·¡½º
public class Person {
	
	//¸â¹öº¯¼ö
	private String name;
	private int age;
	private int gender;
	private String tel;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public char getGender() {
		return (char)gender;
	}

	public void setGender(int gender) {
		this.gender = gender;
	}

	public String getTel() {
		return tel;
	}

	public void setTel(String tel) {
		this.tel = tel;
	}

	public String showInfo()
	{
		String str="--- "+name+" ÇÁ·ÎÇÊ\n";
		str+="³ª ÀÌ: "+age+"\n";
		str+="¼º º°: "+(char)gender+"\n";
		str+="¿¬¶ôÃ³: "+tel+"\n";
		
		return str;		
	}
	
	public void wantJob(String job, int pay)
	{
		System.out.println("--- "+name+"´Ô---");
		System.out.println("Èñ¸Á Á÷¾÷: "+job);
		System.out.println("Èñ¸Á ¿¬ºÀ: "+pay);
	}
	
	
}
