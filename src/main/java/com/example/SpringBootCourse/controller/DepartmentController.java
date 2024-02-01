package com.example.SpringBootCourse.controller;

import com.example.SpringBootCourse.entity.Department;
import com.example.SpringBootCourse.service.DepartmentService;
import jakarta.validation.Valid;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController // this is where api methods are defined
public class DepartmentController {

    @Autowired // maps this departmentService to the one that is already in the spring container.
    private DepartmentService departmentService;

    private final Logger LOGGER = LoggerFactory.getLogger( DepartmentController.class);

    @PostMapping("/departments")
    //the input will take the body of the request and convert it to be a department
    public Department saveDepartment(@Valid @RequestBody Department department) {
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchDepartmentList() {
        LOGGER.info("Inside fetchDepartmentList of Department Controller");
        return departmentService.fetchDepartments();
    }

    @GetMapping("/departments/{id}") //dynamic variable, whatever this is will the input as a path variable.
    public Department fetchDepartmentById(@PathVariable("id") Long departmentId) {
        return departmentService.fetchDepartmentById(departmentId);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName) {
        return departmentService.fetchDepartmentByName(departmentName);
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


