package K20191031;

public class ArrayTest3 {
	
	public static void main(String[] args)
	{
		int a[]= new int[3];
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		
		int b[];		//����
		b=a;
		
/*		  
		  �����迭 a�� b�� �ʱ�ȭ
		  
	      �̶� ���ο� �޸𸮸� �Ҵ�޾� �����Ǵ°��� �ƴ϶�,
		  a�� �����ϴ� �迭�� b�� �����ϴ� ���°� �ȴ�
		  �� ��� a�迭��Ұ��� �����ϸ� b�� ����ȴ�
		  ���� �ű������ʴ�
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
		
		
		//�ӽú����� �޸��ּҸ� �ٲ㰡��Ű�� �迭�ٲٱ�
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
