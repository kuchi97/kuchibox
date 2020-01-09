package my.job;

public class UnitTest {

	public static void main(String[] args) {

		Person p1= new Person();
		p1.setName("¿”≤©¡§");
		p1.setAge(24);
		p1.setGender(1);
		p1.setTel("292939992");
		
		System.out.println(p1.showInfo());
		

	}

}