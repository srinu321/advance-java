package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Servlet_Servlet1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pwo =res.getWriter();
		System.out.println("second servlet");
		String name = req.getParameter("name");
		String fname = req.getParameter("fname");
		String mname =req.getParameter("mname");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection conn = DriverManager.getConnection("jdbc:oracLe:thin:@localhost:1521:xe","srinu","srinu");
			System.out.println("created");
			PreparedStatement pst = conn.prepareStatement("insert into student values(?,?,?)");
		
			pst.setString(1, name);
			pst.setString(2, fname);
			pst.setString(3, mname);
			System.out.println("executed");

			int i = pst.executeUpdate();
			
			System.out.println(i);
			if(i!=0){
				pwo.println(name+"...name");
				pwo.println(fname+"......fname");
				pwo.println(mname+"...mname");
				pwo.println("<font color = 'green'><h1> reg success</h1></font>");
			}
			else{
				pwo.println("<font color = 'red'><h1> reg failed</h1></font>");
			}
			}catch(Exception e){
				System.out.println(e);
			}
	}
	
}
