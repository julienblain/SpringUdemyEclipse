package org.studyeasy.aspect;



import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Pointcut;

@org.aspectj.lang.annotation.Aspect
public class Aspect {
	//ajout aopalliance, asm, aspectjrt, aspectjweaver, cglib et build path

	@Pointcut("@target(org.springframework.stereotype.Controller)")
	public void controllerBean() {
		
	}
	
	@Pointcut("execution(* helloWord(..))")
	public void helloWord() {
		
	}
	
	@AfterReturning("controllerBean() && helloWord()")
	public void testAdvice() {
		System.out.println("testAdvice");
	}
}
