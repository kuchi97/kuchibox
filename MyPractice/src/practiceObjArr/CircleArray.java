package practiceObjArr;

class Circle
{
	int radius;
	
	//생성자
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
		//circle 배열 초기화
		Circle c[]= new Circle[5];
		
		//배열크기만큼의 Circle 객체 생성
		for(int i=0; i<c.length; i++)
		{
			c[i]= new Circle(i);
		}
		
		//배열의 모든 circle객체의 면적 출력
		for(int i=0; i<c.length; i++)
		{
			System.out.println(c[i].getArea());
		}
	}
}
