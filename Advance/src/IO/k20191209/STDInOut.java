package IO.k20191209;

/*
InputStreamReader/OutputStreamWriter
	- 2byte기반 스트림
	- 필터-노드간 다리역할:	bridge stream
	- 1바이트 스트림과 2바이트 필터스트림 사이의 가교역할을 한다
	- 1바이트 입력/출력을 2바이트로 조합하여 읽고쓴다

*/

//실습. 키보드로 입력받아 콘솔에 출력
//		(System.in / System.out)


import java.io.*;

public class STDInOut {

	public static void main(String[] args) throws IOException{
		
		
		InputStreamReader ir= new InputStreamReader(System.in);			//입력받고
		//**입력받은 데이터의 encoding(charSet)을 맞출 수 있다
		OutputStreamWriter ow= new OutputStreamWriter(System.out);		//출력함
		
		ow.write("입력하세요");
			//write(String)  /  write(char[])
		ow.flush();
	
		int n=0;
		while((n=ir.read())!=-1)
		{
			ow.write(n);
				//write(int)
			ow.flush();
			
		}
		
		
		ow.close();
		ir.close();
		
	}
}
