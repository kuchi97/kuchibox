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

public class InOutTest {
	
	public static void main(String[] args) throws IOException{
		
		int n=0, count=0;
		
		while((n=System.in.read())!=-1)
		{
//			System.out.print((char)n);
			System.out.write(n);
			count++;
		}
		System.out.println("total "+count+" bytes");
		
	}

}
