package com.student.dao;

import java.util.List;

import com.student.model.Student;

/**
 * Student Dao Interface for Simple Spring MVC CRUD App
 * 
 * @author Anjani Choudhary
 */
public interface StudentDao {

	Student getStudent(Long id);

	Long saveStudent(Student st);

	List<Student> listAllStudents();

	void updateStudent(Student st);

	void deleteStudent(Student st);

}
