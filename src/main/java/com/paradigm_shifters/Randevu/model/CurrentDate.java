package com.paradigm_shifters.Randevu.model;

import java.time.LocalDate;
import java.time.Month;

public class CurrentDate {
	//get current date in YYYY-MM-DD format
	private LocalDate todaysDate = LocalDate.now();
	
	//break LocalDate object into relevant information
	private int numberOfDay = todaysDate.getDayOfMonth();
	private Month numberOfMonth = todaysDate.getMonth();
	private int numberOfYear = todaysDate.getYear();
	
	private String allTogether = "The day of the month is: " + numberOfDay + "<br>" +
								"The current month is: " + numberOfMonth + "<br>" +
								"The current year is: " + numberOfYear + "<br>";
	
	//get method for the date
	public String getFullDateString() {
		return allTogether;
	}

}
