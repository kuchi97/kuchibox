package IO.k20191206;

/*
기본적으로 알아야함
java.io.File 클래스의 주요 메소드

*/

import java.io.File;

public class FileTest {

	public static void main(String[] args) {
		File file= new File("target.png");
		//파일에 대한 주요 정보를 알 수 있다
		
		long fileSize= file.length();
		System.out.println("파일크기: "+fileSize);
		System.out.println("파일명: "+file.getName());
		System.out.println("절대경로: "+file.getAbsolutePath());
		System.out.println("상대경로: "+file.getPath());
		System.out.println("존재여부: "+file.exists());
		
		File dir= new File("sample","example");	//디렉토리명 ,로 하위디렉토리 구분
		if(!dir.exists())
		{
			//해당디렉토리가 없다면 생성하자
			boolean bool= dir.mkdirs();			//하나이면 mkdir()
			System.out.println("디렉토리 생성여부"+bool);
		}
		else
		{
			boolean bool= dir.delete();
			System.out.println("삭제여부: "+bool);
		}
		
		File dir2= new File("study");
		dir2.mkdir();
		
		//디렉토리 이름변경 >> study -> simple
		dir2.renameTo(new File("rename"));
		
		//디렉토리 삭제
		//	삭제는 해당 디렉토리의 파일이 없을경우에 삭제된다
		dir2.delete();
	}
}
