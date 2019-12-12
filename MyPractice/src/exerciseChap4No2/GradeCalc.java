package exerciseChap4No2;

import java.util.Scanner;
public class GradeCalc {
	Scanner sc= new Scanner(System.in);
	
	
	public void input()
	{
		Grade gd= new Grade();
		
		System.out.print("input your score (math, science, english): ");
		int math= sc.nextInt();
		int science= sc.nextInt();
		int english= sc.nextInt();
		
		gd.setMath(math);
		gd.setScience(science);
		gd.setEnglish(english);
		
		gd.showGrade();
		System.out.println("average: "+gd.letsAvg(gd.getMath(), gd.getScience(), gd.getEnglish()));
	}
	

	public static void main(String[] args)
	{
		GradeCalc gc= new GradeCalc();
		
		gc.input();

	}

}
