package practiceObjArr;
//3��¥�� book ��ü �迭�� ����� ����ڷκ��� å����� ���ڸ� �Է¹޾� �迭�� �����϶�
import java.util.Scanner;

class Book
{
	private String title, author;
	
	//������
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
		
		//�迭����
		Book bookArr[]= new Book[3];
		
		//�Է¹޾� �����ϱ�
		for(int i=0; i<bookArr.length; i++)
		{
			//book��ü ����
			Book book= new Book();
			
			System.out.println((i+1)+"��° å");
			//�����Է¹ޱ�
			System.out.print("���� :");
			book.setAuthor(sc.next());
			//�����Է¹ޱ�
			System.out.print("���� :");
			book.setTitle(sc.next());
			
			//�迭�� �Է¹����� ����
			bookArr[i]=book;
		}
		
		//�迭���
		for(int i=0; i<bookArr.length; i++)
		{
			System.out.println("=== "+(i+1)+"��° å ===");
			System.out.println(bookArr[i].getAuthor());
			System.out.println(bookArr[i].getTitle());
		}
		
		sc.close();

	}

}
