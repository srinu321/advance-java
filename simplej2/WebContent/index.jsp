<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import ="java.sql.Connection" %>
    <%@page import ="java.sql.DriverManager" %>
    <%@page import="java.sql.PreparedStatement"%>
    <%@page import="java.sql.ResultSet"%>
    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>dynamic reg page</title>
</head>

<body>
<%Class.forName("oracle.jdbc.driver.OracleDriver");
Connection con = DriverManager.getConnection("jdbc:oracLe:thin:@localhost:1521:xe","srinu","srinu");
System.out.println("created");
PreparedStatement pst = con.prepareStatement("select * from qul"); 
ResultSet rs = pst.executeQuery();%>

<form action="./index1 .jsp">
<pre>
id:<input type = "text" name = "id">
Name<input type = "text" name = "name">
email<input type = "text" name = "email">
address<textarea rows="5" cols= "10" name = "address"></textarea>
qul: <select name = "qul">
<%while(rs.next()){ %>
 
<option value ="<%=rs.getString(2)%>"><%=rs.getString(2)%></option>
<%} %>
</select>
<input type = "submit" value ="click">
</pre>
</form><%
rs.close();
con.close();%>
</body>
</html>