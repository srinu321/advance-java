package com.dss.jdbcpack;
import java.sql.*;
import java.util.Enumeration;
public class Driver2 {

	@SuppressWarnings("rawtypes")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Driver dd =new JdbcOdbcDriver();
		 //DriverManager.registerDriver(dd);
		 Enumeration e = DriverManager.getDrivers();
		 while(e.hasMoreElements()){
				Driver d 	=(Driver) e.nextElement();
				System.out.println(d.getClass().getName());
					}
		 

	}

}
