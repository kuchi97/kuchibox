package common.file;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class FileDownloadServlet
 */
@WebServlet("/FileDown")
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
		String fname= req.getParameter("filename");
		
		//2. ���ε� ���丮�� ������ ���
		String upDir="C:/Myjava/upload";
		
		System.out.println(fname);
		
		//3. �ٿ�ε�â�� �����Ű������ response �����
		// ����Ʈ������ �������� �Ľ��ϱ� ����� Ÿ������ ��������
		// �������� �˼��ִ������̸� �����ְ� �𸣴�Ÿ���̸� �ٿ�ε�â�� �����Ų��
		res.setContentType("application/sctet-stream");
		
		//���ϸ��� �ѱ�ó���� ���� charset�� ISO-8859-1�� ó���Ѵ�
		String fname_en= new String(fname.getBytes(), "ISO-8859-1");
		
		//4. ����� Content-Disposition ���� (�ٿ�ε� â�� �ش� ���ϸ��� �߰��ϱ�)
		String arg1="attachment; filename="+fname_en;
		res.setHeader("Content-Disposition", arg1);
		
		//5. ��Ʈ�� �����Ͽ� �а� �������� ���� ��������
		String path=upDir+"/"+fname;	//������ �ҽ�(����)
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
