package IO.k20191203;

/*
[실습] InOutTest.java 파일을 읽어서 콘솔에 출력하기

	- 데이터소스: 파일 (FileInputStream)
	- 데이터 목적지: 콘솔 (System.out)

	- FileInputStream
		: 1byte 기반 stream
		  node stream. 파일과 노드연결함
		
*/

import java.io.*;
public class FileInOut {

	public static void main(String[] args) throws IOException {
												//IOException > FileNotFoundException
		String file="src/IO/k20191203/InOutTest.java";		//데이터 소스
		FileInputStream fis= new FileInputStream(file);		//노드 연결
		
		int n=0, count=0, total=0;
		
//		while((n=fis.read())!=-1)
//			//file 끝에 도달하면 -1을 반환해
//		{
//			System.out.write(n);
//			count++;
//		}
		
		//byte[]에 담아서 바꿔보기
		byte data[]= new byte[10];
		while((n=fis.read(data))!=-1)
		{
			System.out.write(data,0,n);
			count++;
			total+=n;
		}
		
		System.out.println("총 "+total+" bytes");
		
		System.out.close();
		fis.close();
	}
}
