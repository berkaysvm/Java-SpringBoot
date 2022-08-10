package com.DatabaseStaj.project1.service;

import com.DatabaseStaj.project1.dto.DepartmentDto;
import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.entities.Department;
import com.DatabaseStaj.project1.entities.Student;

import java.util.List;

public interface DepartmentService {
    //List<Department> getAllDepartments();

    DepartmentDto save(DepartmentDto departmentDto);
    String deleteById(int id);
    DepartmentDto getReferenceById(int id);

 //    List<StudentDto> findAllByDepartmentId(int id);
}
