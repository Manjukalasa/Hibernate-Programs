package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GetDataStudent {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Student student=entityManager.find(Student.class, 111);
		Student student1=entityManager.find(Student.class, 114);
		
		System.out.println("-----------------------------Getting the Data--------------------------------------------");
		System.out.println(student);  // toString() is Overridden 
		System.out.println(student.getId());
		System.out.println(student.getName());
		System.out.println(student.getAge());
		System.out.println(student.getGender());
		System.out.println(student.getPhone());
		System.out.println("------------------------------Getting the Data-------------------------------------------");
		System.out.println(student1);  // toString() is Overridden
		System.out.println(student1.getId());
		System.out.println(student1.getName());
		System.out.println(student1.getAge());
		System.out.println(student1.getGender());
		System.out.println(student1.getPhone());
	}
}