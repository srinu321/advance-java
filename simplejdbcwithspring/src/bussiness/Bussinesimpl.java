package bussiness;

import bean.StudentDao;
import model.Student;

public class Bussinesimpl implements Studentbo {
	private StudentDao sd;
	public void setSd(StudentDao sd) {
		this.sd = sd;
	}

	@Override
	public int creatstudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		
		return sd.save(st);
	}

	@Override
	public boolean updatestudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteStudent(Student st) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

}
