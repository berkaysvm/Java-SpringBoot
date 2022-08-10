package com.DatabaseStaj.project1.controller;

import com.DatabaseStaj.project1.dto.DepartmentDto;
import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.entities.Department;
import com.DatabaseStaj.project1.entities.Student;
import com.DatabaseStaj.project1.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/departments")
public class DepartmentController {
    private DepartmentService departmentService;

    @Autowired
    public DepartmentController(DepartmentService departmentService) {
        this.departmentService = departmentService;

    }

    @PostMapping("/save")
    public DepartmentDto saveDepartment(@RequestBody DepartmentDto departmentDto)
    {
        return  departmentService.save(departmentDto);
    }

    @DeleteMapping("/delete")
    public String deleteById(@RequestParam ("id") int id)
    {
        return  departmentService.deleteById(id);
    }
    @GetMapping("/get")
    public DepartmentDto getReferenceById(@RequestParam("id") int id)
    {
        return departmentService.getReferenceById(id);
    }



}
