package client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Driver {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac =new ClassPathXmlApplicationContext("resource/spring.xml");
		Test t = 	(Test)ac.getBean("t");
			t.print();
	}

}
