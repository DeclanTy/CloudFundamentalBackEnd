package com.bae.JavaProgramBackend.property.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bae.JavaProgramBackend.property.domain.Property;

@Service
public class PropertyService {
	private List<Property> properties = new ArrayList<>();
/*
	public Property createProperty(Property property) {
		properties.add(property);
		Property created = this.properties.get(this.properties.size() - 1);
		return created;
	}
	public List<Property>getAllProperties(){
		return this.properties;
	}
	public Property getProperty(Integer id) {
		Property getProperty=properties.get(id);
		return getProperty;
	}
	public Property replaceProperty(Integer id,Property newProperty) {
		return newProperty;
	}
	public void removeProperty(Integer id,Property newProperty) {
		this.properties.remove(id.intValue());
	}
*/
	//unsed code with the junit
}
