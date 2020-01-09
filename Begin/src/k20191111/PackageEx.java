package k20191111;

/*
/////////////////////////////////////////////
14. 패키지(package)란?

 : 1)  클래스들+인터페이스들  의 집합
   2)  패키지를 사용하는 이유
		ㄱ) 관리의 용이성
		ㄴ) 배포의 목적
   3) 패키지는 유사한 기능을 가진 클래스와 인터페이스들
       을 묶어 관리하도록 하며,
	   개발이 끝난 후 jar파일로 묶어 배포한다.
  4) 패키지 구성
	------------------------------------
	package 패키지이름; //패키지 선언..최상단에 위치해야 함
	import java.util.*;
	class Test
	{
	}
	------------------------------------
	5) 예제 1의 구조
	    myjava/Begin/day17          //[ROOT]
								|
								+--mypack  : 패키지
								        +------AAA.java[AAA.class,
										|						BBB.class]
										+------CCC.java[CCC.class,
																DDD.class]
 컴파일 방법]
 day17> javac mypack\AAA.java
			 javac mypack\CCC.java
 
 실행방법]
 day17>java mypack.AAA

 6) 예제2의 구조 [import문을 익히기 위한 예제]

myjava\day17
				|
				+--pack: 패키지
						+--demo: 하위 패키지
						|		+---------MyDemo.java
						|
						+--My1.java
						+--My2.java
				|
				+---TestPack.java[루트에 존재]

7) 예제 3의 구조[접근지정자 관련 예제]
myjava\day17
			  |
			  +-mypack: 패키지
			  |		+--AAA.java[AAA,BBB클래스]
			  |		+--CCC.java[CCC,DDD클래스]
			  |
			  +-yourpack: 패키지
				     +---FFF.java
					 :위 예제는 yourpack이란 패키지에
					 있는 FFF 클래스에서 mypack의
					 AAA클래스와 BBB클래스의 객체를
					 생성해 접근하려 할 때의 예제.
					 AAA클래스의 접근지정자-->public
					 BBB 클래스의 접근지정자-->생략형

					 ...생략형 접근 지정자는 같은 패키지
					   일 경우에만 접근 가능하다.

**Access Modifier [접근지정자]의 접근 범위********
---------------------------------------------------------------
Modifiers|Same Class|Same Package|Sub Class| Universe
---------------------------------------------------------------
public     | yes		   | yes		       |yes	      | yes									   
---------------------------------------------------------------
protected| yes		   | yes		       | yes		  |
---------------------------------------------------------------
default	  | yes		   | yes		      |			      |
---------------------------------------------------------------
private	 | yes		       |			          |		        	|
-------------------------------  --------------------------------
**이들 접근 지정자중 protected, private 은 클래스 앞에
   못쓴다. 단 Inner 클래스 앞에는 가능.

8) 예제 4의 구조
myjava\day17
			  +---linux
			   |			+---java
			   |				+------Parent.java
			   |				+------Son1.java
               +---window 
							+--java
									+----Son2.java

컴파일 방법] -d 옵션을 주어 컴파일 하자.
					....실무에서 가장 많이 쓰는 방법

		day17>javac -d . Parent.java

9) 예제 5 [접근지정자와 오버라이딩]

2myjava\day17
				+----president
				|			+-------King.class 
				|
				+----prince
							+-------Prince.class
///////////////////////////////////////////
10) 패키지를 라이브러리로 만들어 배포하기
방법]
	1>jar라는 명령어를 사용하여 패키지를 jar파일로
	   묶는다.
	   day17>jar cvf mylinux.jar linux

    2> 압축된 jar파일을[mylinux.jar] 복사해
	     C:\Java\jdk1.6...\jre\lib\ext\
		 아래에 붙여넣기 하자.
    3> 1>,2>단계를 마쳤다면 어디에서든
		Son1.class파일을 사용할 수 있다.

	cf> jar 파일 압축을 해제할때는
		jar xvf 파일명.jar

	제어판-시스템-고급-환경변수 가서
	classpath 부분에
	jar 파일의 경로\myapp.jar 를 잡아주면 된다
///////////////////////////////////////////////
*/

public class PackageEx
{
	public static void main(String[] args)
	{

	}
}