package jdbc.k20191121;

import java.sql.*;
import java.util.Scanner;

public class MemoSelect2 {

	public static void main(String[] args) throws Exception{

		Scanner sc= new Scanner(System.in);
		System.out.print("검색할 작성자 입력: ");
		String name= sc.next();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String id="scott", pw="tiger";
		
		Connection con= DriverManager.getConnection(url,id,pw);
		
		Statement stmt= con.createStatement();
		
		//특정 작성자가 작성한 글만 가져오는 프로그램 작성
		String sql="SELECT * FROM MEMO WHERE NAME='"+name+"'";
		System.out.println(sql);
				
		ResultSet rs= stmt.executeQuery(sql);
			//public ResultSet executeQuery(sql);
		
		while(rs.next())
		{
			int idx= rs.getInt("idx");
			name= rs.getString("name");
			String msg= rs.getString("msg");
			java.sql.Date wdate=rs.getDate("wdate");			//java.util.Date 아니고 java.sql.Date임
			System.out.println(idx+"\t"+name+"\t"+msg+"\t"+wdate);
		}
		
		sc.close();
		stmt.close();
		con.close();		
	}
}
