package com.DatabaseStaj.project1.mapper;

import com.DatabaseStaj.project1.dto.DepartmentDto;
import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.entities.Department;
import com.DatabaseStaj.project1.entities.Student;
import org.springframework.stereotype.Component;


import java.util.Set;
import java.util.stream.Collectors;

@Component
public class DepartmentMapper {

    public DepartmentDto map(Department department)
    {
       Set<Student> departmentSet = department.getStudents();
       Set<StudentDto> studentDtoList = departmentSet.stream().map(StudentMapper::map).collect(Collectors.toSet());

        return DepartmentDto.Builder.DepartmentBuilderWith()
                .id(department.getId())
                .departmentName(department.getDepartmentName())
                .students(studentDtoList)
                .build();}


    public  Department convertEntity(DepartmentDto departmentDto)
    {
        Department department = new Department();
        department.setId(departmentDto.getId());
        department.setDepartmentName(departmentDto.getDepartmentName());
        return  department;

    }


}
