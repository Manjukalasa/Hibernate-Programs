package com.hibernate;

import java.util.*;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveHospitalBranch {

	public static void main(String[] args) 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Hospital hospital1=new Hospital();
		hospital1.setName("appolo");
		hospital1.setWebsite("www.appolo.com");
		
		Hospital hospital2=new Hospital();
		hospital2.setName("mk");
		hospital2.setWebsite("www.mk.com");
		
		
		Branch branch1=new Branch();
		branch1.setBname("banglore");
		branch1.setLocation("near metro");
		
		Branch branch2=new Branch();
		branch2.setBname("bagalkot");
		branch2.setLocation("near bus stannd");
		
		Branch branch3=new Branch(); 
		branch3.setBname("navanagar");
		branch3.setLocation("near bus stand");
		
		
		Branch branch4=new Branch();
		branch4.setBname("vidyagiri");
		branch4.setLocation("near shcool stannd");
		
		
		List<Branch> list1=new ArrayList<Branch>();
		list1.add(branch1);
		list1.add(branch2);
		
		
		List<Branch> list2=new ArrayList<Branch>();
		list2.add(branch3);
		list2.add(branch4);
		
		hospital1.setBranches(list1);
		hospital2.setBranches(list2);
		branch1.setHospital(hospital1);
		branch2.setHospital(hospital1);
		branch3.setHospital(hospital2);
		branch4.setHospital(hospital2);
		
		entityTransaction.begin();
		entityManager.persist(hospital1);   //save super class data automatically chaild also save the data
		entityManager.persist(hospital2);
		entityTransaction.commit();
	}
}
