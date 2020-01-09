package IO.k20191206;

/*
ObjectInputStream/ObjectOutputStream
	- 1 byte��� ��Ʈ��
	- ���� ��Ʈ��
	- ���: '����ȭ�� ������ ��ü'�� ���Ϸ� �����ϰų� ��Ʈ��ũ�� �����Ҽ� �ִ�
			* ����ȭ: �Ϸķ� ������ ��
	
	

*/

import java.io.*;
import java.util.Date;

import javax.swing.*;

public class SaveEmployee {

	public static void main(String[] args) throws IOException{
		
		//1. ��� ��Ʈ�� ����
		String file="obj.txt";
		FileOutputStream fos= new FileOutputStream(file);
				
		//2. ��ü�� �����ִ� ���ͽ�Ʈ�� ����
		ObjectOutputStream oos= new ObjectOutputStream(fos);
		
		Date today= new Date();		//��ü
		//fos.write() �ȵ�
		
		oos.writeObject(today);		//��ü�� byte������ �����ؼ� ���Ͽ� ��
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
		
		
		
		System.out.println("obj.txt�� ���� �Ϸ�");
		
		oos.close();
		fos.close();
		
	}
}
