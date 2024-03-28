package com.example.japmapping.servciceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.japmapping.Entity.StudentEntity;
import com.example.japmapping.repository.studrepo;
import com.example.japmapping.service.Stdservice;

@Service
public class stdserviceimpl implements Stdservice{

	@Autowired
	studrepo repo;
	public StudentEntity adduser(StudentEntity add) {
		// TODO Auto-generated method stub
		StudentEntity st = repo.save(add);
		
		return st;
	}

}
