package com.scheduler.backend.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.scheduler.backend.model.Person;


public class PersonServiceTest {

	private PersonService personService = new PersonService();
	
	@Test
	public void testFindAll() {
		List<Person> persons = personService.findAll();
		Assert.assertNotNull(persons);
		Assert.assertEquals(1, persons.size());
	}
}
