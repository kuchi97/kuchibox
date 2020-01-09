package jdbc.k20191122;

import java.sql.*;
import java.util.Scanner;

import jdbc.util.DBUtil;

/*
Prepared Statement
	: �̸� �غ�� statement
	
	- statement�� executeXXX() �޼ҵ�� �������� �����ų��
		Driver�� DBMS���Ŀ� �°� �ش� �������� �������ϴ� �ݸ�
		
		PreparedStatement�� �������� �̸� �������Ͽ� �غ��ص� ��
		executeXXX()�� ȣ��ɶ� �Ķ���ͺκи� �������Ͽ� �����Ѵ�


*/

public class PreparedStatementTest {
	
	public static void main(String[] args) {
		
		Connection con= null;
		PreparedStatement pstmt= null;
		Scanner sc= new Scanner(System.in);
		System.out.print("�ۼ���: ");
		String name= sc.next();
		System.out.print("�޸�: ");
		sc.skip("\r\n");
		String msg= sc.nextLine();
		
		try {
			con=DBUtil.getCon();
			
			String sql="insert into memo values(memo_seq.nextval,?,?,sysdate)";
															//?: In Parameter- ����ڰ� �Է��� ���� �� ����
			//cf> stmt= con.createStatement();
			pstmt=con.prepareStatement(sql);
			// ��ü�� ���ö� �̸� sql���� �Ű������� �����Ͽ� �̸� ������ ���ѳ��´�
			
			//sql���� ?�� ����(setter)
			pstmt.setString(1, name);
			pstmt.setString(2, msg);
			
			//execute
			int cnt= pstmt.executeUpdate();
			System.out.println(cnt>0?"��ϼ���":"�ƴϽ���");
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
		finally {			//�ڿ��ݳ�
			try {
				if(pstmt!=null)
					pstmt.close();
				if(con!=null)
					con.close();
			} catch (SQLException e) {}
		}
		
	}

}
