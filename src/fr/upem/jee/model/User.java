package fr.upem.jee.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="user")
public class User {

	@Id
	@Column(name="email", length=64)
	private final String email;
	
	@Column(name="password", length=32)
	private String password; // SHA-1
	
	@Column(name="firstname", length=64)
	private String firstname;
	
	@Column(name="lastname", length=64)
	private String lastname;
	
	@OneToMany(
			targetEntity=History.class,
			orphanRemoval=true,
			cascade=CascadeType.ALL,
			fetch=FetchType.LAZY)
	@JoinColumn(table="history", name="user", referencedColumnName="email")
	private Set<History> histories;
	
	public User(String email, String password, String firstname, String lastname) {
		this.email = email;
		this.password = password;
		this.firstname = firstname;
		this.lastname = lastname;
	}
	
	public String getEmail() {
		return this.email;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	public String getFirstname() {
		return this.firstname;
	}
	
	public String getLastname() {
		return this.lastname;
	}
	
	/**
	 * This method is intended only to update the password of the current user.<br>
	 * The password must not be given clearly.<br>
	 * Use SHA-1 algorithm to encrypt it before any transaction.
	 * @param password the new password to be set. Must be a SHA-1 string
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	
}
