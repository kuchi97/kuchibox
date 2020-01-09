package net.k20191219;

/*
�����͸� �޴� ��(Ŭ���̾�Ʈ�� ���� ��������)

UDP����� ���: �񿬰� ���⼺					<<>>		TCP: �������⼺
				��Ŷ ������						<<>>			��Ŷ ����
					�����Ͱ� ������� 
					�´ٴ� ������ ����
				�����Ͱ� ������ ���޵�			<<>>			������ �ΰ� ���µ� �ð��� �ɸ�
													
				.DatagramSocket(��ü��)			<<>>			.Socket �� �̿���
				.DatagramPacket(����)

- DatagramSocket: ������ ����, ���Ű� ���õ� Ŭ����
- DatagramPacket: ������ ���� ������, �۽��� ���� ������ 2������ ����

*/


import java.net.*;
import java.io.*;

public class UDPServer {

	public static void main(String[] args) throws IOException{
		
		//�����͸� �ޱ����� �迭 (byte[]�迭�� �������� byte[]�迭�� �޴´�)
		byte[] buffer= new byte[100];
		//UDP�� ���������ʹ� 512byte �� �����ϴ� ��찡 ����
		//	���� �����ϸ� �迭ũ��� 512���Ϸ� ��°� ����
		
		DatagramSocket ds= new DatagramSocket(3000);
											//portNo
		DatagramPacket pack= new DatagramPacket(buffer, buffer.length);
											//�������� �ڽ�ũ�⸦ ���Ѵ�
		
		while(true)
		{
			ds.receive(pack);		//��Ŷ�� ��Ƽ� �޴´�
			
			//��Ŷ�� ���� ������ ����
			byte[] data= pack.getData();
			String msg= new String(data,0,pack.getLength());	//byte�迭�� �ٽ� String����
			
			System.out.println(pack.getAddress()+" �κ��� �� �޽���: "+msg);
			
			
			
		}
		
		
	}
}
