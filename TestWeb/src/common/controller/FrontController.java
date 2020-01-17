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
	//Command.properties 파일에 있는 key, value를 가져와서 cmdMap에 옮긴다
	
	
	@Override
	public void init(ServletConfig config) throws ServletException
	{
		super.init(config);
		//@WebInitParam에 기술되어있는 init-param config 값을 읽어오자
		String props= config.getInitParameter("config");
		System.out.println("props: "+props);
		
		//proterties객체생성
		Properties pr= new Properties();
		
		try {
			FileInputStream fis= new FileInputStream(props);
			pr.load(fis);
			//Command.properties 파일의 경로를 Properties객체에 저장한다
			
			fis.close();
			System.out.println(pr.getProperty("/testMember.do"));
			
			//pr의 키값들만 추출해보자
			Enumeration<Object> en= pr.keys();
			while(en.hasMoreElements())
			{
				Object key= en.nextElement();
				String cmd= key.toString();			//아마 index.do가 들어올거임
				String className= pr.getProperty(cmd);		//xxxIndexAction
				
				System.out.println("cmd: "+cmd);
				System.out.println("classname: "+className);
				
				if(className != null)
				{
					className=className.trim();		//공백제거
				}
				
				//해당 클래스를 객체화하여 메모리에 올린다
				Class cls= Class.forName(className);
				Object cmdObj= cls.newInstance();		//객체를 메모리에 올려준다
				
				cmdMap.put(cmd,  cmdObj);			//이 객체들을 해시맵에 저장한다
				
			}//--while
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);			//브라우저에 예외기록출력
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
			System.out.println("액션이 null");
			return;
		}
		AbstractAction action= (AbstractAction)obj;
		
		try {
			action.execute(req, res);		//서브컨트롤러의 일을 수행
			
			//이동할 뷰페이지를 지정
			String viewPage=action.getViewPage();
			if(viewPage==null)
			{
				System.out.println("뷰페이지가 null");
				viewPage="index.jsp";
			}
			
			//이동방식에 따라 해당 뷰페이지로 이동
			if(action.isRedirect())
			{
				res.sendRedirect(viewPage);
			}
			else
			{
				//forward 이동
				RequestDispatcher disp= req.getRequestDispatcher(viewPage);
				disp.forward(req, res);
			}
			
		} catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);
		}
	}
}
