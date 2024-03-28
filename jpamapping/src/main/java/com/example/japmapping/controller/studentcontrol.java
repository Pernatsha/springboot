package com.example.japmapping.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.japmapping.Entity.StdAddress;
import com.example.japmapping.Entity.StudentEntity;
import com.example.japmapping.repository.studrepo;
//import com.example.japmapping.servciceimpl.stdserviceimpl;
import com.example.japmapping.service.Stdservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;



@RestController
@RequestMapping("/mapping")
public class studentcontrol {
	
	@Autowired
	Stdservice service;
	
	@Autowired
	studrepo stdrepo;
	
	
	@PostMapping("/add")
	public ResponseEntity<?> add(@RequestBody StudentEntity std){
		
		StudentEntity s = service.adduser(std);
		
		return ResponseEntity.status(HttpStatus.OK).body(s);
		
	}
	@GetMapping("/StdAddress/{id}")
	public ResponseEntity<?> getMethodName(@PathVariable int id) {
		
		StudentEntity sa = stdrepo.findById(id).get();
		
		return ResponseEntity.status(HttpStatus.OK).body(sa);
	}
	

}
