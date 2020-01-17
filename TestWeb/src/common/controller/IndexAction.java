package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.persistence.BoardDAOMyBatis;

//sub controller : 실무담당: AbstractAction을 상속받아 execute()를 재정의한다

public class IndexAction extends AbstractAction{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		System.out.println("indexAction execute()");
		
		//mybatis 활용한 test sql 실행 테스트
		BoardDAOMyBatis dao= new BoardDAOMyBatis();
		int cnt=dao.testTableCount();
		System.out.println("cnt: "+cnt);
		
		
		//1. 모델을 통해 db연동작업(DAO)를 한 뒤, 그 결과물을 request나 session등에 저장
		req.setAttribute("msg", "Hello MVC=> myshop계정의 테이블 수: "+cnt);
		
		//2. 이동할 뷰페이지를 지정하고,
		this.setViewPage("/index.jsp");
		
		//3. 이동방식을 지정한다
		this.setRedirect(false);		//false: forward 방식으로 이동(값을가지고 이동)
	}

	
}
