package k20191106;

class Yuja
{
	private int yuja;
	private int sugar;
	
	public int getYuja() {
		return yuja;
	}
	public void setYuja(int yuja) {
		this.yuja = yuja;
	}
	public int getSugar() {
		return sugar;
	}
	public void setSugar(int sugar) {
		this.sugar = sugar;
	}
	
	
}
public class CoffeeMachine {
	
	int coffee, sugar, cream;
	
/*	method overload 
 * 		1. �޼ҵ���� ���ƾ���
 * 		2. �Ű������� �ڷ����� �ٸ��ų�, ������ �ٸ��ų� ������ �޶����
 * 		3. ��ȯŸ���� �Ű�Ⱦ���
 */
	
	//Ŀ�Ǹ���� �޼ҵ�- ��Ŀ��
	public void makeTea(int coffee)
	{
		this.coffee=coffee;
		System.out.println("��Ŀ�� �����ϴ�");
	}
	//Ŀ�Ǹ����- ����Ŀ��
	public void makeTea(int coffee, int sugar)
	{
		this.coffee=coffee;
		this.sugar=sugar;
		System.out.println("����Ŀ�� �����ϴ�");
	}
	//Ŀ�Ǹ����- ũ��Ŀ��
	//Ŀ��&ũ�� �̸� ���� �޼ҵ�� �����ڷ���(int int)�̹Ƿ� �ߺ��� �޼ҵ� ������
	public void makeTea(int coffee, short cream)			//int�� ������ �� �ִ� �ڷ��� short�� ��ü
	{
		this.coffee=coffee;
		this.cream=cream;
		System.out.println("ũ��Ŀ�� �����ϴ�");
	}
	//�Ȱ��� ũ��Ŀ��
	public void makeTea(short cream, int coffee)			//int short ������ �ٲ� �ߺ����� �ȶ�
	{
		this.makeTea(coffee, cream);						//�ڱ� Ŭ������ ũ��Ŀ��(int short)�� ȣ��
	}
	
	public String makeTea(int coffee, int sugar, int cream)
	{
		this.coffee=coffee;
		this.sugar=sugar;
		this.cream=cream;
		return "��ũĿ�� ������";
	}
	
	public void makeTea(Yuja yuja)
	{
		System.out.println("������ ������");
		System.out.println("����: "+yuja.getYuja());
		System.out.println("����: "+yuja.getSugar());
		System.out.println("��������: "+(yuja.getYuja()+yuja.getSugar()));
	}

}
