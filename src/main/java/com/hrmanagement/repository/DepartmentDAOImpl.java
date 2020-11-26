package com.hrmanagement.repository;

import com.hrmanagement.dao.DepartmentDAO;
import com.hrmanagement.domain.Department;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository("departmentDAO")
public class DepartmentDAOImpl implements DepartmentDAO {
    @Override
    public List<Department> getAllDepartments() {
        List<Department> departments = new ArrayList<>();
        departments.add(new Department("1", " Finance"));
        departments.add(new Department("2", " Building Application"));
        departments.add(new Department("3", " Government Tax"));
        return departments;
    }
}
