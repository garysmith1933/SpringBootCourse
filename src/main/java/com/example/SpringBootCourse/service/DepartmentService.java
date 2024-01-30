package com.example.SpringBootCourse.service;

import com.example.SpringBootCourse.entity.Department;

import java.util.List;

public interface DepartmentService { //list of methods pertaining to the service, but not the actual logic behind it.
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartments();
    public Department fetchDepartmentById(Long id);
    public void deleteDepartmentById(Long id);
}
