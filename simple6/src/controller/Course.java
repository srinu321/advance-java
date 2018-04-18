package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.GenericServlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class Course extends GenericServlet {
	private static final long serialVersionUID = 1L;
	private Connection conn;
	@SuppressWarnings("unused")
	public void init(ServletConfig config) throws ServletException {
		ServletContext sc =	config.getServletContext();
		String driver=sc.getInitParameter("driver");
		String url=sc.getInitParameter("url");
		String s1 =config.getInitParameter("username");
		String s2 = config.getInitParameter("password");
		System.out.println("course user name "+s1);
		System.out.println("course password "+s2);
		try{
			Class.forName(driver);
			 conn = DriverManager.getConnection(url,s1,s2);
			
		}catch(Exception e){
			System.out.println(e);
		}
		}
		
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
	
		PrintWriter pwo=	res.getWriter();
		int cid =Integer.parseInt(req.getParameter("cid"));	
		String cname = req.getParameter("cname");
		String fee = req.getParameter("fee");
		try{
		PreparedStatement pst = conn.prepareStatement("insert into student values(?,?,?)");
		pst.setInt(1, cid);
		pst.setString(2, cname);
		pst.setString(3, fee);

		int i = pst.executeUpdate();
		System.out.println(i);
		if(i!=0){
			pwo.println("<font color = 'green'><h1> reg success</h1></font>");
		}
		else{
			pwo.println("<font color = 'red'><h1> reg failed</h1></font>");
		}
		}catch(Exception e){
			System.out.println(e);
		}
	
	
	}
	@Override
	public void destroy() {
	try {
		conn.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	}

}
