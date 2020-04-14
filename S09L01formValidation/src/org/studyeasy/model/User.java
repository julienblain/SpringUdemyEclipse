package org.studyeasy.model;

import javax.validation.constraints.Size;

public class User {
	
	@Size(min=5, max=15, message="entre un nombre de lettre entre 5 et 15 :)") //info sur la validation des données qui sera faite par le controller
	private String name;
	private String gender, country, introduction, visitedCountries[];

	public String[] getVisitedCountries() {
		return visitedCountries;
	}

	public void setVisitedCountries(String[] visitedCountries) {
		this.visitedCountries = visitedCountries;
	}

	public String getIntroduction() {
		return introduction;
	}

	public void setIntroduction(String introduction) {
		this.introduction = introduction;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

}
