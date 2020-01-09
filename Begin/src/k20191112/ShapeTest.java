package k20191112;

//concrete class	<--->	abstract class
//����α�����Ŭ����
abstract class Shape
{
	int x;
	
	public String getInfo()
	{
		return "shape of me";
	}
	
	//abstract: modifier
	abstract void area(int a, int b);
	
	
}//--EO.Shape

class Rectangle extends Shape
{
	@Override
	void area(int a, int b)
	{
		
		x=a*b;
		System.out.println("����: "+a+" ����: "+b);
		System.out.println("RectArea: "+x);
	}
	
}//--EO.Rectangle
class Triangle extends Shape
{
	@Override
	void area(int a, int b)
	{
		x=(a*b)/2;
		System.out.println("����: "+a+" ����: "+b);
		System.out.println("TriArea: "+x);
	}	
}//--EO.Triangle
abstract class Circle extends Shape
{
	//���࿡ �߻�޼ҵ带 ������������� �ʴ´ٸ� ���Ŭ������ �߻�Ŭ������ �Ǿ���Ѵ�
}
class MyCircle extends Circle
{
	@Override
	void area(int a, int b)
	{
		//�ʿ䰡 ������ �����̶� ���ܵ־��Ѵ�
	}
	//overload
	void area(int a)
	{
		double x=Math.PI*a*a;
		System.out.println("������: "+a);
		System.out.println("CircArea: "+x);
	}
}

public class ShapeTest {

	public static void main(String[] args)
	{
		Rectangle rect= new Rectangle();
		rect.area(5,7);
		Triangle tri= new Triangle();
		tri.area(42, 22);
		
//		Circle circ= new Circle();
		/*
		 	�߻�Ŭ������ Ÿ�Լ����� �Ҽ�������
		 	��ü������ �Ұ����ϴ�
		 */
		MyCircle myCirc= new MyCircle();
		myCirc.area(3);
		
		Circle circ= new MyCircle();
		//�θ�Ÿ������ �����ϰ� �ڽ�Ÿ������ ��ü��������
		//��, ����ȯ �������
		((MyCircle)circ).area(4);
	}
}
