package jdbc.k20191125;
//procedures
//EXECUTE MEMOADD('김프로', '프로시져잉');
//EXECUTE MEMOEDIT(12,'홍수정','나도 수정이 있다');
//EXECUTE MEMODEL(13);
//EXECUTE MEMOALL;

//프로시저를 호출할때 사용하는 클래스: CollableStatement

import java.sql.*;
import jdbc.util.DBUtil;
import java.util.Scanner;


public class CallableStatementTest {

	public static void main(String[] args) throws Exception{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("작성자를 입력: ");
		String name= sc.next();
		System.out.print("메모를 입력: ");
		sc.skip("\r\n");			//엔터값 전달 패스
		String msg= sc.nextLine();
		
		if(name==null || msg==null)
			return;
		
		Connection con= DBUtil.getCon();
		
		/*
		프로시저를 호출할때
		1. 인파라미터가 존재할경우
			{call [프로시저명(인파라미터값)]}
		
		2. 인파라미터가 존재하지 않을경우
			{call [프로시저명]}
		*/
		String sql="{call MEMOADD(?,?)}";
		
		//statement 생성
		CallableStatement cstmt= con.prepareCall(sql);
		
		cstmt.setString(1, name);
		cstmt.setString(2, msg);
		
		//statement 실행
		cstmt.execute();
		
		System.out.println("MEMOADD procedure executed");
		
		cstmt.close();
		con.close();
		

	}
}
