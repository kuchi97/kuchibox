package net.k20191212;

import java.io.BufferedReader;
/*
EchoServer �޾Ƹ�����

	- Client�� Server�� �����ϸ�
		1. �����κ��� �ȳ��ϼ��� Ŭ���̾�Ʈ�� �̶�� �޽����� �޴´�
		2. Ŭ���̾�Ʈ�� Ű�����Է����� �޽����� ������
		3. ������ Ŭ���̾�Ʈ�� ������ '�޽����� �м�(parsing)'�ؼ�
			3.1. �ȳ��ϼ��� �Ǵ� ���� ��� �޽����� ����
				>> �ݰ����� Ŭ���̾�Ʈ�� �̶�� �亯�ϰ�
			3.2. ���� ��¥�� �̶�� �޽����� ����
				>> ���ó�¥�� �˷��ְ�
			3.3. �׿ܿ� �ٸ� �޽����� ����
				>> ~�� ���! �� �޽����� ������
				
		�̰� ���� �ɽ��� �ƴϳ�

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
		System.out.println(sock.getInetAddress()+"���� �����߽��ϴ�");
			//Ŭ���̾�Ʈ�� �����ϸ� ������ ���� �λ縻�� �ǳٴ�
		
		OutputStream os= sock.getOutputStream();
		
		String str="�ȳ��ϼ���"+sock.getInetAddress()+"��";
//		os.write(str.getBytes());
//			//�޽��� ���������� �Ź� �����������ְ� getBytes ��ȯ�Ϸ��� ���ŷο�
		
		BufferedWriter bout= new BufferedWriter(new OutputStreamWriter(os));		//bout�� �ٷ� �������� �߰��ٸ������̾�
		
		bout.write(str+"\n");
		bout.flush();
		
		//Ŭ���̾�Ʈ�� �޽����� ��� ��Ʈ���� ��´� >>> ���͸�
		InputStream is= sock.getInputStream();
		BufferedReader in= new BufferedReader(new InputStreamReader(is));
		
		//Ŭ���̾�Ʈ�� �޽����� ��� ��������, 
		// �޽����� null�� �ƴҶ����� �޽����� �޾Ƽ�
		// �޽��� �м��� �˸´� �޾Ƹ��� ������
		
		String clientMsg=null;			//Ŭ���̾�Ʈ �޽����� ���� �׸�
//		PrintWriter pout= new PrintWriter(os,true);
		while((clientMsg=in.readLine())!=null)
		{
//			pout.println(clientMsg);
			System.out.println("Client: "+clientMsg);
			//parsing	(Ŭ���̾�Ʈ�� ������ ���뿡 ���� �޾Ƹ��亯 ������
			if(clientMsg.contains("�ȳ�") || clientMsg.contains("����"))
			{
				bout.write("�ݰ��� ���� �����̸��� " + sock.getInetAddress().getHostAddress()+"\n");
					// \n ������ newline�� �ȵż� �Է� ���� ������ �� cf>PrintWriter.println�� �ڵ�����
			} 
			else if(clientMsg.contains("��¥"))
			{
				Date today= new Date();
				bout.write("���� ��¥�� "+today.toString()+" �Դϴ�\n");
			}
			else
			{
				bout.write("���Ҹ��� ���˾Ƹ԰ڴµ�?\n");
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
