package net.k20191211Absent;

public class AccountTest {

	public static void main(String[] args) {
		Account ac=new Account();
		UserOut user1=new UserOut(ac,"����");
		UserIn user2=new UserIn(ac,"�Ƴ�");
		user1.start();
		user2.start();
		
	}

}
