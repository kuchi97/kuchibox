package k20191114;

/*
try {} �ϳ��� catch{} �������� �ü��ִ�
	��, �̶����� catch ������ ����
	- �θ�� �ڽ��� ��Ӱ��谡 �ִ� ������ ���
	- �ڽ� ���ܸ� ���� catch �ϰ� �θ𿹿ܸ� ���߿� catch �ؾ��Ѵ�

try~finally {} : �ݵ�� �ѹ��� �����ϴ� ��
	return�� �־ �ݵ�� �����ϰ� ������� �ѱ��
*/
	

import javax.swing.*;

public class ExceptionTest4 {

	public static void main(String[] args) {
		
		String str;
		int num, a;
		try {
			str = JOptionPane.showInputDialog("�����Է�");
			String b= str.substring(0,1);	//523 => 5
			System.out.println("b: "+b);
			num = Integer.parseInt(b);
//			����ڰ� ������ �Է��ϴ��Ŀ� ���� NumberFormatException�̳�
//			ArithMeticException�� ��Ÿ��������
			a= 50/num;
			System.out.println("a: "+a);
			
		} catch (NumberFormatException e) {
			System.out.println("���ڸ� �Է���");
		} catch (ArithmeticException e) {
			System.out.println("0���� ��������");
			//return;
			System.exit(-1);
			//�ý������� �ڵ尡 ���� �ٷ� �����
				//finally�� �������� ����
		} catch (Exception e) {
			System.out.println("�׳ɿ���");
		} finally {
			System.out.println("�ݵ�ü���Ǿ���ϴ��ڵ�");
		}
		System.out.println("E N D ~ ~");

	}

}
