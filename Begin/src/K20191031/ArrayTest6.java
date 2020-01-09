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
 		--확장 for 루프--
 		
		for(변수 선언문: 자료구조) {
			실행문;
		}
*/
		
		System.out.println("--------------");
		
		for(int a: x)				//int a에 x배열의 값을 순차적으로 출력하라
		{
			System.out.println(a);
			
		}
		
		String[] str= {"Hello","Java","Hi","css"};
		
		//확장 for루프를 이용해서 str에 저장된 값 출력
		
		for(String s: str)			//string s 생성하여 str 요소값을 저장
		{
			System.out.println(s.toUpperCase());	//하나씩 출력, toUpperCase 대문자로 출력
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
		
		
		// 2차원 배열을 확장 for루프로 출력해보기
		
		double [][]b= {
				{'A','B'},
				{5,6,7},
				{20.1,31.5}
		};
		
		for(double []i: b)		//double i[]는 double b[]의 각 행을 참조
		{
			for(double j: i)		//double j는 double i[]의 각 열을 참조
			{
				System.out.print(j);	//참조한값을 출력
			}
			System.out.println();
		}

		
		
		
	}

}
