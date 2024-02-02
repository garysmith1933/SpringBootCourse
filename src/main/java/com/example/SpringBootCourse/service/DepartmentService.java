package com.example.SpringBootCourse.service;

import com.example.SpringBootCourse.entity.Department;
import com.example.SpringBootCourse.error.DepartmentNotFoundException;

import java.util.List;

public interface DepartmentService { //list of methods pertaining to the service, but not the actual logic behind it.
    public Department saveDepartment(Department department);
    public List<Department> fetchDepartments();
    public Department fetchDepartmentById(Long id) throws DepartmentNotFoundException;
    public void deleteDepartmentById(Long id);
    public Department updateDepartment(Long id, Department department);
    public Department fetchDepartmentByName(String departmentName);
}
