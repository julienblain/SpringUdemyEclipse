package org.studyeasy.diagnosis;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;


@Aspect
public class Diagnose {

	@Pointcut("within(@org.springframework.stereotype.Component org.studyeasy.cars.*)") //pour pas prendre en compte le component electric car
	public void beanPointcut() {
	}
	
	@Before("beanPointcut()")
	public void testAdvice() {
		System.out.println("test advice");
	}
}
