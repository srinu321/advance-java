package cilent;

import org.springframework.aop.framework.ProxyFactoryBean;

import bussiness.Bank;

import service.LogBeforeBo;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//target
		Bank b = new Bank();
		//service advice
		LogBeforeBo llb = new LogBeforeBo();
		
		//target+service advice
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		//pfb.setTarget(b);
		
		pfb.addAdvice(llb);
		pfb.setTarget(b);
		Bank bp =(Bank)pfb.getObject();
		int i =bp.deposit("sbi123", 8000);
	System.out.println(i);
	}

}
