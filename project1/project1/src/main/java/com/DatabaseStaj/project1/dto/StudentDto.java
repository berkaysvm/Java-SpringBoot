package com.DatabaseStaj.project1.dto;

import com.DatabaseStaj.project1.entities.Student;
import com.DatabaseStaj.project1.mapper.StudentMapper;
import lombok.*;


@AllArgsConstructor
@NoArgsConstructor
@Getter
@ToString
@EqualsAndHashCode
public class StudentDto {
    private int id;
    private String firstName;
    private String lastName;
    private int age;
    private DepartmentDto departmentDto;

    public void StudentDto()
    {};

    public StudentDto(Builder studentBuilder) {
        this.id = studentBuilder.id;
        this.firstName = studentBuilder.firstName;
        this.lastName = studentBuilder.lastName;
        this.age = studentBuilder.age;
        this.departmentDto = studentBuilder.departmentDto;
    }

            public static StudentDto builder(Student student)
            {
        StudentMapper studentMapper = new StudentMapper();
        return studentMapper.map(student);

    }

    @Getter
    public static class Builder{
        private int id;
        private String firstName;
        private String lastName;
        private int age;
        private DepartmentDto departmentDto;

        public Builder() {
        }

        public static Builder StudentBuilderWith()
        {
            return new Builder();
        }

        public Builder id(int id)
        {
            this.id = id;
            return this;
        }

        public Builder firstName(String firstName)
        {
            this.firstName = firstName;
            return this;
        }

        public Builder lastName(String lastName)
        {
            this.lastName = lastName;
            return this;
        }

        public Builder age(int age)
        {
            this.age = age;
            return this;
        }

        public Builder department(DepartmentDto departmentDto)
        {
            this.departmentDto = departmentDto;
            return this;
        }



        public StudentDto build()
        {
            return new StudentDto(this);
        }
    }
}
