package com.example.employee.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.employee.Mapper.EmployeeMapper;
import com.example.employee.dto.employeeDto;
import com.example.employee.entity.employee;
import com.example.employee.exception.ResourceNotFound;
import com.example.employee.repository.employeeRepo;

import lombok.AllArgsConstructor;


@AllArgsConstructor
@Service
public class employeeServiceImple implements employeeService{
    private employeeRepo EmployeeRepo;
    

    @Override 
        public  employeeDto createEmployee(employeeDto EmployeeDto){
        employee Employee = EmployeeMapper.mapToemployee(EmployeeDto);
        employee savedemployee=EmployeeRepo.save(Employee);
        return EmployeeMapper.mapToDto(savedemployee);
    }


    @Override
    public employeeDto getEmployeeByID(Long employeeId) {
        employee Employee =EmployeeRepo.findById(employeeId)
        .orElseThrow(()-> new ResourceNotFound("employee  not exist with given id :"));
    return EmployeeMapper.mapToDto(Employee);
    }


    @Override
    public List<employeeDto> getAllEmployees() {
List<employee> employees= EmployeeRepo.findAll()  ;
return employees.stream().map(Employee -> EmployeeMapper.mapToDto(Employee))
  .collect(Collectors.toList());
}


    @Override
    public employeeDto updateEmployee(Long employeeId, employeeDto updatedEmployee) {
      employee Employee= EmployeeRepo.findById(employeeId).orElseThrow(
        ()-> new ResourceNotFound("employee not exist"));
        Employee.setFirstname(updatedEmployee.getFirstname());
        Employee.setLastname(updatedEmployee.getLastname());
        Employee.setEmail(updatedEmployee.getEmail());
         employee updated=EmployeeRepo.save(Employee);
return EmployeeMapper.mapToDto(updated);

}


    


    @Override
    public void deleteEmployee(Long employeeId) {
        employee Employee= EmployeeRepo.findById(employeeId).orElseThrow(
        ()-> new ResourceNotFound("employee not exist"));

        EmployeeRepo.deleteById(employeeId);

    }





}


