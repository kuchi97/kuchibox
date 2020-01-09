package jdbc.k20191121;

import java.sql.*;
import javax.swing.JOptionPane;

public class MemoInsert2
{
	public static void main(String[] args) throws ClassNotFoundException, SQLException
	{
		String name= JOptionPane.showInputDialog("작성자를 입력하세요");
		String msg= JOptionPane.showInputDialog("메모를 입력하세요");
		
		
		
		//1.
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2.
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String user="scott", pw="tiger";
		Connection con= DriverManager.getConnection(url,user,pw);
		//3.
		Statement stmt= con.createStatement();
		
		//insert문 작성하여 실행시키기
		//4.
		String sql="INSERT INTO MEMO (IDX,NAME,MSG,WDATE)"
				+ "VALUES(MEMO_SEQ.NEXTVAL,'"+name+"','"+msg+"',SYSDATE)";
		System.out.println(sql);
		if(name==null || msg==null)
		{
			System.out.println("입력하라고");
			return;
		}
		//5.
		//stmt.execute(sql);
		//boolean isSel=stmt.execute(sql);
		
		//DML(데이터를 조작하는 언어): insert delete update 등이 잘 시행되었는지 확인하려면
		//public int executeUpdate(sql)			:	DML문자을 실행시키고
		//											DML문장에 의해 영향받은 레코드 갯수를 반환한다
		int cnt= stmt.executeUpdate(sql);
		String str=(cnt>0)? "등록성공":"등록실패";
		System.out.println(str);
		
		
		
		//6.
		stmt.close();
		con.close();
	}
}
