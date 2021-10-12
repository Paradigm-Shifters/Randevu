package com.paradigm_shifters.Randevu.model;

import java.time.LocalDate;
import java.time.Period;

public class Person {
	private String name;
	private LocalDate birthday;
	
	public Person (String name, String birthday) {
		this.name = name;
		this.birthday = parseBirthday(birthday);
	}
	
	private LocalDate parseBirthday (String birthday) {
		int year = Integer.parseInt(birthday.substring(0, 4));
		int month = Integer.parseInt(birthday.substring(5, 7));
		int dayOfMonth = Integer.parseInt(birthday.substring(8, 10));
		return LocalDate.of(year, month, dayOfMonth);
	}
	
	public int getAge() {
		Period age = Period.between(birthday, LocalDate.now());
		return age.getYears();
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public LocalDate getBirthday() {
		return birthday;
	}
	
	public void setBirthday(LocalDate birthday) {
		this.birthday = birthday;
	}
	
	@Override 
	public String toString () {
		return "Person [name = " + name + ", birhtday = " + birthday +"]";
	}
}
