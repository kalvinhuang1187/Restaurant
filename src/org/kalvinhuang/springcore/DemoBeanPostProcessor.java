package org.kalvinhuang.springcore;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class DemoBeanPostProcessor implements BeanPostProcessor{
	
	// will be called before initializing a bean
	@Override
	public Object postProcessBeforeInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("processing bean instance before initialization (after spring instantiates bean and before init life cycle event) of : " + arg1);
		return arg0;
	}
	
	// will be called after initializing a bean
	@Override
	public Object postProcessAfterInitialization(Object arg0, String arg1)
			throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("processing bean instance after initialization (just after init life cycle event) of : " + arg1);
		return arg0;
	}

}
