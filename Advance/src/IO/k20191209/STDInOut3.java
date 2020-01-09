package IO.k20191209;

/*
BufferedReader/BufferedWriter
	- 2byte기반 스트림
	- 필터스트림
	- 버퍼에 모아서 읽고 쓴다
	- line 단위로 읽어들이는 기능이 있다
		: Scanner가 나오기전에는 BufferedReader를 많이 썼대

*/

//실습. 키보드입력, 콘솔출력



import java.io.*;

public class STDInOut3 {

	public static void main(String[] args) throws IOException{
		
//		BufferedReader br= new BufferedReader(System.in);	//에러남 1byte-2byte기반 스트림의 충돌
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
												//다리역할의 InputStreamReader로 입력받음
//		BufferedWriter bw= new BufferedWriter(System.out);
		BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));
		
		bw.write("입력하세요\n");
		bw.flush();
		
		String line="";
		while((line=br.readLine())!=null)
				//String readLine();
		{
			bw.write(line);
			bw.newLine();
			bw.flush();
		}
		
		//입력받고 엔터(\r\n)치면 엔터치기 전까지만 line변수에 넣어줌 (엔터값 미포함)
		//그래서 줄바꿈해주려면 newLine()을 중간에 넣어줘야함
		
		bw.close();
		br.close();
		
		
	}
}
