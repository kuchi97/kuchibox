package exChap4No7;
//오늘할일
public class Day {

	private String work;			//하루의 할일을 나타내는 문자열

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	//할일 출력
	public void show()
	{
		if(work==null)
			System.out.println("없습니다");
		else
			System.out.println(work+"입니다");
	}
}
