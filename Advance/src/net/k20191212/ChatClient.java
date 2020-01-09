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
			System.out.println("������ ip �Է��ϱ�");
			ip=sc.next();
			sock= new Socket(ip, port);
			System.out.println("�� to the �� ��");
		
			//Ű���� �Է½�Ʈ�� ����
			key= new BufferedReader(new InputStreamReader(System.in));
		
			//������ �޽����� ��� ��Ʈ�� ���/���͸�
			in= new BufferedReader(new InputStreamReader(sock.getInputStream()));
		
			//������ �޽����� ������ ��Ʈ�� ���/���͸�
			pout= new PrintWriter(sock.getOutputStream(),true);
		
			//�޽����� ��� ������ ����
			Thread listener= new Thread(this);
			listener.start();
					
			//Ű���� �Է¹޾� ������ �޽��� ����
			String myMsg="";
			while((myMsg=key.readLine())!=null)
			{
				pout.println(myMsg);
			}
			
			
		} catch (IOException e) {
			System.out.println("����: client "+e);
			close();
		}

/*
		//�����带 �̳�Ŭ������ ������
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
		//������ �������� �޽����� ��� ��� �ڱ��ֿܼ� �� �޽��� ���
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
	
	//�ݴ� �޼ҵ�
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
