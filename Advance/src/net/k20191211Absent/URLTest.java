package net.k20191211Absent;
import java.net.*;
import java.io.*;
/*URL (Uniform Resource Locator)
 * ���ͳݿ� ���� ������ �ڿ�(resource)�� �ּҸ� ǥ���ϴ� ������ ����
 * ���⼭ �ڿ��� ���ͳ� ���� �������ݿ� ���� �ٸ� �� �ִ�.
 * ���� http���������� ��� �ڿ��̶� html������, �̹�������, ���ø� ��
 * ���� ���ϰ� ���丮�� �ǹ��Ѵ�.
 * - URL ���� ���
 * http://www.naver.com:80/member/join.jsp?name=honb#page2
 * ftp
 * telnet
 * protocol   host     :port/path   ?queryString#reference
 * */
public class URLTest {

	public static void main(String[] args) {
		
		String str
		="https://media.istockphoto.com/vectors/christmas-tree-with-bulbs-and-gifts-vector-id697910044";
		try {
			URL url=new URL(str);
			System.out.println("��������: "+url.getProtocol());
			System.out.println("ȣ��Ʈ: "+url.getHost());
			System.out.println("��Ʈ��ȣ: "+url.getDefaultPort());
			System.out.println("Path: "+url.getPath());
			System.out.println("QueryString: "+url.getQuery());
			System.out.println("Reference: "+url.getRef());
			
			InputStream is=url.openStream();
			String target="treeCopy.jpg";
			/*���ݿ� �ִ� ������ target���Ϸ� ī���ϼ���
			 * */
			File file=new File(target);
			FileOutputStream fos=new FileOutputStream(file);
			
			BufferedInputStream bis=new BufferedInputStream(is);
			BufferedOutputStream bos=new BufferedOutputStream(fos);
			
			byte[] data=new byte[4000];
			int n=0, count=0;
			while((n=bis.read(data))!=-1) {
				bos.write(data,0,n);
				count+=n;
			}
			bos.close();
			bis.close();
			fos.close();
			is.close();
			System.out.println(count+"bytes ī�ǵ�");
			System.out.println(file.getAbsolutePath());
		} catch (MalformedURLException e) {
			// ���������� ���ų� url���Ŀ� ���� ���� ��� ���� �߻���
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
