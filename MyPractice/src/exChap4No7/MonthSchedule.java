package exChap4No7;

import java.util.Scanner;

public class MonthSchedule {
	
	Scanner sc= new Scanner(System.in);
	
	Day dayArr[]= new Day[30];
	Day day=new Day();
	int count=0;
	
	public void run()
	{
		String toDo;

		for(int i=0; i<dayArr.length; i++)
		{
			day.setWork(null);
			dayArr[i]=day;
			System.out.print((i+1)+"���� ");
			dayArr[i].show();
		}
		
		System.out.println("�̹��� �����ٰ���");
		
		while(true)
		{
			
			System.out.print("����(1.�Է� 2.���� 3.����): ");
			int input= sc.nextInt();
			
			if(input==1)
			{
				day= new Day();
				//��ü����
				System.out.print("����: ");
				toDo= sc.next();
				day.setWork(toDo);
				dayArr[count]= day;
				dayArr[count].show();
				count++;
				System.out.println(count+"�� �Է¿Ϸ�");
			}
			else if(input==2)
			{
				for(int i=0; i<dayArr.length; i++)
				{
					System.out.print((i+1)+"���� ");
					dayArr[i].show();
				}
			}
			else if(input==3)
			{
				System.out.println("���α׷��� �����մϴ�");
				return;
			}
			else
			{
				System.out.println("invalid input");
				continue;
			}
			
//			switch(input)
//			{
//				case 1:
//					System.out.print("����: ");
//					String toDo= sc.next();
//					day.setWork(toDo);
//					dayArr[count]= day;
//					dayArr[count].show();
//					count++;
//					System.out.println(count+"�� �Է¿Ϸ�");
//					break;
//					
//				case 2:
//					for(int i=0; i<30; i++)
//					{
//						dayArr[i].show();
//					}
//					break;
//					
//				case 3:
//					System.out.println("���α׷��� �����մϴ�");
//					return;
//					
//				default:
//			}
		}
	}
	
	public static void main(String[] args)
	{
		MonthSchedule ms= new MonthSchedule();
		ms.run();
	}
}
