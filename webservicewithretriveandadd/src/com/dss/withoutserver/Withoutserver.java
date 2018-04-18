package com.dss.withoutserver;

import javax.xml.ws.Endpoint;

import com.dss.service.Catlog;

public class Withoutserver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Endpoint.publish("http://localhost:789/Catlog",new Catlog());

	}

}
