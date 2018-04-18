package bean;

public class Car {
	private String[] carname;
	private Eng[] emodel;
public void setCarname(String[] carname) {
	this.carname = carname;
}
public void setEmodel(Eng[] emodel) {
	this.emodel = emodel;
}
public void print(){
	for(String car:carname){
		System.out.println(car);
	}
	for(Eng es :emodel){
		System.out.println(es.getMyear());
	}
}

}
