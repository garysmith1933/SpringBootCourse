package com.example.SpringBootCourse.controller;

import com.example.SpringBootCourse.entity.Department;
import com.example.SpringBootCourse.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController // this is where api methods are defined
public class DepartmentController {

    @Autowired // maps this departmentService to the one that is already in the spring container.
    private DepartmentService departmentService;

    @PostMapping("/departments")
    //the input will take the body of the request and convert it to be a department
    public Department saveDepartment(@RequestBody Department department) {
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        return departmentService.fetchDepartments();
    }

    @GetMapping("/departments/{id}") //dynamic variable, whatever this is will the input as a path variable.
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId) {
        departmentService.deleteDepartmentById(departmentId);
        return "Department deleted Successfully";
    }

    @PutMapping("/department/{id}") //had to distingush it from the others to avoid 405 error.
    public Department updateDepartment(@PathVariable("id") Long departmentId, @RequestBody Department department) {
       return departmentService.updateDepartment(departmentId, department);
    }
}


