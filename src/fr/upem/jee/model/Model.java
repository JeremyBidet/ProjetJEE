package fr.upem.jee.model;

import java.util.HashMap;
import java.util.stream.Collectors;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.PersistenceContext;

@EJB
public class Model {
	
	@PersistenceContext(unitName="project")
	private EntityManager em;
	
	private HashMap<String, User> users;
	
	/**
	 * Either inject with annotations @PersistenceContext(unitName="name"),
	 * either instanciate with EntityManagerFactory
	 */
	public Model() {
		// EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
		// this.em = emf.createEntityManager();
		EntityTransaction et = this.em.getTransaction();
		et.begin();
		users = (HashMap<String, User>) em.createQuery("SELECT * FROM user", User.class).getResultList().stream().collect(Collectors.toMap(User::getEmail, u -> u));
	}

	public User findUser(String email) {
		return users.containsKey(email) ? users.get(email): null;
	}
	
	public EntityManager getEntityManager() {
		return this.em;
	}
	
}
