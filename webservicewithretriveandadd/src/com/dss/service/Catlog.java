package com.dss.service;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.dss.buss.Catlog2;

@WebService(name="srinivas" ,serviceName="dude")
public class Catlog {
Catlog2 cat = new Catlog2();
@WebMethod
public List<String> getCatlog(){
	return cat.getCatlog();
		
}
@WebMethod(exclude=true)
public List<String> getCatlogall(String cats){
	return cat.getCatlogall(cats);

}
}