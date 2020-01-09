package net.k20191212;

import java.io.BufferedReader;
/*
EchoServer 메아리서버

	- Client가 Server에 접속하면
		1. 서버로부터 안녕하세요 클라이언트님 이라는 메시지를 받는다
		2. 클라이언트는 키보드입력으로 메시지를 보낸다
		3. 서버는 클라이언트가 보내온 '메시지를 분석(parsing)'해서
			3.1. 안녕하세요 또는 하이 라는 메시지가 오면
				>> 반가워요 클라이언트님 이라고 답변하고
			3.2. 오늘 날짜는 이라는 메시지가 오면
				>> 오늘날짜를 알려주고
			3.3. 그외에 다른 메시지가 오면
				>> ~님 어여가! 란 메시지를 보내자
				
		이거 완전 심심이 아니냐

*/
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;


public class EchoServer {

	public static void main(String[] args) throws IOException{
		
		final int port = 3333;
		
		ServerSocket server=null;
		Socket sock=null;
		
		System.out.println("Echo Server is started..");
		
		server= new ServerSocket(port);
		sock= server.accept();
		System.out.println(sock.getInetAddress()+"님이 접속했습니다");
			//클라이언트가 접속하면 서버가 먼저 인사말을 건넨다
		
		OutputStream os= sock.getOutputStream();
		
		String str="안녕하세요"+sock.getInetAddress()+"님";
//		os.write(str.getBytes());
//			//메시지 보낼때마다 매번 변수선언해주고 getBytes 변환하려면 번거로워
		
		BufferedWriter bout= new BufferedWriter(new OutputStreamWriter(os));		//bout은 바로 못보내고 중간다리역할이야
		
		bout.write(str+"\n");
		bout.flush();
		
		//클라이언트의 메시지를 듣는 스트림을 얻는다 >>> 필터링
		InputStream is= sock.getInputStream();
		BufferedReader in= new BufferedReader(new InputStreamReader(is));
		
		//클라이언트가 메시지를 계속 보내오니, 
		// 메시지가 null이 아닐때까지 메시지를 받아서
		// 메시지 분석후 알맞는 메아리를 보낸다
		
		String clientMsg=null;			//클라이언트 메시지를 담을 그릇
//		PrintWriter pout= new PrintWriter(os,true);
		while((clientMsg=in.readLine())!=null)
		{
//			pout.println(clientMsg);
			System.out.println("Client: "+clientMsg);
			//parsing	(클라이언트가 보내온 내용에 따른 메아리답변 보내기
			if(clientMsg.contains("안녕") || clientMsg.contains("하이"))
			{
				bout.write("반갑다 집사 너의이름은 " + sock.getInetAddress().getHostAddress()+"\n");
					// \n 없으면 newline이 안돼서 입력 한지 안한지 모름 cf>PrintWriter.println은 자동개행
			} 
			else if(clientMsg.contains("날짜"))
			{
				Date today= new Date();
				bout.write("오늘 날짜는 "+today.toString()+" 입니다\n");
			}
			else
			{
				bout.write("뭔소린지 못알아먹겠는데?\n");
			}
			bout.flush();
		}
		
//		pout.close();
		in.close();
		is.close();
		bout.close();
		os.close();
		sock.close();
		server.close();
		
	}
}
