package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteMobileSims {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile mobile=entityManager.find(Mobile.class, 1);
		
		if(mobile!=null)
		{
			Sim sim=entityManager.find(Sim.class, 1);
			Sim sim1=entityManager.find(Sim.class, 2);
			entityTransaction.begin();
			entityManager.remove(mobile);
			entityManager.remove(sim);
			entityManager.remove(sim1);  //Delete the data
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Data Already Deleted");
		}
	}
}