package com.example.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.employee.entity.employee;

public interface employeeRepo  extends  JpaRepository<employee, Long>{
    

}
