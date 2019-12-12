package practiceObjArr;

class Circle
{
	int radius;
	
	//������
	public Circle(int radius)
	{
		this.radius=radius;
	}
	
	public double getArea()
	{
		return 3.14*radius*radius;
	}
}

public class CircleArray {

	public static void main(String[] args)
	{
		//circle �迭 �ʱ�ȭ
		Circle c[]= new Circle[5];
		
		//�迭ũ�⸸ŭ�� Circle ��ü ����
		for(int i=0; i<c.length; i++)
		{
			c[i]= new Circle(i);
		}
		
		//�迭�� ��� circle��ü�� ���� ���
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i].getArea());
		}
	}
}
