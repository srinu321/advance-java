package cilent;

import org.springframework.aop.framework.ProxyFactoryBean;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import bussiness.Bank;

import service.LogBeforeBo;

public class Driver {
	

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		ConfigurableApplicationContext cap = new ClassPathXmlApplicationContext("resource/spring.xml");
		Bank bp =(Bank)cap.getBean("pfb");
		int i =bp.deposit("sbi123", 8000);
	System.out.println(i);
/*int i =	bp.findbal("sbi123");*/
System.out.println(i);
cap.close();
	}

}
