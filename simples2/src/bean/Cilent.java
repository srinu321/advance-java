package bean;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "deprecation", "unused" })
public class Cilent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext ac=new ClassPathXmlApplicationContext ("resource/resource.xml");
		//BeanFactory br=new XmlBeanFactory(rc);
		//System.out.println("vaildate");
		//ApplicationContext ac=new  FileSystemXmlApplicationContext("C:/Users/divya/Documents/programs/adavance java/simples2/src/resource/resource.xml");
	}

}
