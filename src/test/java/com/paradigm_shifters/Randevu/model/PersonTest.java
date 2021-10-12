package com.paradigm_shifters.Randevu.model;

import java.time.LocalDate;

import org.junit.Assert;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PersonTest {

	@Test
	void testGetAge() {
		int ageToTest = 20;
		Person person = createPersonWithAge(ageToTest);
		Assert.assertTrue(person.getAge() == ageToTest);
	}

	private Person createPersonWithAge(int currentYear) {
		currentYear = LocalDate.now().getYear();
		int birthYear = currentYear - 20;
		String birthday = birthYear + "-01-01";
		Person person = new Person("Jason", birthday);
		return person;
	}
	
	@Test
	void testInvalidBirthday() {
		Assertions.assertThrows(NumberFormatException.class, () -> {
			@SuppressWarnings("Unused")
			Person person = new Person("Jason", "Invalid birthday");
		});
	}

}













