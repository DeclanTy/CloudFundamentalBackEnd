package com.bae.JavaProgramBackend.property.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity 
public class Property {
	
	//Created private variables
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String address;
	private String gps_location;
	private String location;
	private Integer price;
	private Integer bedrooms;


	//Default constructor
	public Property() {
		super();
	}
	
	//Constructor with all variables
	public Property(Integer id, String address, String gps_location, String location, Integer price, Integer bedrooms) {
		super();
		this.id = id;
		this.address = address;
		this.gps_location = gps_location;
		this.location = location;
		this.price = price;
		this.bedrooms = bedrooms;
	}

	public Property(String address, String gps_location, String location, Integer price, Integer bedrooms) {
		super();
		this.address = address;
		this.gps_location = gps_location;
		this.location = location;
		this.price = price;
		this.bedrooms = bedrooms;
	}

	//Getters and setters, some may not be required in the finished application
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}

	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getgps_location() {
		return gps_location;
	}
	public void setgps_location(String gps_location) {
		this.gps_location = gps_location;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getBedrooms() {
		return bedrooms;
	}
	public void setBedrooms(Integer bedrooms) {
		this.bedrooms = bedrooms;
	}

	
	//toString, using default presentation, id may not be needed at this stage.
	@Override
	public String toString() {
		return "Property [address=" + address + ", gps_Location=" + gps_location + ", location=" + location + ", price="
				+ price + ", bedrooms=" + bedrooms + "]";
	}
	
	
	
	
	
	

}
