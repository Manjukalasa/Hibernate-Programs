package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePersonCab 
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("manju");
		person.setPhno(7795543450l);
		
		Person person1=new Person();
		person1.setName("kalasa");
		person1.setPhno(123456789l);
		
		Person person2=new Person();
		person2.setName("mbk");
		person2.setPhno(99820206168l);
		
		Cab cab=new Cab();
		cab.setDname("mk");
		cab.setCost(105.5);
		
		Cab cab1=new Cab();
		cab1.setDname("mbk");
		cab1.setCost(255.5);
		
		Cab cab2=new Cab();
		cab2.setDname("kk");
		cab2.setCost(110);
		
		Cab cab3=new Cab();
		cab3.setDname("mboss");
		cab3.setCost(500);
		
		List<Person> l=new ArrayList<Person>();
		l.add(person);
		l.add(person1);
		l.add(person2);
		
		List<Cab> list=new ArrayList<Cab>();
		list.add(cab);
		list.add(cab1);
		list.add(cab2);
		list.add(cab3);
		
		List<Cab> list1=new ArrayList<Cab>();
		list1.add(cab);
		list1.add(cab1);
		list1.add(cab2);
		list1.add(cab3);
		
		List<Cab> list2=new ArrayList<Cab>();
		list2.add(cab);
		list2.add(cab1);
		list2.add(cab2);
		list2.add(cab3);
	
		person.setCabs(list);
		person1.setCabs(list1);
		person2.setCabs(list2);
		cab.setPersons(l);
		cab1.setPersons(l);
		cab2.setPersons(l);
		cab3.setPersons(l);
		
		entityTransaction.begin();
		entityManager.persist(person);  //save the data
		entityManager.persist(person1);
		entityManager.persist(person2);
		entityManager.persist(cab);
		entityManager.persist(cab1);
		entityManager.persist(cab2);
		entityManager.persist(cab3);
		entityTransaction.commit();	
	}

}
