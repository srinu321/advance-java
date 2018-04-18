package model;

public class Student {
	private int id;
	private String name,email,qul,address;
public Student() {
	// TODO Auto-generated constructor stub
}
	
	public Student(int id, String name, String email, String qul, String address) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.qul = qul;
		this.address = address;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getQul() {
		return qul;
	}
	public void setQul(String qul) {
		this.qul = qul;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}

}
