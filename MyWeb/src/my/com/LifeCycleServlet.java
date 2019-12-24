package my.com;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*

package my.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
 * m44-981-678 
 * [1] -->로드?-->No-->서블릿 객체 생성(생성자 호출)
 * 	-->init()호출(딱 한번 호출되는 메소드)
 * 	-->service()메소드 호출(요청이 있을 때마다 수시로 호출되며,
 * 					스레드로 처리되는 부분)
 * 	-->서버shutdown(종료)시 destory()호출
 * 				(정상 종료시 한번 호출됨)
 * [2]-->로드?-Yes-->service()호출==>종료==>destory()
 * 
 * service()메소드는 요청이 있을 때마다 호출되며
 * 스레드가 서비스 메소드 부분을 수행한다.
 * service()메소드 안에서는 메소드 요청방식을 분석하여
 * get방식이면 doGet()을 호출하고,
 * post방식이면 doPost()를 호출한다.
 * 
@WebServlet("/LifeCycle")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int count;

    public LifeCycleServlet() {
        super();
        System.out.println("LifeCycleServlet()객체생성");
    }
    @Override
    public void init() throws ServletException{
    	super.init();
    	count=0;
    	System.out.println("init()메소드 호출됨...");
    }
    @Override
    public void service(HttpServletRequest req,
    		HttpServletResponse res)
    throws ServletException,IOException
    {
    	
//    	String method=req.getMethod();
//    	if(method.contentEquals("get")){
//    		doGet(req,res);
//    	}else if(method.contentEquals("post")){
//    		doPost(req,res);
//    	}
    	
    	System.out.println("service()메소드 호출됨");
    	 *service()메소드는 스레드에 의해 호출되는 메소드.
    	 * 첫 클라이언트 요청시 init()이 호출되고, 이후
    	 * 요청 부터는 스레드에 의해 service()가 호출된다.
    	
    	res.setContentType("text/html; charset=UTF-8");
    	PrintWriter pw=res.getWriter();
    	pw.println("<h1>Servlet Life Cycle</h1>");
    	count++;
    	pw.println("<h2>Count: "+count+"</h2>");
    	
    	//현재 실행 중인 스레드 이름을 출력해보자.
    	Thread tr=Thread.currentThread();
    	pw.println("<h2>스레드 이름: "+tr.getName()+"</h2>");
    	
    	//가용 메모리
    	Runtime rt=Runtime.getRuntime();
    	long memory=rt.freeMemory();
    	pw.println("<h3>현재 가용 메모리: "+memory+"</h3>");
    	if(count>10){
    		//Garbage Collector를 호출
    		System.gc();
    		long memory2=rt.freeMemory();
   pw.println("<h3>GC호출후 가용 메모리: "+memory2+"</h3>");
   			count=0;
    	}//if------
    	
    	pw.close();
    }
    
    @Override
    public void destroy(){
    	super.destroy();
    	System.out.println("destroy()메소드 호출됨");
    	//WAS서버가 정상종료 될 때 딱 한번만 호출한다.
    	//자원 반납할 일이 있으면 여기서 구현
    }

}

*/


@WebServlet("/LifeCycle")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	//server side applet ==> servlet
	
	int count;
       
    public LifeCycleServlet() {
        super();
        System.out.println("LifeCycleServlet() 생성자..");
        
    }
    
    //init(): 최초로 해당 서블릿에 대한 요청이 있을때 딱 한번 수행되는 메소드
    // ex> 첫방문자가 들어오면 한번 실행, 두번째 방문자부터는 실행 안해
    @Override
    public void init() throws ServletException
    {
    	super.init();
    	count=0;
    	System.out.println("init()호출됨");
    	
    	
    }
    
    //service(): 클라이언트의 요청이 있을때마다 수행되는 메소드
    //			스레드에 의해 호출된다
    //서블릿은 이 메소드 안에서 요청방식(method)을 분석해서
    //get방식 요청이면 doGet()을 , post 방식 요청이면 doPost()등을 호출한다
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
    	/* 
    	super.service(req, res);
    	super service()는 어떻게 돌아가는가?
    	
    	String method= req.getMethod();
    	if(method.equals("get"))
    		doGet(req,res);
    	else
    		doPost(req,res);
    	
    	이렇게!
    	*/
    	
    	System.out.println("service() 호출됨: 스레드에 의해 호출된것");
    	res.setContentType("text/html; charset=UTF-8");
    	PrintWriter out= res.getWriter();
    	
    	count++;
    	out.println("<h1>Servlet Life Cycle: 나주평야~</h1>");
    	out.println("<h2 style='color:red;'>"+count+"</h2>");
    	Thread th= Thread.currentThread();
    	out.println("<h2>스레드 이름: "+th.getName()+"</h2>");

    	//가용 메모리
    	Runtime rt= Runtime.getRuntime();
    	long memorySize=rt.freeMemory();		//현재 사용가능한 메모리 반환
    	out.println("<h3>현재 사용가능한 메모리: "+memorySize+"</h3>");
    	
    	if(count==10)
    	{
    		//가비지컬렉터 호출
    		System.gc();
    		memorySize=rt.freeMemory();
    		out.println("<hr color='red'>");
    		out.println("<h3>GC호출 후 사용가능한 메모리: "+memorySize+"</h3>");
    		count=0;
    	}
    	
    	out.close();
    }
    
    
    //destroy(): WAS서버가 정상종료(shutdown)될때 딱한번 호출한다
    //			자원을 반납할일일 있을때 여기서 구현한다
    @Override
    public void destroy()
    {
    	super.destroy();
    	System.out.println("destroy()호출됨");
    }

}
