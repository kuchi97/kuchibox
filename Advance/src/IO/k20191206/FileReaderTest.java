package IO.k20191206;

/*
FileReader/FileWriter
	- 2byte기반(char기반) 스트림
	- node stream (파일과 노드연결)
	
	- 1byte기반 스트림과의 차이점
		: int read()	>> 1byte기반 스트림
		: int read(char[] buf)	>>2byte기반 스트림

*/

import java.io.*;

public class FileReaderTest {

	public static void main(String[] args) throws FileNotFoundException, IOException{
		
		String file="src/io/k20191206/BIStream.java";
		
		//text기반이면 FileReader를 쓰면 좋다
		FileReader fr= new FileReader(file);		//2byte 기반
		
		//console에 출력
		//2byte 기반 스트림이면 2byte기반 출력으로 맞춰주는게 좋다
		PrintWriter pw= new PrintWriter(System.out);	//2byte 기반
		
		//copy.txt파일에 BIStream.java 파일 내용을 복사하기
		//	>>FileWriter(2byte기반 스트림)이용하기
		String fileTo="copy.txt";
		FileWriter fw= new FileWriter(fileTo);
		
		
		int n=0;
		
//		while((n=fr.read())!=-1)
//		{
//			pw.write(n);
//			pw.flush();
//		}
		
		//배열에 담아서 읽고 쓰기
		//단 배열은 char[]
		char box[]= new char[1000];
		while((n=fr.read(box))!=-1)
		{
			//printwriter
			pw.write(box,0,n);
			pw.flush();
			
			//filewriter
			fw.write(box,0,n);
			fw.flush();
		}
		
		
		//close
		pw.println("copy.txt에 복사완료");
		fw.close();
		pw.close();
		fr.close();
	}
}
