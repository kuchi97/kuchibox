package k03AttributeMaple;

public class AttDispensor2 {
	int att[]= {4,4,4,4};
	
	public void run()
	{
		int total=12;
		
		for(int i=0; i<12; i++)
		{
			att[(int)(Math.random()*4)]++;
			total--;
		}
		
		if(total==0)
		{
			System.out.println("str: "+(att[0]-4));
			System.out.println("dex: "+(att[1]-4));
			System.out.println("int: "+(att[2]-4));
			System.out.println("luk: "+(att[3]-4));
			System.out.println("\n*********************\n");
		}
	}

}
