package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�������̽�: �߻�޼ҵ�, ��� ���� ������ �س�������
public interface Command {

	
	//public abstract�� �ڵ����� ������ �������� ����
	void execute(HttpServletRequest req, HttpServletResponse res) throws Exception;
}
