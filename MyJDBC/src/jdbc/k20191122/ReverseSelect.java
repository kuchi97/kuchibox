package jdbc.k20191122;

import java.sql.*;
import jdbc.util.DBUtil;

public class ReverseSelect {

	public static void main(String[] args) throws Exception{
		
		Connection con= DBUtil.getCon();
		
		String sql="SELECT empno, ename, rpad(job,15,' ') job, sal FROM emp ORDER BY 1 ASC";
		//ResultSet의 커서를 자유자재로 이동시키려면 Statement나 PreparedStatement
		//얻어올 때 매개변수를 아래와같이 넘긴다
		PreparedStatement ps= con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
														//이 옵션이 없다면 rs커서는 기본적으로 next()만 가능하다
		
		ResultSet rs= ps.executeQuery();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("사번\t이름\t업무\t급여");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		while(rs.next())
		{
			int no= rs.getInt(1);
			String name=rs.getString(2);
			String job= rs.getString(3);
			int sal= rs.getInt(4);
			System.out.println(no+"\t"+name+"\t"+job+"\t"+sal);
		}
		
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		//현재논리커서위치 afterLast()
		//여기서 다시 역으로 읽기
		System.out.println("\n=========REVERSE READING=========\n");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("사번\t이름\t업무\t급여");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		while(rs.previous())			//역순으로 읽기
		{
			int no= rs.getInt(1);
			String name=rs.getString(2);
			String job= rs.getString(3);
			int sal= rs.getInt(4);
			System.out.println(no+"\t"+name+"\t"+job+"\t"+sal);
		}
		
		/*
		rs.next()  <==>  rs.previous()
		rs.beforeFirst():	첫번째행의 직전에 위치(출발선상)
		rs.afterLast():		마지막행 직후
		rs.first():			첫번째 행
		rs.last():			마지막행
		rs.absolute(5):		5번째행으로 이동
							 양수이면 next(), 음수이면 previous()와 같다
		rs.getRow():		실제커서가 위치한곳의 행번호 반환
		*/
		
		System.out.println("\n*********************\n");
		
		rs.absolute(2);			//정순정렬의 2행으로 이동
		System.out.println(rs.getInt(1)+"/"+rs.getString(2));
		rs.absolute(-2);		//역순정렬의 2행으로 이동
		System.out.println(rs.getInt(1)+"/"+rs.getString(2));
		
		
		rs.close();
		ps.close();
		con.close();
		
	}
}
