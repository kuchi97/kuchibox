package k03AttributeMaple;

public class AttDispenser {
	int tmpSave[] = new int[4]; // 저장용
	int att[] = { 4, 4, 4, 4 }; // 초기능력치

	public void run() {

		int total = 12; // 총 나눠줄거
		
		int dice = 6;

		for (int i = 0; i < tmpSave.length; i++) {

			if (dice <= total) 
			{
				dice = (int) (Math.random() * 6 + 1);
				total -= dice;
				tmpSave[i] = dice;
				for (int j = 0; j < i; j++) {

					if (tmpSave[i] == tmpSave[j])
						i--;
				}
				System.out.println(dice);
			} 
			else if (dice > total) 
			{
				dice = (int) (Math.random() * total + 1);
				total -= dice;
				tmpSave[i] = dice;
				for (int j = 0; j < i; j++) 
				{
					if (tmpSave[i] == tmpSave[j])
						i--;
				}

				if (dice == 0)
					break;

				System.out.println(dice);
			}

		}
		for(int i=0; i<4; i++)
		{
			att[i]+=tmpSave[i];
		}
		System.out.println("\n*********************\n");
	}
}
