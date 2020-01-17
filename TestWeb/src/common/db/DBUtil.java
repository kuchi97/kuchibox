package common.db;

import java.sql.*;


public class DBUtil {
	
	static String url="jdbc:oracle:thin:@localhost:1521:XE";
	static String user="retulix", pwd="1234";
	
	static
	{
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("Driver loading success");
			
		} catch(ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public static Connection getCon() throws SQLException
	{
		Connection con= DriverManager.getConnection(url,user,pwd);
		
		return con;
	}
}
