package jdbc.k20191121;

import java.sql.*;
import java.util.Scanner;

public class MemoUpdate {

	public static void main(String[] args) throws Exception{
		
		Scanner sc= new Scanner(System.in);
		
		System.out.print("������ �۹�ȣ �Է�: ");
		int idx= sc.nextInt();
		System.out.print("������ �ۼ��� �Է�: ");
		String name=sc.next();
		sc.skip("\r\n");						//next �Է��Ҷ� ���Ͱ� �ǳʶٱ�
		System.out.print("������ �޸𳻿� �Է�: ");
		String msg=sc.nextLine();
		
		System.out.println(idx+"/"+name+"/"+msg);
		
		//1. ����̹� �ε��ϱ�
		Class.forName("oracle.jdbc.driver.OracleDriver");
		//2. db�� �����ϱ�
		String url=("jdbc:oracle:thin:@localhost:1521:XE");
		String id="scott", pw="tiger";
		
		Connection con=null;
		con=DriverManager.getConnection(url,id,pw);
		
		//3. statement ���
		Statement stmt=null;
		stmt= con.createStatement();
		
		//4. update�� �ۼ�
		String sql= "UPDATE MEMO SET NAME='"+name+"', MSG='"+msg+"'"
				+ " WHERE IDX="+idx;
		System.out.println(sql);
		
		//5. update�� ����
		stmt.executeUpdate(sql);
		int cnt=stmt.executeUpdate(sql);
		System.out.println(cnt>0? "��ϼ���":"��Ͻ���");
		
		//6. �ݱ�
		stmt.close();
		con.close();
	}
}
