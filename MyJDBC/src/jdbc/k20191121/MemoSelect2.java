package jdbc.k20191121;

import java.sql.*;
import java.util.Scanner;

public class MemoSelect2 {

	public static void main(String[] args) throws Exception{

		Scanner sc= new Scanner(System.in);
		System.out.print("�˻��� �ۼ��� �Է�: ");
		String name= sc.next();
		
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String id="scott", pw="tiger";
		
		Connection con= DriverManager.getConnection(url,id,pw);
		
		Statement stmt= con.createStatement();
		
		//Ư�� �ۼ��ڰ� �ۼ��� �۸� �������� ���α׷� �ۼ�
		String sql="SELECT * FROM MEMO WHERE NAME='"+name+"'";
		System.out.println(sql);
				
		ResultSet rs= stmt.executeQuery(sql);
			//public ResultSet executeQuery(sql);
		
		while(rs.next())
		{
			int idx= rs.getInt("idx");
			name= rs.getString("name");
			String msg= rs.getString("msg");
			java.sql.Date wdate=rs.getDate("wdate");			//java.util.Date �ƴϰ� java.sql.Date��
			System.out.println(idx+"\t"+name+"\t"+msg+"\t"+wdate);
		}
		
		sc.close();
		stmt.close();
		con.close();		
	}
}
