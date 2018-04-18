<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<% int id =Integer.parseInt(request.getParameter("id"));	
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String add = request.getParameter("address");
		String qul = request.getParameter("qul");
		
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracLe:thin:@localhost:1521:xe","srinu","srinu");
		System.out.println("created");
		PreparedStatement pst = con.prepareStatement("insert into student values(?,?,?,?,?)");
		
		pst.setInt(1,id);
		pst.setString(2, name);
		pst.setString(3, email);
		pst.setString(4, add);
		pst.setString(5,qul);
		int i=pst.executeUpdate();
		con.close();
		pst.close();
		if(i!=0)
		out.println("regestertion sucess");
		else
		out.println("regestertion sucess");%>
	
		
		