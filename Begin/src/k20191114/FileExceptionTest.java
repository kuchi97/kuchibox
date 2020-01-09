package k20191114;
/*
Exception
	+---------IOException
					+----------FileNotFoundException
*/

import java.io.*;			//입출력 패키지
import javax.swing.JOptionPane;

public class FileExceptionTest {
	
	public static String reading(String fileName)
	{
		System.out.println(fileName);
		String contents= "";
		
		FileReader fr=null;
		char data[]= new char[1000];
		
		try {
			fr= new FileReader(fileName);		//파일과 노드연결
			
			fr.read(data,0,1000);				//파일을 읽어서 data 배열에 담음
			
			int n=fr.read(data,0,1000);
			contents= new String(data,0,n);
			
			fr.close();
		} catch (FileNotFoundException e) { 
			System.out.println("파일을 못찾겠엉");
		} catch (IOException e) {
			System.out.println("전송오류");
		}
		
		
		return contents;
	}

	public static void main(String[] args) {
		String fname= JOptionPane.showInputDialog("읽을파일명을 입력");
		//./src/k20191114/ExceptionTest.java
		//C:\Myjava\workspace\Begin\src\k20191114\ExceptionTest.java
		String str= FileExceptionTest.reading(fname);
		System.out.println(str);			//파일내용 출력
	}
}
