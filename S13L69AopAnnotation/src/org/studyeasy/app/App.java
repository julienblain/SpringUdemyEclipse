package org.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.Machine;
import org.studyeasy.cars.PetrolCar;
import org.studyeasy.config.Config;
import org.studyeasy.service.Cars;

public class App {

public static void main(String args[]){
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		PetrolCar car = context.getBean("petrolCar", PetrolCar.class);
			
			car.run();
			
		context.close();
	}

	
	

}
