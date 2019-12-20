package practiceThread;

public class SynchronizedEx {

	public static void main(String[] args) {
		
		SharedBoard board= new SharedBoard();
		
		//������ ������ �������� �ּҸ� �˷��ش�.
		//�� ������� �����ǿ� ���ÿ� �����Ѵ�.
		StudentThread th1= new StudentThread("����", board);
		Thread th2= new StudentThread("����", board);
		
		th1.start();
		th2.start();
	}
}

// ������������ �������� �ùķ��̼� �ϴ� Ŭ����
// �� �л������忡 ���� �������ٵ�
class SharedBoard
{
	//global var
	private int sum= 0;				//������ ��
	
//---------------------------------------------------------------------------------	
/*
	//����ȭ �Ͽ� ���������� �۵��ϴ� �޼ҵ� add()
	synchronized public void add()
	{
		int n= sum;
		
		Thread.yield();				//���� �������� �����带 �纸�Ѵ�
		n+=10;
		
		sum= n;		//������ n���� �����տ� ���
		
		System.out.println(Thread.currentThread().getName()+": "+sum);
	}
*/

	//����ȭ���� �ʾ� ���������� �۵����� �ʴ� �޼ҵ� add()
	public void add()
	{
		int n= sum;
		
		Thread.yield();				//���� �������� �����带 �纸�Ѵ�
		n+=10;
		
		sum= n;		//������ n���� �����տ� ���
		
		System.out.println(Thread.currentThread().getName()+": "+sum);
	
	}
	
//-----------------------------------------------------------------------------------------
	
	public int getSum()
	{
		return sum;
	}
}
	
//�л� ������
class StudentThread extends Thread
{
	//global var.
	private SharedBoard board;			//�������� �ּ�
	
	public StudentThread(String name, SharedBoard board)
	{
		super(name);
		this.board= board;
	}
	
	//�����ǿ� 10�� �����Ͽ� ī�����Ѵ�
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			board.add();
		}
	}
}

