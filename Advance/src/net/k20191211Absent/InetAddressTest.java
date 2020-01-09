package net.k20191211Absent;
import java.net.*;
/* InetAddress 클래스
 *  - IP 주소를 추상화한 클래스
 *  - new 해서 객체를 생성하는 것이 아니라 static메소드를 통해
 *    객체를 얻어온다.
 *    public static InetAddress getByName("호스트명");
 * */
public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress inet
				=InetAddress.getByName("www.naver.com");
			System.out.println("호스트이름: "+inet.getHostName());
			System.out.println("호스트 IP주소: "+inet.getHostAddress());
			
			InetAddress[] inet2
				=InetAddress.getAllByName("www.daum.net");
			if(inet2!=null) {
				for(InetAddress ia:inet2) {
					System.out.println("호스트명: "+ia.getHostName());
					System.out.println("IP주소 : "+ia.getHostAddress());
				}
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
