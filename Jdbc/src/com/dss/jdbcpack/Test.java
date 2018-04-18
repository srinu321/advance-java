package com.dss.jdbcpack;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		Properties pp = new Properties();
		pp.load(new FileInputStream("C:/Users/divya/Documents/programs/adavance java/Jdbc/src/com/dss/jdbcpack/oracle.properties"));

		System.out.println(pp.getProperty("user"));
		System.out.println(pp.getProperty("password"));
		Class.forName("oracle.jdbc.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@Localhost:1521:xe",pp);
		System.out.println(con);
	}

}
