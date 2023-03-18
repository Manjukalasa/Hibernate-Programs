package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SaveStudentsColleage {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Student student=new Student();
		student.setName("manju");
		student.setAge(21);
		student.setMarks(99.9);
		student.setGender("male");
		

		Student student1=new Student();
		student1.setName("kalasa");
		student1.setAge(22);
		student1.setMarks(89.9);
		student1.setGender("male");

		Student student2=new Student();
		student2.setName("mbk");
		student2.setAge(23);
		student2.setMarks(78);
		student2.setGender("male");
		
		Student student3=new Student();
		student3.setName("kk");
		student3.setAge(21);
		student3.setMarks(70);
		student3.setGender("female");
		
		Colleage colleage=new Colleage();
		colleage.setName("DSCE");
		colleage.setWebsite("WWW.DSCE.COM");
		colleage.setLocation("Banglore");
		
		Colleage colleage1=new Colleage();
		colleage1.setName("BSC");
		colleage1.setWebsite("WWW.BSC.COM");
		colleage1.setLocation("Bagalkot");
		
		student.setColleages(colleage);
		student1.setColleages(colleage);
		student2.setColleages(colleage1);
		student3.setColleages(colleage1);
		
		entityTransaction.begin();
		entityManager.persist(colleage);  //save the data
		entityManager.persist(colleage1);
		entityManager.persist(student);
		entityManager.persist(student1);
		entityManager.persist(student2);
		entityManager.persist(student3);
		entityTransaction.commit();	
	}

}
