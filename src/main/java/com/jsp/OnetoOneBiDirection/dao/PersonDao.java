package com.jsp.OnetoOneBiDirection.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.OnetoOneBiDirection.model.Pancard;
import com.jsp.OnetoOneBiDirection.model.Person;

public class PersonDao {

	public EntityManager getEntityManager()
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Omkarr");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		return entityManager;
	}
	
	public void savePerson(Person person)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Pancard pancard=person.getPancard();
		
		entityTransaction.begin();
		entityManager.persist(pancard);
		entityManager.persist(person);
		entityTransaction.commit();
		
	}
	
}
