package com.DatabaseStaj.project1.controller;

import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {
    private StudentService studentservice;


    @Autowired
    public StudentController(StudentService studentservice) {
        this.studentservice = studentservice; }

    @PostMapping("/save")
    public StudentDto saveStudent (@RequestBody StudentDto studentDto) {
        return studentservice.saveStudent(studentDto);
    }

    @DeleteMapping("/delete")
    public String sil(@RequestParam("id") int id) {
        return studentservice.deleteById(id);
    }

    @GetMapping("/get")
    public StudentDto getById(@RequestParam("id") int id) {return  studentservice.getById(id);}



    }


