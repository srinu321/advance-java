package service;

import java.lang.reflect.Method;

import org.springframework.aop.support.StaticMethodMatcherPointcut;

public class DepositPointCut extends StaticMethodMatcherPointcut {

	@Override
	public boolean matches(Method m, Class c) {
		// TODO Auto-generated method stub
		
		
		String mname=m.getName();
		if(mname.equals("deposit"))
		return true;
		else
			return false;
	}

}
