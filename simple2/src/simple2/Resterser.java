package simple2;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Resterser implements Servlet {
public Resterser() {
	System.out.println("while object creation");
}
	
	@Override
	public void init(ServletConfig sc) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("after while object creation");

	}

	@Override
	public void service(ServletRequest areq, ServletResponse ares) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("while object in uses");
	}
	@Override
	public void destroy() {
		System.out.println("while object destroy");
	}
	@Override
	public ServletConfig getServletConfig() {return null;}

	@Override
	public String getServletInfo() {return null;}

	
}
