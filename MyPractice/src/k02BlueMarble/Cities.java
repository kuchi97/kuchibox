package k02BlueMarble;

public class Cities {

	String cityName;
	String cityNameArr[]= {"���","����¡","���Ҷ�","���ֵ�","�̰���",
					"�ĸ�","�θ�","����","����","����"};
	Cities arr[]= new Cities[10];
	
	
	boolean house,building,hotel;
	
	int landPrice, housePrice, buildingPrice, hotelPrice;
	int landFee, houseFee, buildingFee, hotelFee;
	
	//constructor
	public Cities()
	{
		this("���ø�",0,0,0,0,0,0,0,0);
	
	}
	public Cities(String cityName, int landPrice, int housePrice, int buildingPrice, int hotelPrice,
				int landFee, int houseFee, int buildingFee, int hotelFee)
	{
		this.cityName=cityName;
		this.landPrice=landPrice;
		this.housePrice=housePrice;
		this.buildingPrice=buildingPrice;
		this.hotelPrice=hotelPrice;
		this.landFee= landFee;
		this.houseFee=houseFee;
		this.buildingFee=buildingFee;
		this.hotelFee=hotelFee;
	}
	
//���������� �����
//arr�迭�� ����
	public void regCity()
	{
		for (int i = 0; i < arr.length; i++) {
			
			if(i>=0 && i<4)
			{
				landPrice=500;
				housePrice=500;
				buildingPrice=1500;
				hotelPrice=2500;
				landFee=(int)(landPrice*(0.1*((i+1)*0.3)));
				houseFee=(int)(housePrice*(0.3*((i+1)*0.3)));
				buildingFee=(int)(buildingPrice*(0.7*((i+1)*0.3)));
				hotelFee=(int)(hotelPrice*(1.2*((i+1)*0.3)));
				
				Cities city= new Cities(cityNameArr[i],landPrice,housePrice,buildingPrice,hotelPrice,
						landFee,houseFee,buildingFee,hotelFee);
				arr[i]= city;
			}
			else if(i>=4 && i<7)
			{
				landPrice=1500;
				housePrice=1000;
				buildingPrice=3000;
				hotelPrice=5000;
				landFee=(int)(landPrice*(0.2*((i+1)*0.3)));
				houseFee=(int)(housePrice*(0.5*((i+1)*0.3)));
				buildingFee=(int)(buildingPrice*(1.2*((i+1)*0.3)));
				hotelFee=(int)(hotelPrice*(1.7*((i+1)*0.3)));
				Cities city= new Cities(cityNameArr[i],landPrice,housePrice,buildingPrice,hotelPrice,
						landFee,houseFee,buildingFee,hotelFee);
				arr[i]= city;
			}
			else
			{
				landPrice=2500;
				housePrice=1500;
				buildingPrice=4500;
				hotelPrice=7500;
				landFee=(int)(landPrice*(0.2*((i+1)*0.3)));
				houseFee=(int)(housePrice*(0.7*((i+1)*0.3)));
				buildingFee=(int)(buildingPrice*(1.5*((i+1)*0.3)));
				hotelFee=(int)(hotelPrice*(2.0*((i+1)*0.3)));
				Cities city= new Cities(cityNameArr[i],landPrice,housePrice,buildingPrice,hotelPrice,
						landFee,houseFee,buildingFee,hotelFee);
				arr[i]= city;
			}
		}
	}
	

/*
	//�����ʱ�ȭ
	public void regCity()
	{
		for(int i=0; i<city.length; i++)
		{
			cityName=city[i];
			if(i>0 && i<4)			//�Ѷ�
			{
				landPrice=500;
				housePrice=500;
				buildingPrice=1500;
				hotelPrice=2500;
				
				landFee=(int)(landPrice*0.1);
				houseFee=(int)(housePrice*0.3);
				buildingFee=(int)(buildingPrice*0.7);
				hotelFee=(int)(hotelPrice*1.2);
			}
			else if(i>=4 && i<7)	//�߰���
			{
				landPrice=1500;
				housePrice=1000;
				buildingPrice=3000;
				hotelPrice=5000;
				
				landFee=(int)(landPrice*0.2);
				houseFee=(int)(housePrice*0.5);
				buildingFee=(int)(buildingPrice*1.2);
				hotelFee=(int)(hotelPrice*1.7);
			}
			else					//����޶�
			{
				landPrice=2500;
				housePrice=1500;
				buildingPrice=4500;
				hotelPrice=7500;
				
				landFee=(int)(landPrice*0.2);
				houseFee=(int)(housePrice*0.7);
				buildingFee=(int)(buildingPrice*1.5);
				hotelFee=(int)(hotelPrice*2);
			}
		}
	}//--EOregCity
*/
	public void cityInfo()
	{
		System.out.println("���ø�: "+cityName);
		System.out.println("==== ���Ժ�� ====");
		System.out.println("����: "+landPrice);
		System.out.println("����: "+housePrice);
		System.out.println("����: "+buildingPrice);
		System.out.println("ȣ��: "+hotelPrice);
		System.out.println("==== �湮��� ====");
		System.out.println("����: "+landFee);
		System.out.println("����: "+houseFee);
		System.out.println("����: "+buildingFee);
		System.out.println("ȣ��: "+hotelFee);
		
	}
	
}
