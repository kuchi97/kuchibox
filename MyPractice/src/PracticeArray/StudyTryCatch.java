package PracticeArray;

public class StudyTryCatch {

	public static void main(String[] args)
	{
		int intArray[]= new int[5];
		
		try
		{
			intArray[3]= 2;		//예외아님
			intArray[6]= 5;		//예외발생!
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("배열의범위를초과하여입력함");
		}
	}
	//에러메시지에 catch의 메시지가 출력됨
}
