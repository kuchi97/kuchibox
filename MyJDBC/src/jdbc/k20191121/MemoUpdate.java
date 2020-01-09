package jdbc.k20191121;

import java.sql.*;
import java.util.Scanner;

public class MemoUpdate {

	public static void main(String[] args) throws Exception{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("수정할 글번호 입력: ");
		int idx= sc.nextInt();
		System.out.print("수정할 작성자 입력: ");
		String name=sc.next();
		sc.skip("\r\n");						//next 입력할때 엔터값 건너뛰기
		System.out.print("수정할 메모내용 입력: ");
		String msg=sc.nextLine();
		
		System.out.println(idx+"/"+name+"/"+msg);
		
		//1. 드라이버 로딩하기
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. db에 연결하기
		String url=("jdbc:oracle:thin:@localhost:1521:XE");
		String id="scott", pw="tiger";
		
		Connection con=null;
		con=DriverManager.getConnection(url,id,pw);
		
		//3. statement 얻기
		Statement stmt=null;
		stmt= con.createStatement();
		
		//4. update문 작성
		String sql= "UPDATE MEMO SET NAME='"+name+"', MSG='"+msg+"'"
				+ " WHERE IDX="+idx;
		System.out.println(sql);
		
		//5. update문 실행
		stmt.executeUpdate(sql);
		int cnt=stmt.executeUpdate(sql);
		System.out.println(cnt>0? "등록성공":"등록실패");
		
		//6. 닫기
		stmt.close();
		con.close();
	}
}
