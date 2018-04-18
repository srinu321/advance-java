package bean;

public class Car {
	
	private String name;
	private Eng model;
	
	
	public void setName(String name) {
		this.name = name;
	}
public void setModel(Eng model) {
	this.model = model;
}
public void print(){
	System.out.println(name);
	System.out.println(model.getModelyear());
}
}
