package com.DatabaseStaj.project1.repository;

import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.entities.Department;
import com.DatabaseStaj.project1.entities.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {
    List<Student> findAllByFirstName(String firstName);

}
