package jdbc.k20191121;

import java.sql.*;
import javax.swing.JOptionPane;

public class MemoInsert2
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String name= JOptionPane.showInputDialog("�ۼ��ڸ� �Է��ϼ���");
		String msg= JOptionPane.showInputDialog("�޸� �Է��ϼ���");
		
		
		
		//1.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott", pw="tiger";
		Connection con= DriverManager.getConnection(url,user,pw);
		//3.
		Statement stmt= con.createStatement();
		
		//insert�� �ۼ��Ͽ� �����Ű��
		//4.
		String sql="INSERT INTO MEMO (IDX,NAME,MSG,WDATE)"
				+ "VALUES(MEMO_SEQ.NEXTVAL,'"+name+"','"+msg+"',SYSDATE)";
		System.out.println(sql);
		if(name==null || msg==null)
		{
			System.out.println("�Է��϶��");
			return;
		}
		//5.
		//stmt.execute(sql);
		//boolean isSel=stmt.execute(sql);
		
		//DML(�����͸� �����ϴ� ���): insert delete update ���� �� ����Ǿ����� Ȯ���Ϸ���
		//public int executeUpdate(sql)			:	DML������ �����Ű��
		//											DML���忡 ���� ������� ���ڵ� ������ ��ȯ�Ѵ�
		int cnt= stmt.executeUpdate(sql);
		String str=(cnt>0)? "��ϼ���":"��Ͻ���";
		System.out.println(str);
		
		
		
		//6.
		stmt.close();
		con.close();
	}
}
