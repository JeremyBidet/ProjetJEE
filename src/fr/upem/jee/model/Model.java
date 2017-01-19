package fr.upem.jee.model;

import javax.persistence.EntityManager;
import javax.ejb.EJB;
import javax.inject.Inject;

@EJB
public class Model {
	
	@Inject
	private EntityManager em;

	public EntityManager getEntityManager() {
		return this.em;
	}
	
}
