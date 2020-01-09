package k20191118;

import java.util.Vector;

public class VectorTest {

	public static void main(String[] args) {
		
		//Vector: jdk5.0 이전과 이후가 달라 : Generic 사용 여부
		Vector v= new Vector(5,3);
			//초기용량 5, 증가치 3
			//5개 저장공간을 만들고, 데이터가 꽉차면 3개씩 늘림
		System.out.println("v.capacity: "+v.capacity());
			//capacity(): 용량을 알려줘
		System.out.println("v.size: "+v.size());
			//size(): 몇개저장했는지 알려줘
		
		//public boolean add(Object o)  벡터에 자료 저장하기
		for(int i=0; i<10; i++)
		{
			v.add(new Integer(i));
			
		}
		System.out.println("v.capacity2: "+v.capacity());
		System.out.println("v.size2: "+v.size());
		
		v.add(new Double(3.14));
		v.add("Hello");
		v.add(100);		//int가 저장된 것이 아닌, Integer로 auto boxing되어 저장된다
		
		//벡터도 배열과 동일하게 인덱스로 관리된다
		
		//Object get(int index)
		//Object elementAt(int index)		//벡터의 데이터를 추출하기
		
//		Integer val1= v.get(3);
			//그냥 받으면 에러남  cannot convert from Object to Integer
			//Integer 형변환 해줘야함
		Integer val1= (Integer)(v.get(3));
		System.out.println(val1);
		
		Double val2= (Double)v.get(10);
		System.out.println(val2);
			//에러남 Double cannot be cast to java.lang.Integer
			//double로 해주면 잘돼요
		
		System.out.println("\n****jdk5.0이후로 달라진점****\n");
		Vector<String> v2= new Vector<String>();			//기본생성자 초기용량 10, 증가치 2배
		//String 유형만 저장하겠다는 의미: Generic
		
		for(int i=1; i<6; i++)
		{
			v2.add("Hello"+i);
		}
		
		System.out.println("v2 cap: "+v2.capacity());
		System.out.println("v2 size: "+v2.size());
		
		String str= v2.get(2);				//꺼내올때 형변환 필요없음

		//for루프 이용해서 v2 출력
		for(int i=0; i<5; i++)
		{
			System.out.println("v"+i+": "+v2.get(i));
		}
		for(String str2:v2)
		{
			System.out.println(str2);
		}
		
		System.out.println("\n*********************\n");
		
		//float 저장할 벡터 v3 생성하고 객체 3개이상 저장
		//for루프를 이용해 v3에 저장된 객체의 합과 평균도 구하세요
		
		Vector<Float> v3= new Vector<Float>();
			//float형 벡터가 아니라 Float 클래스형 벡터인듯?
		v3.add(new Float(1.2f));		//정석
		v3.add(3.66f);					// float==> Float autoboxing
		v3.add(new Float((float)(Math.random()*10+5)));
		float sum=0;
		
		//벡터요소값 보여주기 - for 안써도 한번에 나온다
		System.out.println(v3);
		
		//v3 합 구하기
		for(Float f:v3)
		{
			sum+=f;
		}
		
		//합과 평균 출력
		System.out.println("v3sum: "+sum);
		System.out.println("v3avg: "+sum/3);
		
	}

}
