/*
Apache DBCP 설정

1.  다운로드받자. 아래 사이트에서...

http://archive.apache.org/dist/jakarta/commons/

jakarta-commons DBCP
jakarta-commons collections
jakarta-commons pool

위 6개의 jar파일을 다운로드 받아 클래스패스에 걸어준다.

ex]
변수명: classpath
값:
.;C:\Java\jdk1.6.0_03\jre\lib\ext\ojdbc14.jar;
C:\Java\jdk1.6.0_03\jre\lib\ext\servlet-api.jar;
C:\Java\jdk1.6.0_03\jre\lib\ext\jsp-api.jar;
C:\Java\jdk1.6.0_03\jre\lib\ext\cos.jar;
C:\Java\Tomcat 8.0\common\lib\commons-collections-3.2.jar;
C:\Java\Tomcat 8.0\common\lib\commons-collections-testframework-3.2.jar;
C:\Java\Tomcat 8.0\common\lib\commons-dbcp-1.2.2.jar;
C:\Java\Tomcat 8.0\common\lib\commons-pool-1.3.jar

2. 세팅

참조 url:
http://tomcat.apache.org/tomcat-8.5-doc/jndi-datasource-examples-howto.html

1) c:/Tomcat8.0/conf/server.xml의 (톰캣이 설치된 폴더)
<GlobalNamingResources>태그 사이에 다음과 같이 세팅

[주의: oracle.jdbc.driver.OracleDriver 확인]

<Resource name="myoracle/scott" auth="Container"
              type="javax.sql.DataSource" driverClassName="oracle.jdbc.driver.OracleDriver"
              url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
              username="scott" password="tiger" maxActive="20" maxIdle="10"
              maxWait="-1"/> 
<Resource name="myoracle/myshop" auth="Container"
              type="javax.sql.DataSource" driverClassName="oracle.jdbc.driver.OracleDriver"
              url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
              username="myshop" password="tiger" maxTotal="20" maxIdle="10"
              maxWaitMillis="-1"/>		//<-- 이건 myshop에서 쓸거

 

2)c:/Tomcat8.0/conf/context.xml의

<Context reloadable="true"> 태그 사이에 아래부분 세팅

<ResourceLink global="jdbc/myoracle" name="jdbc/myoracle"
type="oracle.jdbc.pool.OracleDataSource"/>

3) XX프로젝트(~Project)/WEB-INF/web.xml 의 
<web-app> 태그사이에 아래 부분 세팅
	<resource-ref> 
	<description>Oracle Datasource example</description> 
	<res-ref-name>jdbc/myoracle</res-ref-name> 
	<res-type>javax.sql.DataSource</res-type> 
	<res-auth>Container</res-auth> 
	</resource-ref> 
 </web-app>

4) Java Source 상에서 다음과 같이 참조

 
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();

////////////////////////////////////////////////////////////////////////


Java 프로그램에서 DB 접속하는 방법은 
크게 2가지로 볼수 있습니다.
[1] JDBC를 사용하는 방법
-  우리는 ConnectionPoolBean을 만들어 사용
[2] WAS서버에서 제공해주는 Connection Pool을 
사용하는 방법


1) JDBC를 사용하는 방법 : 
   오라클(각 다른 DB)에서 제공하는 
   DB 커넥션 클래스를 이용해서  
   DB에 접속하는 방법입니다.
   사용자가 직접 소스에 아이디와 비밀번호 IP등을 
   입력하여 커넥션 객체를 생성하고
   그것(커넥션객체)을 이용하여 DB를 제어합니다.

2) WAS가 제공하는 Connection Pool 을 사용하는 방법 : 
    사용자(프로그래머)가 소스에서 
	직접 DB에 연결하는 것이 아니라. 연결은 
	WAS(Weblogic나 제우스, 톰켓등을 말합니다)가 하고 
	사용자는 WAS가 연결한 
	커넥션을 이용하는 방법입니다.

	즉, WAS가 스타트 하면서 동시에 오라클에 
	커넥션 객체를 미리 생성합니다.
	프로그래머는 그 객체를 그냥 가져다 쓴다.
.
	DataSource를 이용한 방법이 바로 
	커넥션 풀 방법입니다.
	당연히 아이디와 비밀번호는 필요없죠 
	그런건 WAS가 다 알아서 접속합니다.
	그리기 위해서는 당연히 WAS의 설정파일에 
	DB연결 정보가 있어야 합니다.
	톰켓의 경우 톰켓/conf/server.xml  
	파일에 설정을 하시면 됩니다.

     cf>

	WAS가 만들어놓은 커낵션은 각각 커넥션 마다 
	이름이 있습니다.
	위 2개의 소스를 보시면
	GlobalVariable.DATA_SOURCE 
	= (DataSource) envCtx.lookup("jdbc/ora9");
	DATA_SOURCE = (DataSource) ctx.lookup("DS");
	라는 부분이 각각 있습니다.
	바로 이부분이 WAS에 등록된 커넥션 
	이름(정확히 말하면 커넥션과 매칭되는 이름)을 갖고 
	커넥션을 찾는 부분입니다.
	친절하게도 메소드 이름이 lookup 입니다. 
	뭔가 찾는다는 말이죠 
	여기서 그 이름은 jdbc/ora9, DS 가 됩니다. 
	정확히 말하면 이 이름들은 JNDI라고 합니다.
	공부하다 보면 알게 됩니다.

그리고 위 두 소스의 가장큰 차이점은

Context envCtx 
= (Context) initCtx.lookup("java:comp/env");
GlobalVariable.DATA_SOURCE 
= (DataSource) envCtx.lookup("jdbc/ora9");

props.put(Context.INITIAL_CONTEXT_FACTORY,"jeus.jndi.JEUSContextFactory");
props.put(Context.PROVIDER_URL,"127.0.0.1");

대충 이부분 정도인데 사실  차이가 아닙니다.

각기 WAS가 다르기 때문에 WAS마다 커넥션을 가져오는 방법이 다른겁니다.
위에 것은 톰켓에서 쓰는 방법이고 아래꺼는 제우스라는 국산 WAS 입니다.

///////////////////////////////////////////
질문을 통해서 보면 로그인을 할때 
DB를 사용하고 있습니다.
따라서 DB에 접근을 해서 DB상에 
아이디와패스워드를 체크하고, 
아이디정보를 가져오기 위한

Database Connection을 확보해야하는데요,

이 getConnection()이란 메소드가 바로 
그 역할을 하는것입니다.
Connection을 확보하는 방법은 
크게 두가지로 나누어집니다만,

여기서는 그중 WAS(Web Application Server, 
즉 Tomcat 같은..)에 설정되어 있는 
Datasource라는것을 통해서 가져오는 방법입니다.

 //

private Connection getConnection() throws Exception{
  Context initCtx=new InitialContext();   
  // WAS의 Datasource를 이용하기 위해 필요한 Context 객체를 생성합니다.
  Context envCtx=(Context)initCtx.lookup("java:comp/env"); 
  // WAS의 리소스중 JDNI라는 리소스 참조 방식을 사용해 "java:/comp/env" 카테고리 정보 
  //Context를 가져옵니다.
  DataSource ds=(DataSource)envCtx.lookup("jdbc/myoracle"); 
  // "java:/comp/env" 의 하위 Context중에 "jdbc/myoracle" 라는 항목의 리소스를 가져오면서 
  //해당 리소스가 DataSource 클래스란걸 알고 있기때문에 (DataSource) 로 캐스팅을 해서 
  //DataSource 객체 ds를 얻습니다.
  return ds.getConnection(); 
  // DataSource 객체 ds의 getConnection() 메소드를 통해 java.sql.Connection 객체를 얻어 반환합니다.
 }

 

이 소스는 이렇게도 가능. 즉 한다리 안걸치고 바로 JNDI 풀 PATH를 줘서 가져올수 있습니다.

private Connection getConnection() throws Exception{
  Context initCtx=new InitialContext();
  DataSource ds=(DataSource)envCtx.lookup("java:comp/env/jdbc/myoracle");
  return ds.getConnection();
 } 

다만 이렇게 DataSource를 사용하기 위해선 
WAS에 DataSource가 
저런 카테고리로 등록이 되어있어야합니다.
WAS에 따라서 DataSource를 등록하는법은 다르기때문에 
자세한 DataSource 등록법은 WAS별 메뉴얼을 참고.

////////////////////////////////////////////////////

cf] 
1. Naming Service란? <참고: 알기쉽게 풀어쓴 
웹로직과 EJB>

[1] 대표적인 예로 도메인명을 ip로 바꿔주는 서비스
     즉, 211.123.111.11 등의 ip를 www.a.co.kr 등의
	 이름을 이용해 접근
	 이것은 운영체제에 등록된 네임 서버를 이용해
	 해당 도메인이 어떤 아이피인지 알아낼 수 있기 때문에
	 가능.
	 이 떄 서버의 아이피가 변경되도 클라이언트는 동일한
	 이름으로 접근할 수 있는 장점이 있다.

[2] 이렇게 도메인 네임 서비스와 같이 분산된 객체를 찾기
     위해 자바 진영에서는 자바 표준 네이밍 서비스를 JNDI
	 로 정의하였다. 
	 JNDI는 특정한 이름으로 객체를 등록해서 관리할 수 있게 
	 도와준다.

2. JNDI란?  <Head First EJB 참고 : 116,602 p>

[1] Java Naming and Directory Interface의 약자
[2] 명명 및 디렉토리 서비스에 접근하기 위한 API
[3] 많은 기능이 있지만 우리는 등록(bind, rebind)하고,
     찾아쓰는(lookup) 방법만 알면 된다.
[4] 서버에 JNDI Driver(service provider라고 부름)
	 만 있으면 명명/디렉토리 서비스를 이용할 수 있다.
	 jndi 드라이버는 우리가 호출한 이름을 Naming 서비스에
	 서 이해할 수 있는 것으로 바꿔주는 역할을 한다.
[5] JNDI트리를 들어갈 때는 우선 InitialContext 에서 시작함
     ...javax.naming패키지에 있음-->1.4부터 j2se에 포함되었음
[6] InitialContext에서 시작하지만 빈에는 자기만의 JNDI컨텍스트가
     있다. 바로 이 빈에서 찾고자 하는 검색작업은 java:comp/env라는
	  서브 컨텍스트에서 시작된다.
*/