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
			System.out.print((i+1)+"일차 ");
			dayArr[i].show();
		}
		
		System.out.println("이번달 스케줄관리");
		
		while(true)
		{
			
			System.out.print("할일(1.입력 2.보기 3.종료): ");
			int input= sc.nextInt();
			
			if(input==1)
			{
				day= new Day();
				//객체생성
				System.out.print("할일: ");
				toDo= sc.next();
				day.setWork(toDo);
				dayArr[count]= day;
				dayArr[count].show();
				count++;
				System.out.println(count+"개 입력완료");
			}
			else if(input==2)
			{
				for(int i=0; i<dayArr.length; i++)
				{
					System.out.print((i+1)+"일차 ");
					dayArr[i].show();
				}
			}
			else if(input==3)
			{
				System.out.println("프로그램을 종료합니다");
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
//					System.out.print("할일: ");
//					String toDo= sc.next();
//					day.setWork(toDo);
//					dayArr[count]= day;
//					dayArr[count].show();
//					count++;
//					System.out.println(count+"개 입력완료");
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
//					System.out.println("프로그램을 종료합니다");
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
