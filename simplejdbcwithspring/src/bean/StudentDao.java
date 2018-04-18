package bean;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.List;

import org.apache.tomcat.jdbc.pool.DataSource;

import model.Student;

public class StudentDao implements Dao {
	private DataSource ds;
	public void setDs(DataSource ds) {
		this.ds = ds;
	}

	@Override
	public int save(Student a) throws Exception {
		// TODO Auto-generated method stub
Connection con =ds.getConnection();
PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?,?)");
pst.setInt(1,a.getId());
pst.setString(2, a.getName());
pst.setString(3,a.getEmail());
pst.setString(4, a.getQul());
pst.setString(5,a.getAddress());
int i =pst.executeUpdate();
con.close();
		return i;
	}

	@Override
	public boolean update(Student a) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean delete(Student a) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Student findbyPK(int id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByName(String name) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByEmail(String email) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByQul(String Qul) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findByaddr(String address) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Student> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
