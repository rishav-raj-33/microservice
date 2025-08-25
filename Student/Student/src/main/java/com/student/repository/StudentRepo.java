package com.student.repository;

import com.student.collection.Student;

public interface StudentRepo {

      Student saveStudent(Student student);

      Student getByRollNo(Integer rollNo);

       Boolean deleteStudent(Integer rollNo);

       Student updateStudent(Student student,Integer rollNo);






}
