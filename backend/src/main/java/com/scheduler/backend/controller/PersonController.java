package com.scheduler.backend.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.service.PersonService;

@RestController
public class PersonController {

	private PersonService personService = new PersonService();
	
	@GetMapping("/persons")
	@ResponseBody
	public List<Person> getAllPersons() {
		return personService.findAll();
	}
	
	@PostMapping("/persons")
	@ResponseBody
	public Person savePerson(@RequestBody Person person) {
		if (person != null) {
			return personService.save(person);
		}
		return null;
	}
}
