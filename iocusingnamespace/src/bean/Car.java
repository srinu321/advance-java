package bean;

public class Car {
	private String name;
	private Eng myear;
public void setName(String name) {
	this.name = name;
}
public void setMyear(Eng myear) {
	this.myear = myear;
}
public void print(){
	System.out.println(name);
	System.out.println(myear.getModel());
}
	
}

