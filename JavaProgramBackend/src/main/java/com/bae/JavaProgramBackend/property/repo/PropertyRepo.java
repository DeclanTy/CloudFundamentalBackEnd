package com.bae.JavaProgramBackend.property.repo;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bae.JavaProgramBackend.property.domain.Property;
//It was at this moment I realised I should not have called my class property.

@Repository
public interface PropertyRepo extends JpaRepository<Property, Integer> {
//This creates an interface of spring auto generated CRUD methods
	
	// Spring will auto-generate all of the basic CRUD functionality
/*
	List<Property> findByTypeIgnoreAddress(String address);

	List<Property>findByGpsLocation(String gpsLocation);
	
	List<Property>findByLocation(String location);

	List<Property> findByPrice(Integer price);

	List<Property> findByBedrooms(Integer bedrooms);
	*/
}
