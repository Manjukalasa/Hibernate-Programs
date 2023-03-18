package com.hibernate;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteHospitalBranch 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Hospital hospital1=entityManager.find(Hospital.class,1);

		if(hospital1 !=null)
		{
			entityTransaction.begin();
			entityManager.remove(hospital1);   //save super class data automatically chaild also save the data
			entityTransaction.commit();
		}
		}
}