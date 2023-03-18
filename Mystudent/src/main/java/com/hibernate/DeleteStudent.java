package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=entityManager.find(Student.class, 113);
		
		if(student!=null)
		{
			entityTransaction.begin();
			entityManager.remove(student);  //Delete the data
			entityTransaction.commit();
		}
		else
		{
			System.out.println("Data Already Deleted");
		}
	}
}