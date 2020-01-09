package k20191112;

//concrete class	<--->	abstract class
//제대로구현된클래스
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
		System.out.println("가로: "+a+" 세로: "+b);
		System.out.println("RectArea: "+x);
	}
	
}//--EO.Rectangle
class Triangle extends Shape
{
	@Override
	void area(int a, int b)
	{
		x=(a*b)/2;
		System.out.println("가로: "+a+" 세로: "+b);
		System.out.println("TriArea: "+x);
	}	
}//--EO.Triangle
abstract class Circle extends Shape
{
	//만약에 추상메소드를 오버라디으하지 않는다면 헤당클래스도 추상클래스가 되어야한다
}
class MyCircle extends Circle
{
	@Override
	void area(int a, int b)
	{
		//필요가 없지만 빈블록이라도 남겨둬야한다
	}
	//overload
	void area(int a)
	{
		double x=Math.PI*a*a;
		System.out.println("반지름: "+a);
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
		 	추상클래스는 타입선언은 할수있으나
		 	객체생성은 불가능하다
		 */
		MyCircle myCirc= new MyCircle();
		myCirc.area(3);
		
		Circle circ= new MyCircle();
		//부모타입으로 선언하고 자식타입으로 객체생성가능
		//단, 형변환 해줘야함
		((MyCircle)circ).area(4);
	}
}
