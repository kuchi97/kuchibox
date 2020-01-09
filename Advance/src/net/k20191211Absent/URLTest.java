package net.k20191211Absent;
import java.net.*;
import java.io.*;
/*URL (Uniform Resource Locator)
 * 인터넷에 접근 가능한 자원(resource)의 주소를 표현하는 형식을 말함
 * 여기서 자원은 인터넷 응용 프로토콜에 따라 다를 수 있다.
 * 가령 http프로토콜의 경우 자원이란 html페이지, 이미지파일, 애플릿 등
 * 각종 파일과 디렉토리를 의미한다.
 * - URL 구성 요소
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
			System.out.println("프로토콜: "+url.getProtocol());
			System.out.println("호스트: "+url.getHost());
			System.out.println("포트번호: "+url.getDefaultPort());
			System.out.println("Path: "+url.getPath());
			System.out.println("QueryString: "+url.getQuery());
			System.out.println("Reference: "+url.getRef());
			
			InputStream is=url.openStream();
			String target="treeCopy.jpg";
			/*원격에 있는 파일을 target파일로 카피하세요
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
			System.out.println(count+"bytes 카피됨");
			System.out.println(file.getAbsolutePath());
		} catch (MalformedURLException e) {
			// 프로토콜이 없거나 url형식에 맞지 않을 경우 예외 발생함
			e.printStackTrace();
		} catch(IOException e) {
			e.printStackTrace();
		}

	}

}
