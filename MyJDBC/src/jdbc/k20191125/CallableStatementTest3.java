package jdbc.k20191125;

/*
CREATE OR REPLACE PROCEDURE MEMOLIST(CR OUT SYS_REFCURSOR) --���Ķ���Ͱ��� Ŀ���� �޴´�
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
			// ���� �ƿ��Ķ���͸� Ŀ��Ÿ������ ����
		cstmt.registerOutParameter(1, oracle.jdbc.OracleTypes.CURSOR);
		
		//execute
		cstmt.execute();
		
		ResultSet rs= (ResultSet)cstmt.getObject(1);		//getObject�� ObjectŸ���� ResultSetŸ������ ����ȯ
		
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
