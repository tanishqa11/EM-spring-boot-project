package com.example.employee.service;

import java.util.List;

import com.example.employee.dto.employeeDto;

public interface employeeService {
    employeeDto createEmployee(employeeDto EmployeeDto);
    employeeDto getEmployeeByID(Long employeeId);
    List<employeeDto> getAllEmployees();
    employeeDto updateEmployee(Long employeeId,employeeDto updatedEmployee);
    void deleteEmployee(Long employeeId);

}