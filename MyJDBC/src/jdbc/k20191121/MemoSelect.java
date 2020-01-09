package jdbc.k20191121;

import java.sql.*;

public class MemoSelect {

	public static void main(String[] args) throws ClassNotFoundException, SQLException{
		
		//1. 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
			// OracleDriver 객체를 생성해서 DriverManager에 등록한다
			// DriverManager는 등록된 여러개의 드라이버를 Vertor에 저장하여 관리하는 클래스.
			// DB와 연결할 때 Connection을 반환해주는 메소드를 가진다
		
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
		
		//2.db연결
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String id="scott",pw="tiger";
		Connection con= DriverManager.getConnection(url,id,pw);
		
		//3.statement 생성
		Statement stmt= con.createStatement();
		
		//4.쿼리문 작성
		String sql="SELECT idx, name, msg, wdate FROM memo ORDER BY idx ASC";
		
		//5. 실행
//		boolean isSel=stmt.execute(sql);
//		System.out.println(isSel);
		
		//DML문장: public int executeUpdate(sql);
		//DQL문장(select): public ResultSet executeQuery(sql);
		
		ResultSet rs= stmt.executeQuery(sql);
		
		while(rs.next())
			//public boolean next()	:	논리커서가 첫번째레코드 앞에 위치하다가 next() 호출시 다음으로 이동
			//							이동위치에 레코드가 있으면 true 없으면 false
		{
			int idx= rs.getInt("idx");
			String name= rs.getString("name");
			String msg= rs.getString("msg");
			java.sql.Date wdate= rs.getDate("wdate");			//java.util.Date 아니고 java.sql.Date임
			
			System.out.println(idx+"\t"+name+"\t"+msg+"\t"+wdate);
			
		}
		
		//6.
		stmt.close();
		con.close();
		
	}
}
