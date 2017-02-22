package fr.upem.jee.controller;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;


@ManagedBean
@SessionScoped
public class Login {
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
		// TODO Auto-generated constructor stub
	}
    
	public void login(){
		//TODO : user = getUser(login) from DB if user null then growl
		//TODO : if password == getPassword(User) if false then growl
		//TODO : if all true redirect to main page
	}
	

}
