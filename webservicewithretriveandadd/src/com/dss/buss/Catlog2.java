package com.dss.buss;

import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
public class Catlog2 {
	List bt = new ArrayList();
	List mt = new ArrayList();
	List mot = new ArrayList();
	public Catlog2() {
		bt.add("harry");
		bt.add("parry");
		bt.add("charry");
		mt.add("mharry");
		mt.add("mparry");
		mt.add("mharry");
		mot.add("moharry");
		mot.add("moparry");
		mot.add("mocharry");
		}
	
	public List<String> getCatlog(){
		
		List<String> l = new ArrayList<>();
		l.add("book");
		l.add("music");
		l.add("movies");
		return l;
		
	}

	public List<String> getCatlogall(String cats){
		switch(cats.toLowerCase()){
		case "books":
		return bt;
		case "music":
			return mt;
		case "movies":
			return mot;
		}
		return null;
		
	}

}
