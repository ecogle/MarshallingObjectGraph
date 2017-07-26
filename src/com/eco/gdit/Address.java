package com.eco.gdit;

import javax.persistence.*;
import javax.xml.bind.annotation.*;

@SuppressWarnings("unused")
@XmlAccessorType(XmlAccessType.FIELD)

@Entity
@Table(name="ADDRESS")
public class Address {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	
	@Column(name="HOUSE_NUM")
	private String houseNum;
	
	
	@Column(name="APT_NUM")
	private String aptNum;
	
	@Transient
	private String street;
    
	@Column(name="CITY")
    private String city;
    
	@Column(name="STATE")
    private String state;
    
	@Column(name="ZIP")
    private String zip;
    
	@Transient
    private String province;
     
	@Transient
    private String postalCode;

	public String getHouseNum() {
		return houseNum;
	}

	public void setHouseNum(String houseNum) {
		this.houseNum = houseNum;
	}

	public String getAptNum() {
		return aptNum;
	}

	public void setAptNum(String aptNum) {
		this.aptNum = aptNum;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getZip() {
		return zip;
	}

	public void setZip(String zip) {
		this.zip = zip;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}
	
	
	
}
