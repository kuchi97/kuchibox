package net.k20191210;

//[2] Runnable�������̽��� ��ӹ޴� ���.
//    �߻�޼ҵ� run()�� �������̵� �Ѵ�.
//Runnable��ü�� �������� �ڵ� �κ��� �����ִ� ��ü���� ������� �ƴϴ�.
//�׷��� Thread�� Runnable��ü�� ������ �ؾ� �Ѵ�.
class Snail1 implements Runnable {
	String name;

	public Snail1(String name) {
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 0; i < 5; i++) {
			System.out.println(name + "�����尡 ����~~");
			try {
				Thread.sleep(500);
				// �ٸ� �����忡�� �����ȸ�� �ְ��� �� �� ȣ�� //�켱������ ������� �ٸ� �����忡�� ��ȸ�� �ش�.
			} catch (InterruptedException e) {
				e.printStackTrace();
				break;
			}

		} // for-----------
	}
}/////////////////////////////////

public class ThreadTest4Absent {
	public static void main(String[] args) {
		// 1. Runnable��ü�� ���� ����
		Snail sr1 = new Snail("ù��°");
		Snail sr2 = new Snail("�ι�°");
		Snail sr3 = new Snail("����°");
		// 2. Thread��ü�� ������ �� Runnable��ü�� ���ڷ� �־��ش�.
		Thread tr1 = new Thread(sr1);
		Thread tr2 = new Thread(sr2);
		Thread tr3 = new Thread(sr3);
		// 3. Thread�� start()�Դ�.

		// ������ �����ٸ��� ������ ��ĥ �� �ִ� �޼ҵ带 Ȱ���غ���.
		// �켱���� �ֱ�: setPriority(int n)
		// 1 ~ 10������ �������� �־��ش�. Ŭ ���� �켱������ ������
		// �����ȸ�� �� ���� ���� �� �ִ�. (��, ������ �ü������ ������)
		tr1.setPriority(Thread.MIN_PRIORITY);// 1
		tr2.setPriority(Thread.NORM_PRIORITY);// 5
		tr3.setPriority(Thread.MAX_PRIORITY);// 10

		tr1.start();
		tr2.start();
		tr3.start();

		// tr2.yield();
		// tr2�� �켱������ ���ų� �� ���� �����忡�� �纸�Ѵ�.

		/*
		 * try { tr1.join(); //tr1 �����尡 ���� �� ��ĥ ������ �̸޼ҵ带 ȣ���� // ������ (���⼭�� main������)��
		 * block���°� �ȴ�. } catch (InterruptedException e) { e.printStackTrace(); }
		 */
		tr2.interrupt();
		//Block���¿� ���� �� InterruptedException�� �߻���Ų��.
		
		System.out.println("Hello World~~~");
	}

}
