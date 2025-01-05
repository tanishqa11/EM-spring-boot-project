package com.example.employee.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.employee.dto.employeeDto;
import com.example.employee.service.employeeService;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/api/employee")
public class EmployeeController {

    private employeeService EmployeeService;

    //build api for  adding employee
    @PostMapping
    public ResponseEntity<employeeDto> createEmployee(@RequestBody employeeDto EmployeeDto){
        System.out.println("i m here ");
        employeeDto savedEmployee =EmployeeService.createEmployee(EmployeeDto);
        return new  ResponseEntity<>(savedEmployee,HttpStatus.CREATED);

    }

    //build get employee restapi
    @GetMapping("{id}")
    public ResponseEntity<employeeDto> getEmployeeById(@PathVariable("id") Long employeeId){
       employeeDto dto = EmployeeService.getEmployeeByID(employeeId);
       return ResponseEntity.ok(dto);

    }

    //get all employees details 
    @GetMapping
    public ResponseEntity<List<employeeDto>> getAllEmployee(){
    List<employeeDto> employees= EmployeeService.getAllEmployees();
    return ResponseEntity.ok(employees);
    }


    @PutMapping("{id}")
    public ResponseEntity<employeeDto> updateEmployee(@PathVariable("id") Long employeeId,@RequestBody employeeDto updatedEmployee){
        employeeDto EmployeeDto = EmployeeService.updateEmployee(employeeId,updatedEmployee);
        return ResponseEntity.ok(EmployeeDto);

    }
    @DeleteMapping({"id"})
    public ResponseEntity<String> deleteEmployee(@PathVariable("id") Long employeeId){
        EmployeeService.deleteEmployee(employeeId);
        return ResponseEntity.ok("employee deleted successfully");


    }
}

