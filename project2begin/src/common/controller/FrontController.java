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
		urlPatterns= {"*.do"},
		initParams= {
				@WebInitParam(name="config", value="C:\\Users\\2class-005\\git\\kuchibox\\project2begin\\WebContent\\WEB-INF\\command.properties")
		})
public class FrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	private Map<String, Object> cmdMap= new HashMap<>();
	//command.properties������ key�� value���� �����ͼ� �������� map��ü
       
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		/* @WebInitParam�� �ִ� init-param config���� �о�´� */
		String props= config.getInitParameter("config");
		//@WebInitParam�� Ű�� config�� ������� props�� ������
		System.out.println("���props:"+props);
		
		
		/* Properties��ü ���� */
		Properties pr= new Properties();
		/*
		command.properties ������ ��θ� Properties ��ü�� �����Ѵ� 
		�����Ϸ��� input stream�� �ʿ��Ѱ���
		*/
		try {
			FileInputStream fis= new FileInputStream(props);
			pr.load(fis);
			
			fis.close();
			System.out.println(pr.getProperty("/index.do"));
			
			//pr�� Ű���鸸 �����غ���
			Enumeration<Object> en= pr.keys();
			while(en.hasMoreElements()) {
				Object key= en.nextElement();
				String cmd= key.toString();				//index.do�� ����
				String className=pr.getProperty(cmd);	//xxxIndexAction
				
				System.out.println("[FrontController] cmd: "+cmd);
				System.out.println("[FrontController] className: "+className);
				
				if(className != null) {
					className=className.trim();
				}
				
				/*�ش� Ŭ������ ��üȭ�Ͽ� �޸𸮿� �ø���*/
				Class cls= Class.forName(className);
				Object cmdObj= cls.newInstance();		//��ü�� �޸𸮿� �÷���
				
				cmdMap.put(cmd,  cmdObj);			//������ �ʿ� ����
			}//--while
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);				//�������� ���� ������ֱ�
		}
	}

	/* get�̳� post�� ������� process��� �޼ҵ�� �������ٰ��� */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		process(request, response);
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		process(request, response);
	}
	
	private void process(HttpServletRequest req, HttpServletResponse res) throws ServletException {
		String path= req.getServletPath();
		System.out.println("[FrontController] path: "+path);
		
		Object obj=cmdMap.get(path);
		System.out.println("[FrontController] obj: "+obj);
		
		if(obj==null) {
			System.out.println("[FrontController] �׼��� null");
			return;
		}
		
		AbstractAction action= (AbstractAction)obj;
		//obj�� path�� value��. ����ȯ ����ߵ�
		//AbstractAction���� viewPage�� isRedirect�� ����ְ� Command�� ��ӹް��ִ�
		
		try {
			action.execute(req, res);			//������Ʈ�ѷ��� ���� �����Ѵ�
			
			//�̵��� �������� ����
			String viewPage= action.getViewPage();
			if(viewPage==null) {
				System.out.println("[FrontController] ���������� null");
				viewPage="index.jsp";
			}
			
			//�̵���Ŀ� ���� �ش� ���������� �̵�
			if(action.isRedirect()) {
				res.sendRedirect(viewPage);
			}
			else {
				//isRedirect�� false�� ��� �������
				RequestDispatcher disp= req.getRequestDispatcher(viewPage);
				disp.forward(req, res);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);			//������ ȭ�鿡 ����ּ���
		}
	}
	

}
