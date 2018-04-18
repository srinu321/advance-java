package bean;

public class Bus {
	private Eng emodelnumber;
	public Bus() {
		// TODO Auto-generated constructor stub
	}
	
	public Bus(Eng emodelnumber) {
	System.out.println("from construtor");
	this.emodelnumber= emodelnumber;
	}
	public void setEmodelnumber(Eng emodelnumber) {
		this.emodelnumber = emodelnumber;
	}
		public void print(){
		System.out.println(emodelnumber.getEmodel());
	}
}
