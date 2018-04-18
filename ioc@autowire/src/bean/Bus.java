package bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;



public class Bus {
	
	@Qualifier(value="e2")
	@Autowired
	private Eng emodelnumber;
	
		public void print(){
		System.out.println(emodelnumber.getEmodel());
	}
}
