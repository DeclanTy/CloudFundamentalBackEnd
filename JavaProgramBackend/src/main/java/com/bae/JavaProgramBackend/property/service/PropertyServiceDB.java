package com.bae.JavaProgramBackend.property.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bae.JavaProgramBackend.property.domain.Property;
import com.bae.JavaProgramBackend.property.repo.PropertyRepo;

@Service
public class PropertyServiceDB {
	
private PropertyRepo repo;
	
	@Autowired
	public PropertyServiceDB(PropertyRepo repo) {
		super();
		this.repo=repo;
		
	}
	public Property createProperty(Property property) {
		Property created=this.repo.save(property);
		return created;
	}
	public List<Property>getAllProperties(){
		return this.repo.findAll(); //SELECT * FROM property
		
	}
	public Property getProperty(Integer id) {
		return this.repo.findById(id).get();
	
	}
	public Property replaceProperty(Integer id,Property newProperty) {
		Property existing=this.repo.getById(id);
		existing.setAddress(newProperty.getAddress());
		existing.setgps_location(newProperty.getgps_location());
		existing.setLocation(newProperty.getLocation());
		existing.setPrice(newProperty.getPrice());
		existing.setBedrooms(newProperty.getBedrooms());
		Property updated=this.repo.save(existing);
		return updated;
	}
	public void removeProperty(Integer id) {
		this.repo.deleteById(id);
	}
}
