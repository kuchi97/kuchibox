package jdbc.k20191122;

import java.sql.*;
import jdbc.util.DBUtil;

public class ReverseSelect {

	public static void main(String[] args) throws Exception{
		
		Connection con= DBUtil.getCon();
		
		String sql="SELECT empno, ename, rpad(job,15,' ') job, sal FROM emp ORDER BY 1 ASC";
		//ResultSet�� Ŀ���� ��������� �̵���Ű���� Statement�� PreparedStatement
		//���� �� �Ű������� �Ʒ��Ͱ��� �ѱ��
		PreparedStatement ps= con.prepareStatement(sql,ResultSet.TYPE_SCROLL_SENSITIVE,ResultSet.CONCUR_READ_ONLY);
														//�� �ɼ��� ���ٸ� rsĿ���� �⺻������ next()�� �����ϴ�
		
		ResultSet rs= ps.executeQuery();
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("���\t�̸�\t����\t�޿�");
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
		//�����Ŀ����ġ afterLast()
		//���⼭ �ٽ� ������ �б�
		System.out.println("\n=========REVERSE READING=========\n");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		System.out.println("���\t�̸�\t����\t�޿�");
		System.out.println("$$$$$$$$$$$$$$$$$$$$$$$$");
		
		while(rs.previous())			//�������� �б�
		{
			int no= rs.getInt(1);
			String name=rs.getString(2);
			String job= rs.getString(3);
			int sal= rs.getInt(4);
			System.out.println(no+"\t"+name+"\t"+job+"\t"+sal);
		}
		
		/*
		rs.next()  <==>  rs.previous()
		rs.beforeFirst():	ù��°���� ������ ��ġ(��߼���)
		rs.afterLast():		�������� ����
		rs.first():			ù��° ��
		rs.last():			��������
		rs.absolute(5):		5��°������ �̵�
							 ����̸� next(), �����̸� previous()�� ����
		rs.getRow():		����Ŀ���� ��ġ�Ѱ��� ���ȣ ��ȯ
		*/
		
		System.out.println("\n*********************\n");
		
		rs.absolute(2);			//���������� 2������ �̵�
		System.out.println(rs.getInt(1)+"/"+rs.getString(2));
		rs.absolute(-2);		//���������� 2������ �̵�
		System.out.println(rs.getInt(1)+"/"+rs.getString(2));
		
		
		rs.close();
		ps.close();
		con.close();
		
	}
}
