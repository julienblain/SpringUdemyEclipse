package org.studyeasy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.studyeasy.cars.ElectricCar;
import org.studyeasy.cars.Machine;
import org.studyeasy.cars.PetrolCar;
import org.studyeasy.diagnosis.Diagnose;
import org.studyeasy.service.Cars;

@Configuration
@EnableAspectJAutoProxy(proxyTargetClass = true)   //true =pour compilation aspect et target class qui a une interface, true enleve le type
public class Config {
	
	@Bean("electricCar")
	public ElectricCar electricCar() {
		return new ElectricCar();
	}
	
	@Bean("petrolCar")
	public PetrolCar petrolCar() {
		return new PetrolCar();
	}
	
	@Bean("cars")
	public Cars cars() {
		return new Cars();
	}
	
	@Bean("diagnose")
	public Diagnose diagnose( ) {
		return new Diagnose();
	}
	
}
