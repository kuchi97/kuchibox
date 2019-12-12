package k02BlueMarble;

public class Cities {

	String cityName;
	String cityNameArr[]= {"출발","베이징","마닐라","제주도","싱가폴",
					"파리","로마","런던","뉴욕","서울"};
	Cities arr[]= new Cities[10];
	
	
	boolean house,building,hotel;
	
	int landPrice, housePrice, buildingPrice, hotelPrice;
	int landFee, houseFee, buildingFee, hotelFee;
	
	//constructor
	public Cities()
	{
		this("도시명",0,0,0,0,0,0,0,0);
	
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
	
//도시정보를 등록해
//arr배열에 저장
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
	//도시초기화
	public void regCity()
	{
		for(int i=0; i<city.length; i++)
		{
			cityName=city[i];
			if(i>0 && i<4)			//싼땅
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
			else if(i>=4 && i<7)	//중간땅
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
			else					//고오급땅
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
		System.out.println("도시명: "+cityName);
		System.out.println("==== 구입비용 ====");
		System.out.println("대지: "+landPrice);
		System.out.println("별장: "+housePrice);
		System.out.println("빌딩: "+buildingPrice);
		System.out.println("호텔: "+hotelPrice);
		System.out.println("==== 방문비용 ====");
		System.out.println("대지: "+landFee);
		System.out.println("별장: "+houseFee);
		System.out.println("빌딩: "+buildingFee);
		System.out.println("호텔: "+hotelFee);
		
	}
	
}
