package net.k20191211Absent;
import java.util.Random;
/*synchronized: ���� �����尡 ���ÿ� ����� ��
 *  ����ȭ ���̳� �޼ҵ忡���� ���� �� �����常
 *  �����ϵ��� �����ϴ� ������. 
 *  
 *  wait()/notify(),notifyAll() ����ȭ �������� ȣ�� ����
 *    �׷��� ���� ��� ���ܰ� �߻��ȴ�.
 * */
public class Account {
	
	private int money=10;
	private boolean flag=false;
		/*wait()�� ȣ��Ǹ� ������� ��������� �����ϰ�
		 * Waiting Pool���� ����Ѵ�. �̶� ����� ��(lock)��
		 * �ݳ��ϰ� �����·� ����.
		 * */
	//����ȭ �޼ҵ�
	synchronized public void get(int val) {
		if(flag==false) {
			try {
				wait();
			}catch(InterruptedException e) {}
		}//if------------
		flag=false;
		if(money-val<0) {
			System.out.println("���� ����: ���� �ܾ�="+money
					+", ��û �ݾ�: "+val);
			notify();
			return;
		}
		money-=val;
		System.out.println("��ݾ�: "+val+", ����� �ܾ�: "+money);
		notify();
	}//get()-------------------------
	public void save(int val) {
		//����ȭ ���� �̿��ϴ� ��� 
				//this�� lock�� ���� ��ü(�� �����ϴ� ��ü)
		synchronized(this) {
		if(flag==true) {
			try {
				wait();
			} catch (InterruptedException e) {}
		}//if-------------
			money+=val;
			System.out.println("�Աݾ�: "+val+", �Ա��� �ܾ�: "+money);
			flag=true;
			notify();
			/*notify()�� ȣ��Ǹ� Waiting Pool���ִ� ������
			 * �ϳ��� ���� Runnable�� ���·� ��ȯ��Ų��.
			 * �׷��� notify()�� Ư�� �����带 �����ؼ� ����� ����
			 * �ƴ϶� ���ǿ� �ִ� ������ �ƹ��ų� �ϳ� ���
			 * �����.
			 * �ݸ� notifyAll()�� ���ǿ� �ִ� ��� �����带
			 * �����.
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
		//�����ϰ� 1~5���� ���̰��� ����
		Random r=new Random();
		for(int i=1;i<6;i++) {
			//int val=r.nextInt(����)+���۰�;
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
			ac.save(1);//1������ �Ա�
		}
	}
}//////////////////////////////////////////



