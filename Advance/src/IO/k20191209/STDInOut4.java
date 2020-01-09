package IO.k20191209;

/*
PrintWriter
	- 2byte기반 스트림
	- 필터스트림
	- write()도 있고 print(), println()메소드도 있다!
	- autoflush 지원: 생성자에서 매개변수로 true를 준다
	
*/

//실습. 키보드입력, 콘솔출력



import java.io.*;

public class STDInOut4 {

	public static void main(String[] args) throws IOException{
		
//		BufferedReader br= new BufferedReader(System.in);	//에러남 1byte-2byte기반 스트림의 충돌
		BufferedReader br= new BufferedReader(new InputStreamReader(System.in));	
												//다리역할의 InputStreamReader로 입력받음

		PrintWriter pw= new PrintWriter(System.out, true);
											//true값 주면 autoflush()!!!
											//newLine()만나면 자동으로 flush 해줌

		pw.println("입력하세요");
		
		String line="";
		while((line=br.readLine())!=null)
				//String readLine();
		{
			pw.println(line);			//pw.write(line+"\n") 해줘야함
			
		}
		
		//입력받고 엔터(\r\n)치면 엔터치기 전까지만 line변수에 넣어줌 (엔터값 미포함)
		//그래서 줄바꿈해주려면 newLine()을 중간에 넣어줘야함
		
		br.close();
		
		
	}
}
