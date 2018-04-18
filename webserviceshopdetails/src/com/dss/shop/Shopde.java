package com.dss.shop;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

@WebService
@SOAPBinding(style=Style.RPC)
public class Shopde {
@WebMethod
@WebResult(partName="outputname")
	public String getShopde(@WebParam(partName="input")String pro){
		String res= "invaild property";
		if("shopname".equals(pro)){
			res="srinu mart";
			}
		if("since".equals(pro)){
			res="from 1993";
			}
		
		return res;
		
	}
}
