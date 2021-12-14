package com.bae.JavaProgramBackend.property.web;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.bae.JavaProgramBackend.property.domain.Property;
import com.bae.JavaProgramBackend.property.service.PropertyServiceDB;
@CrossOrigin
@RestController
public class propertyController {
	private PropertyServiceDB service;

	public propertyController(PropertyServiceDB service) {
		super();
		this.service=service;
	}
	@PostMapping("/create")//201
	public ResponseEntity createProperty(@RequestBody Property property) {
		Property created=this.service.createProperty(property);
		ResponseEntity<Property>response=new ResponseEntity<Property>(created,HttpStatus.CREATED);
		return response;
	}
	
	@GetMapping("/getAll")//200
	public ResponseEntity<List<Property>> getAllProperties(){
		return ResponseEntity.ok(this.service.getAllProperties());
	}
	@GetMapping("/get/{id}")//200
	public Property getProperty(@PathVariable Integer id) {
		return this.service.getProperty(id);
	}
	@PutMapping("/replace/{id}")//202
	public ResponseEntity<Property> replaceProperty(@PathVariable Integer id,@RequestBody Property newProperty){
		Property body=this.service.replaceProperty(id, newProperty);
		ResponseEntity<Property>response = new ResponseEntity<Property>(body,HttpStatus.ACCEPTED);
		return response;
		
	}
	@DeleteMapping("/remove/{id}")//204
	public ResponseEntity<?>removeProperty(@PathVariable Integer id){
		this.service.removeProperty(id);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}
	
}
