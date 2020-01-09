package net.k20191210;

/*
스레드 구현하기
	1. java.lang.Thread를 상속받기
	
	2. java.lang.Runnable 인터페이스를 상속받기
	
	
*/

class snailThread extends Thread
{
	public snailThread(String name)
	{
		this.setName(name);
	}
	
	//스레드가 할일을 run()에서 구현한다
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(this.getName()+"스레드가 기어갑니다");
			int millis=(int)(Math.random()*3000+500);		//0.5~3.5초 사이에 정지
			try {
				Thread.sleep(millis);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
			}
			
		}
	}
}
public class ThreadTest2 {

	public static void main(String[] args) {
		
		//스레드 동작시키기
		snailThread tr1= new snailThread("철이");
		snailThread tr2= new snailThread("미애");
		snailThread tr3= new snailThread("라바");
		
		
		//스레드의 동작은 run()이 아닌 start()를 호출해야됨
		//스레드의 동작은 JVM이 맡고있다
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		}
}
