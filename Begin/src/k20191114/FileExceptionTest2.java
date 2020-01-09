package k20191114;

/*
예외처리2: 선언하는방법
throws 이용하기
메소드를 호출하는쪽으로 넘기는법

	- 발생된 예외를 메소드 헤더부분에 throws로 기술한다
	- 예외를 직접 처리하지않고 해당 메소드를 호출한 쪽으로
		넘기겠다는 의미
		결국은 어디선가 처리는 해줘야함
*/

import java.io.*;			//입출력 패키지
import javax.swing.JOptionPane;

public class FileExceptionTest2 {
	
	public static String reading(String fileName)
		//선언
		throws FileNotFoundException, IOException
	{
		System.out.println(fileName);
		String contents= "";
		
		FileReader fr=null;
		char data[]= new char[1000];
		
		
		fr= new FileReader(fileName);		//파일과 노드연결

		fr.read(data,0,1000);				//파일을 읽어서 data 배열에 담음

		int n=fr.read(data,0,1000);
		contents= new String(data,0,n);
		
		fr.close();
		
		return contents;
	}

	public static void main(String[] args) 
	throws FileNotFoundException, IOException
	{
		String fname= JOptionPane.showInputDialog("읽을파일명을 입력");
		
		String str= FileExceptionTest2.reading(fname);
		System.out.println(str);			//파일내용 출력
	}
}
