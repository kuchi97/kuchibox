package k20191120;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
Properties: Map계열

	- XXX.properties 파일을 읽어 해당파일에 저장된 내용을 사용하고자 할때 이용
	
*/

public class PropertiesTest {

	public static void main(String[] args) throws IOException
	{
		
		String loc="./src/k20191120/database.properties";
		
		Properties prop= new Properties();
		//파일읽기	-	스트림 생성
		FileReader fr= new FileReader(loc);
		
		prop.load(fr);
		//properties파일에 있는 내용을 읽어서 properties 객체로 옮겨놓는다.
		
		String type= prop.getProperty("DbType");
		System.out.println("Type: "+type);
		
		String user= prop.getProperty("DbUser");
		System.out.println("user: "+user);
		
		String pwd= prop.getProperty("DbPwd");
		System.out.println("pwd: "+pwd);
		
		
		String host= prop.getProperty("Host", "127.0.0.1");
//			prop.getProperty(String key, String defaultValue)
		System.out.println("host: "+host);
		
	}
}
