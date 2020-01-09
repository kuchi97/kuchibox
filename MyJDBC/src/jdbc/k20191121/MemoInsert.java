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
		//4. sql 작성
		String sql="insert into memo(idx,name,msg,wdate) "
				+ "values(memo_seq.nextval,'김메모','안녕하세오 김메모에오',sysdate)";
		
		System.out.println(sql);
		//5. public boolean execute(String sql): 모든sql문(like DDL,DML,DQL)을 실행시키고 t/f를 반환
			//execute의 반환타입은 전송의 성공/실패를 말하는것이 아니라,
			//select문이면 true / select문이 아니면 false를 반환
		boolean isSel= stmt.execute(sql);
		System.out.println("isSel: "+isSel);
		
		
		//6.
		stmt.close();
		con.close();
		
	}
}
