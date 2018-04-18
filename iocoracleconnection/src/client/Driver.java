package client;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import Bean.Test;

public class Driver {

	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
	
		ApplicationContext ac =new ClassPathXmlApplicationContext("resource/spring.xml");
			Object o=ac.getBean("t");
			Test t = (Test)o;
			t.print();
	}

}
