package com.hibernate;

import java.util.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePerson_Bank
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Person person=new Person();
		person.setName("manju");
		person.setPhno(7795543450l);
		
		Person person1=new Person();
		person1.setName("kalasa");
		person1.setPhno(9980206168l);
		
		Bank bank=new Bank();
		bank.setBname("punjab");
		bank.setLocation("Bagalkot");

		Bank bank1=new Bank();
		bank1.setBname("BOB");
		bank1.setLocation("Banglore");
		
		Bank bank2=new Bank();
		bank2.setBname("union");
		bank2.setLocation("Bagalkot");
		
		List<Bank> list=new ArrayList<Bank>();
		list.add(bank);
		list.add(bank2);
		
		List<Bank> list1=new ArrayList<Bank>();
		list1.add(bank1);
		
		person.setBanks(list);
		person1.setBanks(list1);
		
		bank.setPerson(person);
		bank2.setPerson(person);
		bank1.setPerson(person1);
		
		entityTransaction.begin();
		entityManager.persist(person);  //save the data
		entityManager.persist(person1);
		entityManager.persist(bank);
		entityManager.persist(bank1);
		entityManager.persist(bank2);
		entityTransaction.commit();
	}

}
