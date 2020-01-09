package IO.k20191206;

/*
BufferedInputStream/BufferedOutputStream
	- 1byte기반 스트림
	- Filter스트림
	- byte단위로 들어오는 데이터를 버퍼에 모아서 읽어들인다
		데이터는 버퍼가 누적되고 가득차게되면 한꺼번에 읽거나 쓴다
	- 기본 버퍼크기는 512byte
	
*/

//[실습] 키보드로 입력받은 내용을 콘솔에 출력하기
//System.in >> BufferedInputStream
//System.out >> BufferedOutputStream
import java.io.*;

public class BIStream {

	public static void main(String[] args) throws IOException{
		
		BufferedInputStream bis= new BufferedInputStream(System.in);
		BufferedOutputStream bos= new BufferedOutputStream(System.out);
		
		System.out.println("입력하세요");
		int n=0, count=0;
		
		//키보드로 입력ㅎ받은 내용을 콘솔과 동시에 파일로도 내보내기
		//bis.txt 단, bufferedoutputstream 이용
		
		FileOutputStream fos= new FileOutputStream("bis2.txt");			//이거도 됨
		
		//선생님 풀이
		BufferedOutputStream bos2=	new BufferedOutputStream(new FileOutputStream("bis.txt"));
		
		while((n=bis.read())!=-1)
		{
			bos.write(n);
			bos.flush();	//해주면 엔터치는 즉시 바로 출력함
			bos2.write(n);
			bos2.flush();
			fos.write(n);
			fos.flush();
			count++;
		}
		System.out.println(count+" bytes");

		fos.close();
		bos2.close();
		bos.close();
		bis.close();
		
	}
}
