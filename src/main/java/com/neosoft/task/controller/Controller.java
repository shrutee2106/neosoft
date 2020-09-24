package com.neosoft.task.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neosoft.task.model.Student;
import com.neosoft.task.service.ServiceImpl;

//@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api")

public class Controller {
	@Autowired
	
	ServiceImpl si;
	
	@GetMapping("/read")
	public List<Student> displayall(){
		
		List<Student> all=si.displayall();
		return all;
		
	}
	@PostMapping("/create")
    public List<Student> create(@RequestBody List<Student> stu) {
		si.insert(stu);
		
		return stu;      
	}
	
	@DeleteMapping("/delete/{id}")
	public void delete(@PathVariable("id") Integer id) {
		si.delete(id);
	}
	
	@PatchMapping("/update/{id}")
	public void update(@RequestBody Student stu,@PathVariable("id") Integer id) {
		System.out.println("1233");
		//stu.setId(id);
		System.out.println("45677");
		si.upadte(stu);
	
	}
	
	@GetMapping("/fetchsingleid/{id}")
	public Student fetchsingleid(@PathVariable("id") int id)
	{
		Student s=si.displayonedata(id);
		return s;
		
	}
}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
