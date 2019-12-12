package k01HumanMaker;


public class ExtendsHuman extends Human{

	
	
	//override
	@Override
	public String createMaleName()
	{
		String lastLastChar;
		lastLastChar=malLastCharArr[(int)(Math.random()*19)];
		return super.createMaleName()+(lastLastChar);
	}
	
	
	public static void main(String[] args) {
		Human hm= new Human();
		
		System.out.println(hm.createMaleName());

	}

}
