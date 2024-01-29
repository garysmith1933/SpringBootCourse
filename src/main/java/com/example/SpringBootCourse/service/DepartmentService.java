package com.example.SpringBootCourse.service;

import com.example.SpringBootCourse.entity.Department;

import java.util.List;
import java.util.Optional;

public interface DepartmentService { //list of methods pertaining to the service, but not the actual logic behind it.
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartments();

    Department fetchDepartmentById(Long id);
}
