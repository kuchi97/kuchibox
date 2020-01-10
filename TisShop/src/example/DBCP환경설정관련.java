/*
Apache DBCP ����

1.  �ٿ�ε����. �Ʒ� ����Ʈ����...

http://archive.apache.org/dist/jakarta/commons/

jakarta-commons DBCP
jakarta-commons collections
jakarta-commons pool

�� 6���� jar������ �ٿ�ε� �޾� Ŭ�����н��� �ɾ��ش�.

ex]
������: classpath
��:
.;C:\Java\jdk1.6.0_03\jre\lib\ext\ojdbc14.jar;
C:\Java\jdk1.6.0_03\jre\lib\ext\servlet-api.jar;
C:\Java\jdk1.6.0_03\jre\lib\ext\jsp-api.jar;
C:\Java\jdk1.6.0_03\jre\lib\ext\cos.jar;
C:\Java\Tomcat 8.0\common\lib\commons-collections-3.2.jar;
C:\Java\Tomcat 8.0\common\lib\commons-collections-testframework-3.2.jar;
C:\Java\Tomcat 8.0\common\lib\commons-dbcp-1.2.2.jar;
C:\Java\Tomcat 8.0\common\lib\commons-pool-1.3.jar

2. ����

���� url:
http://tomcat.apache.org/tomcat-8.5-doc/jndi-datasource-examples-howto.html

1) c:/Tomcat8.0/conf/server.xml�� (��Ĺ�� ��ġ�� ����)
<GlobalNamingResources>�±� ���̿� ������ ���� ����

[����: oracle.jdbc.driver.OracleDriver Ȯ��]

<Resource name="myoracle/scott" auth="Container"
              type="javax.sql.DataSource" driverClassName="oracle.jdbc.driver.OracleDriver"
              url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
              username="scott" password="tiger" maxActive="20" maxIdle="10"
              maxWait="-1"/> 
<Resource name="myoracle/myshop" auth="Container"
              type="javax.sql.DataSource" driverClassName="oracle.jdbc.driver.OracleDriver"
              url="jdbc:oracle:thin:@127.0.0.1:1521:xe"
              username="myshop" password="tiger" maxTotal="20" maxIdle="10"
              maxWaitMillis="-1"/>		//<-- �̰� myshop���� ����

 

2)c:/Tomcat8.0/conf/context.xml��

<Context reloadable="true"> �±� ���̿� �Ʒ��κ� ����

<ResourceLink global="jdbc/myoracle" name="jdbc/myoracle"
type="oracle.jdbc.pool.OracleDataSource"/>

3) XX������Ʈ(~Project)/WEB-INF/web.xml �� 
<web-app> �±׻��̿� �Ʒ� �κ� ����
	<resource-ref> 
	<description>Oracle Datasource example</description> 
	<res-ref-name>jdbc/myoracle</res-ref-name> 
	<res-type>javax.sql.DataSource</res-type> 
	<res-auth>Container</res-auth> 
	</resource-ref> 
 </web-app>

4) Java Source �󿡼� ������ ���� ����

 
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds = (DataSource)envContext.lookup("jdbc/myoracle");
Connection conn = ds.getConnection();

////////////////////////////////////////////////////////////////////////


Java ���α׷����� DB �����ϴ� ����� 
ũ�� 2������ ���� �ֽ��ϴ�.
[1] JDBC�� ����ϴ� ���
-  �츮�� ConnectionPoolBean�� ����� ���
[2] WAS�������� �������ִ� Connection Pool�� 
����ϴ� ���


1) JDBC�� ����ϴ� ��� : 
   ����Ŭ(�� �ٸ� DB)���� �����ϴ� 
   DB Ŀ�ؼ� Ŭ������ �̿��ؼ�  
   DB�� �����ϴ� ����Դϴ�.
   ����ڰ� ���� �ҽ��� ���̵�� ��й�ȣ IP���� 
   �Է��Ͽ� Ŀ�ؼ� ��ü�� �����ϰ�
   �װ�(Ŀ�ؼǰ�ü)�� �̿��Ͽ� DB�� �����մϴ�.

2) WAS�� �����ϴ� Connection Pool �� ����ϴ� ��� : 
    �����(���α׷���)�� �ҽ����� 
	���� DB�� �����ϴ� ���� �ƴ϶�. ������ 
	WAS(Weblogic�� ���콺, ���ϵ��� ���մϴ�)�� �ϰ� 
	����ڴ� WAS�� ������ 
	Ŀ�ؼ��� �̿��ϴ� ����Դϴ�.

	��, WAS�� ��ŸƮ �ϸ鼭 ���ÿ� ����Ŭ�� 
	Ŀ�ؼ� ��ü�� �̸� �����մϴ�.
	���α׷��Ӵ� �� ��ü�� �׳� ������ ����.
.
	DataSource�� �̿��� ����� �ٷ� 
	Ŀ�ؼ� Ǯ ����Դϴ�.
	�翬�� ���̵�� ��й�ȣ�� �ʿ���� 
	�׷��� WAS�� �� �˾Ƽ� �����մϴ�.
	�׸��� ���ؼ��� �翬�� WAS�� �������Ͽ� 
	DB���� ������ �־�� �մϴ�.
	������ ��� ����/conf/server.xml  
	���Ͽ� ������ �Ͻø� �˴ϴ�.

     cf>

	WAS�� �������� Ŀ������ ���� Ŀ�ؼ� ���� 
	�̸��� �ֽ��ϴ�.
	�� 2���� �ҽ��� ���ø�
	GlobalVariable.DATA_SOURCE 
	= (DataSource) envCtx.lookup("jdbc/ora9");
	DATA_SOURCE = (DataSource) ctx.lookup("DS");
	��� �κ��� ���� �ֽ��ϴ�.
	�ٷ� �̺κ��� WAS�� ��ϵ� Ŀ�ؼ� 
	�̸�(��Ȯ�� ���ϸ� Ŀ�ؼǰ� ��Ī�Ǵ� �̸�)�� ���� 
	Ŀ�ؼ��� ã�� �κ��Դϴ�.
	ģ���ϰԵ� �޼ҵ� �̸��� lookup �Դϴ�. 
	���� ã�´ٴ� ������ 
	���⼭ �� �̸��� jdbc/ora9, DS �� �˴ϴ�. 
	��Ȯ�� ���ϸ� �� �̸����� JNDI��� �մϴ�.
	�����ϴ� ���� �˰� �˴ϴ�.

�׸��� �� �� �ҽ��� ����ū ��������

Context envCtx 
= (Context) initCtx.lookup("java:comp/env");
GlobalVariable.DATA_SOURCE 
= (DataSource) envCtx.lookup("jdbc/ora9");

props.put(Context.INITIAL_CONTEXT_FACTORY,"jeus.jndi.JEUSContextFactory");
props.put(Context.PROVIDER_URL,"127.0.0.1");

���� �̺κ� �����ε� ���  ���̰� �ƴմϴ�.

���� WAS�� �ٸ��� ������ WAS���� Ŀ�ؼ��� �������� ����� �ٸ��̴ϴ�.
���� ���� ���Ͽ��� ���� ����̰� �Ʒ����� ���콺��� ���� WAS �Դϴ�.

///////////////////////////////////////////
������ ���ؼ� ���� �α����� �Ҷ� 
DB�� ����ϰ� �ֽ��ϴ�.
���� DB�� ������ �ؼ� DB�� 
���̵���н����带 üũ�ϰ�, 
���̵������� �������� ����

Database Connection�� Ȯ���ؾ��ϴµ���,

�� getConnection()�̶� �޼ҵ尡 �ٷ� 
�� ������ �ϴ°��Դϴ�.
Connection�� Ȯ���ϴ� ����� 
ũ�� �ΰ����� ���������ϴٸ�,

���⼭�� ���� WAS(Web Application Server, 
�� Tomcat ����..)�� �����Ǿ� �ִ� 
Datasource��°��� ���ؼ� �������� ����Դϴ�.

 //

private Connection getConnection() throws Exception{
  Context initCtx=new InitialContext();   
  // WAS�� Datasource�� �̿��ϱ� ���� �ʿ��� Context ��ü�� �����մϴ�.
  Context envCtx=(Context)initCtx.lookup("java:comp/env"); 
  // WAS�� ���ҽ��� JDNI��� ���ҽ� ���� ����� ����� "java:/comp/env" ī�װ� ���� 
  //Context�� �����ɴϴ�.
  DataSource ds=(DataSource)envCtx.lookup("jdbc/myoracle"); 
  // "java:/comp/env" �� ���� Context�߿� "jdbc/myoracle" ��� �׸��� ���ҽ��� �������鼭 
  //�ش� ���ҽ��� DataSource Ŭ�������� �˰� �ֱ⶧���� (DataSource) �� ĳ������ �ؼ� 
  //DataSource ��ü ds�� ����ϴ�.
  return ds.getConnection(); 
  // DataSource ��ü ds�� getConnection() �޼ҵ带 ���� java.sql.Connection ��ü�� ��� ��ȯ�մϴ�.
 }

 

�� �ҽ��� �̷��Ե� ����. �� �Ѵٸ� �Ȱ�ġ�� �ٷ� JNDI Ǯ PATH�� �༭ �����ü� �ֽ��ϴ�.

private Connection getConnection() throws Exception{
  Context initCtx=new InitialContext();
  DataSource ds=(DataSource)envCtx.lookup("java:comp/env/jdbc/myoracle");
  return ds.getConnection();
 } 

�ٸ� �̷��� DataSource�� ����ϱ� ���ؼ� 
WAS�� DataSource�� 
���� ī�װ��� ����� �Ǿ��־���մϴ�.
WAS�� ���� DataSource�� ����ϴ¹��� �ٸ��⶧���� 
�ڼ��� DataSource ��Ϲ��� WAS�� �޴����� ����.

////////////////////////////////////////////////////

cf] 
1. Naming Service��? <����: �˱⽱�� Ǯ� 
�������� EJB>

[1] ��ǥ���� ���� �����θ��� ip�� �ٲ��ִ� ����
     ��, 211.123.111.11 ���� ip�� www.a.co.kr ����
	 �̸��� �̿��� ����
	 �̰��� �ü���� ��ϵ� ���� ������ �̿���
	 �ش� �������� � ���������� �˾Ƴ� �� �ֱ� ������
	 ����.
	 �� �� ������ �����ǰ� ����ǵ� Ŭ���̾�Ʈ�� ������
	 �̸����� ������ �� �ִ� ������ �ִ�.

[2] �̷��� ������ ���� ���񽺿� ���� �л�� ��ü�� ã��
     ���� �ڹ� ���������� �ڹ� ǥ�� ���̹� ���񽺸� JNDI
	 �� �����Ͽ���. 
	 JNDI�� Ư���� �̸����� ��ü�� ����ؼ� ������ �� �ְ� 
	 �����ش�.

2. JNDI��?  <Head First EJB ���� : 116,602 p>

[1] Java Naming and Directory Interface�� ����
[2] ��� �� ���丮 ���񽺿� �����ϱ� ���� API
[3] ���� ����� ������ �츮�� ���(bind, rebind)�ϰ�,
     ã�ƾ���(lookup) ����� �˸� �ȴ�.
[4] ������ JNDI Driver(service provider��� �θ�)
	 �� ������ ���/���丮 ���񽺸� �̿��� �� �ִ�.
	 jndi ����̹��� �츮�� ȣ���� �̸��� Naming ���񽺿�
	 �� ������ �� �ִ� ������ �ٲ��ִ� ������ �Ѵ�.
[5] JNDIƮ���� �� ���� �켱 InitialContext ���� ������
     ...javax.naming��Ű���� ����-->1.4���� j2se�� ���ԵǾ���
[6] InitialContext���� ���������� �󿡴� �ڱ⸸�� JNDI���ؽ�Ʈ��
     �ִ�. �ٷ� �� �󿡼� ã���� �ϴ� �˻��۾��� java:comp/env���
	  ���� ���ؽ�Ʈ���� ���۵ȴ�.
*/