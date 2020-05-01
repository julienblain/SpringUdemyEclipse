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
	
	//@Pointcut("execution(void run(int))") //permet de faire des pointcut generique par rapport à une methode ou arg
//	@Pointcut("args(int)")
	//public void pointcut() {}
	
	
	@Pointcut("args(temp)") 
	public void pointcut(int temp) {
		
	}
	
	@Before("pointcut(temp)")
	public void testAdvice(int temp) {
		System.out.println("test advice" + temp);
	}
	
	
//	@Before("execution(void run(int))")
//	public void testAdvice(JoinPoint jp) {
//		//System.out.println(jp.toString()); //permet de voir le joinpoint
//		//PetrolCar car = (PetrolCar) jp.getTarget(); //get petrol car
//		//car.run("test call to run method");
//		
//		for(Object ob : jp.getArgs()) { //recup des arguments
//			System.out.println(ob);
//		}
//		
//		System.out.println("Test Advice");
//	}
	
}
