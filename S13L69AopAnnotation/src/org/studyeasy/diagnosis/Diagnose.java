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

//	@Pointcut("bean(petrolCar)")
//	public void beanPointcut() {}
	@Pointcut("bean(*Car)")
	public void beanPointcut() {}
	
	@Before("beanPointcut()")
	public void testAdvice() {
		System.out.println("test advice");
	}
}
