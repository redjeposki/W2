package com.web2.APP.persistence;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "appuser")
public class AppUser {
	
	
	//@GeneratedValue
		// @GeneratedValue(strategy = GenerationType.SEQUENCE, generator =
		// "hibernate_sequence")
		// @SequenceGenerator(name="hibernate_sequence",
		// sequenceName="hibernate_sequence", allocationSize=1)
		// @Column(name = "uID", updatable = false, nullable = false)
	@Id
	@Column(name = "uID")
	private int uID;
	private String Name;
	private String Surname;
	private String Birthday;
	private String Email;
	private Boolean isAdmin;
	private ArrayList<Post> userPosts;

	public AppUser() {

	}
    
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
		return this.uID;
	}
	
	public void setuID(int id) {
		this.uID = id;
	}
}
