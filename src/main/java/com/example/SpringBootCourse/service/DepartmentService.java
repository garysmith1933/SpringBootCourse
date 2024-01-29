package com.example.SpringBootCourse.service;

import com.example.SpringBootCourse.entity.Department;

public interface DepartmentService { //list of methods pertaining to the service, but not the actual logic behind it.
    public Department saveDepartment(Department department);
}
