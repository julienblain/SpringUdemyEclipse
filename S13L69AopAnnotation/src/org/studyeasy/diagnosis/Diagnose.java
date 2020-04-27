package org.studyeasy.diagnosis;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Diagnose {

	@Before("execution(void run())")
	public void engine() {
		System.out.println("checking engine");
	}
	
}
