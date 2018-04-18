package service;

import java.lang.reflect.Method;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.AfterReturningAdvice;

import bussiness.Bank;

public class LogAfterBo implements AfterReturningAdvice {

	@Override
	public void afterReturning(Object o, Method m, Object[] parama, Object oo) throws Throwable {
		// TODO Auto-generated method stub
		
		Log l =LogFactory.getLog(Bank.class);
		l.info("deposit after.."+o);
	}

}