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

@Aspect()
public class Diagnose {
	//this = all join points where this instanceof a type is true
	//target = all where an object instance of a type
	//this from a receivers perspective and target is from a caller perspective
	//bug
	@Pointcut("target(org.studyeasy.cars.Machine)")
	public void targetPointcut(){};
	
	@Before("targetPointcut()")
	public void targetAdvice(){
		System.out.println("targetAdvice");
	}
	
	@Pointcut("this(org.studyeasy.cars.PetrolCar)")
	public void thisPointcut(){};
	
	@Before("thisPointcut()")
	public void thisAdvice(){
		System.out.println("thisAdvice");
	}
}
