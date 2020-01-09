package IO.k20191206;

/*
ObjectInputStream/ObjectOutputStream
	- 1 byte기반 스트림
	- 필터 스트림
	- 기능: '직렬화가 구현된 객체'를 파일로 저장하거나 네트워크로 전송할수 있다
			* 직렬화: 일렬로 나열된 것
	
	

*/

import java.io.*;
import java.util.Date;

import javax.swing.*;

public class SaveEmployee {

	public static void main(String[] args) throws IOException{
		
		//1. 노드 스트림 생성
		String file="obj.txt";
		FileOutputStream fos= new FileOutputStream(file);
				
		//2. 객체를 쓸수있는 필터스트림 생성
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		Date today= new Date();		//객체
		//fos.write() 안됨
		
		oos.writeObject(today);		//객체를 byte단위로 분해해서 파일에 씀
		oos.flush();
		
		JFrame f= new JFrame("ObjectStream");
		f.getContentPane().add(new JButton("OK"));
		oos.writeObject(f);
		oos.flush();
		
		Employee emp1= new Employee(7788,"Scott","Accounting",3000);
		Employee emp2= new Employee(7601,"Annie","Marketing",4500);
		Employee emp3= new Employee(7322,"Brown","Engineering",2600);
		Employee emp4= new Employee(7001,"King","Boss",10000);
		
		oos.writeObject(emp1);
		oos.writeObject(emp2);
		oos.writeObject(emp3);
		oos.writeObject(emp4);
		oos.flush();
		
		
		
		System.out.println("obj.txt에 쓰기 완료");
		
		oos.close();
		fos.close();
		
	}
}
