package cilent;

import java.util.Calendar;

import org.springframework.beans.factory.config.MethodInvokingFactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Car;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
		Car t = (Car)ap.getBean("t");
		t.driver();
		

	}

}
