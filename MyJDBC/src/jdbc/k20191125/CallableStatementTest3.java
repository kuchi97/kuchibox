package jdbc.k20191125;

/*
CREATE OR REPLACE PROCEDURE MEMOLIST(CR OUT SYS_REFCURSOR) --인파라미터값을 커서로 받는다
IS
BEGIN
  OPEN CR FOR SELECT * FROM MEMO ORDER BY IDX DESC;
END;
/
 

*/
import java.sql.*;
import jdbc.util.DBUtil;
public class CallableStatementTest3 {

	public static void main(String[] args) throws Exception {
		
		//set connection
		Connection con=DBUtil.getCon();
		
		//set sql
		String sql="{call MEMOLIST(?)}";
		
		//create statement
		CallableStatement cstmt= con.prepareCall(sql);
			// ?: out parameter(cursor)
			// 따라서 아웃파라미터를 커서타입으로 지정
		cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
		
		//execute
		cstmt.execute();
		
		ResultSet rs= (ResultSet)cstmt.getObject(1);		//getObject의 Object타입을 ResultSet타입으로 형변환
		
		while(rs.next())
		{
			int idx=rs.getInt(1);
			String name= rs.getString(2);
			String msg= rs.getString(3);
			java.sql.Date wdate= rs.getDate(4);
			System.out.println(idx+"\t"+name+"\t"+msg+"\t"+wdate);
		}
		
		
		//close
		cstmt.close();
		con.close();
		
	}
}
