package net.k20191212;

import java.net.*;
import java.io.*;

/*
구현할 내용

	- 채팅서버와 클라이언트가 1:1로 대화하는 프로그램
	- 키보드로 메시지를 보내는것과 동시에 상대방이 보내는 메시지를 듣는다(Thread)

*/

public class ChatServer implements Runnable{

	//global var.
	private ServerSocket server;
	private Socket sock;
	private final int port=7777;
	
	private BufferedReader key, in;			//키보드로 입력하는것과 클라이언트에서 보낸걸 듣는놈
	private PrintWriter pout;				//출력용
	
	//constructor
	public ChatServer() {

		System.out.println("### *하*늘*사*랑* ###");
		
		try {
			server= new ServerSocket(port);			//서버소켓 생성
			sock=server.accept();					//클라이언트가 들어오면 소켓을 생성해줌
				//1:1이니까 반복생성할필요없고 한번만 해주면 됨
			System.out.println("클라이언트께서 들어오십니다 부대차렷 ["+sock.getInetAddress()+"]");
			
			//키보드 입력스트림 생성
			key= new BufferedReader(new InputStreamReader(System.in)) ;
			
			//클라이언트의 메시지를 듣는 스트림 얻기/필터링
			in= new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			//클라이언트에게 메시지를 보내는 스트림 얻기//필터링
			pout= new PrintWriter(sock.getOutputStream(),true);
			
			//메시지를 듣는 스레드 생성: 내가 입력하는중에 상대방이 채팅을 칠수 있으니까
			//안그러면 쿵짝쿵짝이 안맞아서 내가 입력하지않으면 상대방이 입력을 못함
			
			Thread listener= new Thread(this);
			listener.start();
			
			//키보드 입력받아 클라이언트에 메시지 전송
			String myMsg="";
			while((myMsg=key.readLine())!=null)
			{
				pout.println(myMsg);
			}
			
			
			
		} catch (IOException e) {
//			e.printStackTrace();
			//클라이언트가 접속을 일방종료하면 IOException 남
			System.out.println("예외: "+e);
			close();				//닫는메소드
		}
		
	}
	//Thread override
	@Override
	public void run() 
	{
		//클라이언트가 보내오는 메시지를 계속 듣고 자기 콘솔에 그 메시지 출력
		String clientMsg=null;
		
		try {
			
		while((clientMsg=in.readLine())!=null)
		{
			System.out.println("Client: "+clientMsg);
			
		}//--while

		
		} catch (IOException e) {
			System.out.println("예외2: "+e);
			System.out.println("클라이언트가 접속을 종료함");
			close();
		}//--try/catch
	}

	//닫는 메소드
	public void close()
	{
		try {
			if(in!=null) in.close();
			if(pout!=null) pout.close();
			if(key!=null) key.close();
			if(sock!=null) sock.close();
			if(server!=null) server.close();
			
		} catch (Exception e) {}
	}
	
	
	public static void main(String[] args) {

		new ChatServer();
		
	}


}
