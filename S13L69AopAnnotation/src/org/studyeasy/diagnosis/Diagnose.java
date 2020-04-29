package org.studyeasy.diagnosis;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.studyeasy.cars.PetrolCar;

@Aspect
public class Diagnose {
	
	@Before("execution(void run(int))")
	public void testAdvice(JoinPoint jp) {
		//System.out.println(jp.toString()); //permet de voir le joinpoint
		//PetrolCar car = (PetrolCar) jp.getTarget(); //get petrol car
		//car.run("test call to run method");
		
		for(Object ob : jp.getArgs()) {
			System.out.println(ob);
		}
		
		System.out.println("Test Advice");
	}
	
}
