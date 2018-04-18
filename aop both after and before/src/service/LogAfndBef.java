package service;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import bussiness.Bank;

public class LogAfndBef implements MethodInterceptor {

	@Override
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		Log l= LogFactory.getLog(Bank.class);
		l.info("before deposit");
	Object o=	mi.proceed();
		l.info("after deposite "+o);
		return o;
	}

}
