package tisChat;

/*
실질적으로 클라이언트와 메시지를 주고받는 일을 한다

*/


import java.net.*;
import java.io.*;
import java.util.*;

public class TISChatHandler extends Thread{

	//global var.
	private Socket sock;
	private Vector<TISChatHandler> userV;
	private String uid, uChatName, uGender;		//접속할 클라이언트의 정보를 저장
	
	private boolean isStop=false;
	
		//streams
	private ObjectInputStream in;
	private ObjectOutputStream out;
	
	
	//constructor
	public TISChatHandler(Socket sock, Vector<TISChatHandler> userV)
	{
		this.sock=sock;
		this.userV=userV;
		
		try {
			in= new ObjectInputStream(this.sock.getInputStream());
			out= new ObjectOutputStream(this.sock.getOutputStream());
			/*
			주의!  서버단에서 ObjectInputStream을 먼저 생성하면
					클라이언트단에서는 ObjectOutputStream을 먼저 생성해야함
			*/
			
		} catch (IOException e) {
			System.out.println("TISChatHandler()에서 예외발생: "+e);
		}
		
	}
	
	//thread override
	@Override
	public void run()
	{
		//클라이언트가 접속하면 먼저 대화명을 보낸다
		
		try {
			Object obj= in.readObject();
			if(obj instanceof String)
			{
				String str=(String)obj;
				String arr[]= str.split("\\|");
				this.uid=arr[0];
				this.uChatName=arr[1];
				this.uGender=arr[2];
				System.out.println("##["+uChatName+"] 님##");
				
			}
			
		//대화명이 중복인지 체크
			boolean isExist= isDuplicated(uChatName);
		//	1. 중복된다면
			if(isExist)
			{
				sendMessageTo("700|");
				isStop=true;
				//대화명 중복시 "700|"을 클라이언트에게 보낸다. 임의프로토콜: 문서는 프로젝트안에 있음
				return;
			}
			else
				//	2. 중복되지 않는다면
			{	
		//		2.1. 방금 접속한 클라이언트에게 기존에 입장한 사람들의 정보를 보내준다
				for(TISChatHandler userChat: userV)
				{
					String msg="100|"+userChat.uid+"|"+userChat.uChatName+"|"+userChat.uGender;		//기존에 있던사람들은 벡터에서 꺼내와서 출력
					sendMessageTo(msg);
				}
				
				userV.add(this);
				
				
		//		2.2. 모든참여자들에게 입장한사람의 대화명을 보여준다
				String sendMsg="100|"+this.uid+"|"+this.uChatName+"|"+this.uGender;					//방금입장한사람은 this
				sendMessageAll(sendMsg);	
			}
			
			//클라이언트가 보내오는 메시지를 계속 듣는다
			while(!isStop)
			{
				String cmsg= (String)in.readObject();
				System.out.println(cmsg);
				
				//cmsg를 분석
				parsing(cmsg);
				
			}
			
			
		} catch (ClassNotFoundException | IOException e) {
			System.out.println("TISChatHandler run()에서 예외: "+e);
		}
	}
	
	//대화를 분석하는 메소드 parsing()
	private void parsing (String cmsg)
	{
		//클라이언트가 보내오는 메시지를 | 기준으로 쪼갠다
		String tokens[]= cmsg.split("\\|");
		
		switch(tokens[0])
		{
			case "400": 
			{
				//클라이언트가 서버에게 400|글꼴색|메시지
				String fntRGB= tokens[1];
				String msg= tokens[2];
				
				//서버는 모든 클라이언트에게 받은 메시지를 보내줘야한다
				//		"400|대화명|글꼴색|메시지"
				String str="400|"+this.uChatName+"|"+fntRGB+"|"+msg;
				sendMessageAll(str);
			} break;
			
			case "500":
			{
				//클라이언트가 서버에게 500|받을사람 대화명|귓말메시지
				String to=tokens[1];
				String msg= tokens[2];
				
				//to에 해당하는 대화명을 벡터에서 찾기
				for(TISChatHandler userChat: userV)
				{
					if(to.equals(userChat.uChatName))
					{
						try {
							//서버가 클라이언트에 쏴주는 메시지: "500|보내는사람대화명|귓말메시지"
							String str="500|"+this.uChatName+"|"+msg;
							userChat.sendMessageTo(str+"\r\n");
						} catch (IOException e) {
							System.out.println("TISChatHandler.parsing에서 예외: "+e);
							userV.remove(userChat);
							break;
						}
					}//--if
				}//--for
			} break;
			
			case "800":
			{
				//클라이언트가 서버에게 800|대화명
				String logoutChatName=tokens[1];
				sendMessageAll("800|"+logoutChatName);
				//서버가 모든 클라이언트에게 "800|대화명"
				
				userV.remove(this);
				
				closeAll();
			} break;
			
			case "900":
			{
				//클라이언트가 서버에게 "900|대화명"
				String logoutChatName=tokens[1];
				sendMessageAll("800|"+logoutChatName);
				//서버가 모든 클라이언트에게 "900|대화명"
				
				userV.remove(this);
				
				closeAll();
			} break;
		}
	}


	//대화명 중복여부를 체크하는 메소드
	private boolean isDuplicated(String chatName) 
	{
		Enumeration<TISChatHandler> en= userV.elements();
		while(en.hasMoreElements())
		{
			TISChatHandler tisChat= en.nextElement();
			if(tisChat.uChatName.equals(chatName))
			{
				return true;		//대화명이 중복일때 true반환
			}
		}
		return false;
	}
	
	//서버와 접속한 특정 클라이언트 한명에게 메시지를 보낸다
	private synchronized void sendMessageTo(String msg) throws IOException			//synchronized: 순서대로 전달하라고
	{
		out.writeObject(msg);
		out.flush();
	}
	//서버에 접속한 모든 클라이언트에게 메시지를 보내는 메소드
	private synchronized void sendMessageAll(String msg)
	{
		for(TISChatHandler userChat: userV)
		{
			try {
				userChat.sendMessageTo(msg);
			} catch (IOException e) {
				//연결이 끊긴 클라이언트를 userV에서 제거해줘야함
				System.out.println("sendMessageAll()에서 예외: "+e);
				userV.remove(userChat);
				break;
			}
		}
	}
	
	private void closeAll()
	{
		try {
			if(in!=null) in.close();
			if(out!=null) out.close();
			if(sock!=null) 
			{
				sock.close();
				sock=null;
			}
			
		} catch (Exception e) {
			System.out.println("closeAll()에서 예외: "+e);
		}
	}
	

}
