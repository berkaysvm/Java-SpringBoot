package com.DatabaseStaj.project1.dto;

import com.DatabaseStaj.project1.entities.Department;
import com.DatabaseStaj.project1.mapper.DepartmentMapper;
import com.DatabaseStaj.project1.mapper.StudentMapper;
import lombok.Getter;

import java.util.Set;

@Getter
public class DepartmentDto {

    private int id;
    private String departmentName;
    private Set<StudentDto> students;


    public DepartmentDto() {
    }

    public DepartmentDto(Builder departmentBuilder) {
        this.id = departmentBuilder.id;
        this.departmentName = departmentBuilder.departmentName;
        this.students = departmentBuilder.students;
    }

    public static DepartmentDto builder(Department department)
    {
        DepartmentMapper departmentMapper = new DepartmentMapper();
        return departmentMapper.map(department);
    }



    @Getter
    public static class Builder
    {

        private int id;
        private String departmentName;
        private Set<StudentDto> students;

        public Builder() {
        }
        public static Builder DepartmentBuilderWith()
        {
            return new Builder();
        }

        public Builder id (int id)
        {
            this.id=id;
            return this;
        }
        public Builder departmentName (String departmentName)
        {
            this.departmentName = departmentName;
            return this;
        }
        public Builder students (Set<StudentDto> students)
        {
            this.students = students;
            return this;
        }
        public Department convert(DepartmentDto departmentDto)
        {
            StudentMapper studentMapper = new StudentMapper();
            Department department = new Department();
            department.setId(departmentDto.getId());
            department.setDepartmentName(departmentDto.getDepartmentName());
            return  department;
        }

        public DepartmentDto build()
        {
            return new DepartmentDto(this);
        }
    }


}
