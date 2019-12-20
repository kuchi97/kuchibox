package practiceThread;

public class SynchronizedEx {

	public static void main(String[] args) {
		
		SharedBoard board= new SharedBoard();
		
		//스레드 생성시 집계판의 주소를 알려준다.
		//두 스레드는 집계판에 동시에 접속한다.
		StudentThread th1= new StudentThread("기태", board);
		Thread th2= new StudentThread("정수", board);
		
		th1.start();
		th2.start();
	}
}

// 공유데이터인 집계판을 시뮬레이션 하는 클래스
// 두 학생스레드에 의해 동시접근됨
class SharedBoard
{
	//global var
	private int sum= 0;				//집계판 합
	
//---------------------------------------------------------------------------------	
/*
	//동기화 하여 정상적으로 작동하는 메소드 add()
	synchronized public void add()
	{
		int n= sum;
		
		Thread.yield();				//현재 실행중인 스레드를 양보한다
		n+=10;
		
		sum= n;		//증가한 n값을 집계합에 기록
		
		System.out.println(Thread.currentThread().getName()+": "+sum);
	}
*/

	//동기화하지 않아 정상적으로 작동하지 않는 메소드 add()
	public void add()
	{
		int n= sum;
		
		Thread.yield();				//현재 실행중인 스레드를 양보한다
		n+=10;
		
		sum= n;		//증가한 n값을 집계합에 기록
		
		System.out.println(Thread.currentThread().getName()+": "+sum);
	
	}
	
//-----------------------------------------------------------------------------------------
	
	public int getSum()
	{
		return sum;
	}
}
	
//학생 스레드
class StudentThread extends Thread
{
	//global var.
	private SharedBoard board;			//집계판의 주소
	
	public StudentThread(String name, SharedBoard board)
	{
		super(name);
		this.board= board;
	}
	
	//집계판에 10번 접근하여 카운팅한다
	@Override
	public void run()
	{
		for(int i=0; i<10; i++)
		{
			board.add();
		}
	}
}

