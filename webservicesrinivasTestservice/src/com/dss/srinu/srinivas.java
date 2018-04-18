package com.dss.srinu;

import java.util.ArrayList;

import java.util.List;

import javax.jws.WebService;


@WebService
public class srinivas {
	
	
	public List<String> getsrinivas(){
		
		List<String> l = new ArrayList<>();
		l.add("book");
		l.add("music");
		l.add("movies");
		return l;
		
	
	}

}
