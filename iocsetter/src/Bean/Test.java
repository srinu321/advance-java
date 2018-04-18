package Bean;

public class Test {

	private String name;
	private String email;
	private int id;
	public void setname(String name){
		this.name= name;
	}
	public void setemail(String email){
		this.email= email;
	}
	public void setid(int id){
		this.id = id;
	}
	public void print(){
		System.out.println("name "+name);
		System.out.println("email..."+email);
		System.out.println("id...."+id);
	}
	
}
