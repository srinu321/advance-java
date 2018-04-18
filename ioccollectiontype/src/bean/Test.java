package bean;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class Test {
	
	private List fruits;
	private Set crickets;
	private Map cc;
	public void setFruits(List fruits) {
		this.fruits = fruits;
	}
	public void setCrickets(Set crickets) {
		this.crickets = crickets;
	}
	public void setCc(Map cc) {
		this.cc = cc;
	}
	public void print(){
		System.out.println("print fruits");
		for(Object fs:fruits){
			System.out.println("fruits names ....."+fs);
					}
	
		System.out.println("print crickets name");
		for(Object cr:crickets){
			System.out.println("cricketer names ....."+cr);
					}
		System.out.println("print country names");
	Set keys =	cc.keySet();
		for(Object cn:keys){
			System.out.println("country.."+cn+" capital:"+cc.get(cn));
					}
	}
	

}
