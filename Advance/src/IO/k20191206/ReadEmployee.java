package IO.k20191206;

// - 직렬화 구현하기: java.io.Serializable 인터페이스를 상속받아야함


import java.io.*;
import java.util.*;

import javax.swing.JFrame;


public class ReadEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		//obj.txt에 쓴 객체를 읽어서 복원한다
		//SaveEmployee에서 저장해준 순서대로 읽어줘야함 안그러면 에러남
		
		//1. 노드스트림 생성
		String file="obj.txt";
		FileInputStream fis= new FileInputStream(file);
		//2. 필터스트림 연결
		ObjectInputStream ois= new ObjectInputStream(fis);
		//3. readObject()
		Object obj1= ois.readObject();
		Date date=(Date)obj1;
		//4. 읽은 내용을 콘솔에 출력
		System.out.println(obj1);
		System.out.println(date);
		System.out.println(date.getTime());
		
		//jframe으로 연결하여 보여주기
		JFrame f=(JFrame)ois.readObject();
		f.pack();
		f.setVisible(true);
		
		//Employee 객체를 readObject하여 print()호출
		Employee emp1=(Employee)ois.readObject();
		Employee emp2=(Employee)ois.readObject();
		Employee emp3=(Employee)ois.readObject();
		Employee emp4=(Employee)ois.readObject();
		emp1.print();
		emp2.print();
		emp3.print();
		emp4.print();
		
		ois.close();
		
		
	}
}
