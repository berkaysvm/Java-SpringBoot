package com.DatabaseStaj.project1.service;
import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.entities.Student;

import java.util.List;

public interface StudentService {
    List<Student> getAllStudents();

    String deleteById(int id);

    StudentDto saveStudent(StudentDto studentDto);
    StudentDto getById(int id);
    List<Student> findAll(int id);
    List<StudentDto> findAllByFirstName(String firstname);

    Student getStudentById(int id);

    Student updateStudent(Student g);

}
