package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//인터페이스: 추상메소드와 상수등을 나열만 해둘거임
public interface Command {
	
	//추상xxx 에는 public abstract가 자동으로 붙는다구
	void execute(HttpServletRequest req, HttpServletResponse res) throws Exception;

}
