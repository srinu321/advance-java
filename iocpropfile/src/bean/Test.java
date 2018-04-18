package bean;


import java.util.Properties;
import java.util.Set;


public class Test {
	
	private Properties ps;
	public void setPs(Properties ps) {
		this.ps = ps;
	}

	public void print(){
		
		System.out.println("database details");
	Set keys =	ps.keySet();
		for(Object key:keys){
			System.out.println("country.."+key+" capital:"+ps.getProperty(key.toString()));
					}
	}
	

}
