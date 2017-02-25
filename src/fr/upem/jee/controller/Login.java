package fr.upem.jee.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.PersistenceContext;

import fr.upem.jee.model.User;


@ManagedBean
@SessionScoped
public class Login {
	
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("project");
    EntityManager em = emf.createEntityManager();
    EntityTransaction tx = em.getTransaction();
	
	private String login;
	private String password;
    
    public String getLogin() {
        return login;
    }
 
    public void setLogin(String login) {
        this.login = login;
    }
    
    public String getPassword() {
        return password;
    }
 
    public void setPassword(String password) {
        this.password = password;
    }
	
    public Login() {
	}
    
	public void login(){
		//TODO : user = getUser(login) from DB if user null then growl
	
		//TODO : if password == getPassword(User) if false then growl
		//TODO : if all true redirect to main page
	}
	

}
