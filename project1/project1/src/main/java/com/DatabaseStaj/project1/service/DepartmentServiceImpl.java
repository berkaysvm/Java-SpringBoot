package com.DatabaseStaj.project1.service;

import com.DatabaseStaj.project1.dto.DepartmentDto;
import com.DatabaseStaj.project1.dto.StudentDto;
import com.DatabaseStaj.project1.entities.Department;
import com.DatabaseStaj.project1.entities.Student;
import com.DatabaseStaj.project1.mapper.DepartmentMapper;
import com.DatabaseStaj.project1.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class DepartmentServiceImpl implements DepartmentService {

    private DepartmentRepository departmentRepository;
    private DepartmentMapper departmentMapper;
    @Autowired
    public DepartmentServiceImpl(DepartmentRepository departmentRepository , DepartmentMapper departmentMapper) {
        this.departmentRepository = departmentRepository;
        this.departmentMapper =departmentMapper;
    }


//    @Override
//    public List<StudentDto> findAllByDepartmentId(int department_id)
//    {
//        findAllByDepartmentIdService(department_id);
//        return null;
//
//    }
//    public List<Student> findAllByDepartmentIdService(int department_id)
//    {
//        return  departmentRepository.findAllByDepartmentId(department_id);
//    }

    @Override
    public DepartmentDto save(DepartmentDto departmentDto)
    {
        departmentRepository.save(departmentMapper.convertEntity(departmentDto));
        return null ;
    }

    @Override
    public String deleteById(int id) {
        departmentRepository.deleteById(id);
        return "Department deleted";
    }

    @Override
    public DepartmentDto getReferenceById(int id) {
        return  departmentMapper.map(departmentRepository.getReferenceById(id)) ;
    }
}
