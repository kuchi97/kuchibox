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
		System.out.println("클라이언트 연결을 기다림...");
		while(true) {
			Socket sock=server.accept();
			/*클의 접속을 기다리다가 클이 접속해오면 서버소켓은
			 * 클과 연결된 소켓 객체를 반환해준다.
			 * */
			System.out.println("클이 접속해옴...");
			InetAddress inet=sock.getInetAddress();
			String cip=inet.getHostAddress();
			System.out.println("클의 IP: "+cip);
			//서버는 클이 보내오는 메시지를 듣고 콘솔에 출력한다.
			InputStream is=sock.getInputStream();
			BufferedReader in
				=new BufferedReader(new InputStreamReader(is));
			//readLine()이용해서 메시지 받은 뒤 콘솔에 출력하기
			String cmsg=in.readLine();
			System.out.println(cip+"님>>"+cmsg);
			in.close();
			is.close();
			sock.close();
		}//while----
		
	}

}
