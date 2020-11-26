package com.hrmanagement.repository;

import com.hrmanagement.domain.Department;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository("departmentRepository")
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
