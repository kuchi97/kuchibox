package net.k20191219;

import java.net.*;
import java.io.*;
import java.util.Scanner;

public class UDPClient {
	
	public static void main(String[] args) throws UnknownHostException, SocketException, IOException {
		
		//명령줄 인수(args)로 서버의 ip주소를 입력받자
		//java net.k20191219.UDPClient 192.168.0.xx
		String host= args[0];
		InetAddress inet= InetAddress.getByName(host);
		
		Scanner sc= new Scanner(System.in);
		System.out.println("보낼 내용을 입력하세요");
		
		String sendMsg= "";
		
		DatagramPacket pack= null;
		DatagramSocket ds= new DatagramSocket();
		
		while((sendMsg=sc.nextLine())!=null)
		{
			if(sendMsg.equalsIgnoreCase("x"))	//대소문자 구분안하고 x와 같으면
			{
				break;	//종료
			}
			
			//메시지를 byte단위로 쪼개서 배열에 담는다
			byte[] data= sendMsg.getBytes();
			
			//송신측에서는 ip주소, 포트번호를 넣어주어야함
			pack= new DatagramPacket(data, data.length, inet, 3000);
								//(보낼 데이터, 길이만큼, ipAddress, portNo)
			
			ds.send(pack);			//전! 송!
			//UnknownException, SocketException < IOExeption
			
			System.out.println("데이터 보냈어요 추가메시지 입력하세요");
			
		}
		
		ds.close();
		sc.close();
		
		
	}

}
