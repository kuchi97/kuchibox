package k02BlueMarble;

import java.util.Scanner;

public class Board {
	
	int posess= 0;				//�����ڸ� ��Ÿ�� �⺻0
	int dice1, dice2;			//1d6
	
	int asset=50000;			//�÷��̾� ������ ���߿� �����ʸ��鶧 �Űܾ���
	int cityNum= 0;	//�� ��ȣ
	
	boolean house=false,building=false,hotel=false;		//�ǹ����࿩��
	boolean playerChoice=false;								//���������� �÷��̾��� ���
	
	Scanner sc= new Scanner(System.in);
	Cities city= new Cities();							//Cities class ��ü����
	
	public void regPlayer()
	{
		int playerNum;
		
		System.out.print("�����: ");
		playerNum= sc.nextInt();
		
		PlayerProfile players[]= new PlayerProfile[playerNum];
		
		for (int i = 0; i < playerNum; i++) {
			
			PlayerProfile player= new PlayerProfile();
			player.makeHuman();
			players[i]= player;						//players�迭�� �� player����
		}
		
		int turn=1;
		int input;									//�÷��̾� ������
		while(true)
		{
			if(turn==1)								//1ȣ ����
			{
				dice1= (int)(Math.random()*6+1);
				
				city.arr[cityNum].cityInfo();
				
				System.out.print("�罯?(1.���� 2.�ǳʶٱ�): ");			//���ſ���
				input= sc.nextInt();
				if(input==1)
				{
					if(posess==0)					//������ ������
					{
						posess=turn;
						asset-=city.arr[cityNum].landPrice;
					}
					else if(posess==1)				//�ڱ� ���϶�
					{
						System.out.print("�ǹ�����(1.���� 2.���� 3.���): ");
						input=sc.nextInt();
						switch(input)
						{
							case 1:
								house=true;
								asset-=city.arr[cityNum].housePrice;
								break;
							case 2:
								building=true;
								asset-=city.arr[cityNum].buildingPrice;
								break;
						}
						
					}
					else							//�ٸ�������϶�
					{
						
					}
					turn++;							//�ϳѰ�
				}
				else if(input==2)					//2ȣ����
				{
					turn++;							//�ϳѰ�
				}
				
			}
			
		}
	}
	
	

}
