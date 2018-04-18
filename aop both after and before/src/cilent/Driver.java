package cilent;
import org.springframework.aop.framework.ProxyFactoryBean;

import bussiness.Bank;
import service.LogAfndBef;



public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//target
		Bank b = new Bank();
		//service advice
		
		LogAfndBef lab = new LogAfndBef();
		//target+service advice
		ProxyFactoryBean pfb = new ProxyFactoryBean();
		pfb.setTarget(b);
		
		pfb.addAdvice(lab);
	
		Bank bp =(Bank)pfb.getObject();
		int amount =bp.deposit("sbi123", 5000);
	//System.out.println(amount);
	}

}
