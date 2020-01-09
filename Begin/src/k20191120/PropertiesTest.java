package k20191120;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

/*
Properties: Map�迭

	- XXX.properties ������ �о� �ش����Ͽ� ����� ������ ����ϰ��� �Ҷ� �̿�
	
*/

public class PropertiesTest {

	public static void main(String[] args) throws IOException
	{
		
		String loc="./src/k20191120/database.properties";
		
		Properties prop= new Properties();
		//�����б�	-	��Ʈ�� ����
		FileReader fr= new FileReader(loc);
		
		prop.load(fr);
		//properties���Ͽ� �ִ� ������ �о properties ��ü�� �Űܳ��´�.
		
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
