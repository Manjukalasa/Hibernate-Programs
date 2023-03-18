package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetDataPersonAdhar {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		
		Person person=entityManager.find(Person.class, 2);
		System.out.println(person.getName());
		
		AdharCard adharCard=entityManager.find(AdharCard.class, 12345);
		System.out.println(adharCard.getAddress());
	}
}
