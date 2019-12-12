package exchap4no8;

import java.util.Scanner;

public class PhoneBook {
	
	Scanner sc= new Scanner(System.in);
	
	//이름과 번호입력받기
	public void regPhone()
	{
		int input;
		String search;
		
		System.out.print("입력할 사람수: ");
		input= sc.nextInt();
		
		Phone phArr[]= new Phone[input];
		for(int i=0; i<input; i++)
		{
			Phone ph= new Phone();
			
			System.out.println("이름과 전화번호 입력");
			System.out.println("이름과 전화번호는 빈칸없이 입력(ex>홍길동 xxx-xxxx)");
			
			ph.name= sc.next();
			ph.tel= sc.next();
			
			phArr[i]= ph;
			
			
		}
		
		String tmp="";
		boolean tf=false;

		while(true)
		{
			System.out.print("검색할 이름: ");
			search= sc.next();
			
			for (int i=0; i < phArr.length; i++) {
				
				if(search.equals(phArr[i].name))
				{
					tmp=phArr[i].tel;
					tf=true;
					break;
				}
				else if(search.contentEquals("그만"))
				{
					System.out.println("시스템종료");
					return;
				}
				else
				{
					tmp="그런사람 없어요";
				}
				
			}
			
			if(tf=true)
			{
				System.out.println(tmp);
				tf=false;
			}
			else if(tf=false)
				System.out.println(tmp);
			
//			if(search.equals("그만"))
//			{
//				System.out.println("시스템종료");
//				return;
//			}
//			else
//				continue;
			
		}
/*		
		//배열저장검사
		for (int i = 0; i < phArr.length; i++) {
			phArr[i].showInfo();
		}
*/		
		
		
	}//--EOregPhone();

	public static void main(String[] args) {
		
		PhoneBook ph= new PhoneBook();
		
		ph.regPhone();
		

	}

}
