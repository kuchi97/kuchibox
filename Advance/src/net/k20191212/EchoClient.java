package net.k20191212;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient{

	public static void main(String[] args)  throws IOException{

		//ip주소 입력받기
		System.out.println("접속할 서버의 ip주소를 입력하세요");
		Scanner sc= new Scanner(System.in);
		String ip= sc.next();
		
		final int port= 3333;	//서버와 포트번호 일치
		
		//서버에 접속후 서버가 보내오는 메시지를 듣고 콘솔에 출력하기
		Socket sock= new Socket(ip, port);
			//연결되면 객체생성, 안되면 exception출력
		System.out.println("서버와 연결됨");
		
		//서버의 인사를 듣기
		InputStream is= sock.getInputStream();
		BufferedReader in= new BufferedReader(new InputStreamReader(is));
		String serverMsg= in.readLine();	//서버가 보낸 메시지를 저장할 변수
		System.out.println("Server: "+serverMsg);
		
		//키보드 입력스트림 생성하여 클라이언트가 보낼 메시지 만들기
		
		BufferedReader key= new BufferedReader(new InputStreamReader(System.in));
			//bufferedreader(inputstreamreader(system.in))로 키보드와 노드연결
		
		//서버에 보내기 위한 스트림 얻기
		OutputStream os= sock.getOutputStream();
		PrintWriter pout= new PrintWriter(os,true);
		
		String msg=null;
		while((msg=key.readLine())!=null)
		{
			pout.println(msg);			//서버에 메시지를 전송
			serverMsg=in.readLine();	//서버가 클라이언트의 메시지를 들음
			System.out.println("Server: "+serverMsg);
		}
		
		pout.close();
		os.close();
		key.close();
		in.close();
		is.close();
		sock.close();
		
		
		

		
		
		
	}
}
