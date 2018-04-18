package com.dss.cab.car;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.dss.cab.engien.Eng;
@Component
public class Car {

	@Autowired
	private Eng modelyear;
	public void print(){	
		System.out.println(modelyear.getModel());
	}

}