package myLastWordGame;

import java.util.Scanner;
public class Player {
	Scanner sc= new Scanner(System.in);
	public String player()
	{
		System.out.println("이름을 입력");
		String name= sc.next();
		return name;
	}

}
