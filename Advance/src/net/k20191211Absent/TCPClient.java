package net.k20191211Absent;
import java.net.*;
import java.io.*;
import javax.swing.*;

public class TCPClient {

	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		//������ ip�ּ�, ��Ʈ��ȣ
		String ip="192.168.0.55";
		final int port=5555;
		Socket sock=new Socket(ip, port);
		System.out.println("������ �����...");
		String msg
		=JOptionPane.showInputDialog("�������� ���� �޽����� �Է��ϼ���");
		if(msg==null)return;
		OutputStream os=sock.getOutputStream();
		PrintWriter pout=new PrintWriter(os,true);
		//������ �޽����� ������.
		pout.println(msg);
		pout.close();
		os.close();
		sock.close();
	}

}
