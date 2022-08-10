package com.DatabaseStaj.project1.mapper;

import com.DatabaseStaj.project1.dto.DepartmentDto;
import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.entities.Student;
import org.springframework.stereotype.Component;

import java.util.Set;
@Component
public class StudentMapper {

    public static StudentDto map(Student student)
    {

        return StudentDto.Builder.StudentBuilderWith()
               .id(student.getId())
               .firstName(student.getFirstName())
               .lastName(student.getLastName())
               .age(student.getAge())
               .department(DepartmentDto.Builder.DepartmentBuilderWith()
                       .id(student.getDepartment().getId()).
                       departmentName(student.getDepartment().getDepartmentName())
                       .build())
               .build();
    }
    public Student convertEntity(StudentDto studentDto)
    {
            Student student = new Student();
            student.setId(studentDto.getId());
            student.setFirstName(studentDto.getFirstName());
            student.setLastName(studentDto.getLastName());
            student.setAge(studentDto.getAge());
            DepartmentDto.Builder builder = new DepartmentDto.Builder();
            student.setDepartment(builder.convert(studentDto.getDepartmentDto()));
            return  student;

    }


}
