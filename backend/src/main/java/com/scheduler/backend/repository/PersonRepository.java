package com.scheduler.backend.repository;

import java.sql.ResultSet;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;

import com.scheduler.backend.model.Person;
import com.scheduler.backend.service.HibernateService;
import com.scheduler.backend.transformer.PersonTransformer;

public class PersonRepository implements Repository<Person> {

	private PersonTransformer personTransformer;
	
	public PersonRepository() {
		this.personTransformer = new PersonTransformer();
	}
	
	public Person save(Person entity) {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		databaseSession.beginTransaction();
		databaseSession.saveOrUpdate(entity);
		databaseSession.save(entity);
		databaseSession.getTransaction().commit();
		
		// Some words about entity.getId():
		//   if the id is null it means we want to create a new db entry (INSERT statement)
		//   if the id is non-null it means we want to update a db entry (UPDATE statement)
		//
		//
		// create the insert/update statement out of entity attributes
		// execute query using DBConnector
		// fetch the just inserted entity with a select statement
		// transform ResultSet to Person and return it
		return entity;
	}

	public Person findById(Long id) {
		// create the select query
		// execute it
		// transform ResultSet to Person and return it
		return null;
	}

	public List<Person> findAll() {
		Session databaseSession = HibernateService.getSessionFactory().openSession();
		Query query = databaseSession.createQuery("from Person");
		List<Person> result = query.list();
		return result;
	}

	public boolean delete(Person entity) {
		// the above implementations should be helpful for implementing this
		return false;
	}

}
