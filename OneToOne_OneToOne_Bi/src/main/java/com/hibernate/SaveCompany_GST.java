package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveCompany_GST
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Company company=new Company();
		company.setName("Infosys");
		company.setWebsite("www.infosys.com");
		company.setLocation("Banglore");
		
		
		Company company1=new Company();
		company1.setName("DXC");
		company1.setWebsite("www.dxc.com");
		company1.setLocation("Banglore");
		
		GST gst=new GST();
		gst.setGstno("infosys123");
		gst.setState("Karnataka");
		gst.setCountry("india");
		
		GST gst1=new GST();
		gst1.setGstno("Dxc456");
		gst1.setState("Karnataka");
		gst1.setCountry("india");
		
		company.setGsts(gst);
		company1.setGsts(gst1);
		gst.setCompanies(company);
		gst1.setCompanies(company1);
		
		entityTransaction.begin();
		entityManager.persist(company);  //save the data
		entityManager.persist(company1);
		entityManager.persist(gst);
		entityManager.persist(gst1);
		entityTransaction.commit();
	}

}
