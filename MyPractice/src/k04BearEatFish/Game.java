package k04BearEatFish;
//10x20 �����ǿ��� ���� ������ ��Ģ�� ���� �����δ�
//	bear�� ����� Ű�� ���� a s d f �� �����̰�
//	fish�� 5���� 2ȸ�� ������ġ�� �̵��ϰ� 3ȸ�� ���ڸ��� �ִ´�

//move()�� �� ��ü�� �̵��� �����Ѵ�
//getShape()�� �� ��ü�� ����� �����Ѵ�

//GameObject�� ��ӹ޾� .bear�� .fish �ۼ��Ѵ�

//Ű�� �Էµɶ����� bear�� fish ��ü�� move()�� ������� ȣ��ȴ�

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
	int x, y;		//��������ǥ
	char board[][]= new char[10][20];		//������
	
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
		System.out.println("�̵��� ������ �Է��Ͻÿ�");
		System.out.print("��(w),����(a),�Ʒ�(s),������(d): ");

		if(bear.collide(fish)==true)
		{
			System.out.println("���ֳ�?");
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
