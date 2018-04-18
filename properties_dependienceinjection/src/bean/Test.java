package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;

public class Test {
private String driver,url,user,pass;
public void setDriver(String driver) {
	this.driver = driver;
}
public void setUrl(String url) {
	this.url = url;
}
public void setUser(String user) {
	this.user = user;
}
public void setPass(String pass) {
	this.pass = pass;
}
public void conn() throws ClassNotFoundException, SQLException{

	Class.forName(driver);	
	Connection conn = DriverManager.getConnection(url,user,pass);
	System.out.println(conn);
}
}
