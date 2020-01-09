package IO.k20191203;

/*
pic.png 이미지파일을 카피하여 target.png파일로 내보내기

	- 데이터소스: 파일(pic.png)			>>	FileInputStream
	- 데이터목적지: 파일(target.png)	>>	FileOutputStream

*/


import java.io.*;

public class ImageCopy {
	
	public static void main(String[] args) throws IOException{
		
		String inputFile="C:/Myjava/pic.png";
		String outputFile="target.png";
		
		//node connect
		FileInputStream fis= new FileInputStream(inputFile);
		FileOutputStream fos= new FileOutputStream(outputFile);
		
		int n=0, count=0;
		
//		while((n=fis.read())!=-1)
//		{
//			fos.write(n);
//			fos.flush();
//			count++;
//		}
		
		byte data[]= new byte[1024];
		int total=0;
		
		while((n=fis.read(data))!=-1)
		{
			fos.write(data,0,n);
			fos.flush();
			count++;
			total+=n;
		}
		
		System.out.println(count+" looped");
		System.out.println(total+" bytes used");
		
		fis.close();
		fos.close();
		
	}

}
