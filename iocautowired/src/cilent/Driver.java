package cilent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Bus;
import bean.Car;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring3.xml");
		Bus bb=(Bus)ap.getBean("b");
		bb.print();
	}

}