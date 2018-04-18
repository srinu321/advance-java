package bean;

import java.sql.Connection;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;

import model.Dao;

public class DaoClass implements StudentDa {
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int save(Dao a) throws Exception {
		// TODO Auto-generated method stub
		
		Connection con =ds.getConnection();
		System.out.println(con);
		
		
		con.close();
		return 0;
	}

	@Override
	public boolean update(Dao a) throws Exception {
		// TODO Auto-generated method stub
Connection con =ds.getConnection();
		
		
		con.close();
		return false;
	}

	@Override
	public boolean delete(Dao a) throws Exception {
		// TODO Auto-generated method stub
Connection con =ds.getConnection();
		
		
		con.close();
		
		return false;
	}

	@Override
	public Dao findbyid(int d) throws Exception {
		// TODO Auto-generated method stub
Connection con =ds.getConnection();
		
		
		con.close();
		
		return null;
	}

	@Override
	public Dao findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
Connection con =ds.getConnection();
		
		
		con.close();
		
		
		return null;
	}

	@Override
	public Dao findByName(String name) throws Exception {
		// TODO Auto-generated method stub
Connection con =ds.getConnection();
		
		
		con.close();
		
		return null;
	}

	@Override
	public Dao findByaddr(String addr) throws Exception {
		// TODO Auto-generated method stub
Connection con =ds.getConnection();
System.out.println(con);
		
		
		con.close();
		
		return null;
	}

	@Override
	public List<Dao> findAll(Dao a) throws Exception {
		// TODO Auto-generated method stub
Connection con =ds.getConnection();
		
		
		con.close();
		
		return null;
	}

}
