package com.neosoft.task.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.neosoft.task.dao.Dao;
import com.neosoft.task.model.Student;

@org.springframework.stereotype.Service
public class ServiceImpl implements ServceI {

	@Autowired
	Dao dao;

	@Override
	public void insert(List<Student> stu) {
		dao.saveAll(stu);
		
	}
	
	@Override
	public void delete(int id) {
		dao.deleteById(id);
		
	}

	public void upadte(Student stu) {
         dao.save(stu);
		
	}

	public List<Student> displayall() {
		
		return dao.findAll();
		// TODO Auto-generated method stub
		
	}

	public Student displayonedata(int id) {
		dao.findById(id).get();
		return dao.findById(id).get();
		// TODO Auto-generated method stub
		
	}

	
	
	
}
