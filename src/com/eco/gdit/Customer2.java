package com.eco.gdit;

import javax.persistence.*;

@Entity
@Table(name="CUSTOMERS")
public class Customer2 {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="FIRST_NAME")
	private String firstName;
	
	@Column(name="LAST_NAME")
	private String lastName;
	
	@OneToOne(fetch=FetchType.LAZY,cascade= CascadeType.PERSIST)
	@JoinColumn(name="ADDRESS_ID")
	private Address businessAddress;
	
	

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	
	public Address getBusinessAddress() {
		return businessAddress;
	}

	public void setBusinessAddress(Address businessAddress) {
		this.businessAddress = businessAddress;
	}

	

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	
	
	
	
	

}
