package com.hrmanagement.controller;

import com.hrmanagement.domain.Department;
import com.hrmanagement.service.DepartmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ServiceController {

    @Autowired
    DepartmentService departmentService;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome()
    {
        return "Hi Welcome !";
    }

    @RequestMapping(value = "/user/{username}", method = RequestMethod.GET)
    public String welcome_t( @PathVariable String username )
    {
        return "Hi " + username + " !";
    }

    @RequestMapping(value = "/department", method = RequestMethod.GET)
    public List<Department> getAllDepartments(){
        return departmentService.getAllDepartments();
    }
}
