package fr.upem.jee.model;

import javax.persistence.EntityManager;
import javax.ejb.EJB;
import javax.inject.Inject;

@EJB
@Statefull
public class Model {
	
	@Inject
	private final EntityManager em;

}
