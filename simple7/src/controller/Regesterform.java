package controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class Regesterform extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		HttpSession hs =req.getSession();
	PrintWriter pwo=res.getWriter();
	Connection con=null;
		String s1= req.getParameter("fno");
		if(s1.equals("1")){
			String s2 =req.getParameter("name");
			String s3 =req.getParameter("fname");
			String s4 =req.getParameter("mname");
			hs.setAttribute("name",s2);
			hs.setAttribute("fname",s3);
			hs.setAttribute("mname",s4);
			res.sendRedirect("./form2.html");
		}
		if(s1.equals("2")){
			String s5 =req.getParameter("contact");
			String s6 =req.getParameter("email");
			String s7 =req.getParameter("addr");
			hs.setAttribute("contact",s5);
			hs.setAttribute("email",s6);
			hs.setAttribute("addr",s7);
			res.sendRedirect("./form3.html");
		}
		if(s1.equals("3")){
			String s8 =req.getParameter("qul");
			String s9 =req.getParameter("pre");
			String s2=(String)hs.getAttribute("name");
			String s3=(String)hs.getAttribute("fname");
			String s4=(String)hs.getAttribute("mname");
			String s5=(String)hs.getAttribute("contact");
			String s6=(String)hs.getAttribute("email");
			String s7=(String)hs.getAttribute("addr");
				
		
		
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			 con = DriverManager.getConnection("jdbc:oracLe:thin:@localhost:1521:xe","srinu","srinu");
			System.out.println(con);
			PreparedStatement pst=con.prepareStatement("insert into adhara values(?,?,?,?,?,?,?,?)");
			System.out.println(pst+"pst");
			pst.setString(1, s2);
			pst.setString(2, s3);
			pst.setString(3, s4);
			pst.setString(4, s5);
			pst.setString(5, s6);
			pst.setString(6, s7);
			pst.setString(7, s8);
			pst.setString(8, s9);
			int i=pst.executeUpdate();
			
			System.out.println(i);
			if(i!=0){
				pwo.println("<pre>");
				pwo.println(s2);
				pwo.println(s3);
				pwo.println(s4);
				pwo.println(s5);
				pwo.println(s6);
				pwo.println(s7);
				pwo.println(s8);
				pwo.println(s9);
				pwo.println("</pre>");	
			}
			else{
				pwo.println("fail to insert");
			}
			
		}catch(Exception e){
			System.out.println(e.getClass().getName()+"....*error*");
		}
		}
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}	
	}
}

