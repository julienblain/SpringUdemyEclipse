package org.studyeasy.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.studyeasy.cars.ElectricCar;
import org.studyeasy.cars.PetrolCar;
import org.studyeasy.service.Cars;

@Configuration
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
	
}
