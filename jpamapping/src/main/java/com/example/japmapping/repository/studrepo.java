package com.example.japmapping.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.japmapping.Entity.StudentEntity;

public interface studrepo extends JpaRepository<StudentEntity, Integer>{
	
	

}
