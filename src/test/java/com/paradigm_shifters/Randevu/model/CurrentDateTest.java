package com.paradigm_shifters.Randevu.model;

import org.junit.*;

public class CurrentDateTest {
	
	private CurrentDate cdTest;
	
	@Before
	public void setup() {
		System.out.println("initializing variables ...");
		cdTest = new CurrentDate();
	}
	
	@After
	public void cleanup() {
		System.out.println("moving on ...");
	}
	
	@Test
	//test for valid month
	public void currentDateTest1 () {
		String testResults = cdTest.getFullDateString();
		Assert.assertEquals("Error: Month not valid",
				true, 
				testResults.contains("JANUARY") || testResults.contains("FEBRUARY") || testResults.contains("MARCH") 
				|| testResults.contains("APRIL") || testResults.contains("MAY") || testResults.contains("JUNE") 
				|| testResults.contains("JULY") || testResults.contains("AUGUST") || testResults.contains("SEPTEMBER")
				|| testResults.contains("OCTOBER") || testResults.contains("NOVEMBER") || testResults.contains("DECEMBER")
				);	
	}
	
	@Test
	//test for valid day of month
	public void currentDateTest2 () {
		String testResults = cdTest.getFullDateString();
		//get the numbers from the string
		String numbersFromString = testResults.replaceAll("[^0-9]", "");
		//remove the year so just the day of month remains
		String dayOfMonth = numbersFromString.replace("2021", "");
		//convert to int
		int finalInt = Integer.parseInt(dayOfMonth);
		Assert.assertEquals("Error: Day of month not valid",
				true, 
				(finalInt > 0 && 32 > finalInt)
				);	
	}
	
	@Test
	//test to check year is current
	public void currentDateTest3 () {
		String testResults = cdTest.getFullDateString();
		Assert.assertEquals("Error: Year not valid",
				true, 
				testResults.contains("2021"));	
	}

}
