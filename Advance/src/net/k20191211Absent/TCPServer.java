package net.k20191211Absent;
import java.net.*;
import java.io.*;
import javax.swing.*;
/*ServerSocket, Socket
 * */
public class TCPServer {

	public static void main(String[] args) throws IOException {
		final int port=5555;
		ServerSocket server=new ServerSocket(port);
		System.out.println("Ŭ���̾�Ʈ ������ ��ٸ�...");
		while(true) {
			Socket sock=server.accept();
			/*Ŭ�� ������ ��ٸ��ٰ� Ŭ�� �����ؿ��� ����������
			 * Ŭ�� ����� ���� ��ü�� ��ȯ���ش�.
			 * */
			System.out.println("Ŭ�� �����ؿ�...");
			InetAddress inet=sock.getInetAddress();
			String cip=inet.getHostAddress();
			System.out.println("Ŭ�� IP: "+cip);
			//������ Ŭ�� �������� �޽����� ��� �ֿܼ� ����Ѵ�.
			InputStream is=sock.getInputStream();
			BufferedReader in
				=new BufferedReader(new InputStreamReader(is));
			//readLine()�̿��ؼ� �޽��� ���� �� �ֿܼ� ����ϱ�
			String cmsg=in.readLine();
			System.out.println(cip+"��>>"+cmsg);
			in.close();
			is.close();
			sock.close();
		}//while----
		
	}

}
