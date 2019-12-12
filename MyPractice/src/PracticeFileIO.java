import java.io.*;


public class PracticeFileIO {
	
	public static void main(String[] args) throws Exception{
		
		String sourcePath="c:/myhtml/ex01.html";
		FileReader fr= new FileReader(sourcePath);
		String targetPath="c:/myjava/target/practice.txt";
		FileWriter fw= new FileWriter(targetPath);
		
		int n=0;
		
		while((n=fr.read())!=-1)
		{
			fw.write(n);
			fw.flush();
		}
		
		fw.close();
		fr.close();
	}

}
