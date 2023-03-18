package com.hibernate;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllDataJspiderBranch
{
	public static void main(String[] args)
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();

		Query query=entityManager.createQuery("select j from Jspider j");
		List<Jspider> jspiders=query.getResultList();
		for(Jspider jspider: jspiders)
		{
			System.out.println(jspider.getId());
			System.out.println(jspider.getName());
			System.out.println(jspider.getWebsite());
			System.out.println(jspider.getNotrainers());
			List<Branch> branches= jspider.getBranchs();
			System.out.println("---------------------------------------------");
			for(Branch  branch : branches)
			{
				System.out.println(branch.getBid());
				System.out.println(branch.getBname());
				System.out.println(branch.getLoc());
				System.out.println(branch.getPhno());
				System.out.println("****************************************");
			}
		}
	}
}
