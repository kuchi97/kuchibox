package ExerciseChap3;

//���������� ���� �Է¹޾�
//�Է��� �׼��� �������� �󸶳� ��µǴ��� �˷��ִ� ���α׷�
//�ݵ�� �迭�� �ݺ������� �ۼ��Ұ�
//
//�ݾ��� �Է��Ͻÿ�>>65123
//50000��¥��: 1��
//10000��¥��: 1��
//1000��¥�� : 5��
//100��¥�� : 1��
//10��¥��: 2��
//1��¥��: 3
import java.util.Scanner;

public class ExCh3No6 {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		int unit[]= {50000,10000,5000,1000,500,100,50,10,1};
		
		System.out.print("input gold: ");
		int input= sc.nextInt();
		
		for (int i = 0; i < unit.length; i++) {
			
			System.out.println(unit[i]+"�� ¥��: "+input/unit[i]);
			input%=unit[i];
		}
	}
}
