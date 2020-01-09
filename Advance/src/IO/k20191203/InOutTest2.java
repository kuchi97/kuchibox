package IO.k20191203;
/*
System.in: InputStream 타입
	- 1byte 기반 stream
	- 키보드와 노드연결을 하는 Node stream (데이터소스(여기서는 키보드)와 직접연결)
	- public int read(): 바이트입력을 리턴하고
						입력이 종료(ctrl+c/ctrl+d)되면 -1을
						리턴한다.

System.out: PrintStream 타입
	- 1byte 기반 stream
	- 내부적으로 콘솔과 노드연결을 하고있음
	- print(), println(), printf()...
	- public void write(int b)

*/

import java.io.*;

public class InOutTest2 {
	
	public static void main(String[] args) throws IOException{
		
		int n=0, count=0, total=0;
		
		//데이터를 달걀판에 담아 읽어보자: byte[]
		byte[] data= new byte[6];			//6개들이 달걀판
		
		//data: 배열에 담기고,
		//n: 	배열에 몇byte 담았는지
		
		while((n=System.in.read(data))!=-1)
		{
			System.out.write(data,0,n);
			
			System.out.flush();				//Stream에 남아있는 데이터가 있으면 밀어내서 출력해줌
			
			//n: 담은 달걀 갯수, 읽은 byte 수
			
//			System.out.println("n: "+n);
			
			count++;	//반복문 횟수
			total+=n;	//총 바이트수
		}
		System.out.println("total "+total+" bytes");
		
		System.in.close();
		System.out.close();
	}

}
