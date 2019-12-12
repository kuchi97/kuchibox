package exerciseChap4No2;

public class Grade {

	private int math;
	private int science;
	private int english;
	
	public int getMath() {
		return math;
	}
	public void setMath(int math) {
		this.math = math;
	}
	public int getScience() {
		return science;
	}
	public void setScience(int science) {
		this.science = science;
	}
	public int getEnglish() {
		return english;
	}
	public void setEnglish(int english) {
		this.english = english;
	}
	
	public void showGrade()
	{
		System.out.println("=====S C O R E=====");
		System.out.println("math: "+math);
		System.out.println("science: "+science);
		System.out.println("english: "+english);
		System.out.println("===================");
	}
	
	public double letsAvg(int a, int b, int c)
	{
		double avg;
		avg=(a+b+c)/3;
		
		return avg;
	}
	
}
