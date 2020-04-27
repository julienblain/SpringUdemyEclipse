package org.studyeasy.diagnosis;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

@Aspect
public class Diagnose {

	@Before("execution(void org.studyeasy.cars.PetrolCar.run())") //aspect ne se d�clenchera seulement � petrolCar.run
	public void engine() {
		System.out.println("checking engine");
	}
	
}
