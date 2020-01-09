package net.k20191211Absent;
import java.net.*;
import java.io.*;
import javax.swing.*;

public class TCPClient {

	public static void main(String[] args) 
			throws UnknownHostException, IOException {
		//서버의 ip주소, 포트번호
		String ip="192.168.0.55";
		final int port=5555;
		Socket sock=new Socket(ip, port);
		System.out.println("서버와 연결됨...");
		String msg
		=JOptionPane.showInputDialog("서버에게 보낼 메시지를 입력하세요");
		if(msg==null)return;
		OutputStream os=sock.getOutputStream();
		PrintWriter pout=new PrintWriter(os,true);
		//서버에 메시지를 보내자.
		pout.println(msg);
		pout.close();
		os.close();
		sock.close();
	}

}
