package com.dss.service;

import javax.xml.ws.Endpoint;

import com.dss.service.Catlog;

public class Withoutserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://LocaLhost:7897/Catlog",new Catlog());

	}

}
