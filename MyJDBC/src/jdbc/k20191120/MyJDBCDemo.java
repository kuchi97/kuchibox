package jdbc.k20191120;

/*
memo 테이블 작성하는 문장실행
idx number 4		--글번호 pk
name varchar2 30	--작성자
msg varchar2 100	--글내용
wdate date	default sysdate	--작성일
*/

import java.sql.*;

public class MyJDBCDemo {

	public static void main(String[] args) throws SQLException, ClassNotFoundException
	{

		Connection con=null;
		Statement stmt=null;
		//1 드라이버로딩
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. db연결
		String url="jdbc:oracle:thin:@localhost:1521:XE";
		String id="scott", pw="tiger";
		
		con=DriverManager.getConnection(url);
		//3. 쿼리문 작성
		String query=" ";
		//4. 쿼리를 전송할 statement 생성
		stmt= con.createStatement();
			
		//5. 실행
		stmt.execute(query);
		//6. 자원반납
		stmt.close();
		con.close();
	}
}
