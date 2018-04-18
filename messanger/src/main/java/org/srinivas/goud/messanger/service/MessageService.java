package org.srinivas.goud.messanger.service;

import java.util.ArrayList;
import java.util.List;



import org.srinivas.goud.messanger.model.Messages;

public class MessageService {
	
	public List<Messages> getallMessages(){
		Messages m = new Messages("srinivas",22);
		Messages m1 = new Messages("srin",21);
		List<Messages> list = new ArrayList<>();
		list.add(m);
		list.add(m1);
		return list;
	
		
	}

}
