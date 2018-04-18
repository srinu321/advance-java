package service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.aop.ThrowsAdvice;

import bussiness.Bank;

public class Throwadvice implements ThrowsAdvice {
	public void afterThrowing(Exception ex){
		Log g=LogFactory.getLog(Bank.class);
		g.info("throws advice");
	}

}
