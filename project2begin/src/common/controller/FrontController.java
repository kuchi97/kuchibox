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
	//command.properties파일의 key와 value값을 가져와서 저장해줄 map객체
       
	@Override
	public void init(ServletConfig config) throws ServletException {
		super.init(config);
		
		/* @WebInitParam에 있는 init-param config값을 읽어온다 */
		String props= config.getInitParameter("config");
		//@WebInitParam의 키값 config의 밸류값을 props에 저장함
		System.out.println("경로props:"+props);
		
		
		/* Properties객체 생성 */
		Properties pr= new Properties();
		/*
		command.properties 파일의 경로를 Properties 객체에 저장한다 
		저장하려면 input stream이 필요한가봄
		*/
		try {
			FileInputStream fis= new FileInputStream(props);
			pr.load(fis);
			
			fis.close();
			System.out.println(pr.getProperty("/index.do"));
			
			//pr의 키값들만 추출해보기
			Enumeration<Object> en= pr.keys();
			while(en.hasMoreElements()) {
				Object key= en.nextElement();
				String cmd= key.toString();				//index.do가 들어옴
				String className=pr.getProperty(cmd);	//xxxIndexAction
				
				System.out.println("[FrontController] cmd: "+cmd);
				System.out.println("[FrontController] className: "+className);
				
				if(className != null) {
					className=className.trim();
				}
				
				/*해당 클래스를 객체화하여 메모리에 올린다*/
				Class cls= Class.forName(className);
				Object cmdObj= cls.newInstance();		//객체를 메모리에 올려줌
				
				cmdMap.put(cmd,  cmdObj);			//만들어둔 맵에 저장
			}//--while
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);				//브라우저에 예외 출력해주기
		}
	}

	/* get이나 post나 관계없이 process라는 메소드로 전송해줄거임 */
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
			System.out.println("[FrontController] 액션이 null");
			return;
		}
		
		AbstractAction action= (AbstractAction)obj;
		//obj는 path의 value값. 형변환 해줘야됨
		//AbstractAction에는 viewPage와 isRedirect가 들어있고 Command를 상속받고있다
		
		try {
			action.execute(req, res);			//서브컨트롤러의 일을 수행한다
			
			//이동할 뷰페이지 지정
			String viewPage= action.getViewPage();
			if(viewPage==null) {
				System.out.println("[FrontController] 뷰페이지가 null");
				viewPage="index.jsp";
			}
			
			//이동방식에 따라 해당 뷰페이지로 이동
			if(action.isRedirect()) {
				res.sendRedirect(viewPage);
			}
			else {
				//isRedirect가 false일 경우 경로지정
				RequestDispatcher disp= req.getRequestDispatcher(viewPage);
				disp.forward(req, res);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
			throw new ServletException(e);			//에러를 화면에 띄워주세요
		}
	}
	

}
