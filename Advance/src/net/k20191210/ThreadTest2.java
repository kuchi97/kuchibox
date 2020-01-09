package net.k20191210;

/*
������ �����ϱ�
	1. java.lang.Thread�� ��ӹޱ�
	
	2. java.lang.Runnable �������̽��� ��ӹޱ�
	
	
*/

class snailThread extends Thread
{
	public snailThread(String name)
	{
		this.setName(name);
	}
	
	//�����尡 ������ run()���� �����Ѵ�
	@Override
	public void run()
	{
		for(int i=0; i<5; i++)
		{
			System.out.println(this.getName()+"�����尡 ���ϴ�");
			int millis=(int)(Math.random()*3000+500);		//0.5~3.5�� ���̿� ����
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
		
		//������ ���۽�Ű��
		snailThread tr1= new snailThread("ö��");
		snailThread tr2= new snailThread("�̾�");
		snailThread tr3= new snailThread("���");
		
		
		//�������� ������ run()�� �ƴ� start()�� ȣ���ؾߵ�
		//�������� ������ JVM�� �ð��ִ�
		
		tr1.start();
		tr2.start();
		tr3.start();
		
		}
}
