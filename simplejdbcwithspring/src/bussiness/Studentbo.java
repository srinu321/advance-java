package bussiness;

import model.Student;

public interface  Studentbo {
	public int creatstudent(Student st) throws Exception;
	public boolean updatestudent(Student st) throws Exception;
	public boolean deleteStudent(Student st) throws Exception;
	

}
