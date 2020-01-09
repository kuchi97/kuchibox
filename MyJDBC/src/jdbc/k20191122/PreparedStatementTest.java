package jdbc.k20191122;

import java.sql.*;
import java.util.Scanner;

import jdbc.util.DBUtil;

/*
Prepared Statement
	: 미리 준비된 statement
	
	- statement는 executeXXX() 메소드로 쿼리문을 실행시킬때
		Driver가 DBMS형식에 맞게 해당 쿼리문을 컴파일하는 반면
		
		PreparedStatement는 쿼리문을 미리 컴파일하여 준비해둔 뒤
		executeXXX()가 호출될때 파라미터부분만 컴파일하여 전송한다


*/

public class PreparedStatementTest {
	
	public static void main(String[] args) {
		
		Connection con= null;
		PreparedStatement pstmt= null;
		Scanner sc= new Scanner(System.in);
		System.out.print("작성자: ");
		String name= sc.next();
		System.out.print("메모: ");
		sc.skip("\r\n");
		String msg= sc.nextLine();
		
		try {
			con=DBUtil.getCon();
			
			String sql="insert into memo values(memo_seq.nextval,?,?,sysdate)";
															//?: In Parameter- 사용자가 입력할 값이 들어갈 예정
			//cf> stmt= con.createStatement();
			pstmt=con.prepareStatement(sql);
			// 객체를 얻어올때 미리 sql문을 매개변수로 전달하여 미리 컴파일 시켜놓는다
			
			//sql문의 ?값 세팅(setter)
			pstmt.setString(1, name);
			pstmt.setString(2, msg);
			
			//execute
			int cnt= pstmt.executeUpdate();
			System.out.println(cnt>0?"등록성공":"아니실패");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		finally {			//자원반납
			try {
				if(pstmt!=null)
					pstmt.close();
				if(con!=null)
					con.close();
			} catch (SQLException e) {}
		}
		
	}

}
