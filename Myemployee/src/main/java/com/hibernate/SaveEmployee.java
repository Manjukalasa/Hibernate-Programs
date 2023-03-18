package com.hibernate;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
public class SaveEmployee {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Employee employee=new Employee();
		employee.setName("manju");
		employee.setAge(24);
		employee.setGender("male");
		employee.setPnno(779511543450l); // phone numbers will be Unique
		employee.setSal(45000);

		Employee employee1=new Employee();
		employee1.setName("kalasa");
		employee1.setAge(23);
		employee1.setGender("male");
		employee1.setPnno(77444341150l);  // phone numbers will be Unique
		employee1.setSal(55000);

		Employee employee2=new Employee();
		employee2.setName("mbk");   
		employee2.setAge(21);
		employee2.setGender("male");
		employee2.setPnno(99341150l);    // phone numbers will be Unique
		employee2.setSal(65000);

		entityTransaction.begin();
		entityManager.persist(employee);  //save the data
		entityManager.persist(employee1);
		entityManager.persist(employee2);
		entityTransaction.commit();
	}

}