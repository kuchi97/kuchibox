package k04BearEatFish;

public abstract class GameObject {
	
	protected int distance;	//한번이동거리
	protected int x, y;		//현재 위치(화면 맵상의)
	
	public GameObject(int startX, int startY, int distance)			//초기위치와 이동거리 설정
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
	
	public boolean collide(GameObject p)		//이 객체가 객체 p와 충돌하면 true를 리턴함
	{
		if(this.x==p.getX() && this.y==p.getY())
			return true;
		else
			return false;
	}
	
	protected abstract void move();				//이동후 새로운 위치로 x,y 리턴
	protected abstract char getShape();			//객체의 모양을 나타내는 문자 리턴

}
