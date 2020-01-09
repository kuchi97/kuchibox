package net.k20191212;

import java.net.*;
import java.io.*;

/*
������ ����

	- ä�ü����� Ŭ���̾�Ʈ�� 1:1�� ��ȭ�ϴ� ���α׷�
	- Ű����� �޽����� �����°Ͱ� ���ÿ� ������ ������ �޽����� ��´�(Thread)

*/

public class ChatServer implements Runnable{

	//global var.
	private ServerSocket server;
	private Socket sock;
	private final int port=7777;
	
	private BufferedReader key, in;			//Ű����� �Է��ϴ°Ͱ� Ŭ���̾�Ʈ���� ������ ��³�
	private PrintWriter pout;				//��¿�
	
	//constructor
	public ChatServer() {

		System.out.println("### *��*��*��*��* ###");
		
		try {
			server= new ServerSocket(port);			//�������� ����
			sock=server.accept();					//Ŭ���̾�Ʈ�� ������ ������ ��������
				//1:1�̴ϱ� �ݺ��������ʿ���� �ѹ��� ���ָ� ��
			System.out.println("Ŭ���̾�Ʈ���� �����ʴϴ� �δ����� ["+sock.getInetAddress()+"]");
			
			//Ű���� �Է½�Ʈ�� ����
			key= new BufferedReader(new InputStreamReader(System.in)) ;
			
			//Ŭ���̾�Ʈ�� �޽����� ��� ��Ʈ�� ���/���͸�
			in= new BufferedReader(new InputStreamReader(sock.getInputStream()));
			
			//Ŭ���̾�Ʈ���� �޽����� ������ ��Ʈ�� ���//���͸�
			pout= new PrintWriter(sock.getOutputStream(),true);
			
			//�޽����� ��� ������ ����: ���� �Է��ϴ��߿� ������ ä���� ĥ�� �����ϱ�
			//�ȱ׷��� ��¦��¦�� �ȸ¾Ƽ� ���� �Է����������� ������ �Է��� ����
			
			Thread listener= new Thread(this);
			listener.start();
			
			//Ű���� �Է¹޾� Ŭ���̾�Ʈ�� �޽��� ����
			String myMsg="";
			while((myMsg=key.readLine())!=null)
			{
				pout.println(myMsg);
			}
			
			
			
		} catch (IOException e) {
//			e.printStackTrace();
			//Ŭ���̾�Ʈ�� ������ �Ϲ������ϸ� IOException ��
			System.out.println("����: "+e);
			close();				//�ݴ¸޼ҵ�
		}
		
	}
	//Thread override
	@Override
	public void run() 
	{
		//Ŭ���̾�Ʈ�� �������� �޽����� ��� ��� �ڱ� �ֿܼ� �� �޽��� ���
		String clientMsg=null;
		
		try {
			
		while((clientMsg=in.readLine())!=null)
		{
			System.out.println("Client: "+clientMsg);
			
		}//--while

		
		} catch (IOException e) {
			System.out.println("����2: "+e);
			System.out.println("Ŭ���̾�Ʈ�� ������ ������");
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
			if(server!=null) server.close();
			
		} catch (Exception e) {}
	}
	
	
	public static void main(String[] args) {

		new ChatServer();
		
	}


}
