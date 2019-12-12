package k04BearEatFish;

public abstract class GameObject {
	
	protected int distance;	//�ѹ��̵��Ÿ�
	protected int x, y;		//���� ��ġ(ȭ�� �ʻ���)
	
	public GameObject(int startX, int startY, int distance)			//�ʱ���ġ�� �̵��Ÿ� ����
	{
		this.x=startX;
		this.y=startY;
		this.distance=distance;
	}
	
	public int getX()
	{
		return x;
	}
	public int getY()
	{
		return y;
	}
	
	public boolean collide(GameObject p)		//�� ��ü�� ��ü p�� �浹�ϸ� true�� ������
	{
		if(this.x==p.getX() && this.y==p.getY())
			return true;
		else
			return false;
	}
	
	protected abstract void move();				//�̵��� ���ο� ��ġ�� x,y ����
	protected abstract char getShape();			//��ü�� ����� ��Ÿ���� ���� ����

}
