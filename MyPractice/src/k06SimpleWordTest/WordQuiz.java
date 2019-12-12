package k06SimpleWordTest;
/*
영어단어뜻 맞추기 게임

영어단어와 한글단어로 구성되는 word 클래스를 작성하고
프로그램내에서 미리 여러개의 word객체를 Vector<word> 컬렉션에 삽입해둔다
그리고 다음 결과와같이 랜덤하게 사용자에게 문제를 던진다

벡터 내에 정답이 아닌 단어를 랜덤하게 3개 선택하고,
정답과함께 4개의 보기를 출력한다

현재 클래스에서 다음과같이 벡터를 만들고, 미리 여러개의 word객체를 삽입하는 코드를 작성한다
Vector<Word> v= new Vector();
v.add(new Word("love","사랑"));
v.add(new Word("animal","동물"));
...
*/

import java.util.Iterator;
import java.util.Vector;

public class WordQuiz {
	
	Vector<Word> v= new Vector();
	void wordSet()
	{
		
		v.add(new Word("revenge","복수"));
		v.add(new Word("baby", "아기"));
		v.add(new Word("strength","힘"));
		v.add(new Word("nutrition","영양"));
		v.add(new Word("cat","고양이"));
		
		v.add(new Word("hospital","병원"));
		v.add(new Word("cell","세포"));
		v.add(new Word("justice","정의"));
		v.add(new Word("chance","기회"));
		v.add(new Word("depression","우울"));
		
		v.add(new Word("vigor","활력"));
		v.add(new Word("exception","예외"));
		v.add(new Word("normal","보통의"));
		v.add(new Word("meal","식사"));
		v.add(new Word("Quality","품질"));
		
	}
	
	public void run()
	{
		String answer[]= new String[4];	//보기
		Word w;
		wordSet();
//		System.out.println("영단어 테스트 시작 (-1 을 입력하면 종료)");
		
		w=v.get((int)(Math.random()*15));
		System.out.println(w.key);
		
		//정답집어넣기
		answer[(int)(Math.random()*4)]=w.value;
		
		for(int i=0; i<4; i++)
		{
			for(int j=0; j<i; j++)
			{
				if(!answer[(int)(Math.random()*4)].isEmpty())	//==배열이 비어있지않으면	
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
