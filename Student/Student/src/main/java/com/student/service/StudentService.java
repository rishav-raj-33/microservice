package com.student.service;

import com.student.collection.Student;
import com.student.payload.StudentDto;

public interface StudentService {

    StudentDto registerStudent(StudentDto student);
    StudentDto updateStudent(StudentDto student,Integer rollNo);
    StudentDto getStudent(Integer rollNo);
    Boolean deleteStudent(Integer rollNo);

}
