package bean;

import java.util.Hashtable;
import java.util.Set;
import java.util.TreeSet;
import java.util.Vector;

public class Test {
	
	private Vector fruits;
	private TreeSet crickets;
	private Hashtable cc;
	public void setFruits(Vector fruits) {
		this.fruits = fruits;
	}
	public void setCrickets(TreeSet crickets) {
		this.crickets = crickets;
	}
	public void setCc(Hashtable cc) {
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
		for(Object key:keys){
			System.out.println("country.."+key+" capital:"+cc.get(key));
					}
	}
	

}
