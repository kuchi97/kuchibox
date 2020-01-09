package K20191031;

public class ArrayTest3 {
	
	public static void main(String[] args)
	{
		int a[]= new int[3];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		
		int b[];		//선언만
		b=a;
		
/*		  
		  기존배열 a로 b를 초기화
		  
	      이때 새로운 메모리를 할당받아 생성되는것이 아니라,
		  a가 참조하는 배열을 b도 참조하는 형태가 된다
		  이 경우 a배열요소값을 변경하면 b도 변경된다
		  정말 신기하지않니
*/
		
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
		for (int j = 0; j < b.length; j++) {
			System.out.println(b[j]);
		}
		a[1]= 200;
		System.out.println(a[1]);
		System.out.println(b[1]);
		System.out.println(a);
		System.out.println(b);
		
		
		//임시변수로 메모리주소를 바꿔가리키며 배열바꾸기
		int x[]= {1, 2, 3, 4};
		int []y= {10,20};
		int tmp[];
		
		tmp=x;
		x=y;
		y=tmp;
		
		for(int i=0; i<x.length; i++)
		{
			System.out.print(x[i]+" ");
		}
		System.out.println();
		for(int i=0; i<y.length; i++)
		{
			System.out.print(y[i]+" ");
		}
	}
}
