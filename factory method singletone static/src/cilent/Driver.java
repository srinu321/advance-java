package cilent;

import java.util.Calendar;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
		Test t = (Test)ap.getBean("t");
		Test t1 = (Test)ap.getBean("t");
		System.out.println(t==t1);
		
		Calendar c = (Calendar)ap.getBean("c");
		Calendar c1 = (Calendar)ap.getBean("c");
		System.out.println(c==c1);
		System.out.println(c.getCalendarType());

	}

}
