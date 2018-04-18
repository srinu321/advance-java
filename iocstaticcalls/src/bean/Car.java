package bean;

public class Car { 
	
	private static String carname;
	public static void setCarname(String carname) {
		Car.carname = carname;
	}
	public static void name(){
		System.out.println(carname);
	}
	
}
