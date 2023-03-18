package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetDataBasedOnSalAge
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		Query query=entityManager.createQuery("select e from Employee e where e.sal>?1 and e.age>?2"); // both condition satisfied that time o/p will come
	//	Query query=entityManager.createQuery("select e from Employee e where e.sal>?1 or e.age>?2");  // any one condition satisfied that time o/p will come
		query.setParameter(1,50000);// 1 is salary
		query.setParameter(2,21);// 2 is Age
		List<Employee> employees=query.getResultList();

		System.out.println("----------------------Getting All the Data---------------------------------");
		for(Employee employee:employees)
		{
			System.out.println("Employee Details:"+employee);
		}
	}
}