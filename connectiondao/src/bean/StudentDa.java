package bean;

import java.util.List;

import model.Dao;

public interface StudentDa {
	public int save(Dao a) throws Exception;
	public boolean update(Dao a) throws Exception;
	public boolean delete(Dao a) throws Exception;
	public Dao findbyid(int d) throws Exception;
	public Dao findByEmail(String email) throws Exception;
	public Dao findByName(String name) throws Exception;
	public Dao findByaddr(String addr) throws Exception;
	public List<Dao> findAll(Dao a) throws Exception;
}
