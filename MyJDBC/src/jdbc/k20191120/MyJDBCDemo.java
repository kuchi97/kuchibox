package jdbc.k20191120;

/*
memo ���̺� �ۼ��ϴ� �������
idx number 4		--�۹�ȣ pk
name varchar2 30	--�ۼ���
msg varchar2 100	--�۳���
wdate date	default sysdate	--�ۼ���
*/

import java.sql.*;

public class MyJDBCDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{

		Connection con=null;
		Statement stmt=null;
		//1 ����̹��ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. db����
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String id="scott", pw="tiger";
		
		con=DriverManager.getConnection(url);
		//3. ������ �ۼ�
		String query=" ";
		//4. ������ ������ statement ����
		stmt= con.createStatement();
			
		//5. ����
		stmt.execute(query);
		//6. �ڿ��ݳ�
		stmt.close();
		con.close();
	}
}
