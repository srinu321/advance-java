 package bean;

public class Test {
	private static Test t;
	
	private Test() {
		
		// TODO Auto-generated constructor stub
		System.out.println("object creted");
	}
	public static Test getInstance() {
		if(t==null){
			t= new Test();
			return t;
			
		}
		else{return t;}
	}
	@Override
	protected Object clone() throws CloneNotSupportedException {
		// TODO Auto-generated method stub
		throw new CloneNotSupportedException();
		
	}

}
