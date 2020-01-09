package net.k20191219;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class UDPClient {
	
	public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
		
		//����� �μ�(args)�� ������ ip�ּҸ� �Է¹���
		//java net.k20191219.UDPClient 192.168.0.xx
		String host= args[0];
		InetAddress inet= InetAddress.getByName(host);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("���� ������ �Է��ϼ���");
		
		String sendMsg= "";
		
		DatagramPacket pack= null;
		DatagramSocket ds= new DatagramSocket();
		
		while((sendMsg=sc.nextLine())!=null)
		{
			if(sendMsg.equalsIgnoreCase("x"))	//��ҹ��� ���о��ϰ� x�� ������
			{
				break;	//����
			}
			
			//�޽����� byte������ �ɰ��� �迭�� ��´�
			byte[] data= sendMsg.getBytes();
			
			//�۽��������� ip�ּ�, ��Ʈ��ȣ�� �־��־����
			pack= new DatagramPacket(data, data.length, inet, 3000);
								//(���� ������, ���̸�ŭ, ipAddress, portNo)
			
			ds.send(pack);			//��! ��!
			//UnknownException, SocketException < IOExeption
			
			System.out.println("������ ���¾�� �߰��޽��� �Է��ϼ���");
			
		}
		
		ds.close();
		sc.close();
		
		
	}

}
