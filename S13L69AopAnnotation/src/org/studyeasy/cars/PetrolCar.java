package org.studyeasy.cars;

public class PetrolCar {
	
	public void run() {
		System.out.println("running petrol car");
		
	}
	
	public void run(int speed) {
		System.out.println("running at : "+speed+"km/hr");
	}
	
	public void run(int speed, int kms) {
		System.out.println("running at : "+speed+" for "+kms+" KM");
	}
	public String run(String msg) {
		System.out.println(msg);
		return msg;
	}
	
}
