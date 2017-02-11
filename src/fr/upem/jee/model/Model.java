package fr.upem.jee.model;

import javax.ejb.EJB;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@EJB
public class Model {
	
	@PersistenceContext(unitName="project")
	private EntityManager em;

	public EntityManager getEntityManager() {
		return this.em;
	}
	
}
