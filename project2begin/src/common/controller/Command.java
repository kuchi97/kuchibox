package common.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//�������̽�: �߻�޼ҵ�� ������� ������ �صѰ���
public interface Command {
	
	//�߻�xxx ���� public abstract�� �ڵ����� �ٴ´ٱ�
	void execute(HttpServletRequest req, HttpServletResponse res) throws Exception;

}
