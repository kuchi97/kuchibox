package IO.k20191206;

// - ����ȭ �����ϱ�: java.io.Serializable �������̽��� ��ӹ޾ƾ���


import java.io.*;
import java.util.*;

import javax.swing.JFrame;


public class ReadEmployee {

	public static void main(String[] args) throws IOException, ClassNotFoundException{
		
		//obj.txt�� �� ��ü�� �о �����Ѵ�
		//SaveEmployee���� �������� ������� �о������ �ȱ׷��� ������
		
		//1. ��彺Ʈ�� ����
		String file="obj.txt";
		FileInputStream fis= new FileInputStream(file);
		//2. ���ͽ�Ʈ�� ����
		ObjectInputStream ois= new ObjectInputStream(fis);
		//3. readObject()
		Object obj1= ois.readObject();
		Date date=(Date)obj1;
		//4. ���� ������ �ֿܼ� ���
		System.out.println(obj1);
		System.out.println(date);
		System.out.println(date.getTime());
		
		//jframe���� �����Ͽ� �����ֱ�
		JFrame f=(JFrame)ois.readObject();
		f.pack();
		f.setVisible(true);
		
		//Employee ��ü�� readObject�Ͽ� print()ȣ��
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
