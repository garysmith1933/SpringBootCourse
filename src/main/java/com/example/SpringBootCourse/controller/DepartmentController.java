package com.example.SpringBootCourse.controller;

import com.example.SpringBootCourse.entity.Department;
import com.example.SpringBootCourse.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DepartmentController {

    @Autowired // maps this departmentService to the one that is already in the spring container.
    private DepartmentService departmentService;

    @PostMapping("/departments")
    //the input will take the body of the request and convert it to be a department
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);

    }
}
