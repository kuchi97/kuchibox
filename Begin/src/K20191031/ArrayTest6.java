package K20191031;

public class ArrayTest6 {
	public static void main(String[] args)
	{
		
		
		int []x= {10, 20, 30};
		
		for (int i = 0; i < x.length; i++) 
		{
			System.out.println(x[i]);
		}
		
/*		
 		--Ȯ�� for ����--
 		
		for(���� ����: �ڷᱸ��) {
			���๮;
		}
*/
		
		System.out.println("--------------");
		
		for(int a: x)				//int a�� x�迭�� ���� ���������� ����϶�
		{
			System.out.println(a);
			
		}
		
		String[] str= {"Hello","Java","Hi","css"};
		
		//Ȯ�� for������ �̿��ؼ� str�� ����� �� ���
		
		for(String s: str)			//string s �����Ͽ� str ��Ұ��� ����
		{
			System.out.println(s.toUpperCase());	//�ϳ��� ���, toUpperCase �빮�ڷ� ���
		}
		
//		int tmp[][]= {
//				{1,2,3,4,5},
//				{11,22,33,44,55},
//				{12,23,34,45,56},
//				{13,24,35,46,57}
//			};
//		
//		for(int []a:tmp)
//		{
//			for(int []b:tmp[])
//			{
//				System.out.print(tmp[a][b]);
//			}
//			System.out.println();
//		}
//		
		
		
		// 2���� �迭�� Ȯ�� for������ ����غ���
		
		double [][]b= {
				{'A','B'},
				{5,6,7},
				{20.1,31.5}
		};
		
		for(double []i: b)		//double i[]�� double b[]�� �� ���� ����
		{
			for(double j: i)		//double j�� double i[]�� �� ���� ����
			{
				System.out.print(j);	//�����Ѱ��� ���
			}
			System.out.println();
		}

		
		
		
	}

}
