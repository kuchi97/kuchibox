package IO.k20191206;

import java.io.File;
import java.text.SimpleDateFormat;

import javax.swing.JOptionPane;
public class FileTest2 {

	public static void main(String[] args) {
		
		String dir= JOptionPane.showInputDialog("디렉토리명을 입력하셈");
		
		if(dir==null) return;
		
		File dr= new File(dir);
		
		//dr이 디렉토리인지 여부 판별
		if(!dr.isDirectory())
		{
			System.out.println("디렉토리가 아니야");
			return;
		}
		//해당 디렉토리의 파일목록 가져오기
		// String[] list()  	//파일명만 가져옴
		// File[] listFiles()  	//파일에 대한 정보도 가져옴(file 배열이니까)
		// File[] listFiles(FileFilter filter)  //가져오고싶은거만 가져올수있음(filter매개변수로)
		
//		System.out.println("\n******String[] list() ******\n");
//		String fileListStr[] = dr.list();
//		
//		if(fileListStr!=null)
//		{
//			for(String file: fileListStr)
//			{
//				System.out.println(file);
//			}			
//		}
		
		
		System.out.println("\n******File[] listFiles() *****\n");
		File fileListFile[]= dr.listFiles();
		SimpleDateFormat sdf= new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
		
		if(fileListFile!=null)
		{
			for(File file: fileListFile)
			{
				System.out.println("name: "+file.getName());
				System.out.println("length: "+file.length());
				System.out.println("directory?: "+file.isDirectory());
				
				//java.util.Date에 날짜를 long으로 받는 생성자가 있음
				String dateStr=sdf.format(new java.util.Date(file.lastModified()));
				System.out.println("lastModified: "+dateStr);
			}			
		}
	}
}
