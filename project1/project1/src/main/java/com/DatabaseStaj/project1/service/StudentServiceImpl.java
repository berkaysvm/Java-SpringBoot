package com.DatabaseStaj.project1.service;

import com.DatabaseStaj.project1.dto.DepartmentDto;
import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.entities.Student;
import com.DatabaseStaj.project1.mapper.DepartmentMapper;
import com.DatabaseStaj.project1.mapper.StudentMapper;
import com.DatabaseStaj.project1.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService
{
    private StudentRepository studentRepository;
    private  StudentMapper studentMapper;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository, StudentMapper studentMapper){
        this.studentRepository =studentRepository;
        this.studentMapper = studentMapper;

    }

    @Override
    public List<Student> getAllStudents() {
        return null;
    }

    @Override
    public String deleteById(int id) {
        studentRepository.deleteById(id);
        return "Silme islemi basarili";
    }

    @Override
    public StudentDto saveStudent(StudentDto studentDto) {
        saveStudentService(studentDto);

        return null;
        //return studentRepository.save(mapper.convertEntity(studentDto))

    }

    public Student saveStudentService(StudentDto studentDto)
    {

        return  studentRepository.save(studentMapper.convertEntity(studentDto));    }

//
    public StudentDto getById(int id)
    {

        return studentMapper.map(studentRepository.getReferenceById(id));

    }



    @Override
    public List<Student> findAll(int id) {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(int id) {
        return null;
    }
    @Override
    public List<StudentDto> findAllByFirstName(String firstname)
    {

        findAllByFirstNameService(firstname);
        StudentMapper mapper = new StudentMapper();
        StudentDto studentDto = new StudentDto();
        //mapper.map(StudentDto.Builder.StudentBuilderWith().firstName(firstname))
        return null;

    }
    public List<Student> findAllByFirstNameService(String firstname)
    {
        return studentRepository.findAllByFirstName(firstname);

    }
   // @Override


    @Override
    public Student updateStudent(Student student)
    {
        return null;
    }





}

