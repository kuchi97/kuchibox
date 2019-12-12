package k01HumanMaker;


public class Human {
	
	String lastName;
	String malMidChar, malLastChar;
	String femMidChar, femLastChar;
	String job[]= {"작가","기레기","스파이","빈집털이","쉐프",
					"바텐더","프로게이머","벤처기업가","피아니스트","가수",
					"코미디언","마피아","점쟁이","화가","무용수",
					"장관","무용수","광대","four주","백수",
					"미장이","마법사","목사","부두술사","가사도우미",
					"하인","군인","과외선생님","묘지기","후궁"};
	
	String lastNameArr[]= {"김","이","박","최","정","강","조","윤","장","임"};

	String malMidCharArr[]= {"웅","쇠","돌","만","용",
							"육","칠","삼","","순",
							"구","삼","석","손","지",
							"원","대","필","수","성"};
	String malLastCharArr[]= {"식","구","삼","석","놈",
							"돌","민","복","원","만",
							"룡","득","국","훈","래",
							"정","수","우","의","진",
							"준","규","현","오","동"};
	String femMidCharArr[]= {"희","원","수","선","가",
							"지","영","민","경","채",
							"나","유","하","설","송",
							"세","다","예","나",""};
	String femLastCharArr[]= {"꽃","년","윤","숙","양",
							"희","은","경","선","미",
							"자","화","진","지","영",
							"옥","애","림","정","리"};
	int age[]= new int[40];
	int height[]= new int[45];
	
	
	
	public Human()
	{
		//나이 20~60
		//int age[]= new int[40];
		for(int i=0; i<age.length; i++)
		{
			age[i]=20+i;
		}
		
		//키 145-190
		//int height[]= new int[45];
		for(int i=0; i<height.length; i++)
		{
			height[i]=145+i;
		}
	}
	
	public String createMaleName()
	{
		String malName;
		
		//변수에 출력
		lastName= lastNameArr[(int)(Math.random()*9)];
		malMidChar= malMidCharArr[(int)(Math.random()*19)];
		malLastChar= malLastCharArr[(int)(Math.random()*19)];
		
		malName= lastName+malMidChar+malLastChar;
		return malName;
	}
	public String createFemaleName()
	{
		String femaleName;
		
		//변수에 출력
		lastName= lastNameArr[(int)(Math.random()*9)];
		femMidChar= femMidCharArr[(int)(Math.random()*19)];
		femLastChar= femLastCharArr[(int)(Math.random()*19)];
		
		femaleName= lastName+malMidChar+malLastChar;
		return femaleName;
	}
	public void getMale()
	{
		System.out.println("**** 인 물 정 보 ****");
		System.out.println("이름: "+createMaleName());
		System.out.println("성별: 남");
		System.out.println("나이: "+(age[(int)(Math.random()*39)]));
		System.out.println("키  : "+(height[(int)(Math.random()*44)]));
		System.out.println("직업: "+(job[(int)(Math.random()*29)]));
	}
	public void getFemale()
	{
		System.out.println("**** 인 물 정 보 ****");
		System.out.println("이름: "+createFemaleName());
		System.out.println("성별: 여");
		System.out.println("나이: "+(age[(int)(Math.random()*39)]));
		System.out.println("키  : "+(height[(int)(Math.random()*44)]));
		System.out.println("직업: "+(job[(int)(Math.random()*29)]));
	}
	
	public void makeHuman()
	{
		int gender= (int)(Math.random()*1);
		
		if(gender==0)
		{
			getMale();
		}
		else
			getFemale();
	}
}//--EO.Human
