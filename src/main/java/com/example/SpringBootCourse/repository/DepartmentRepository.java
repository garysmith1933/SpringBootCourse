package com.example.SpringBootCourse.repository;

import com.example.SpringBootCourse.entity.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
 //has access to all Jpa Repository methods. ex: save, findAll, findById

    public Department findByDepartmentName(String departmentName); // have to define it here as it does not exist in the repository.
    public Department findByDepartmentNameIgnoreCase(String departmentName);
}
