package IO.k20191203;

/*
[실습] 키보드로 입력한 내용을 file(result.txt)로 저장해봅시다

	- 데이터소스: 키보드(System.in)
	- 데이터목적지: file(FileOutputStream)
	
*/
import java.io.*;

public class FileInOut2 {

	public static void main(String[] args) throws IOException{
		
		System.out.println("당신이 입력한 문서는 result.txt로 저장됩니다");
		System.out.println("입력하세오");
		
		String file="c:/MyJava/result.txt";
		FileOutputStream fos= new FileOutputStream(file, true);	//노드 연결
												//true를 주면 append기능: 기존파일에 덧붙임
		
		int n=0, count=0, total=0;
		byte data[]= new byte[100];
		while((n=System.in.read(data))!=-1)
		{
			fos.write(data,0,n);
			fos.flush();
			count++;
			total+=n;
		}
		
		System.out.println("total: "+total+" bytes");
		
		System.in.close();
		fos.close();
		
	}
}
