package com.msil.relationsnew.controller;

import com.msil.relationsnew.entity.Department;
import com.msil.relationsnew.repository.DepartmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/department")
public class DepartmentController {
    @Autowired
    DepartmentRepository departmentRepository;
    @PostMapping
    public Department save(@RequestBody Department department)
    {
        return departmentRepository.save(department);
    }

    @GetMapping
    public List<Department> get(){
        return departmentRepository.findAll();
    }
}
