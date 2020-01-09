package net.k20191210;

/*
현재 프로그램에 사용되는 스레드는 1개 이상일 수 있다
	이럴 때 프로그램의 끝점은 main()이 아닐수도 있음
	
	|------------------------------------------|
	프로세스시작							프로세스 끝
	|------------------------------------------|
	메인스레드 시작								끝
	|		|스레드 시작 ----->		|		   |
	메인스레드시작							   끝
	
	|------------------------------------------|------>|
	스레드시작								메인끝		스레드끝

*/

public class ThreadTest {

	public static void main(String[] args) {
		
		//현재 실행중인 스레드 개수 살펴보기
		int count= Thread.activeCount();
		System.out.println("현재 실행중인 스레드 수"+count);
		
		Thread tr= Thread.currentThread();
		System.out.println("현재 실행중인 스레드이름: "+tr.getName());
		tr.setName("Hi Thread");
		System.out.println("지금 이름은 : "+tr.getName());
		
	}
}
