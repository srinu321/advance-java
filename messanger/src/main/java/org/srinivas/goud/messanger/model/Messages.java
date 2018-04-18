package org.srinivas.goud.messanger.model;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Messages {

	private String name;
	private int id;
	public Messages() {
			}
	public Messages(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
}
