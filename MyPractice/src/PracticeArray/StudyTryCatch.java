package PracticeArray;

public class StudyTryCatch {

	public static void main(String[] args)
	{
		int intArray[]= new int[5];
		
		try
		{
			intArray[3]= 2;		//���ܾƴ�
			intArray[6]= 5;		//���ܹ߻�!
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("�迭�ǹ������ʰ��Ͽ��Է���");
		}
	}
	//�����޽����� catch�� �޽����� ��µ�
}
