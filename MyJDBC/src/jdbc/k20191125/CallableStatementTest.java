package jdbc.k20191125;
//procedures
//EXECUTE MEMOADD('������', '���ν�����');
//EXECUTE MEMOEDIT(12,'ȫ����','���� ������ �ִ�');
//EXECUTE MEMODEL(13);
//EXECUTE MEMOALL;

//���ν����� ȣ���Ҷ� ����ϴ� Ŭ����: CollableStatement

import java.sql.*;
import jdbc.util.DBUtil;
import java.util.Scanner;


public class CallableStatementTest {

	public static void main(String[] args) throws Exception{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("�ۼ��ڸ� �Է�: ");
		String name= sc.next();
		System.out.print("�޸� �Է�: ");
		sc.skip("\r\n");			//���Ͱ� ���� �н�
		String msg= sc.nextLine();
		
		if(name==null || msg==null)
			return;
		
		Connection con= DBUtil.getCon();
		
		/*
		���ν����� ȣ���Ҷ�
		1. ���Ķ���Ͱ� �����Ұ��
			{call [���ν�����(���Ķ���Ͱ�)]}
		
		2. ���Ķ���Ͱ� �������� �������
			{call [���ν�����]}
		*/
		String sql="{call MEMOADD(?,?)}";
		
		//statement ����
		CallableStatement cstmt= con.prepareCall(sql);
		
		cstmt.setString(1, name);
		cstmt.setString(2, msg);
		
		//statement ����
		cstmt.execute();
		
		System.out.println("MEMOADD procedure executed");
		
		cstmt.close();
		con.close();
		

	}
}
