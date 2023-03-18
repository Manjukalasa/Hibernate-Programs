package com.hibernate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import java.util.List;

public class GetAllDataEmployee
{
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select e from Employee e");
		List<Employee> employees=query.getResultList();

		System.out.println("----------------------Getting All the Data---------------------------------");
		for(Employee employee:employees)
		{
			System.out.println("Employee inforamation:"+employee);
			System.out.println("Employee ID:"+employee.getId());
			System.out.println("Employee Name:"+employee.getName());
			System.out.println("Employee Age"+employee.getAge());
			System.out.println("Employee Gender:"+employee.getGender());
			System.out.println("Employee Salary:"+employee.getSal());
			System.out.println("Employee Phone:"+employee.getPhno());
			System.out.println("*************************************************************************");
		}
	}
}