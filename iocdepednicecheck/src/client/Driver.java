package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Car;

public class Driver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String files[] = new String[]{"resource/spring.xml","resource/spring1.xml"};
ApplicationContext ac = new ClassPathXmlApplicationContext(files);
Car cc=(Car)ac.getBean("c");
cc.print();
		
		
	}

}
