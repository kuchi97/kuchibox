package k01HumanMaker;


public class Human {
	
	String lastName;
	String malMidChar, malLastChar;
	String femMidChar, femLastChar;
	String job[]= {"�۰�","�ⷹ��","������","��������","����",
					"���ٴ�","���ΰ��̸�","��ó�����","�ǾƴϽ�Ʈ","����",
					"�ڹ̵��","���Ǿ�","������","ȭ��","�����",
					"���","�����","����","four��","���",
					"������","������","���","�εμ���","���絵���",
					"����","����","���ܼ�����","������","�ı�"};
	
	String lastNameArr[]= {"��","��","��","��","��","��","��","��","��","��"};

	String malMidCharArr[]= {"��","��","��","��","��",
							"��","ĥ","��","","��",
							"��","��","��","��","��",
							"��","��","��","��","��"};
	String malLastCharArr[]= {"��","��","��","��","��",
							"��","��","��","��","��",
							"��","��","��","��","��",
							"��","��","��","��","��",
							"��","��","��","��","��"};
	String femMidCharArr[]= {"��","��","��","��","��",
							"��","��","��","��","ä",
							"��","��","��","��","��",
							"��","��","��","��",""};
	String femLastCharArr[]= {"��","��","��","��","��",
							"��","��","��","��","��",
							"��","ȭ","��","��","��",
							"��","��","��","��","��"};
	int age[]= new int[40];
	int height[]= new int[45];
	
	
	
	public Human()
	{
		//���� 20~60
		//int age[]= new int[40];
		for(int i=0; i<age.length; i++)
		{
			age[i]=20+i;
		}
		
		//Ű 145-190
		//int height[]= new int[45];
		for(int i=0; i<height.length; i++)
		{
			height[i]=145+i;
		}
	}
	
	public String createMaleName()
	{
		String malName;
		
		//������ ���
		lastName= lastNameArr[(int)(Math.random()*9)];
		malMidChar= malMidCharArr[(int)(Math.random()*19)];
		malLastChar= malLastCharArr[(int)(Math.random()*19)];
		
		malName= lastName+malMidChar+malLastChar;
		return malName;
	}
	public String createFemaleName()
	{
		String femaleName;
		
		//������ ���
		lastName= lastNameArr[(int)(Math.random()*9)];
		femMidChar= femMidCharArr[(int)(Math.random()*19)];
		femLastChar= femLastCharArr[(int)(Math.random()*19)];
		
		femaleName= lastName+malMidChar+malLastChar;
		return femaleName;
	}
	public void getMale()
	{
		System.out.println("**** �� �� �� �� ****");
		System.out.println("�̸�: "+createMaleName());
		System.out.println("����: ��");
		System.out.println("����: "+(age[(int)(Math.random()*39)]));
		System.out.println("Ű  : "+(height[(int)(Math.random()*44)]));
		System.out.println("����: "+(job[(int)(Math.random()*29)]));
	}
	public void getFemale()
	{
		System.out.println("**** �� �� �� �� ****");
		System.out.println("�̸�: "+createFemaleName());
		System.out.println("����: ��");
		System.out.println("����: "+(age[(int)(Math.random()*39)]));
		System.out.println("Ű  : "+(height[(int)(Math.random()*44)]));
		System.out.println("����: "+(job[(int)(Math.random()*29)]));
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
