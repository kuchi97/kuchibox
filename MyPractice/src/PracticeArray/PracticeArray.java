package PracticeArray;

public class PracticeArray {
	public static int[] makeArray()
	{
		int temp[]= new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]= i;	//�迭�� ���Ҹ� 0 1 2 3 �ʱ�ȭ
		}
		return temp;
	}

	public static void main(String[] args) {
		int intArray[];		//�迭���۷��� ��������
		intArray=makeArray();	//makeArray �޼ҵ�κ��� �迭 ���޹���
		
		for (int i = 0; i < intArray.length; i++) {
			System.out.println(intArray[i]+" ");
		}
		
		int arr[][]= new int[5][5];
		
		for(int i=0; i<arr.length; i++)
		{
			for(int j=0; j<arr[i].length; j++)
			{
				arr[i][j]=(int)(Math.random()*10+1);
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
