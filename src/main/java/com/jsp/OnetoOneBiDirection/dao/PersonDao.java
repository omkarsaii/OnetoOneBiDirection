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
	
	public void updateperson(int id,Person person)
	{
		EntityManager entityManager=getEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person1=entityManager.find(Person.class,id);
		
		if(person1!=null)
		{
			entityTransaction.begin();
			person.setId(id);
			
			Pancard pancard=person.getPancard();   
			
			if(pancard!=null)
			{
				entityManager.merge(pancard) ;
			}
			entityManager.merge(person);
			entityTransaction.commit();
		}
		entityManager.merge(person);
		entityTransaction.commit();
	}
	///hiber/OnetoOneBiDirection/src/main/java/com/jsp/OnetoOneBiDirection/dao
}
