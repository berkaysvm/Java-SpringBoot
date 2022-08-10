package com.DatabaseStaj.project1.entities;

import com.DatabaseStaj.project1.dto.DepartmentDto;
import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.mapper.DepartmentMapper;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.awt.*;
import java.util.List;
import java.util.Set;

@Getter
@Setter
@Entity
@Table(name = "departments")
public class Department {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;
    @Column(name = "department_name")
    private String departmentName;
    @OneToMany(mappedBy = "department")
    private Set<Student> students;



}
