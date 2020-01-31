package common.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

@WebFilter("/*")
public class EncodingFilter implements Filter{
	
	public void destroy() {
		
	}

	/*
	doFilter()
	: request�� ������ ���� ����ó���� �ڵ尡 �ִٸ� �̰����� �����Ѵ�
	����, response�� ���� �Ŀ� ����ó���� �ڵ尡 �ִٸ� ���� ���⼭ �����Ѵ�
	�츮�� ��� ��û�� ó���ϱ� ���� �ѱ� ���ڵ�ó���� ���Ϳ��� �� ����
	
	*/
	
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
	throws IOException, ServletException {
		request.setCharacterEncoding("UTF-8");
		
		//pass the request along the filterchain
		chain.doFilter(request, response);
	}
	
	public void init(FilterConfig fConfig) throws ServletException {
		
	}
}
