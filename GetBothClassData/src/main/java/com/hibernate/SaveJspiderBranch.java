package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveJspiderBranch 
{
	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Jspider jspider1=new Jspider();
		jspider1.setName("jspider");
		jspider1.setWebsite("www.jsp.com");
		jspider1.setNotrainers(32);
		
		Jspider jspider2=new Jspider();
		jspider2.setName("Qspider");
		jspider2.setWebsite("www.qsp.com");
		jspider2.setNotrainers(32);
		
		
		Branch branch1=new Branch();
		branch1.setBname("basavanagudi");
		branch1.setLoc("new national metro");
		branch1.setPhno(123456789l);
		
		Branch branch2=new Branch();
		branch2.setBname("Rajajinagar");
		branch2.setLoc("new bus stand");
		branch2.setPhno(784956789l);
		
		Branch branch3=new Branch();
		branch3.setBname("marthalli");
		branch3.setLoc("new maha ");
		branch3.setPhno(99855556789l);
		
		Branch branch4=new Branch();
		branch4.setBname("BTM");
		branch4.setLoc("new collegae");
		branch4.setPhno(87955456789l);
	
	
		List<Branch> list1=new ArrayList<Branch>();
		list1.add(branch1);
		list1.add(branch2);
		
		List<Branch> list2=new ArrayList<Branch>();
		list2.add(branch3);
		list2.add(branch4);
		
		jspider1.setBranchs(list1);
		jspider2.setBranchs(list2);
		
		branch1.setJspider(jspider1);
		branch2.setJspider(jspider1);
		branch3.setJspider(jspider2);
		branch4.setJspider(jspider2);
		
		entityTransaction.begin();
		entityManager.persist(jspider1);   //save the data
		entityManager.persist(jspider2);
		entityManager.persist(branch1);
		entityManager.persist(branch2);
		entityManager.persist(branch3);
		entityManager.persist(branch4);
		entityTransaction.commit();
	}
}