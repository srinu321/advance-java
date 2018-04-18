package Bean;

public class Car {
	private String carname;
	private Engien emodel;
	Car(){
		System.out.println("car");
		
	}

	public void setcarname(String carname){
		this.carname= carname;
	}

	public void setemodel(Engien emodel){
		this.emodel= emodel;
	}
	public void print(){
		System.out.println("carname.. "+carname);
		System.out.println("emodel.. "+emodel.getmodelyear());
	}
}
