package k06SimpleWordTest;
/*
����ܾ�� ���߱� ����

����ܾ�� �ѱ۴ܾ�� �����Ǵ� word Ŭ������ �ۼ��ϰ�
���α׷������� �̸� �������� word��ü�� Vector<word> �÷��ǿ� �����صд�
�׸��� ���� ����Ͱ��� �����ϰ� ����ڿ��� ������ ������

���� ���� ������ �ƴ� �ܾ �����ϰ� 3�� �����ϰ�,
������Բ� 4���� ���⸦ ����Ѵ�

���� Ŭ�������� ���������� ���͸� �����, �̸� �������� word��ü�� �����ϴ� �ڵ带 �ۼ��Ѵ�
Vector<Word> v= new Vector();
v.add(new Word("love","���"));
v.add(new Word("animal","����"));
...
*/

import java.util.Iterator;
import java.util.Vector;

public class WordQuiz {
	
	Vector<Word> v= new Vector();
	void wordSet()
	{
		
		v.add(new Word("revenge","����"));
		v.add(new Word("baby", "�Ʊ�"));
		v.add(new Word("strength","��"));
		v.add(new Word("nutrition","����"));
		v.add(new Word("cat","�����"));
		
		v.add(new Word("hospital","����"));
		v.add(new Word("cell","����"));
		v.add(new Word("justice","����"));
		v.add(new Word("chance","��ȸ"));
		v.add(new Word("depression","���"));
		
		v.add(new Word("vigor","Ȱ��"));
		v.add(new Word("exception","����"));
		v.add(new Word("normal","������"));
		v.add(new Word("meal","�Ļ�"));
		v.add(new Word("Quality","ǰ��"));
		
	}
	
	public void run()
	{
		String answer[]= new String[4];	//����
		Word w;
		wordSet();
//		System.out.println("���ܾ� �׽�Ʈ ���� (-1 �� �Է��ϸ� ����)");
		
		w=v.get((int)(Math.random()*15));
		System.out.println(w.key);
		
		//��������ֱ�
		answer[(int)(Math.random()*4)]=w.value;
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(!answer[(int)(Math.random()*4)].isEmpty())	//==�迭�� �������������	
					i--;
//				else if()
			}
		}
		
		
		
		
	}
	
	public static void main(String[] args) {
		
		WordQuiz wq= new WordQuiz();
		wq.run();
	}

}
