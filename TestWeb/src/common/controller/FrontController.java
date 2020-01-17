package common.controller;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(
		urlPatterns = { "*.do" }, 
		initParams = { 
				@WebInitParam(name = "config", value = "C:\\Users\\2class-005\\git\\kuchibox\\TestWeb\\WebContent\\WEB-INF\\command.properties")
		})
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private Map<String, Object> cmdMap= new HashMap<>();
	//Command.properties ���Ͽ� �ִ� key, value�� �����ͼ� cmdMap�� �ű��
	
	
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		//@WebInitParam�� ����Ǿ��ִ� init-param config ���� �о����
		String props= config.getInitParameter("config");
		System.out.println("props: "+props);
		
		//proterties��ü����
		Properties pr= new Properties();
		
		try {
			FileInputStream fis= new FileInputStream(props);
			pr.load(fis);
			//Command.properties ������ ��θ� Properties��ü�� �����Ѵ�
			
			fis.close();
			System.out.println(pr.getProperty("/testMember.do"));
			
			//pr�� Ű���鸸 �����غ���
			Enumeration<Object> en= pr.keys();
			while(en.hasMoreElements())
			{
				Object key= en.nextElement();
				String cmd= key.toString();			//�Ƹ� index.do�� ���ð���
				String className= pr.getProperty(cmd);		//xxxIndexAction
				
				System.out.println("cmd: "+cmd);
				System.out.println("classname: "+className);
				
				if(className != null)
				{
					className=className.trim();		//��������
				}
				
				//�ش� Ŭ������ ��üȭ�Ͽ� �޸𸮿� �ø���
				Class cls= Class.forName(className);
				Object cmdObj= cls.newInstance();		//��ü�� �޸𸮿� �÷��ش�
				
				cmdMap.put(cmd,  cmdObj);			//�� ��ü���� �ؽøʿ� �����Ѵ�
				
			}//--while
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);			//�������� ���ܱ�����
		}
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}

	private void process(HttpServletRequest req, HttpServletResponse res) throws ServletException{
		
		String path= req.getServletPath();
		System.out.println("path: "+path);
		
		Object obj=cmdMap.get(path);
		System.out.println("obj: "+obj);
		
		if(obj==null)
		{
			System.out.println("�׼��� null");
			return;
		}
		AbstractAction action= (AbstractAction)obj;
		
		try {
			action.execute(req, res);		//������Ʈ�ѷ��� ���� ����
			
			//�̵��� ���������� ����
			String viewPage=action.getViewPage();
			if(viewPage==null)
			{
				System.out.println("���������� null");
				viewPage="index.jsp";
			}
			
			//�̵���Ŀ� ���� �ش� ���������� �̵�
			if(action.isRedirect())
			{
				res.sendRedirect(viewPage);
			}
			else
			{
				//forward �̵�
				RequestDispatcher disp= req.getRequestDispatcher(viewPage);
				disp.forward(req, res);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
