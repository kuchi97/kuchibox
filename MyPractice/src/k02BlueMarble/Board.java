package k02BlueMarble;

import java.util.Scanner;

public class Board {
	
	int posess= 0;				//점유자를 나타냄 기본0
	int dice1, dice2;			//1d6
	
	int asset=50000;			//플레이어 소지금 나중에 프로필만들때 옮겨야함
	int cityNum= 0;	//땅 번호
	
	boolean house=false,building=false,hotel=false;		//건물건축여부
	boolean playerChoice=false;								//질문에대한 플레이어의 대답
	
	Scanner sc= new Scanner(System.in);
	Cities city= new Cities();							//Cities class 객체생성
	
	public void regPlayer()
	{
		int playerNum;
		
		System.out.print("몇명등록: ");
		playerNum= sc.nextInt();
		
		PlayerProfile players[]= new PlayerProfile[playerNum];
		
		for (int i = 0; i < playerNum; i++) {
			
			PlayerProfile player= new PlayerProfile();
			player.makeHuman();
			players[i]= player;						//players배열에 각 player저장
		}
		
		int turn=1;
		int input;									//플레이어 선택지
		while(true)
		{
			if(turn==1)								//1호 차례
			{
				dice1= (int)(Math.random()*6+1);
				
				city.arr[cityNum].cityInfo();
				
				System.out.print("사쉴?(1.구매 2.건너뛰기): ");			//구매여부
				input= sc.nextInt();
				if(input==1)
				{
					if(posess==0)					//소유가 없을때
					{
						posess=turn;
						asset-=city.arr[cityNum].landPrice;
					}
					else if(posess==1)				//자기 땅일때
					{
						System.out.print("건물지어(1.별장 2.빌딩 3.취소): ");
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
					else							//다른사람땅일때
					{
						
					}
					turn++;							//턴넘겨
				}
				else if(input==2)					//2호차례
				{
					turn++;							//턴넘겨
				}
				
			}
			
		}
	}
	
	

}
