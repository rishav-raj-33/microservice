package com.student.repository;

import java.util.List;

import com.student.collections.Student;

public interface StudentRepo {
	
	Student saveStudent(Student student);
	Student updateStudent(Student student, Integer rollNo);
	Student getStudentByRollNo(Integer rollNo);
	List<Student> getAllStudents();
	Boolean deleteStudent(Integer rollNo);
	
	

}
