package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonAdhar {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Person person=new Person();
		person.setName("manju");
		person.setAge(24);
		person.setGender("male");
		person.setPhno(7795543450l);

		AdharCard adharCard=new AdharCard();
		adharCard.setId(12345);
		adharCard.setAddress("Bagalkot");
	////////////////////////////////////////////////////////////////////////////	
		Person person1=new Person();
		person1.setName("Basu");
		person1.setAge(54);
		person1.setGender("male");
		person1.setPhno(99802061698l);

		AdharCard adharCard1=new AdharCard();
		adharCard1.setId(678910);
		adharCard1.setAddress("Banglore");
		
		person.setCard(adharCard);   // adharcard ref passing into Person class method
		person1.setCard(adharCard1);
		
		entityTransaction.begin();
		entityManager.persist(person);  //save the data
		entityManager.persist(adharCard);
		entityManager.persist(person1);
		entityManager.persist(adharCard1);
		entityTransaction.commit();
	}

}
