package org.studyeasy.cars;

import org.springframework.stereotype.Component;
import org.studyeasy.objects.Battery;


public class ElectricCar {
	@Deprecated
	public void run() {
		System.out.println("running electric car");
	}

	public void recharge(Battery battery) {
		System.out.println("car got recharged");
		
	}

	
	
	
}
