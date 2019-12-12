package ExerciseChap3;
//2차원배열 n출력프로그램


public class ExCh3No2 {

	public static void main(String[] args)
	{
		int n[][]= {
				{1},
				{1,2,3},
				{1},
				{1,2,3,4},
				{1,2}
				};
		
		for (int i = 0; i < n.length; i++) 
		{
			for (int j = 0; j < n[i].length; j++) 
			{
				System.out.print(n[i][j]);
			}
			System.out.println();
			
		}
	}
}
