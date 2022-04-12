package com.kidsducation.repository;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Customer {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private Long userID;
	private String userName;
	private String displayName;
	private String firstName;
	private String lastName;
	private Date DOB;
	private Date joiningDate;
	private String subscriptionType;
	private String Gender;
	
	
	public Long getUserID() {
		return userID;
	}

	public String getUsername() {
		return userName;
	}


	public void setUsername(String username) {
		this.userName = username;
	}


	public String getDisplayName() {
		return displayName;
	}


	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public Date getDOB() {
		return DOB;
	}


	public void setDOB(Date dOB) {
		this.DOB = dOB;
	}


	public Date getJoiningDate() {
		return joiningDate;
	}


	public void setJoiningDate(Date joiningDate) {
		this.joiningDate = joiningDate;
	}


	public String getSubscriptionType() {
		return subscriptionType;
	}


	public void setSubscriptionType(String subscriptionType) {
		this.subscriptionType = subscriptionType;
	}


	public String getGender() {
		return Gender;
	}


	public void setGender(String gender) {
		this.Gender = gender;
	}


	public Customer(String userName, String displayName, String firstName, String lastName, Date dOB, Date joiningDate,
			String subscriptionType, String gender) {
		super();
		this.userName = userName;
		this.displayName = displayName;
		this.firstName = firstName;
		this.lastName = lastName;
		DOB = dOB;
		this.joiningDate = joiningDate;
		this.subscriptionType = subscriptionType;
		Gender = gender;
	}


	@Override
	public String toString() {
		return "Customer [userID=" + userID + ", username=" + userName + ", displayName=" + displayName + ", firstName="
				+ firstName + ", lastName=" + lastName + ", DOB=" + DOB + ", joiningDate=" + joiningDate
				+ ", subscriptionType=" + subscriptionType + ", Gender=" + Gender + "]";
	}


	public Customer() {
		
	}

}
