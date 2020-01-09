package jdbc.k20191120;

import java.sql.*;

/*
JDBC: Java DataBase Connectivity

	- �ڹٿ� �����ͺ��̽��� �����Ͽ� ���α׷��� �ۼ��� �� �ֵ��� �ϴ� API
	- ���� �ǹ̷δ� java.sql ��Ű���� �ǹ���
	
	- JDBC�� �ۼ��ϱ� ���ؼ��� DBMS�翡�� jdbc����̹��� �ٿ�ε�޾ƾ��Ѵ�
	- Oracle�� ���, ojdbc6.jar ������ �ٿ�ε����
	
	- C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar		<<ojdbc6.jar ���
	-C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext							<<�ٿ����� ���
	
	- Eclipse�� ��� jre��θ� ���� ��η� ������� �Ѵ�

*/

public class MyFirstJDBC {
	
	public static void main(String[] args) {
		
		try {
			//1. ����̹� �ε�: ojdbc6.jar
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("��Ű����.Ŭ������"); >> �ش� Ŭ������ü�� �����ؼ� �޸𸮿� �ø�
			
			System.out.println("Driver Loading Success");
			
			//2. DB �����Ͽ� Connection ��ü�� ��������
			String url="jdbc:oracle:thin:@localhost:1521:XE";
				//�������� : dbms���� : driverŸ�� : ȣ��Ʈ : ��Ʈ : ���������ͺ��̽��̸�
			String user="scott", pwd="tiger";
			
			Connection con= DriverManager.getConnection(url,user,pwd);	//�߿�
			System.out.println("DB Connected....aaijfa;ei");
			
			//3. query�� �ۼ�
			String sql="create table �б�(";
				   sql+="�б��ڵ� number(4) primary key,";
				   sql+="�б޸� varchar2(30),";
				   sql+="���ǹ�ȣ number(3)";
				   sql+=")";
				   
						
			System.out.println(sql);
				   
			//4. ������ ������ ���� Statement��ü ���
			Statement stmt= con.createStatement();						//�߿�
			
			//5. Statement �� executeXXX()�޼ҵ带 �̿��� ������ ����
			stmt.execute(sql);
			
			//6. DB���� �ڿ��� �ݳ��ϱ�(���� ����)
			//Statement �ݱ�	--�߿�
			stmt.close();
			//����� db ������� --�ſ��߿�--
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("Ŭ������ ã���� ����");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
