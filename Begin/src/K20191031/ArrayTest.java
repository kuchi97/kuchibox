package K20191031;
/*
 * �⺻�ڷ���
 * ������    ------->  new �����ڷ� �ʱ�ȭ��
 * 	1. Ŭ����
 * 	2. �������̽�
 * 	3. �迭
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		/*
		 * �迭 :	������ �����͸� �����ϴ� �ڷᱸ��
		 
				���������� �����͸� ������ �� �ִ�
					1. ����
					2. �޸��Ҵ�
					3. �ʱ�ȭ
		*/
		
		//1. ����
		// stack�� �����
		int a[];
		int []b;
		
		//2. �޸��Ҵ� :	new ������
		//���������� �ݵ�� �޸��Ҵ� �ϰ� �����
		//�޸��Ҵ��ϸ� heap���� ���� �����
		a= new int[3];
		b= new int[5];
		System.out.println(a);
		System.out.println(b);
		System.out.println(a[0]);
		System.out.println(b[0]);
		//�迭�� �ʱⰪ�� �������� ������ �ڷ����� ����Ʈ���� ����
		
		//3. �ʱ�ȭ
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//�迭�� �Ӽ�:	length:	�迭�� ũ�⸦ �� �� �ִ�
		System.out.println("a.length: "+ a.length);
		System.out.println("b.length: "+ b.length);
		
		// ����+�޸��Ҵ�
		double []arr= new double[4];
		System.out.println(arr[0]);
		arr[0]= 123.456;
		arr[1]= 0x15;
		arr[2]= 300e-5;
		arr[3]= 'A';
		System.out.println(arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]);
		
		//for�̿��Ͽ� �迭 arr�� ����Ȱ��� �ѹ��� ���
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		//1+2+3 ���ο� ��Ű��
		char[] ch= {'j','a','v','a'};
		System.out.println("ch.length: "+ch.length);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			System.out.println(ch[i]);
		}
		
		//��1. float�迭 ���� ũ�� 3
		//		���� -16.1 200.1 5e3�� �ֱ�
		//		�׸��� �����
		
		float[] ft= {-16.1f, 200.1f, 5e3f};
		for (int i = 0; i < ft.length; i++) {
			System.out.println(ft[i]);
		}

		
		
		
	}

}
