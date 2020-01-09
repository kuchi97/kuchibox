package net.k20191212;


import java.io.*;
import java.net.*;
import java.util.Scanner;

public class EchoClient{

	public static void main(String[] args)  throws IOException{

		//ip�ּ� �Է¹ޱ�
		System.out.println("������ ������ ip�ּҸ� �Է��ϼ���");
		Scanner sc= new Scanner(System.in);
		String ip= sc.next();
		
		final int port= 3333;	//������ ��Ʈ��ȣ ��ġ
		
		//������ ������ ������ �������� �޽����� ��� �ֿܼ� ����ϱ�
		Socket sock= new Socket(ip, port);
			//����Ǹ� ��ü����, �ȵǸ� exception���
		System.out.println("������ �����");
		
		//������ �λ縦 ���
		InputStream is= sock.getInputStream();
		BufferedReader in= new BufferedReader(new InputStreamReader(is));
		String serverMsg= in.readLine();	//������ ���� �޽����� ������ ����
		System.out.println("Server: "+serverMsg);
		
		//Ű���� �Է½�Ʈ�� �����Ͽ� Ŭ���̾�Ʈ�� ���� �޽��� �����
		
		BufferedReader key= new BufferedReader(new InputStreamReader(System.in));
			//bufferedreader(inputstreamreader(system.in))�� Ű����� ��忬��
		
		//������ ������ ���� ��Ʈ�� ���
		OutputStream os= sock.getOutputStream();
		PrintWriter pout= new PrintWriter(os,true);
		
		String msg=null;
		while((msg=key.readLine())!=null)
		{
			pout.println(msg);			//������ �޽����� ����
			serverMsg=in.readLine();	//������ Ŭ���̾�Ʈ�� �޽����� ����
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
