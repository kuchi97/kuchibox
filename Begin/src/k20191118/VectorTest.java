package k20191118;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		//Vector: jdk5.0 ������ ���İ� �޶� : Generic ��� ����
		Vector v= new Vector(5,3);
			//�ʱ�뷮 5, ����ġ 3
			//5�� ��������� �����, �����Ͱ� ������ 3���� �ø�
		System.out.println("v.capacity: "+v.capacity());
			//capacity(): �뷮�� �˷���
		System.out.println("v.size: "+v.size());
			//size(): ������ߴ��� �˷���
		
		//public boolean add(Object o)  ���Ϳ� �ڷ� �����ϱ�
		for(int i=0; i<10; i++)
		{
			v.add(new Integer(i));
			
		}
		System.out.println("v.capacity2: "+v.capacity());
		System.out.println("v.size2: "+v.size());
		
		v.add(new Double(3.14));
		v.add("Hello");
		v.add(100);		//int�� ����� ���� �ƴ�, Integer�� auto boxing�Ǿ� ����ȴ�
		
		//���͵� �迭�� �����ϰ� �ε����� �����ȴ�
		
		//Object get(int index)
		//Object elementAt(int index)		//������ �����͸� �����ϱ�
		
//		Integer val1= v.get(3);
			//�׳� ������ ������  cannot convert from Object to Integer
			//Integer ����ȯ �������
		Integer val1= (Integer)(v.get(3));
		System.out.println(val1);
		
		Double val2= (Double)v.get(10);
		System.out.println(val2);
			//������ Double cannot be cast to java.lang.Integer
			//double�� ���ָ� �ߵſ�
		
		System.out.println("\n****jdk5.0���ķ� �޶�����****\n");
		Vector<String> v2= new Vector<String>();			//�⺻������ �ʱ�뷮 10, ����ġ 2��
		//String ������ �����ϰڴٴ� �ǹ�: Generic
		
		for(int i=1; i<6; i++)
		{
			v2.add("Hello"+i);
		}
		
		System.out.println("v2 cap: "+v2.capacity());
		System.out.println("v2 size: "+v2.size());
		
		String str= v2.get(2);				//�����ö� ����ȯ �ʿ����

		//for���� �̿��ؼ� v2 ���
		for(int i=0; i<5; i++)
		{
			System.out.println("v"+i+": "+v2.get(i));
		}
		for(String str2:v2)
		{
			System.out.println(str2);
		}
		
		System.out.println("\n*********************\n");
		
		//float ������ ���� v3 �����ϰ� ��ü 3���̻� ����
		//for������ �̿��� v3�� ����� ��ü�� �հ� ��յ� ���ϼ���
		
		Vector<Float> v3= new Vector<Float>();
			//float�� ���Ͱ� �ƴ϶� Float Ŭ������ �����ε�?
		v3.add(new Float(1.2f));		//����
		v3.add(3.66f);					// float==> Float autoboxing
		v3.add(new Float((float)(Math.random()*10+5)));
		float sum=0;
		
		//���Ϳ�Ұ� �����ֱ� - for �Ƚᵵ �ѹ��� ���´�
		System.out.println(v3);
		
		//v3 �� ���ϱ�
		for(Float f:v3)
		{
			sum+=f;
		}
		
		//�հ� ��� ���
		System.out.println("v3sum: "+sum);
		System.out.println("v3avg: "+sum/3);
		
	}

}
