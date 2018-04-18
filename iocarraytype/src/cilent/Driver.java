package cilent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	@SuppressWarnings("resource")
	ApplicationContext ac = new ClassPathXmlApplicationContext("resource/spring.xml");
		Car cc=(Car)ac.getBean("c");
		cc.print();
		

	}

}
