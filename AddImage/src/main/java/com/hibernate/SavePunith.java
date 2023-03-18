package com.hibernate;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class SavePunith 
{
	public static void main(String[] args) throws IOException 
	{
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();

		Punith punith=new Punith();
		punith.setName("PunithRajKumar");
		punith.setReason("Is BirthDay");
		punith.setBirthdayDate(new Date());

		FileInputStream fis=new FileInputStream("src/main/java/punithimage.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		punith.setImage(data);

		entityTransaction.begin();
		entityManager.persist(punith);   //save super class data automatically chaild also save the data
		entityTransaction.commit();
	}
}
