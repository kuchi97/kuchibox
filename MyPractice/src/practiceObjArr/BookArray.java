package practiceObjArr;
//3개짜리 book 객체 배열을 만들고 사용자로부터 책제목과 저자를 입력받아 배열에 저장하라
import java.util.Scanner;

class Book
{
	private String title, author;
	
	//생성자
	public Book(String title, String author)
	{
		this.title=title;
		this.author=author;
	}
	public Book()
	{
		this("","");
	}
	
	//setter, getter
	public void setTitle(String title)
	{
		this.title=title;
	}
	public String getTitle()
	{
		return title;
	}
	
	public void setAuthor(String author)
	{
		this.author=author;
	}
	public String getAuthor()
	{
		return author;
	}
	
}
public class BookArray {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		//배열생성
		Book bookArr[]= new Book[3];
		
		//입력받아 저장하기
		for(int i=0; i<bookArr.length; i++)
		{
			//book객체 생성
			Book book= new Book();
			
			System.out.println((i+1)+"번째 책");
			//저자입력받기
			System.out.print("저자 :");
			book.setAuthor(sc.next());
			//제목입력받기
			System.out.print("제목 :");
			book.setTitle(sc.next());
			
			//배열에 입력받은값 저장
			bookArr[i]=book;
		}
		
		//배열출력
		for(int i=0; i<bookArr.length; i++)
		{
			System.out.println("=== "+(i+1)+"번째 책 ===");
			System.out.println(bookArr[i].getAuthor());
			System.out.println(bookArr[i].getTitle());
		}
		
		sc.close();

	}

}
