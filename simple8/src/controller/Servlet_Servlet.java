package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		
		PrintWriter pw= res.getWriter();
		String name = req.getParameter("name");
		String fname = req.getParameter("fname");
		String mname =req.getParameter("mname");
		boolean b = false;
	
				if(name.equals(" ")){
					pw.println("<body style='background-color:red;'>");
					
			pw.println("please fill the name");
			pw.println("</body>");
			b = false;			
		}
if(fname.equals("")){
	pw.println("<body style='background-color:red;'>");
	pw.println("please fill the father name");
	pw.println("</body>");
	b = false;			
		}
if(mname.equals("")){
	pw.println("<body style='background-color:red;'>");
	pw.println("please fill the  mother name");
	b = false;
	pw.println("</body>");
}else{
	b= true;
}
if(b==true){
	System.out.println("forward to next");
	RequestDispatcher rd=req.getRequestDispatcher("/next");
	//rd.forward(req, res);
	pw.println("<body style='background-color:green;'>");	
	rd.include(req, res);
	pw.println("</body>");
}
	}
	}
