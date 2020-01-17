package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import board.persistence.BoardDAOMyBatis;

//sub controller : �ǹ����: AbstractAction�� ��ӹ޾� execute()�� �������Ѵ�

public class IndexAction extends AbstractAction{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		
		System.out.println("indexAction execute()");
		
		//mybatis Ȱ���� test sql ���� �׽�Ʈ
		BoardDAOMyBatis dao= new BoardDAOMyBatis();
		int cnt=dao.testTableCount();
		System.out.println("cnt: "+cnt);
		
		
		//1. ���� ���� db�����۾�(DAO)�� �� ��, �� ������� request�� session� ����
		req.setAttribute("msg", "Hello MVC=> myshop������ ���̺� ��: "+cnt);
		
		//2. �̵��� ���������� �����ϰ�,
		this.setViewPage("/index.jsp");
		
		//3. �̵������ �����Ѵ�
		this.setRedirect(false);		//false: forward ������� �̵�(���������� �̵�)
	}

	
}
