package net.k20191212;

import java.io.*;
import java.net.*;
import java.util.Scanner;

public class ChatClient implements Runnable{

	//global var.
	private String ip="";
	private final int port= 7777;
	private	Socket sock;
	
	private BufferedReader key, in;
	private PrintWriter pout;
	
	Scanner sc= new Scanner(System.in);
	
	
	//constructor
	public ChatClient() {

		try {
			System.out.println("접속할 ip 입력하기");
			ip=sc.next();
			sock= new Socket(ip, port);
			System.out.println("입 to the 장 ㅋ");
		
			//키보드 입력스트림 생성
			key= new BufferedReader(new InputStreamReader(System.in));
		
			//서버의 메시지를 듣는 스트림 얻기/필터링
			in= new BufferedReader(new InputStreamReader(sock.getInputStream()));
		
			//서버에 메시지를 보내는 스트림 얻기/필터링
			pout= new PrintWriter(sock.getOutputStream(),true);
		
			//메시지를 듣는 스레드 생성
			Thread listener= new Thread(this);
			listener.start();
					
			//키보드 입력받아 서버에 메시지 전송
			String myMsg="";
			while((myMsg=key.readLine())!=null)
			{
				pout.println(myMsg);
			}
			
			
		} catch (IOException e) {
			System.out.println("예외: client "+e);
			close();
		}

/*
		//스레드를 이너클래스로 만들경우
		class ChatListener extends Thread
		{
			public void run()
			{
				String serverMsg="";
				
				try {
					
					while((serverMsg=in.readLine())!=null)
					{
						System.out.println("Server: "+serverMsg);
						
					}//--while
					
				} catch (IOException e) {
				}//--try/catch
			}
		}
*/
		
		
	}
	//thread override
	@Override
	public void run()
	{
		//서버가 보내오는 메시지를 계속 듣고 자기콘솔에 그 메시지 출력
		String serverMsg="";
		
		try {
			
		while((serverMsg=in.readLine())!=null)
		{
			System.out.println("Server: "+serverMsg);
			
		}//--while
		
		} catch (IOException e) {
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
//			if(server!=null) server.close();
			
		} catch (Exception e) {}
	}
	
	

	public static void main(String[] args) {

		new ChatClient();
	}

}
