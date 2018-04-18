<%
String name = request.getParameter("name");
String pass = request.getParameter("pass");
if(name.equals("srinu") &&pass.equals("srinu")){
	session.setAttribute("msg", "hello you good");
	
	response.sendRedirect("./succ.jsp");
}else{
	session.setAttribute("msg", "hello you are bad");
	response.sendRedirect("./fail.jsp");
}
%>