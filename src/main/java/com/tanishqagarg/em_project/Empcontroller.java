package com.tanishqagarg.em_project;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
public class Empcontroller {

    @Autowired
    EmployeeService service;

    @GetMapping("employees")
    public List<Employee> getAllEmployees(){
        return service.ReadEmployees();
    }
    
    @PostMapping("employees")
    public String CreateEmployees(@RequestBody Employee employee) {
        return service.CreateEmployee(employee);
    }

    @DeleteMapping("employees/{id}")
    public boolean deleteEmployee(@PathVariable Long id ){
        return service.deleteEmployee(id);
    }
    

    
}
