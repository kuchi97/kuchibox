package K20191031;

public class ArrayTest5 {

	public static void main(String[] args) {
		
//		//2�����迭�� �̿��Ͽ� �Ʒ��Ͱ��� ������ ���� �����ϱ�
//		//for���� �̿��Ͽ� ����
//		//for���� �̿��Ͽ� ���
//		/*
//		 * 10000
//		 * 01000
//		 * 00100
//		 * 00010
//		 * 00001
//		 */
//		int arr[][]= new int[5][5];
//		
//		for (int i = 0; i < arr.length; i++) {
//			for (int j = 0; j < arr[i].length; j++) {
//				if(i==j)
//				{
//					arr[i][j]=1;
//				}
//				else
//					arr[i][j]=0;
//			}
//		}
//		
//		for(int i=0; i<arr.length; i++)
//		{
//			for(int j=0; j<arr[i].length; j++)
//			{
//				if(i==j)
//				{
//					System.out.print(arr[i][j]+" ");
//				}
//				else
//					System.out.print(arr[i][j]+" ");
//			}
//			System.out.println();
//		}

//---------------------------------------------------------------------
		
//		
//		//�迭 arr�� �㰣 ��簪�� ���϶�
//		int[] arr= {10,20,30,40,50};
//		int sum=0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			sum+=arr[i];
//		}
//		
//		System.out.println("sum: "+sum);
		
//----------------------------------------------------------------------
		
		
//		//2�����迭 arr�� ��� ��簪�� ���հ� ����� ���ϴ� ���α׷�
//		int[][] arr= {
//				{5,5,5,5,5},
//				{10,10,10,10,10},
//				{20,20,20,20,20},
//				{30,30,30,30,30}
//		};
//		
//		int total=0;
//		float average=0;
//		
//		int i,j;
//		for (i = 0; i < arr.length; i++) 
//		{
//			for (j = 0; j < arr[i].length; j++) 
//			{
//				total+=arr[i][j];
//			}
//		}
//
//		average=total/20.0f;
//		
//		System.out.println("total: "+total);
//		System.out.println("average: "+average);
		
		
//-------------------------------------------------------------------------
		
		//�Ž������� ��� �������� �����Ҽ� �ִ��� ����ϱ�
		//�������� ���� ���� �������� �Ž�������Ѵ�
		
		int[] coinUnit= {500, 100, 50, 10};
		
		int money= 2680;
		System.out.println("money: "+money);
		
		for (int i = 0; i < coinUnit.length; i++) 
		{
			System.out.println(coinUnit[i]+"��: "+money/coinUnit[i]);
			
			money%=coinUnit[i];	
		}
		// ��°� ����, ����� ����� ���� �����غ���
	
		
		
		
	}

}
