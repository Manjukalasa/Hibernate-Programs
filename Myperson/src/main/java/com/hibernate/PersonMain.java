package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class PersonMain {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		Person person=new Person();
		person.setId(104);
		person.setName("kk");
		person.setAge(24);
		person.setGender("female");
		person.setPhone(7793345450l);
		
		Person person1=new Person();
		person1.setId(104);
		person1.setName("kk");
		person1.setAge(24);
		person1.setGender("female");
		person1.setPhone(7793345450l);
		
		entityTransaction.begin();
		entityManager.persist(person);   //save the data
		entityManager.persist(person1);
		entityTransaction.commit();
	}

}
