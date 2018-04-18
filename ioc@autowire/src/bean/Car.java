package bean;




public class Car {
	private String name;
	
	private Eng modelyear;
	public void setName(String name) {
		this.name = name;
	}
	
	
	public void print(){
		
		System.out.println(name);
		System.out.println(modelyear.getEmodel());
	}

}
