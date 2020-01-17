package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//인터페이스: 추상메소드, 상수 등을 나열만 해놓을거임
public interface Command {

	
	//public abstract가 자동으로 붙으니 걱정하지 말라구
	void execute(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
