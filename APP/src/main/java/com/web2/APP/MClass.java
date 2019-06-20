package com.web2.APP;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.web2.APP.persistence.AppUser;
import com.web2.APP.persistence.TestUser;

public class MClass {

	public static void main(String[] args) {
		DBTools db = new DBTools();
		//db.createTable("appuser");

	   //db.dropTable("appuser");
	    //db.createCustomTable();

		AppUser u1 = new AppUser();
		u1.setuID(4);
		u1.setName("Elvis");
		u1.setSurname("Redjeposki");
		u1.setBirthday("22.07.1993");
		u1.setIsAdmin(false);
		u1.setEmail("elvisre@outlook.com");

		// test objects
		TestUser user1 = new TestUser();
		user1.setName("Username1");
		user1.setSurname("Surname1");
		user1.setEmail("ex@egegerx.com");
		user1.setBirthday("22.07.1994");
		user1.setuID(10);

		//db.insertIntoTable("appuser", u1);
		//db.printRecords("appuser");
		
		/*
		EntityManagerFactory EMF = Persistence.createEntityManagerFactory("userinfo1");
		EntityManager EM = EMF.createEntityManager(); 
		EM.getTransaction().begin(); 
		EM.persist(user1); 
		EM.getTransaction().commit(); 
		EM.close(); */
		 


	}

}
