package PracticeArray;

public class PracticeArray {
	public static int[] makeArray()
	{
		int temp[]= new int[4];
		
		for (int i = 0; i < temp.length; i++) {
			temp[i]= i;	//배열의 원소를 0 1 2 3 초기화
		}
		return temp;
	}

	public static void main(String[] args) {
		int intArray[];		//배열레퍼런스 변수선언
		intArray=makeArray();	//makeArray 메소드로부터 배열 전달받음
		
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
