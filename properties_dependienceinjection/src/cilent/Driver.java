package cilent;

import java.sql.SQLException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Driver {
	public static void main(String[] args) throws ClassNotFoundException, SQLException{
	ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml");
Test t = (Test)ap.getBean("c");
	t.conn();
	}
}
