package net.k20191211Absent;

public class AccountTest {

	public static void main(String[] args) {
		Account ac=new Account();
		UserOut user1=new UserOut(ac,"남편");
		UserIn user2=new UserIn(ac,"아내");
		user1.start();
		user2.start();
		
	}

}
