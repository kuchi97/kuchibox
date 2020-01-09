package IO.k20191203;

/*
System.in: InputStream 타입
	- 1byte 기반 stream
	- 키보드와 노드연결을 하는 Node stream (데이터소스(여기서는 키보드)와 직접연결)
	- public int read(): 바이트입력을 리턴하고
						입력이 종료(ctrl+c/ctrl+d)되면 -1을
						리턴한다.

*/

import java.io.*;

public class InputStreamTest {

	public static void main(String[] args) throws IOException
	{	
		InputStream in= System.in;
		
		//int read(byte[] b)  
		int input=0, count=0;
		System.out.println("입력하쎄오: ");				// ASCII \r=13 \n=10
		
		while((input=in.read())!=-1)
			//ctrl+c 눌러서 -1이 반환되기 전까지 루프
		{
			System.out.println("input: "+((char)input));
			count++;
		}
		
//		while(true)
//		{
//			input= in.read();
//			System.out.println("input: "+input);
//			count++;
//			
//			if(input=='x')
//				break;
//		}
		System.out.println("총 "+count+"bytes 입력받음");
		
		//사용한 stream 닫기
		in.close();
		System.out.close();
		
	}
}
