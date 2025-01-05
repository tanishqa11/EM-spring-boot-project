
package com.example.employee.Mapper;

import com.example.employee.dto.employeeDto;
import com.example.employee.entity.employee;

public class EmployeeMapper {
    public static employeeDto mapToDto(employee Employee){
        return new employeeDto(
            Employee.getId(),
            Employee.getFirstname(),
            Employee.getLastname(),
            Employee.getEmail()
        );
    }
    public static employee mapToemployee(employeeDto employeeDto){
        return new employee(
            employeeDto.getId(),
            employeeDto.getEmail(),
            employeeDto.getFirstname(),
            employeeDto.getLastname()

        );
    }



}
