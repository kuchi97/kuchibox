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
 * [1] -->�ε�?-->No-->���� ��ü ����(������ ȣ��)
 * 	-->init()ȣ��(�� �ѹ� ȣ��Ǵ� �޼ҵ�)
 * 	-->service()�޼ҵ� ȣ��(��û�� ���� ������ ���÷� ȣ��Ǹ�,
 * 					������� ó���Ǵ� �κ�)
 * 	-->����shutdown(����)�� destory()ȣ��
 * 				(���� ����� �ѹ� ȣ���)
 * [2]-->�ε�?-Yes-->service()ȣ��==>����==>destory()
 * 
 * service()�޼ҵ�� ��û�� ���� ������ ȣ��Ǹ�
 * �����尡 ���� �޼ҵ� �κ��� �����Ѵ�.
 * service()�޼ҵ� �ȿ����� �޼ҵ� ��û����� �м��Ͽ�
 * get����̸� doGet()�� ȣ���ϰ�,
 * post����̸� doPost()�� ȣ���Ѵ�.
 * 
@WebServlet("/LifeCycle")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	int count;

    public LifeCycleServlet() {
        super();
        System.out.println("LifeCycleServlet()��ü����");
    }
    @Override
    public void init() throws ServletException{
    	super.init();
    	count=0;
    	System.out.println("init()�޼ҵ� ȣ���...");
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
    	
    	System.out.println("service()�޼ҵ� ȣ���");
    	 *service()�޼ҵ�� �����忡 ���� ȣ��Ǵ� �޼ҵ�.
    	 * ù Ŭ���̾�Ʈ ��û�� init()�� ȣ��ǰ�, ����
    	 * ��û ���ʹ� �����忡 ���� service()�� ȣ��ȴ�.
    	
    	res.setContentType("text/html; charset=UTF-8");
    	PrintWriter pw=res.getWriter();
    	pw.println("<h1>Servlet Life Cycle</h1>");
    	count++;
    	pw.println("<h2>Count: "+count+"</h2>");
    	
    	//���� ���� ���� ������ �̸��� ����غ���.
    	Thread tr=Thread.currentThread();
    	pw.println("<h2>������ �̸�: "+tr.getName()+"</h2>");
    	
    	//���� �޸�
    	Runtime rt=Runtime.getRuntime();
    	long memory=rt.freeMemory();
    	pw.println("<h3>���� ���� �޸�: "+memory+"</h3>");
    	if(count>10){
    		//Garbage Collector�� ȣ��
    		System.gc();
    		long memory2=rt.freeMemory();
   pw.println("<h3>GCȣ���� ���� �޸�: "+memory2+"</h3>");
   			count=0;
    	}//if------
    	
    	pw.close();
    }
    
    @Override
    public void destroy(){
    	super.destroy();
    	System.out.println("destroy()�޼ҵ� ȣ���");
    	//WAS������ �������� �� �� �� �ѹ��� ȣ���Ѵ�.
    	//�ڿ� �ݳ��� ���� ������ ���⼭ ����
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
        System.out.println("LifeCycleServlet() ������..");
        
    }
    
    //init(): ���ʷ� �ش� ������ ���� ��û�� ������ �� �ѹ� ����Ǵ� �޼ҵ�
    // ex> ù�湮�ڰ� ������ �ѹ� ����, �ι�° �湮�ں��ʹ� ���� ����
    @Override
    public void init() throws ServletException
    {
    	super.init();
    	count=0;
    	System.out.println("init()ȣ���");
    	
    	
    }
    
    //service(): Ŭ���̾�Ʈ�� ��û�� ���������� ����Ǵ� �޼ҵ�
    //			�����忡 ���� ȣ��ȴ�
    //������ �� �޼ҵ� �ȿ��� ��û���(method)�� �м��ؼ�
    //get��� ��û�̸� doGet()�� , post ��� ��û�̸� doPost()���� ȣ���Ѵ�
    @Override
    public void service(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException
    {
    	/* 
    	super.service(req, res);
    	super service()�� ��� ���ư��°�?
    	
    	String method= req.getMethod();
    	if(method.equals("get"))
    		doGet(req,res);
    	else
    		doPost(req,res);
    	
    	�̷���!
    	*/
    	
    	System.out.println("service() ȣ���: �����忡 ���� ȣ��Ȱ�");
    	res.setContentType("text/html; charset=UTF-8");
    	PrintWriter out= res.getWriter();
    	
    	count++;
    	out.println("<h1>Servlet Life Cycle: �������~</h1>");
    	out.println("<h2 style='color:red;'>"+count+"</h2>");
    	Thread th= Thread.currentThread();
    	out.println("<h2>������ �̸�: "+th.getName()+"</h2>");

    	//���� �޸�
    	Runtime rt= Runtime.getRuntime();
    	long memorySize=rt.freeMemory();		//���� ��밡���� �޸� ��ȯ
    	out.println("<h3>���� ��밡���� �޸�: "+memorySize+"</h3>");
    	
    	if(count==10)
    	{
    		//�������÷��� ȣ��
    		System.gc();
    		memorySize=rt.freeMemory();
    		out.println("<hr color='red'>");
    		out.println("<h3>GCȣ�� �� ��밡���� �޸�: "+memorySize+"</h3>");
    		count=0;
    	}
    	
    	out.close();
    }
    
    
    //destroy(): WAS������ ��������(shutdown)�ɶ� ���ѹ� ȣ���Ѵ�
    //			�ڿ��� �ݳ������� ������ ���⼭ �����Ѵ�
    @Override
    public void destroy()
    {
    	super.destroy();
    	System.out.println("destroy()ȣ���");
    }

}
