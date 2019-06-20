package com.web2.APP.persistence;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name = "appuser")
public class TestUser {
	

	
	
	@Id 
	//@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "hibernate_sequence")
	//@GenericGenerator(name = "seq_abcd", strategy = "native")
	//@SequenceGenerator(name="hibernate_sequence", sequenceName="hibernate_sequence", allocationSize=1)
	@Column(name = "uID", updatable = false, nullable = false)
	private int uID;
	protected String Name;
	public String Surname;
	private String Birthday;
	private String Email;
	private Boolean isAdmin;
	
	
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getSurname() {
		return Surname;
	}
	public void setSurname(String surname) {
		Surname = surname;
	}
	public String getBirthday() {
		return Birthday;
	}
	public void setBirthday(String birthday) {
		Birthday = birthday;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		Email = email;
	}
	public Boolean getIsAdmin() {
		return isAdmin;
	}
	public void setIsAdmin(Boolean isAdmin) {
		this.isAdmin = isAdmin;
	}
	

	public int getuID() {
		return uID;
	}
	public void setuID(int uID) {
		this.uID = uID;
	}
	public TestUser() {
		this.setIsAdmin(false);
	}	
}