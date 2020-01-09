package jdbc.k20191125;
//EXECUTE MEMOEDIT(12,'홍수정','나도 수정이 있다');

import java.sql.*;
import java.util.*;
import jdbc.util.DBUtil;

public class CallabeStatementTest2 {

	public static void main(String[] args) throws Exception{
		Scanner sc= new Scanner(System.in);
		//MEMOEDIT procedure 구동시키기
		
		System.out.print("글번호 입력: ");
		int idx=sc.nextInt();
		System.out.print("작성자명 입력: ");
		String name=sc.next();
		sc.skip("\r\n");
		System.out.print("메모 입력: ");
		String msg=sc.nextLine();
		
		//get connection
		Connection con=DBUtil.getCon();
		
		//set sql
		String sql="{call MEMOEDIT(?,?,?)}";
		
		//create statement
		CallableStatement cstmt= con.prepareCall(sql);
		
		//set sql parameters
		cstmt.setInt(1, idx);
		cstmt.setString(2, name);
		cstmt.setString(3, msg);
		
		//statement execute
		cstmt.execute();
		
		//close
		cstmt.close();
		con.close();
		
	}
}
