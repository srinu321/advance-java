package bean;

import java.util.List;

import model.Student;;

public interface Dao{
	public int save(Student a) throws Exception;
	public boolean update(Student a) throws Exception;
	public boolean delete(Student a) throws Exception;
	public Student findbyPK(int id) throws Exception;
	public List<Student> findByName(String name) throws Exception;
	public List<Student> findByEmail(String email) throws Exception;
	public List<Student> findByQul(String Qul) throws Exception;
	public List<Student> findByaddr(String address) throws Exception;
	public List<Student> findAll() throws Exception;
}
