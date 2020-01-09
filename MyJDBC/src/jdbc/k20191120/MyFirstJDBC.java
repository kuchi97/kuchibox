package jdbc.k20191120;

import java.sql.*;

/*
JDBC: Java DataBase Connectivity

	- 자바와 데이터베이스를 연동하여 프로그램을 작성할 수 있도록 하는 API
	- 좁은 의미로는 java.sql 패키지를 의미함
	
	- JDBC를 작성하기 위해서는 DBMS사에서 jdbc드라이버를 다운로드받아야한다
	- Oracle의 경우, ojdbc6.jar 파일을 다운로드받자
	
	- C:\oraclexe\app\oracle\product\11.2.0\server\jdbc\lib\ojdbc6.jar		<<ojdbc6.jar 경로
	-C:\Program Files\Java\jdk1.8.0_231\jre\lib\ext							<<붙여넣을 경로
	
	- Eclipse의 경우 jre경로를 위의 경로로 맞춰줘야 한다

*/

public class MyFirstJDBC {
	
	public static void main(String[] args) {
		
		try {
			//1. 드라이버 로딩: ojdbc6.jar
			Class.forName("oracle.jdbc.driver.OracleDriver");
			//Class.forName("패키지명.클래스명"); >> 해당 클래스객체를 생성해서 메모리에 올림
			
			System.out.println("Driver Loading Success");
			
			//2. DB 연결하여 Connection 객체를 가져오기
			String url="jdbc:oracle:thin:@localhost:1521:XE";
				//프로토콜 : dbms유형 : driver타입 : 호스트 : 포트 : 전역데이터베이스이름
			String user="scott", pwd="tiger";
			
			Connection con= DriverManager.getConnection(url,user,pwd);	//중요
			System.out.println("DB Connected....aaijfa;ei");
			
			//3. query문 작성
			String sql="create table 학급(";
				   sql+="학급코드 number(4) primary key,";
				   sql+="학급명 varchar2(30),";
				   sql+="교실번호 number(3)";
				   sql+=")";
				   
						
			System.out.println(sql);
				   
			//4. 쿼리문 실행을 위한 Statement객체 얻기
			Statement stmt= con.createStatement();						//중요
			
			//5. Statement 의 executeXXX()메소드를 이용해 쿼리문 전송
			stmt.execute(sql);
			
			//6. DB관련 자원들 반납하기(순서 주의)
			//Statement 닫기	--중요
			stmt.close();
			//사용후 db 연결끊기 --매우중요--
			con.close();
		} catch (ClassNotFoundException e) {
			System.out.println("클래스를 찾을수 엄서");
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}
