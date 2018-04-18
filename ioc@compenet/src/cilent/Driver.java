package cilent;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.dss.cab.car.Car;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ap = new ClassPathXmlApplicationContext("resource/spring.xml"); 
		Car cc=(Car)ap.getBean(Car.class);
		cc.print();
		
	}

}
