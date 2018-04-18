package Bean;

public class Test {

	private String name;
	private String email;
	private int id;
Test(String name,String email,int id){
	this.name= name;
this.email= email;
	this.id=id;
	
}
	public void print(){
		System.out.println("name "+name);
		System.out.println("email..."+email);
		System.out.println("id...."+id);
	}
	
}
