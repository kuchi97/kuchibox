package K20191031;

public class ArrayTest5 {

	public static void main(String[] args) {
		
//		//2차원배열을 이용하여 아래와같은 형태의 값을 저장하기
//		//for루프 이용하여 저장
//		//for루프 이용하여 출력
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
//		//배열 arr에 담간 모든값을 더하라
//		int[] arr= {10,20,30,40,50};
//		int sum=0;
//		
//		for (int i = 0; i < arr.length; i++) {
//			sum+=arr[i];
//		}
//		
//		System.out.println("sum: "+sum);
		
//----------------------------------------------------------------------
		
		
//		//2차원배열 arr에 담긴 모든값의 총합과 평균을 구하는 프로그램
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
		
		//거스름돈을 몇개의 동전으로 지불할수 있는지 계산하기
		//가능한한 적은 수의 동전으로 거슬러줘야한다
		
		int[] coinUnit= {500, 100, 50, 10};
		
		int money= 2680;
		System.out.println("money: "+money);
		
		for (int i = 0; i < coinUnit.length; i++) 
		{
			System.out.println(coinUnit[i]+"원: "+money/coinUnit[i]);
			
			money%=coinUnit[i];	
		}
		// 출력값 따로, 계산한 결과값 따로 생각해보기
	
		
		
		
	}

}
