package net.k20191210;

//2. runnable() �������̽� ��ӹޱ�
//	- �̹� �ٸ� Ŭ������ ��ӹް��־ Thread�� ��ӹ��� �� ������ ����Ѵ�

//Runnable ��ü�� �������� �ڵ�κ��� �������ִ� ��ü���� ������� �ƴϴ�
//	���� thread�� runnable ��ü�� �����ؾ��Ѵ�


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
			System.out.println(name+"�����尡 ���ϴ�");
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
		
		//1. Runnable ��ü ����
		SnailRunnable sr1= new SnailRunnable("������1");
		SnailRunnable sr2= new SnailRunnable("������2");
		SnailRunnable sr3= new SnailRunnable("������3");
		
		//2. Thread ��ü�� �����Ҷ� Runnable ��ü�� ���ڷ� �־��ش�
		Thread tr1= new Thread(sr1);
		Thread tr2= new Thread(sr2);
		Thread tr3= new Thread(sr3);
		
		//3. Thread.start();
		tr1.start();
		tr2.start();
		tr3.start();
	}
}
