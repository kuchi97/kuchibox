package exChap6No7;

import java.util.StringTokenizer;
import java.util.Scanner;


public class WordDivider {
	
	
	Scanner sc= new Scanner(System.in);
	int divider(String input)
	{
		System.out.print("�����Է�: ");
		input= sc.nextLine();
		
		StringTokenizer st= new StringTokenizer(input," ");
		return st.countTokens();	
	}
	void splitDivider(String input)
	{
		System.out.print("�����Է�: ");
		input= sc.nextLine();
		
		String resStr[]= input.split(" ");
		
		System.out.println((resStr.length)+"���� ����");
		
	}
	

	public static void main(String[] args) {
		
		WordDivider wd= new WordDivider();
		String input=null;
		int cnt= wd.divider(input);
		
		System.out.println(cnt+"���� ����");
		
		wd.splitDivider(input);
	}
	
}
