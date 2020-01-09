package net.k20191211Absent;
import java.net.*;
/* InetAddress Ŭ����
 *  - IP �ּҸ� �߻�ȭ�� Ŭ����
 *  - new �ؼ� ��ü�� �����ϴ� ���� �ƴ϶� static�޼ҵ带 ����
 *    ��ü�� ���´�.
 *    public static InetAddress getByName("ȣ��Ʈ��");
 * */
public class InetAddressTest {
	public static void main(String[] args) {
		try {
			InetAddress inet
				=InetAddress.getByName("www.naver.com");
			System.out.println("ȣ��Ʈ�̸�: "+inet.getHostName());
			System.out.println("ȣ��Ʈ IP�ּ�: "+inet.getHostAddress());
			
			InetAddress[] inet2
				=InetAddress.getAllByName("www.daum.net");
			if(inet2!=null) {
				for(InetAddress ia:inet2) {
					System.out.println("ȣ��Ʈ��: "+ia.getHostName());
					System.out.println("IP�ּ� : "+ia.getHostAddress());
				}
			}
		}catch(UnknownHostException e) {
			e.printStackTrace();
		}
	}

}
