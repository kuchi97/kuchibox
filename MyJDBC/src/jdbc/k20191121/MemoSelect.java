package jdbc.k20191121;

import java.sql.*;

public class MemoSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		//1. ����̹��ε�
		Class.forName("oracle.jdbc.driver.OracleDriver");
			// OracleDriver ��ü�� �����ؼ� DriverManager�� ����Ѵ�
			// DriverManager�� ��ϵ� �������� ����̹��� Vertor�� �����Ͽ� �����ϴ� Ŭ����.
			// DB�� ������ �� Connection�� ��ȯ���ִ� �޼ҵ带 ������
		
		/*
		public class OracleDriver implements Driver
		{
			static {
				new OracleDriver();
			}
			
			private OracleDriver()
			{
				DriverManager.registerDriver(this);
			}
		}
		
		*/
		
		//2.db����
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String id="scott",pw="tiger";
		Connection con= DriverManager.getConnection(url,id,pw);
		
		//3.statement ����
		Statement stmt= con.createStatement();
		
		//4.������ �ۼ�
		String sql="SELECT idx, name, msg, wdate FROM memo ORDER BY idx ASC";
		
		//5. ����
//		boolean isSel=stmt.execute(sql);
//		System.out.println(isSel);
		
		//DML����: public int executeUpdate(sql);
		//DQL����(select): public ResultSet executeQuery(sql);
		
		ResultSet rs= stmt.executeQuery(sql);
		
		while(rs.next())
			//public boolean next()	:	��Ŀ���� ù��°���ڵ� �տ� ��ġ�ϴٰ� next() ȣ��� �������� �̵�
			//							�̵���ġ�� ���ڵ尡 ������ true ������ false
		{
			int idx= rs.getInt("idx");
			String name= rs.getString("name");
			String msg= rs.getString("msg");
			java.sql.Date wdate= rs.getDate("wdate");			//java.util.Date �ƴϰ� java.sql.Date��
			
			System.out.println(idx+"\t"+name+"\t"+msg+"\t"+wdate);
			
		}
		
		//6.
		stmt.close();
		con.close();
		
	}
}
