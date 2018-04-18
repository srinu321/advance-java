package Bean;

import java.sql.Connection;
import java.sql.DriverManager;

import org.springframework.beans.factory.annotation.Required;

public class Test {

	private String driver;
	private String url;
	private String user;
	private String password;
	private String srinu;

	@Required
public void setDriver(String driver) {
	this.driver = driver;
}
	@Required
public void setUrl(String url) {
	this.url = url;
}
public void setUser(String user) {
	this.user = user;
}
public void setPassword(String password) {
	this.password = password;
}
public void setSrinu(String srinu) {
	this.srinu = srinu;
}
public void print(){
	System.out.println(driver);
	System.out.println(url);
	System.out.println(user+""+password);
	System.out.println(srinu);
}
public void print1() throws Exception  {
	Class.forName(driver);
	Connection conn = DriverManager.getConnection(url,user,password);
	System.out.println(conn);
}
	
}
