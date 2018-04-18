package com.dss.service;


import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;

import com.dss.buss.Catlog2;
import com.dss.complexdatatypes.ComplexDataTypes;

@WebService(endpointInterface="com.dss.service.CatlogINT",portName="srinivascatlog",serviceName="Testmart")
/*@SOAPBinding(style=Style.RPC)*/
public class Catlog implements CatlogINT {
Catlog2 cat = new Catlog2();

/* (non-Javadoc)
 * @see com.dss.service.CatlogINT#getCatlog()
 */
@Override
public List<String> getCatlog(){
	return cat.getCatlog();
		
}

/* (non-Javadoc)
 * @see com.dss.service.CatlogINT#getCatlogall(java.lang.String)
 */
@Override
public List<String> getCatlogall(String cats){
	return cat.getCatlogall(cats);

}
/* (non-Javadoc)
 * @see com.dss.service.CatlogINT#getCatlog2(java.lang.String)
 */
@Override
public List<ComplexDataTypes> getCatlog2(String sm){
	return cat.getCatlog2(sm);
		
}


}