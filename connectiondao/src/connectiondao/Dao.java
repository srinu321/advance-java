package connectiondao;

import java.sql.Connection;
import java.sql.SQLException;

import org.apache.tomcat.dbcp.dbcp.BasicDataSource;

public class Dao {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		BasicDataSource bds = new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("srinu");
		bds.setPassword("srinu");
		bds.setMaxActive(3);
		bds.setMaxIdle(5);
		bds.setMaxWait(1000*5);
for(int i =0;i<5;i++){
		Connection con=bds.getConnection();
		System.out.println(con);
		con.close();
}
	}

}
