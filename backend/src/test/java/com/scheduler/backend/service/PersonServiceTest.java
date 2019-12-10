package com.scheduler.backend.service;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.model.PersonType;


public class PersonServiceTest {

	private PersonService personService = new PersonService();
	
	@Test
	public void testFindAll() {
		
		Person newPerson = new Person();
		newPerson.setFirstName("Alex");
		newPerson.setLastName("Bondor");
		newPerson.setCalendarId(1L);
		newPerson.setType(PersonType.TEACHER);
		newPerson = personService.save(newPerson);
		
		List<Person> persons = personService.findAll();
		Assert.assertNotNull(persons);
		Assert.assertEquals(1, persons.size());
	}
}
