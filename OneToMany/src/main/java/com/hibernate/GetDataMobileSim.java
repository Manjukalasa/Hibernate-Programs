package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetDataMobileSim 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		
		Mobile mobile=entityManager.find(Mobile.class, 2);
		System.out.println(mobile.getBrand());
		
		Sim sim=entityManager.find(Sim.class, 3);
		System.out.println(sim.getCost());	
	
	}
}
