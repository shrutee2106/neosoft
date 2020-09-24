package com.neosoft.task.dao;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.neosoft.task.model.Student;

@Repository
public interface Dao extends MongoRepository<Student, Integer>{

	

}
