package net.k20191211Absent;
import java.util.Random;
/*synchronized: 여러 스레드가 동시에 실행될 때
 *  동기화 블럭이나 메소드에서는 락을 쥔 스레드만
 *  수행하도록 제한하는 지정자. 
 *  
 *  wait()/notify(),notifyAll() 동기화 블럭에서만 호출 가능
 *    그렇지 않을 경우 예외가 발생된다.
 * */
public class Account {
	
	private int money=10;
	private boolean flag=false;
		/*wait()가 호출되면 스레드는 수행권한을 포기하고
		 * Waiting Pool에서 대기한다. 이때 모니터 락(lock)을
		 * 반납하고 대기상태로 들어간다.
		 * */
	//동기화 메소드
	synchronized public void get(int val) {
		if(flag==false) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}//if------------
		flag=false;
		if(money-val<0) {
			System.out.println("현금 부족: 현재 잔액="+money
					+", 요청 금액: "+val);
			notify();
			return;
		}
		money-=val;
		System.out.println("출금액: "+val+", 출금후 잔액: "+money);
		notify();
	}//get()-------------------------
	public void save(int val) {
		//동기화 블럭을 이용하는 경우 
				//this는 lock을 가진 객체(즉 공유하는 객체)
		synchronized(this) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}//if-------------
			money+=val;
			System.out.println("입금액: "+val+", 입금후 잔액: "+money);
			flag=true;
			notify();
			/*notify()가 호출되면 Waiting Pool에있는 스레드
			 * 하나를 깨워 Runnable한 상태로 전환시킨다.
			 * 그런데 notify()는 특정 스레드를 지정해서 깨우는 것이
			 * 아니라 대기실에 있는 스레드 아무거나 하나 골라서
			 * 깨운다.
			 * 반면 notifyAll()은 대기실에 있는 모든 스레드를
			 * 깨운다.
			 * */
		}
	}
}////////////////////////////////////
class UserOut extends Thread{
	private Account ac;
	private String name;
	public UserOut(Account a, String name) {
		this.ac=a;
		this.name=name;
	}
	@Override
	public void run() {
		//랜덤하게 1~5만원 사이값을 인출
		Random r=new Random();
		for(int i=1;i<6;i++) {
			//int val=r.nextInt(범위)+시작값;
			int val=r.nextInt(5)+1;
			ac.get(val);
		}//for-------
	}//run()------------
}/////////////////////////////////////
class UserIn extends Thread{
	private Account ac;
	private String name;
	
	public UserIn(Account ac, String name) {
		this.ac=ac;
		this.name=name;
	}
	@Override
	public void run() {
		for(int i=0;i<5;i++) {
			ac.save(1);//1만원씩 입금
		}
	}
}//////////////////////////////////////////



