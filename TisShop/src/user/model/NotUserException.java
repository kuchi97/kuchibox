package user.model;

public class NotUserException extends Exception {

	//constructor
	public NotUserException()
	{
		super("ȸ���� �ƴմϴ�");
	}
	public NotUserException(String msg)
	{
		super(msg);
	}
}//
