package com.dss.service;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.dss.complexdatatypes.ComplexDataTypes;
@WebService(name="srinivas",
targetNamespace="http://www.testmart.com")
/*@SOAPBinding(style=Style.RPC)*/
public interface CatlogINT {
	@WebMethod(action="fetchcatagories",operationName="fetchcat")
	List<String> getCatlog();
	@WebMethod
	List<String> getCatlogall(String cats);
	@WebMethod
	List<ComplexDataTypes> getCatlog2(String sm);

}