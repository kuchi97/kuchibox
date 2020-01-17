package common.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FileDownloadServlet
 */
@WebServlet("/fileDown")
public class FileDownloadServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		download(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		download(request, response);
	}

	private void download(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//1. �ٿ�ε��� ���ϸ� �޾ƿ���
		String filename= req.getParameter("filename");		//������ ���ϸ�
		String originFilename=req.getParameter("origin");	//���� ���ϸ�
		System.out.println("filename: "+filename+", origin: "+originFilename);
		
		//2. ���ε� ���丮�� ������ ���
		ServletContext app= req.getServletContext();
		String upDir=app.getRealPath("/upload");
		System.out.println("upDir: "+upDir);
		
		//3. �ٿ�ε�â�� �����Ű������ response �����
		// ����Ʈ������ �������� �Ľ��ϱ� ����� Ÿ������ ��������
		// �������� �˼��ִ������̸� �����ְ� �𸣴�Ÿ���̸� �ٿ�ε�â�� �����Ų��
		res.setContentType("application/octet-stream");
		
		//���ϸ��� �ѱ�ó���� ���� charset�� ISO-8859-1�� ó���Ѵ�
		String filename_en= new String(originFilename.getBytes(), "ISO-8859-1");
		
		//4. ����� Content-Disposition ���� (�ٿ�ε� â�� �ش� ���ϸ��� �߰��ϱ�)
		// �ߺ������ϰ�� ����������϶� �ڿ� �ߺ����� �ε��� �ٴ°ͱ��� ��µȴ�
		// �̸� �����ϱ� ���� ������ ���ϸ��ٴ� �������ϸ��� ��µǵ��� �Ѵ�
		String arg1="attachment; filename="+filename_en;
		res.setHeader("Content-Disposition", arg1);
		
		//5. ��Ʈ�� �����Ͽ� �а� �������� ���� ��������
		String path=upDir+"/"+filename;	//������ �ҽ�(����)
		//������ �ٿ�ε��Ҷ��� ���������ϰ� ��Ʈ���� �����Ѵ�
		
		//���⵵ BufferedInputStream���� ���͸�
		BufferedInputStream in= new BufferedInputStream(new FileInputStream(path));

		//������ ������ >> Ŭ���̾�Ʈ(������)������ ���
		ServletOutputStream sos= res.getOutputStream();
		//BufferedOutputStream ���� ���͸�
		BufferedOutputStream out= new BufferedOutputStream(sos);
		
		int n;
		byte[] data= new byte[4000];
		
		while((n=in.read(data))!=-1)
		{
			out.write(data,0,n);
			out.flush();
		}
		
		in.close();
		out.close();
		sos.close();
		
		
		
	}

}
