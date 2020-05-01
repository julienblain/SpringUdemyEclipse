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
	@Before("execution(public void run())")
	public void testAdvice() {
		System.out.println("Test advice");
	}
}
