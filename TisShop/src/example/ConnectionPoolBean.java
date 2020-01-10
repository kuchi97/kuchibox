package example;
import java.util.*;
import java.sql.*;

public class ConnectionPoolBean {
	private Hashtable<Connection, Boolean> ht;
	private String url, user, pwd;
	private int increment;
	
	public ConnectionPoolBean()
			throws ClassNotFoundException, 
			SQLException{
		increment=3;// 증가치: 3
		ht=new Hashtable<Connection,Boolean>(5);
		//커넥션을 저장할 자료구조
		Connection con=null;
		Class.forName("oracle.jdbc.driver.OracleDriver");
		url="jdbc:oracle:thin:@localhost:1521:orcl10";
		user="scott"; pwd="tiger";
		/*커넥션을 미리 5개 생성하여 저장해 놓는다.*/
		for(int i=0;i<5;i++){
			con=DriverManager.getConnection(url,user,pwd);
			ht.put(con,Boolean.FALSE);
			//첨에는   false로 마크한다.
		}
	System.out.println("ConnectionPoolBean Created....");
	}//생성자----------------------------------------- 
	
	public synchronized Connection getConnection()
	throws SQLException{
		Connection con=null;
		Enumeration<Connection> en=ht.keys();// key 값을 집합체 형체로 추출
		while(en.hasMoreElements()){
			con=en.nextElement();//key
			Boolean b=ht.get(con);//value
			if(b==Boolean.FALSE){
				ht.put(con, Boolean.TRUE);// 일하는 놈으로 마크
				return con;
			}                    
		}//while--------------
		// 놀고있는  con이 하나도 없다면 커넥션을 증가시키자.
		for(int i=0;i<increment;i++){
			Connection con2
			=DriverManager.getConnection(url,user,pwd);
			ht.put(con2, Boolean.FALSE);
		}
		return getConnection();// 재귀호출
	}//getConnection()--------------------------------
	
	public void returnConnection(Connection returnCon)
	throws SQLException{
		Connection con=null;
		Enumeration<Connection> en=ht.keys();// key 값을 집합체 형체로 추출
		while(en.hasMoreElements()){
			con=en.nextElement();
			if(con==returnCon){
				//반환되는 커넥션과 주소값이 같다면...  false 로 표시해준다.
				ht.put(con,Boolean.FALSE);
				break;
			}//if--------
		}//while------------------		
		removeCon();
		//커넥션을 기본적으로 5개만 유지하도록...
	}//returnConnection()-------------------------------
	public void removeCon(){
		Connection con=null;
		Enumeration<Connection> en=ht.keys();
		int count=0;//False인 con의 개수
		try{
			while(en.hasMoreElements()){
				con=en.nextElement();
				Boolean b=ht.get(con);
				if(!b){
					count++;
					if(count>5){
						ht.remove(con);
						con.close();// false인 con이 5개 이상이라면 ht에서 제거후
						//연결 종료
					}
				}//if----
			}//while--------------		
		}catch(SQLException e){			
		}
	}//removeCon()-----------------------------------
	public void closeAll(){
		Enumeration<Connection> en=ht.keys();
		while(en.hasMoreElements()){
			Connection con=en.nextElement();
			try{
			con.close();
			}catch(SQLException e){}
		}//while---------
	}//closeAll()--------------------------------------
	
}//////////////////////////////////////////////







