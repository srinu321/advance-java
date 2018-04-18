package simples1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.beans.factory.xml.XmlBeanFactory;

import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

@SuppressWarnings({ "deprecation", "unused" })
public class Springdriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource r = new ClassPathResource("resource/resource.xml");

		BeanFactory bf = new XmlBeanFactory(r);
Object o=	bf.getBean("s");
Object o1=	bf.getBean("s");
Object o2=	bf.getBean("s");

Test1 t = (Test1)o;
t.hello();
	
	}
}
