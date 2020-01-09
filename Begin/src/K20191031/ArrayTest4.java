package K20191031;

public class ArrayTest4 {

	public static void main(String[] args)
	{
		System.out.println("1.-----------");
		int [][]a;
		int []b[];
		int c[][];
		
		a=new int[3][2];
		a[0][0]=1;
		a[0][1]=2;
		a[1][0]=3;
		a[1][1]=4;
		a[2][0]=5;
		a[2][1]=6;
		
		for(int i=0; i<a.length; i++)
		{
			for(int j=0; j<a[i].length; j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println("2.================");
		//행의 크기만 먼저 잡아놓고 열의 크기를 각각 가변적으로 할당하기
		char ch[][]=new char[3][];
		
		ch[0]=new char[2]; //첫째행 열의 크기= 2;
		ch[1]=new char[4];
		ch[2]=new char[3];
		
		ch[0][0]='h';
		ch[0][1]='i';
		
		ch[1][0]='j';
		ch[1][1]='a';
		ch[1][2]='v';
		ch[1][3]='a';
		//char의 기본값 '\u0000'- null비슷한거
		
		for(int i=0; i<ch[2].length; i++)
			ch[2][i]=(char)('a'+i);
				
		for(int i=0; i<ch.length; i++)
		{
			for(int j=0; j<ch[i].length; j++)
			{
				System.out.print(ch[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("3.---------");
		
		String str[][]= {{"Hell Ya"}, {"Java","html"},{new String("Bye")}};
		System.out.println(str[0][0]);
		System.out.println(str[1][0]);
		System.out.println(str[1][1]);
		System.out.println(str[2][0]);
		//3행 1/2/1열 배열이 되었다!

	}
}
