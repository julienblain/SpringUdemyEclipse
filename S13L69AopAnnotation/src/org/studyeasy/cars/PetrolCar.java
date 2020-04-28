package org.studyeasy.cars;

public class PetrolCar {
	
	public void run() throws Exception{
		System.out.println("running");
		throw new Exception("What happened !");
	}
}
