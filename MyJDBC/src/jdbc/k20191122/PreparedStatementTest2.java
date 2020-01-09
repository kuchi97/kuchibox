package jdbc.k20191122;

import java.sql.*;
import jdbc.util.DBUtil;
import java.util.Scanner;

public class PreparedStatementTest2 {

	public static void main(String[] args) throws SQLException {
		
		Scanner sc= new Scanner(System.in);
		System.out.print("작성자 입력하세요: ");
		String name= sc.next();
		
		Connection con=null;
		PreparedStatement ps= null;
		ResultSet rs=null;
		
		//해당작성자가 쓴 글 검색
		try {
			con= DBUtil.getCon();
			
			String sql="SELECT * FROM MEMO WHERE NAME= ?";
			System.out.println(sql+name);
			ps=con.prepareStatement(sql);
			
			ps.setString(1, name);
			
			//query execute
			rs=ps.executeQuery();
			
			//query sysout
			while(rs.next())
			{
				int idx= rs.getInt(1);				//컬럼 인덱스로 써도 됨 우왕
				String name2= rs.getString("name");
				String msg= rs.getString("msg");
				Date wdate=rs.getDate(4);			//이거도 컬럼인덱스
				System.out.println(idx+"\t"+name2+"\t"+msg+"\t"+wdate);
			}
			
		}
		finally {
			if(rs!=null)
				rs.close();
			if(ps!=null)
				ps.close();
			if(con!=null)
				con.close();
		}
		
		
	}
}
