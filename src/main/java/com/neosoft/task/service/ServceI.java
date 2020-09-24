package com.neosoft.task.service;

import java.util.List;

import com.neosoft.task.model.Student;

public interface ServceI {
public void  insert( List<Student> stu);
public void delete(int id);
public void upadte(Student stu);
public  List<Student> displayall();
public Student displayonedata(int id);
}
