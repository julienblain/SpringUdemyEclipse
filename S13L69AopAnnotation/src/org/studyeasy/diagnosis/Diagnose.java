package org.studyeasy.diagnosis;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Diagnose {

	@Pointcut("@target(org.springframework.stereotype.Component)") 
	public void beanPointcut() {
	}
	
	@Before("beanPointcut()")
	public void testAdvice() {
		System.out.println("test advice");
	}
}
