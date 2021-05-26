package com.student.service;

import java.util.List;

import com.student.model.Student;

/**
 * Student Service Interface for Simple Spring MVC CRUD App
 * 
 * @author Anjani Choudhary
 */
public interface StudentService {

	Student getStudent(Long id);

	Long saveStudent(Student st);

	List<Student> listAllStudents();

	void update(Long id, Student st);

	void delete(Long id);

	boolean isStudentUnique(Long id);
}
