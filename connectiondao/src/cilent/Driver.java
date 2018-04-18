package cilent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.DaoClass;
import model.Dao;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("Resource/Spring.xml");
		DaoClass dc=(DaoClass)ap.getBean("sdo");
	Dao a = new Dao();
		dc.save(a);
		
	}

}
