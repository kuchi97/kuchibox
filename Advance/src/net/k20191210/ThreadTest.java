package net.k20191210;

/*
���� ���α׷��� ���Ǵ� ������� 1�� �̻��� �� �ִ�
	�̷� �� ���α׷��� ������ main()�� �ƴҼ��� ����
	
	|------------------------------------------|
	���μ�������							���μ��� ��
	|------------------------------------------|
	���ν����� ����								��
	|		|������ ���� ----->		|		   |
	���ν��������							   ��
	
	|------------------------------------------|------>|
	���������								���γ�		�����峡

*/

public class ThreadTest {

	public static void main(String[] args) {
		
		//���� �������� ������ ���� ���캸��
		int count= Thread.activeCount();
		System.out.println("���� �������� ������ ��"+count);
		
		Thread tr= Thread.currentThread();
		System.out.println("���� �������� �������̸�: "+tr.getName());
		tr.setName("Hi Thread");
		System.out.println("���� �̸��� : "+tr.getName());
		
	}
}
