package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
        
		Student student=entityManager.find(Student.class, 114);
		student.setName("mbk");
		student.setPhone(9980206168l);
		
		entityTransaction.begin();
		entityManager.merge(student);  //Updated the data
		entityTransaction.commit();
	}
}


