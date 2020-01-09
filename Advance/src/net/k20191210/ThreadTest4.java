package net.k20191210;

//2. runnable() 인터페이스 상속받기
//	- 이미 다른 클래스를 상속받고있어서 Thread를 상속받을 수 없을때 사용한다

//Runnable 객체는 스레드의 코드부분을 가지고있는 객체이지 스레드는 아니다
//	따라서 thread와 runnable 객체가 결합해야한다


class Snail implements Runnable
{
	String name;
	public Snail(String name)
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
				Thread.sleep(500);
				
				//sleep(): 다른 스레드에게 실행기회를 주고자 할때 호출
				//	우선순위와는 상관이 없이 다른스레드에 기회를 준다
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//-- for
	}
}

public class ThreadTest4 {

	public static void main(String[] args) {
		
		//1. Runnable 객체 생성
		Snail sr1= new Snail("깜찍이1");
		Snail sr2= new Snail("깜찍이2");
		Snail sr3= new Snail("깜찍이3");
		
		//2. Thread 객체를 생성할때 Runnable 객체를 인자로 넣어준다
		Thread tr1= new Thread(sr1);
		Thread tr2= new Thread(sr2);
		Thread tr3= new Thread(sr3);
		
		
	//스레드 스케줄링에 영향을 미칠수있는 메소드를 활용한다
		//스레드에 우선순위 주기 setPriority(int n);
		//	n= 1~10 클수록 우선순위가 높다. 실행기회를 더 많이받음
		//		단, 선점형 운영체제에서 동작한다
		
		tr1.setPriority(Thread.MIN_PRIORITY);
		tr2.setPriority(Thread.NORM_PRIORITY);
		tr3.setPriority(Thread.MAX_PRIORITY);
		
		//3. Thread.start();
		tr1.start();
		tr2.start();
		tr3.start();
		
//		tr2.yield();
//		//yield(): tr2와 우선순위가 같거나 더 높은 스레드에게 양보한다
		
//		try {
//			tr1.join();
//			//tr1 스레드가 작업을 다 마칠때까지 호출한쪽(여기서는 main)은 튀어나오지 않는다
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		tr2.interrupt();
		//tr2가 sleep에 들어가면 interruptException이 발생
		
		
		System.out.println("Hello world!");
	}
}
