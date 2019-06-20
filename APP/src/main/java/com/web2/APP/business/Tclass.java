package com.web2.APP.business;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.web2.APP.persistence.TestUser;

@Path("getuser")
public class Tclass {
	
	@PersistenceContext
    private EntityManager entityManager; // doesn't work, returns NullException...
	private EntityManagerFactory entityManagerFactory;

	@GET
	@Path("/newest")
	@Produces(MediaType.APPLICATION_JSON)
	public String readNewestNews() {      //must be Response instead of String
		
		//Change this! The path is only for my pc.
		//without specifying the "derby.system.home", java can't find it, if specified in derby.log"
		System.setProperty("derby.system.home", "C:\\Users\\elvis\\eclipse-workspace\\APP");
		
		this.entityManagerFactory = Persistence.createEntityManagerFactory("userinfo1");
        this.entityManager = this.entityManagerFactory.createEntityManager();
        this.entityManager.getTransaction().begin();

		
		final CriteriaBuilder builder = this.entityManager.getCriteriaBuilder();
		final CriteriaQuery<TestUser> query = builder.createQuery(TestUser.class);
		final Root<TestUser> from = query.from(TestUser.class);
		
		/* //select * from from TestUser table
		final Root<TestUser> from = query.from(TestUser.class);
		query.select(from);
		List<TestUser> u = this.entityManager.createQuery(query).getResultList();
		*/
		
		/*//returns a TestUser with id 10 ?????
		 * this.entityManager.find(TestUser.class, 10);
		 * */
        
		query.where(builder.equal(from.get("Name"), "Username1"));
		List<TestUser> user = this.entityManager.createQuery(query).getResultList();
		
			
        
        //final TestUser user = this.entityManager.find(TestUser.class, "El");
        
        this.entityManager.getTransaction().commit();
        this.entityManager.close();
        
        System.out.println("OUTPUT: " + user.get(0).getName());
        return  "{\"name\": \"" + user.get(0).getName() + "\"}";
 		
	    //return (Response) this.entityManager.createQuery(query).getResultList();
	    //return "{\"hello\": \"world\"}";

	}


	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String testt() {
		return "{\"hello\": \"Hii\"}";
	}


	@POST
	@Path("withPath")
	@Produces(MediaType.TEXT_PLAIN)
	public String testing() {
		return "This is response to a post request.";
	}
}
