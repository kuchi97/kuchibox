package K20191031;
/*
 * 기본자료형
 * 참조형    ------->  new 연산자로 초기화함
 * 	1. 클래스
 * 	2. 인터페이스
 * 	3. 배열
 */

public class ArrayTest {
	
	public static void main(String[] args) {
		/*
		 * 배열 :	동종의 데이터를 저장하는 자료구조
		 
				같은유형의 데이터만 저장할 수 있다
					1. 선언
					2. 메모리할당
					3. 초기화
		*/
		
		//1. 선언
		// stack에 저장됨
		int a[];
		int []b;
		
		//2. 메모리할당 :	new 연산자
		//참조유형은 반드시 메모리할당 하고 써야함
		//메모리할당하면 heap으로 가서 방배정
		a= new int[3];
		b= new int[5];
		System.out.println(a);
		System.out.println(b);
		System.out.println(a[0]);
		System.out.println(b[0]);
		//배열은 초기값을 저장하지 않으면 자료형의 디폴트값이 저장
		
		//3. 초기화
		a[0]= 10;
		a[1]= 20;
		a[2]= 30;
		
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		
		//배열의 속성:	length:	배열의 크기를 알 수 있다
		System.out.println("a.length: "+ a.length);
		System.out.println("b.length: "+ b.length);
		
		// 선언+메모리할당
		double []arr= new double[4];
		System.out.println(arr[0]);
		arr[0]= 123.456;
		arr[1]= 0x15;
		arr[2]= 300e-5;
		arr[3]= 'A';
		System.out.println(arr[0]+", "+arr[1]+", "+arr[2]+", "+arr[3]);
		
		//for이용하여 배열 arr에 저장된값을 한번에 출력
		for(int i=0; i<arr.length; i++)
			System.out.println(arr[i]);
		
		//1+2+3 올인원 패키지
		char[] ch= {'j','a','v','a'};
		System.out.println("ch.length: "+ch.length);
		for (int i = 0; i < ch.length; i++) {
			System.out.print(ch[i]);
			System.out.println(ch[i]);
		}
		
		//문1. float배열 선언 크기 3
		//		각각 -16.1 200.1 5e3값 주기
		//		그리고 값출력
		
		float[] ft= {-16.1f, 200.1f, 5e3f};
		for (int i = 0; i < ft.length; i++) {
			System.out.println(ft[i]);
		}

		
		
		
	}

}
