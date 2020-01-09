package net.k20191210;

//2. runnable() 인터페이스 상속받기
//	- 이미 다른 클래스를 상속받고있어서 Thread를 상속받을 수 없을때 사용한다

//Runnable 객체는 스레드의 코드부분을 가지고있는 객체이지 스레드는 아니다
//	따라서 thread와 runnable 객체가 결합해야한다


class SnailRunnable implements Runnable
{
	String name;
	public SnailRunnable(String name)
	{
		this.name= name;
	}
	
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(name+"스레드가 기어갑니다");
			try {
				Thread.sleep(1000);
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//-- for
	}
}

public class ThreadTest3 {

	public static void main(String[] args) {
		
		//1. Runnable 객체 생성
		SnailRunnable sr1= new SnailRunnable("깜찍이1");
		SnailRunnable sr2= new SnailRunnable("깜찍이2");
		SnailRunnable sr3= new SnailRunnable("깜찍이3");
		
		//2. Thread 객체를 생성할때 Runnable 객체를 인자로 넣어준다
		Thread tr1= new Thread(sr1);
		Thread tr2= new Thread(sr2);
		Thread tr3= new Thread(sr3);
		
		//3. Thread.start();
		tr1.start();
		tr2.start();
		tr3.start();
	}
}
