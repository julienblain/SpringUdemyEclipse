package org.studyeasy.diagnosis;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	@Before("run()") //on peut mettre execution blabla ou le pointcut
	public void engine() {
		System.out.println("checking engine");
	}
	
	@After("run()") 
	public void engine2() {
		System.out.println("checking engine2");
	}
	
	@Pointcut("execution(void org.studyeasy.cars.PetrolCar.run())")
	public void run() {
		
	}
	
}
