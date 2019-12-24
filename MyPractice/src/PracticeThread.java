class runThread extends Thread
{
	runThread()
	{

	}
	@Override
	public void run()
	{
		int x=0;
		while(x>10)
		{
			try {
				System.out.println("*");
				sleep(200);
				x++;
				
			} catch (Exception e) {
				return;
			}
		}
	}
}

public class PracticeThread {
	public static void main(String[] args) {
		
		runThread th= new runThread();
		th.start();
	}
}
