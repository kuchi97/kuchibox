package net.k20191219;

/*
데이터를 받는 측(클라이언트가 먼저 보낼거임)

UDP방식의 통신: 비연결 지향성					<<>>		TCP: 연결지향성
				패킷 비정렬						<<>>			패킷 정렬
					데이터가 순서대로 
					온다는 보장이 없음
				데이터가 빠르게 전달됨			<<>>			연결을 맺고 끊는데 시간이 걸림
													
				.DatagramSocket(우체부)			<<>>			.Socket 을 이용함
				.DatagramPacket(소포)

- DatagramSocket: 데이터 전송, 수신과 관련된 클래스
- DatagramPacket: 수신을 위한 생성자, 송신을 위한 생성자 2가지를 제공

*/


import java.net.*;
import java.io.*;

public class UDPServer {

	public static void main(String[] args) throws IOException{
		
		//데이터를 받기위한 배열 (byte[]배열로 보냈으니 byte[]배열로 받는다)
		byte[] buffer= new byte[100];
		//UDP의 실제데이터는 512byte 로 제한하는 경우가 많다
		//	따라서 가능하면 배열크기는 512이하로 잡는게 좋다
		
		DatagramSocket ds= new DatagramSocket(3000);
											//portNo
		DatagramPacket pack= new DatagramPacket(buffer, buffer.length);
											//소포받을 박스크기를 정한다
		
		while(true)
		{
			ds.receive(pack);		//패킷에 담아서 받는다
			
			//패킷을 통해 데이터 추출
			byte[] data= pack.getData();
			String msg= new String(data,0,pack.getLength());	//byte배열을 다시 String으로
			
			System.out.println(pack.getAddress()+" 로부터 온 메시지: "+msg);
			
			
			
		}
		
		
	}
}
