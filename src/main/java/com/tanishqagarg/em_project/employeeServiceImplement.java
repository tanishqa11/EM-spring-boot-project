package com.tanishqagarg.em_project;

import java.util.*;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class employeeServiceImplement implements EmployeeService {
    
    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public String CreateEmployee(Employee employee) {
        EmployeeEntity ee=new EmployeeEntity();
        BeanUtils.copyProperties(employee, ee);
        employeeRepository.save(ee);

        // employees.add(employee);    //for local purpose as in pc 

        return "saved successfully";

    }

    @Override
    public List<Employee> ReadEmployees() {
        List<EmployeeEntity>employeesList1=employeeRepository.findAll();
        List<Employee> employees= new ArrayList<>(); //for local purpose as in pc 

        for(EmployeeEntity e1:employeesList1){
            Employee emp= new Employee();
            emp.setId(e1.getId());
            emp.setName(e1.getName());
            emp.setPhone(e1.getPhone());
            emp.setEmail(e1.getEmail());
            employees.add(emp);
        }           
        
        return employees;
    }

    @Override
    public boolean deleteEmployee(Long id) {
        // employees.remove(id);
        return true;
    }

    
}
