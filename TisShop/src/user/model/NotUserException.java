package user.model;

public class NotUserException extends Exception {

	//constructor
	public NotUserException()
	{
		super("회원이 아닙니다");
	}
	public NotUserException(String msg)
	{
		super(msg);
	}
}//
