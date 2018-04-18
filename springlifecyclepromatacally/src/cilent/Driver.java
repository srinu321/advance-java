package cilent;

import java.util.Scanner;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bean.Test;

public class Driver {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resource/spring.xml");
while(true){
	
	Scanner sc = new Scanner(System.in);
	System.out.println("enter 1 to save 2 destroy");
	int i = sc.nextInt();
	switch(i){
	case 1: Test t=(Test)cap.getBean("t");
	System.out.println("enter values id then to save");
	int id =sc.nextInt();
	System.out.println("enter values name then to save");
	String name = sc.next();
	System.out.println("enter values email then to save");
	String email = sc.next();
	System.out.println("enter values  qul to save");
	String qul = sc.next();
	System.out.println("enter values address then to save");
	String address = sc.next();
	t.save(id, name,email, qul, address);
	break;
	default:
		cap.close();
		break;
	
	}
	
}
	}

}
