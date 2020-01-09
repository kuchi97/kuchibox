package jdbc.k20191125;

/*
CREATE OR REPLACE PROCEDURE EMPINFO(CR OUT SYS_REFCURSOR, VDEPTNO IN EMP.DEPTNO%TYPE)
IS
BEGIN
  OPEN CR FOR 
    SELECT E.DEPTNO, E.ENAME, E.JOB, E.SAL, D.DNAME
    FROM EMP E JOIN DEPT D
    ON E.DEPTNO=D.DEPTNO ORDER BY E.EMPNO;
END;
/

*/

import java.sql.*;
import java.util.Scanner;
import jdbc.util.DBUtil;

public class MyProcedure {

	public static void main(String[] args) throws Exception{
		Scanner sc= new Scanner(System.in);
		
		int deptno;
		
		System.out.print("검색할 부서번호: ");
		deptno=sc.nextInt();
		
		
		//set connection
		Connection con= DBUtil.getCon();
		
		//set sql
		String sql="{call EMPINFO(?,?)}";
		
		//create statement
		CallableStatement cs= con.prepareCall(sql);
		
		//set cursor parameter
		cs.setInt(1, deptno);
		cs.registerOutParameter(2, oracle.jdbc.OracleTypes.CURSOR);
		
		//execute statement
		cs.execute();
		
		//set ResultSet
		ResultSet rs= (ResultSet)cs.getObject(2);
		
		while(rs.next())
		{
			int deptno2= rs.getInt(1);
			String ename=rs.getString(2);
			String job= rs.getString(3);
			int sal= rs.getInt(4);
			String dname= rs.getString(5);
			System.out.println(deptno2+"\t"+ename+"\t"+job+"\t"+sal+"\t"+dname);
		}
		
		//close
		sc.close();
		cs.close();
		con.close();
	}
}
