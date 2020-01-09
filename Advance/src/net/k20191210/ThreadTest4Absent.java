package net.k20191210;

//[2] Runnable인터페이스를 상속받는 경우.
//    추상메소드 run()을 오버라이드 한다.
//Runnable객체는 스레드의 코드 부분을 갖고있는 객체이지 스레드는 아니다.
//그래서 Thread와 Runnable객체가 결합을 해야 한다.
class Snail1 implements Runnable {
	String name;

	public Snail1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "스레드가 기어가요~~");
			try {
				Thread.sleep(500);
				// 다른 스레드에게 실행기회를 주고자 할 때 호출 //우선순위와 상관없이 다른 스레드에게 기회를 준다.
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}

		} // for-----------
	}
}/////////////////////////////////

public class ThreadTest4Absent {
	public static void main(String[] args) {
		// 1. Runnable객체를 먼저 생성
		Snail sr1 = new Snail("첫번째");
		Snail sr2 = new Snail("두번째");
		Snail sr3 = new Snail("세번째");
		// 2. Thread객체를 생성할 때 Runnable객체를 인자로 넣어준다.
		Thread tr1 = new Thread(sr1);
		Thread tr2 = new Thread(sr2);
		Thread tr3 = new Thread(sr3);
		// 3. Thread를 start()함다.

		// 스레드 스케줄링에 영향을 미칠 수 있는 메소드를 활용해보자.
		// 우선순위 주기: setPriority(int n)
		// 1 ~ 10까지의 정수값을 넣어준다. 클 수록 우선순위가 높아져
		// 실행기회를 더 많이 가질 수 있다. (단, 선점형 운영체제에서 동작함)
		tr1.setPriority(Thread.MIN_PRIORITY);// 1
		tr2.setPriority(Thread.NORM_PRIORITY);// 5
		tr3.setPriority(Thread.MAX_PRIORITY);// 10

		tr1.start();
		tr2.start();
		tr3.start();

		// tr2.yield();
		// tr2와 우선순위가 같거나 더 높은 스레드에게 양보한다.

		/*
		 * try { tr1.join(); //tr1 스레드가 일을 다 마칠 때까지 이메소드를 호출한 // 스레드 (여기서는 main스레드)가
		 * block상태가 된다. } catch (InterruptedException e) { e.printStackTrace(); }
		 */
		tr2.interrupt();
		//Block상태에 있을 깨 InterruptedException을 발생시킨다.
		
		System.out.println("Hello World~~~");
	}

}
