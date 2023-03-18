package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class GetAllDataStudent 
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select s from Student s");
		List<Student> list=query.getResultList();

		System.out.println("----------------------Getting All the Data---------------------------------");
		for(Student student:list)
		{
			System.out.println(student.getId());
			System.out.println(student.getName());
			System.out.println(student.getAge());
			System.out.println(student.getGender());
			System.out.println(student.getPhone());
			System.out.println("------------------------------------------------------------------------");
		}
	}
}