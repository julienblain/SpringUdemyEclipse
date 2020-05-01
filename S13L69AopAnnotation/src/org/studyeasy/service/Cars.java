package org.studyeasy.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.studyeasy.cars.ElectricCar;
import org.studyeasy.cars.Machine;
import org.studyeasy.cars.PetrolCar;

public class Cars {
	
	@Autowired
	public ElectricCar electricCar;
	@Autowired
	public Machine petrolCar;
	public ElectricCar getElectricCar() {
		return electricCar;
	}
	public void setElectricCar(ElectricCar electricCar) {
		this.electricCar = electricCar;
	}
	public Machine getPetrolCar() {
		return petrolCar;
	}
	public void setPetrolCar(Machine petrolCar) {
		this.petrolCar = petrolCar;
	}

	
}
