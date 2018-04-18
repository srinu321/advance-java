package bean;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;


public class Test {
	private Connection con;
	private String driver;
	private String url;
	private String user;
	private String pass;
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
	@PostConstruct
	public void myInit() throws Exception {
		// TODO Auto-generated method stub
		Class.forName(driver);
		con = DriverManager.getConnection(url,user,pass);
		System.out.println("connection opened");
	
	}
	public void save(int id,String name,String email,String qul,String address) throws Exception{
		PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?,?)");
		ps.setInt(1,id);
		ps.setString(2, name);
		ps.setString(3, email);
		ps.setString(4, qul);
		ps.setString(5, address);
		int i =ps.executeUpdate();
		System.out.println("this many rows effected "+i);	
	}
	@PreDestroy
	public void myDestroy() throws Exception {
		// TODO Auto-generated method stub
	con.close();
	System.out.println("closed connection1");
	}
	
		

}
