package exChap4No7;
//��������
public class Day {

	private String work;			//�Ϸ��� ������ ��Ÿ���� ���ڿ�

	public String getWork() {
		return work;
	}

	public void setWork(String work) {
		this.work = work;
	}
	
	//���� ���
	public void show()
	{
		if(work==null)
			System.out.println("�����ϴ�");
		else
			System.out.println(work+"�Դϴ�");
	}
}
