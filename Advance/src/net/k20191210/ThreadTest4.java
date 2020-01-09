package net.k20191210;

//2. runnable() �������̽� ��ӹޱ�
//	- �̹� �ٸ� Ŭ������ ��ӹް��־ Thread�� ��ӹ��� �� ������ ����Ѵ�

//Runnable ��ü�� �������� �ڵ�κ��� �������ִ� ��ü���� ������� �ƴϴ�
//	���� thread�� runnable ��ü�� �����ؾ��Ѵ�


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
			System.out.println(name+"�����尡 ���ϴ�");
			try {
				Thread.sleep(500);
				
				//sleep(): �ٸ� �����忡�� �����ȸ�� �ְ��� �Ҷ� ȣ��
				//	�켱�����ʹ� ����� ���� �ٸ������忡 ��ȸ�� �ش�
				
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}//-- for
	}
}

public class ThreadTest4 {

	public static void main(String[] args) {
		
		//1. Runnable ��ü ����
		Snail sr1= new Snail("������1");
		Snail sr2= new Snail("������2");
		Snail sr3= new Snail("������3");
		
		//2. Thread ��ü�� �����Ҷ� Runnable ��ü�� ���ڷ� �־��ش�
		Thread tr1= new Thread(sr1);
		Thread tr2= new Thread(sr2);
		Thread tr3= new Thread(sr3);
		
		
	//������ �����ٸ��� ������ ��ĥ���ִ� �޼ҵ带 Ȱ���Ѵ�
		//�����忡 �켱���� �ֱ� setPriority(int n);
		//	n= 1~10 Ŭ���� �켱������ ����. �����ȸ�� �� ���̹���
		//		��, ������ �ü������ �����Ѵ�
		
		tr1.setPriority(Thread.MIN_PRIORITY);
		tr2.setPriority(Thread.NORM_PRIORITY);
		tr3.setPriority(Thread.MAX_PRIORITY);
		
		//3. Thread.start();
		tr1.start();
		tr2.start();
		tr3.start();
		
//		tr2.yield();
//		//yield(): tr2�� �켱������ ���ų� �� ���� �����忡�� �纸�Ѵ�
		
//		try {
//			tr1.join();
//			//tr1 �����尡 �۾��� �� ��ĥ������ ȣ������(���⼭�� main)�� Ƣ����� �ʴ´�
//		} catch (InterruptedException e) {
//			e.printStackTrace();
//		}
		
		tr2.interrupt();
		//tr2�� sleep�� ���� interruptException�� �߻�
		
		
		System.out.println("Hello world!");
	}
}
