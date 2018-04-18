package cilent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


import bussiness.Bussinesimpl;
import model.Student;

public class Driver {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		ConfigurableApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
		Bussinesimpl dc=(Bussinesimpl)ap.getBean("bs");
		int i =dc.creatstudent(new Student(9090,"srinu", "chinna.sri0@gmail.com", "ms", "a"));
		System.out.println(i);
		ap.close();
	}

}
