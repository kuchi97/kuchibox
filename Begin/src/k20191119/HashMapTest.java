package k20191119;

import java.util.HashMap;
import java.util.Iterator;
import java.io.Console;

/*
HashMap
	- Hashtable�� ������ ���, �޼ҵ嵵 ����
	- ����ȭ �Ǿ����� �ʾ�, ������ �ַ� ���� (ArrayList�� ���)
	
*/

public class HashMapTest {

	HashMap<String, String> map= new HashMap();
	
	//ȸ������ó���� �ϴ� �޼ҵ�
	public void join()
	{
		map.put("Hong", "123");
		map.put("Gil", "abc");
		map.put("Dong", "!@#");
		map.put("Admin", "tiger");
		System.out.println("ȸ�����ԿϷ�!");
	}
	
	//�α���ó���ϴ� �޼ҵ�
	public void loginCheck()
	{
		//Console�� �̿��Ͽ� �Է¹ޱ�
		Console con= System.console();		//�������� ������Ѿ���
		System.out.println("input id: ");
		String userid= con.readLine();
		System.out.println("input pw: ");
		char[] pwd=con.readPassword();
			//char[] readPassword()
		//�Է�Ȯ��
		String pwdStr= new String(pwd,0,pwd.length);
		System.out.println(userid+" / "+pwdStr);
		
		//id pwd �Է��� �ش� ���̵� map�� �����ϴ��� ã�Ƽ�
		//���ٸ� "ȸ���� �ƴմϴ�"
		//id�� ������ pwd�� �ٸ���� "��й�ȣ�� Ʋ�Ⱦ�"
		//id, pwd�� ��� �´ٸ� "xxx�� ȯ���մϴ�"
		//Admin�̶�� "������ ��带 �̿밡���մϴ�"
		
		//boolean containsKey(Object key)		//HashMap�ȿ� �ش簪�� ���ԵǾ��ֱ⸸ �ϸ�
		//boolean containsValue(Object Value)	//true ��ȯ
		String orgPwd= map.get(userid);
		if(map.containsKey(userid))
		{
			if(userid.contentEquals("Admin"))
			{
				if(orgPwd.contentEquals(pwdStr))
					System.out.println("�����ڸ�� �̿밡��");
				else
					System.out.println("�������");
			}
			
			else if(orgPwd.contentEquals(pwdStr))
			{
				System.out.println(userid+"�� ȯ���մϴ�");
			}
			else
				System.out.println("����� �޶��");
		}
		else
			System.out.println("ȸ�� �ƴѵ�?");
	}
	
	public static void main(String[] args) {
	
		HashMapTest hm= new HashMapTest();
		
		hm.join();
		
		hm.loginCheck();
	}
}
