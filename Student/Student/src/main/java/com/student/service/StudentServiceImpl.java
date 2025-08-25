package com.student.service;

import com.student.collection.Student;
import com.student.payload.StudentDto;
import com.student.repository.StudentRepo;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements  StudentService{

    @Autowired
    private StudentRepo repo;

    @Autowired
    private ModelMapper mapper;

    @Override
    public StudentDto registerStudent(StudentDto student) {
        return mapper.map(repo.saveStudent(mapper.map(student,Student.class)),StudentDto.class);
    }

    @Override
    public StudentDto updateStudent(StudentDto studentDto, Integer rollNo) {
        return mapper.map(repo.updateStudent(mapper.map(studentDto,Student.class),rollNo),StudentDto.class);
    }

    @Override
    public StudentDto getStudent(Integer rollNo) {
        return mapper.map(repo.getByRollNo(rollNo),StudentDto.class);
    }

    @Override
    public Boolean deleteStudent(Integer rollNo) {
        return repo.deleteStudent(rollNo);
    }
}
