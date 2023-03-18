package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveMobileSims {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Mobile mobile=new Mobile();
		mobile.setBrand("iphone");
		mobile.setCost(100000);
		mobile.setColor("Red");
		mobile.setRam("8GB");
		
		Mobile mobile1=new Mobile();
		mobile1.setBrand("Samsung");
		mobile1.setCost(400000);
		mobile1.setColor("Gold");
		mobile1.setRam("6GB");
		
		Sim sim=new Sim();
		sim.setProvider("jio");
		sim.setType("4g");
		sim.setCost(399);
		sim.setPhno(7795543450l);
		
		Sim sim1=new Sim();
		sim1.setProvider("Airtel");
		sim1.setType("4g");
		sim1.setCost(499);
		sim1.setPhno(8679543450l);
		
		Sim sim2=new Sim();
		sim2.setProvider("vada");
		sim2.setType("3g");
		sim2.setCost(299);
		sim2.setPhno(99895543450l);
		
		Sim sim3=new Sim();
		sim3.setProvider("Idia");
		sim3.setType("5g");
		sim3.setCost(599);
		sim3.setPhno(9980206168l);
		
		List<Sim> list=new ArrayList<Sim>();
		list.add(sim);
		list.add(sim1);
		
		List<Sim> list1=new ArrayList<Sim>();
		list1.add(sim2);
		list1.add(sim3);
		
		mobile.setSims(list);
		mobile1.setSims(list1);
		
		entityTransaction.begin();
		entityManager.persist(mobile);  //save the data
		entityManager.persist(mobile1); 
		entityManager.persist(sim); 
		entityManager.persist(sim1); 
		entityManager.persist(sim2); 
		entityManager.persist(sim3); 
		entityTransaction.commit();	
	}
}