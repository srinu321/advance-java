import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.GenericServlet;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.Statement;

@SuppressWarnings("serial")
public class Regser extends GenericServlet{
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		// TODO Auto-generated method stub
		res.setContentType("text/html");
		PrintWriter pwo = res.getWriter();
		int id =Integer.parseInt(req.getParameter("id"));	
		String name = req.getParameter("name");
		String email = req.getParameter("email");
		String student = req.getParameter("address");
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracLe:thin:@localhost:1521:xe","srinu","srinu");
			System.out.println("created");
			PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?)");
			pst.setInt(1, id);
			pst.setString(2, name);
			pst.setString(3, email);
			pst.setString(4, student);
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

}
