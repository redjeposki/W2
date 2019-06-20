package com.web2.APP.business;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.PersistenceContextType;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.web2.APP.persistence.TestUser;


@Path("per")
public class Tclass1 {
	
	@PersistenceContext(unitName = "userinfo1")
    private EntityManager entityManager;
	
	
	@GET
    @Produces(MediaType.APPLICATION_JSON)
    public String read() {
		
		System.setProperty("derby.system.home", "C:\\Users\\elvis\\eclipse-workspace\\APP");

        //this.entityManager.getTransaction().begin();
		try {
			final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
			final CriteriaQuery<TestUser> query = builder.createQuery(TestUser.class);
			final Root<TestUser> from = query.from(TestUser.class);
			
	        
			query.where(builder.equal(from.get("Name"), "Username1"));
			List<TestUser> user = this.entityManager.createQuery(query).getResultList();

	        //this.entityManager.getTransaction().commit();
	        //this.entityManager.close();
	        
	        System.out.println("OUTPUT: " + user.get(0).getName());
	        return  "{\"name\": \"" + user.get(0).getName() + "\"}";
			
		} catch (Exception e) {
			System.out.print(e);
		}

		
		return "Uppps";

		

    }
	
	
}
