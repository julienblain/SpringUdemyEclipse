package org.studyeasy.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.studyeasy.cars.ElectricCar;
import org.studyeasy.cars.Machine;
import org.studyeasy.cars.PetrolCar;
import org.studyeasy.config.Config;
import org.studyeasy.objects.Battery;
import org.studyeasy.service.Cars;

public class App {

public static void main(String args[]){
		
		AnnotationConfigApplicationContext context = 
				new AnnotationConfigApplicationContext(Config.class);
		ElectricCar car = context.getBean("electricCar", ElectricCar.class);
			
			car.run();
			
		context.close();
	}

	
	

}
