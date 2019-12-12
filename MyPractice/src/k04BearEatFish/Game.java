package k04BearEatFish;
//10x20 격자판에서 각자 정해진 규칙에 의해 움직인다
//	bear는 사용자 키에 의해 a s d f 로 움직이고
//	fish는 5번중 2회를 랜덤위치로 이동하고 3회는 제자리에 있는다

//move()는 각 객체의 이동을 정의한다
//getShape()는 각 객체의 모양을 정의한다

//GameObject를 상속받아 .bear와 .fish 작성한다

//키가 입력될때마다 bear와 fish 객체의 move()가 순서대로 호출된다

import java.util.Scanner;

class Bear extends GameObject
{

	String bearMove;

	public Bear(int startX, int startY, int distance) 
	{
		super(startX, startY, distance);
	}
	
	@Override
	protected void move() 
	{
		
		if(bearMove.equals("a"))
		{
			if(y==0)
				y=0;
			else
				y-=1;
		}
		else if(bearMove.equals("d"))
		{
			if(y==19)
				y=19;
			else
				y+=1;
		}
		else if(bearMove.equals("w"))
		{
			if(x==0)
				x=0;
			else
				x-=1;
		}
		else if(bearMove.equals("s"))
		{
			if(x==9)
				x=9;
			else
				x+=1;
		}
	}

	@Override
	protected char getShape() 
	{
		return 'B';
	}
	
	public boolean collide(GameObject p)
	{
		if(this.x==p.getX() && this.y==p.getY())
			return true;
		else
			return false;
	}
}

class Fish extends GameObject
{
	static int count=0;
	
	public Fish(int startX, int startY, int distance) {
		super(startX,startY,distance);
	}

	@Override
	protected void move() {

		int moveOrNot=(int)(Math.random()*2);
		int moveWhere=(int)(Math.random()*4);
		
		if(count<4)
		{
			if(moveOrNot==1)
			{
				if(moveWhere==0)
				{
					if(x==9)
						x=9;
					else
						x+=1;
				}
				else if(moveWhere==1)
				{
					if(x==0)
						x=0;
					else
						x-=1;

				}
				else if(moveWhere==2)
				{
					if(y==19)
						y=19;
					else
						y+=1;
				}
				else if(moveWhere==3)
				{
					if(y==0)
						y=0;
					else
						y-=1;
				}
			}//--if
			count=0;
		}
	}

	@Override
	protected char getShape() {
		// TODO Auto-generated method stub
		return '@';
	}
	
}
class runGame
{
	int x, y;		//게임판좌표
	char board[][]= new char[10][20];		//게임판
	
	Bear bear= new Bear(0,0,1);
	Fish fish= new Fish((int)(Math.random()*10),(int)(Math.random()*20),1);
	
	Scanner sc= new Scanner(System.in);
	
	public void run()
	{

		while(true){
		System.out.println("$$$$$$ B O A R D $$$$$$");
		baseBoard();
		showBoard();
		
		System.out.println();
		System.out.println("이동할 방향을 입력하시오");
		System.out.print("위(w),왼쪽(a),아래(s),오른쪽(d): ");

		if(bear.collide(fish)==true)
		{
			System.out.println("맛있냐?");
			return;
		}
		bear.bearMove= sc.next();
		bear.move();
		Fish.count++;
		fish.move();
		showBoard();
		System.out.println();
		System.out.println(fish.x+","+fish.y);
		
		}
		
	}
	
	public void baseBoard()
	{
		for(int x=0; x<board.length; x++)
		{
			for(int y=0; y<board[x].length; y++)
			{
				board[x][y]='-';
			}
		}
	}
	public void imBear()
	{
		board[bear.x][bear.y]=bear.getShape();
	}
	public void imFish()
	{
		board[fish.x][fish.y]=fish.getShape();
	}
	public void showBoard()
	{
		imFish();
		imBear();
		
		for(int x=0; x<board.length; x++)
		{
			for(int y=0; y<board[x].length; y++)
			{
				System.out.print(board[x][y]);
			}
			System.out.println();
		}
	}
}

public class Game {
	
	public static void main(String[] args) 
	{
		runGame run= new runGame();
		
		run.run();

	}

}
