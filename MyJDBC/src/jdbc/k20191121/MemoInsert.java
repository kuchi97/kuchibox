package jdbc.k20191121;

import java.sql.*;

public class MemoInsert 
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		//1.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott", pw="tiger";
		Connection con= DriverManager.getConnection(url,user,pw);
		//3.
		Statement stmt= con.createStatement();
		//4. sql �ۼ�
		String sql="insert into memo(idx,name,msg,wdate) "
				+ "values(memo_seq.nextval,'��޸�','�ȳ��ϼ��� ��޸𿡿�',sysdate)";
		
		System.out.println(sql);
		//5. public boolean execute(String sql): ���sql��(like DDL,DML,DQL)�� �����Ű�� t/f�� ��ȯ
			//execute�� ��ȯŸ���� ������ ����/���и� ���ϴ°��� �ƴ϶�,
			//select���̸� true / select���� �ƴϸ� false�� ��ȯ
		boolean isSel= stmt.execute(sql);
		System.out.println("isSel: "+isSel);
		
		
		//6.
		stmt.close();
		con.close();
		
	}
}
