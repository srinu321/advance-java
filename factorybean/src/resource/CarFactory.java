package resource;

import org.springframework.beans.factory.FactoryBean;

import bean.Car;

public class CarFactory implements FactoryBean {
	private String carname;
	public void setCarname(String carname) {
		this.carname = carname;
	}
	public  Car getInstance() throws Exception{
		Car c= (Car)Class.forName(carname).newInstance();
		return c;
	}
	@Override
	public Object getObject() throws Exception {
		Car c = (Car)Class.forName(carname).newInstance();
		return c;
	}
	@Override
	public Class getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}
	@Override
	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

		
	

}
