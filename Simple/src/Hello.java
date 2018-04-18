import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;


public class Hello implements Servlet {
	public static void main(String[] args) {}
		public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name=req.getParameter("sm");
		PrintWriter pw = res.getWriter();
		pw.println(name+"...... i am so sorry and i love so much sorry");
		}	
		public void destroy() {	}
	public ServletConfig getServletConfig() {return null;}
	public String getServletInfo() {return null;}
	public void init(ServletConfig arg0) throws ServletException {	}

}

