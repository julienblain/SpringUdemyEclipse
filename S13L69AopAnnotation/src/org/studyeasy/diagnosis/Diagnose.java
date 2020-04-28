package org.studyeasy.diagnosis;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class Diagnose {

	@Pointcut("execution(void org.studyeasy.cars.PetrolCar.run())") 
	public void run() {
		
	}
	
	/*
	@Before("run()") //on peut mettre execution blabla ou le pointcut
	public void beforeAdvice() {
		System.out.println("before advice");
	}*/
	
	/*
	@After("run()") // s'execute si exception
	public void afterAdvice() {
		System.out.println("checking engine2");
	}
	*//*
	@AfterReturning("run()") //ne s'execute pas si exception
	public void afterAdvice() {
		System.out.println("After advice ");
	}
	
	@AfterThrowing("run()") //s'execute seulement si une exception est levée
	public void afterAdvice() {
		System.out.println("After advice ");
	}
	*/
	
	@Around("run()") //avant et apres run si jp.proceed sinon nop
	public void aroundAdvice(ProceedingJoinPoint jp) {
		System.out.println("Around advice initial msg ");
		
		try {
			jp.proceed();
		} catch (Throwable e) {
			
			e.printStackTrace();
		}
		
		System.out.println("Around advice later msg ");
	}
	
}
