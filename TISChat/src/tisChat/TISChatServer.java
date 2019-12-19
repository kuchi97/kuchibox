package tisChat;

/*
- 특정포트로 클라이언트 연결을 무한정 기다린다
- 클라이언트와 연결이 이루어지면, 
	클라이언트와 통신을 담당할 스레드(TISChatHandler)를 생성한 후, 동작시킨다
- 여러명의 클라이언트와 통신하기 위해 TISChatHandler를 Vector에 저장하여 관리한다

*/

import java.net.*;
import java.io.*;
import java.util.*;

public class TISChatServer extends Thread{
	
	//global var.
	private ServerSocket server;
	private final int port=7777;
	Vector<TISChatHandler> userV= new Vector<>();
	
	
	//constructor
	public TISChatServer()
	{
		try {
			server= new ServerSocket(port);
			System.out.println("채팅서버가 시작됨");
			System.out.println("["+port+"]번 포트에서 대기중");
			
		} catch (IOException e) {
			e.printStackTrace();
			System.out.println("채팅서버 시작중 예외발생: "+e);
			return;
		}
	}//--constructor
	
	@Override
	public void run()
	{
		while(true)
		{
			try {
				Socket sock= server.accept();
				String cip= sock.getInetAddress().getHostAddress();
				
				System.out.println(cip+" 님이 접속함");
				
				//클라이언트와 통신을 담당할 TISChatHandler스레드 생성하고 동작시킨다
				//이때, sock과 userV를 인자로 넘김
				TISChatHandler chat= new TISChatHandler(sock, userV);
				chat.start();		//스레드 동작
				
				
			} catch (IOException e) {
				System.out.println("클라이언트 소켓생성 실패: "+e);
			}
		}//--while
		
	}//--run()
	
	public static void main(String[] args) {
		TISChatServer tis= new TISChatServer();
		tis.start();
	}
}
